package tagliaferro.adriano.androiddev.model

import tagliaferro.adriano.androiddev.data.Repository
import tagliaferro.adriano.androiddev.domain.User

class UserRepositoryImpl(val repo: Repository) : UserRepository {

    override fun getUsersList(): List<User>? {
        try {
            return repo.getUsers()
        } catch (e: Exception) {
            println(e.message)
        }
        return emptyList()
    }
}