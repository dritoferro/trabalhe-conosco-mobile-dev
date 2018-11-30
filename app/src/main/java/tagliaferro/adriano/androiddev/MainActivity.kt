package tagliaferro.adriano.androiddev

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.startKoin
import tagliaferro.adriano.androiddev.data.myModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin(this, listOf(myModule))
    }


}
