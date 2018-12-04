package tagliaferro.adriano.androiddev.feature

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.list_item_cardview.view.*
import tagliaferro.adriano.androiddev.R
import tagliaferro.adriano.androiddev.domain.User

class ListRecycler(private var users: List<User>?) : RecyclerView.Adapter<ListRecycler.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_item_cardview, p0, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int = users?.size ?: 0

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.textName.text = users?.get(p1)?.name
        p0.txtUser.text = users?.get(p1)?.username
        Glide.with(p0.itemView).load(users?.get(p1)?.img).apply(
            RequestOptions().circleCrop()
        ).into(p0.image)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName: TextView = itemView.card_textName
        val txtUser: TextView = itemView.card_textUser
        val image: ImageView = itemView.card_image
    }

    fun updateList(users: List<User>?) {
        this.users = users
    }
}