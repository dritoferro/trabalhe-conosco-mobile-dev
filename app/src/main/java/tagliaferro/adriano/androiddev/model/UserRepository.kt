package tagliaferro.adriano.androiddev.model

import tagliaferro.adriano.androiddev.domain.User

interface UserRepository {

    fun getUsersList(): List<User>?
}