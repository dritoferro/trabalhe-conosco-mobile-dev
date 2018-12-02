package tagliaferro.adriano.androiddev

import org.koin.dsl.module.module

val appModule = module {
    single { ListViewModel() }
    single { ListRecycler(get()) }
}