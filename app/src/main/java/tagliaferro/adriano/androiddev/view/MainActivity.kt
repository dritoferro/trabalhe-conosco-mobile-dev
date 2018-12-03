package tagliaferro.adriano.androiddev.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.startKoin
import tagliaferro.adriano.androiddev.R
import tagliaferro.adriano.androiddev.appModule
import tagliaferro.adriano.androiddev.data.dataModule
import tagliaferro.adriano.androiddev.feature.ListRecycler
import tagliaferro.adriano.androiddev.feature.ListViewModel
import tagliaferro.adriano.androiddev.presenter.MainPresenterImpl

class MainActivity : AppCompatActivity(), MainView {

    private val recycler: ListRecycler by inject()
    private val viewModel: ListViewModel by inject()
    private val presenter: MainPresenterImpl by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin(this, listOf(dataModule, appModule))

        loadUsers()
    }

    override fun loadUsers() {
        presenter.loadUsers()
    }

    override fun updateUI(pos: Int) {
        recycler.notifyItemInserted(pos)
    }


}
