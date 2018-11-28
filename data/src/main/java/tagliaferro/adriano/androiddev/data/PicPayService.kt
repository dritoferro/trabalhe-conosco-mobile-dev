package tagliaferro.adriano.androiddev.data

import retrofit2.Call
import retrofit2.http.GET
import tagliaferro.adriano.androiddev.domain.User

interface PicPayService {

    @GET("/users")
    fun getUsersList(): Call<List<User>>

}