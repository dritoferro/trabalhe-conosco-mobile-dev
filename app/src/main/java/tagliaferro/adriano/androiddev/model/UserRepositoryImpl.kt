package tagliaferro.adriano.androiddev.model

import tagliaferro.adriano.androiddev.domain.User
import tagliaferro.adriano.androiddev.presenter.MainPresenter

class UserRepositoryImpl(presenter: MainPresenter) : UserRepository {

    override fun getUsersList(): List<User>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}