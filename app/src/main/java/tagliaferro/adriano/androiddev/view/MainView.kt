package tagliaferro.adriano.androiddev.view

import android.arch.lifecycle.LifecycleOwner
import android.content.Context
import tagliaferro.adriano.androiddev.domain.User

interface MainView {

    fun loadUsers()

    fun updateUI(usersList: List<User>?)

    fun getLifecycleOwner() : LifecycleOwner
}