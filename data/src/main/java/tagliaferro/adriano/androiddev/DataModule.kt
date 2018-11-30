package tagliaferro.adriano.androiddev.data

import org.koin.dsl.module.module


val myModule = module {
    single { Repository() }
}