package tagliaferro.adriano.androiddev.view

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.startKoin
import org.koin.android.viewmodel.ext.android.viewModel
import tagliaferro.adriano.androiddev.R
import tagliaferro.adriano.androiddev.appModule
import tagliaferro.adriano.androiddev.data.dataModule
import tagliaferro.adriano.androiddev.domain.User
import tagliaferro.adriano.androiddev.feature.ListRecycler
import tagliaferro.adriano.androiddev.feature.ListViewModel

class MainActivity : AppCompatActivity(), MainView {

    private val recycler: ListRecycler by inject()
    private val viewModel: ListViewModel by viewModel()
    //private val presenter: MainPresenterImpl by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin(this, listOf(dataModule, appModule))

        loadUsers()
    }

    override fun loadUsers() {
        recyclerList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        viewModel.getUsersFromModel().observe(this, Observer { usersList -> updateUI(usersList) })
        //presenter.loadUsers()
    }

    override fun updateUI(usersList: List<User>?) {
        if (recycler.itemCount > 0) {
            recycler.notifyItemInserted(usersList?.lastIndex ?: 0)
        } else {
            recycler.updateList(usersList)
        }
    }

    override fun getLifecycleOwner(): LifecycleOwner = this


}
