package tagliaferro.adriano.androiddev.presenter

import tagliaferro.adriano.androiddev.model.UserRepository
import tagliaferro.adriano.androiddev.view.MainView

class MainPresenterImpl(val view: MainView, val repo: UserRepository) : MainPresenter {


    override fun loadUsers() {
        repo.getUsersList()
    }

    override fun updateUI() {
        view.updateUI(1)
    }

}