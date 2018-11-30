package tagliaferro.adriano.androiddev.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {


    private val client = Retrofit.Builder()
        .baseUrl("http://careers.picpay.com/tests/mobdev")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun picPayService(): PicPayService {
        return client.create(PicPayService::class.java)
    }

}