package tagliaferro.adriano.androiddev

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import tagliaferro.adriano.androiddev.feature.ListRecycler
import tagliaferro.adriano.androiddev.feature.ListViewModel
import tagliaferro.adriano.androiddev.model.UserRepositoryImpl
import tagliaferro.adriano.androiddev.presenter.MainPresenterImpl
import tagliaferro.adriano.androiddev.view.MainActivity

val appModule = module {
    viewModel { ListViewModel(get()) }
    single { ListRecycler(get()) }
    single { UserRepositoryImpl(get()) }
    single { MainActivity() }
    //single { MainPresenterImpl(get()) }
}