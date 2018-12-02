package tagliaferro.adriano.androiddev.data

import org.koin.dsl.module.module


val dataModule = module {
    single { Repository() }
}