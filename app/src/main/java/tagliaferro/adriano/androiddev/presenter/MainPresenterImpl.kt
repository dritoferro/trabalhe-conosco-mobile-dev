package tagliaferro.adriano.androiddev.presenter

import android.arch.lifecycle.Observer
import tagliaferro.adriano.androiddev.view.MainView

class MainPresenterImpl(val view: MainView) : MainPresenter {


    override fun loadUsers() {
        //viewModel.getUsersFromModel()
          //  .observe(view.getLifecycleOwner(), Observer { usersList -> view.updateUI(usersList) })
    }


}