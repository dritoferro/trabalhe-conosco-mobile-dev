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

class MainActivity : AppCompatActivity(), MainView {

    private val recycler: ListRecycler by inject()
    private val viewModel: ListViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin(this, listOf(dataModule, appModule))

        loadData()
    }

    private fun loadData() {
        //TODO implementar a função de carregar os dados a partir do repository no viewModel e depois aplicar o viewModel ao adapter...
    }


}
