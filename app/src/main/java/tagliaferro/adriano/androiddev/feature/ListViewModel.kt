package tagliaferro.adriano.androiddev.feature

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import tagliaferro.adriano.androiddev.domain.User
import tagliaferro.adriano.androiddev.model.UserRepositoryImpl

class ListViewModel(private val repo : UserRepositoryImpl) : ViewModel() {

    private val usersList : MutableLiveData<List<User>> = MutableLiveData()

    fun getUsersFromModel() : LiveData<List<User>>{
        loadData()
        return usersList
    }
    private fun loadData(){
        val users = repo.getUsersList()
        usersList.value = users
    }
}