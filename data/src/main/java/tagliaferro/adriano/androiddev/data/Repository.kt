package tagliaferro.adriano.androiddev.data

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tagliaferro.adriano.androiddev.domain.User


class Repository {

    val repo = RetrofitClient().picPayService()


    fun getUsers(): List<User>? {
        var call = repo.getUsersList()
        var users: List<User>? = null
        try {
            call.enqueue(object : Callback<List<User>> {
                override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                    if (response.isSuccessful) {
                        users = response.body()
                    }
                }

                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                    println(t.message)
                }
            })
        }catch (e : Exception){
            println(e.message)
        }
        return users
    }
}