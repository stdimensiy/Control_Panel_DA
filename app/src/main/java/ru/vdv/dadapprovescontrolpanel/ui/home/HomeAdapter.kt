package ru.vdv.dadapprovescontrolpanel.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.HomeListItemBinding
import ru.vdv.dadapprovescontrolpanel.domain.User
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class HomeAdapter(
    private val imageLoader: IImageLoader<ImageView>
) : RecyclerView.Adapter<HomeViewHolder>() {
    private val users = listOf(
        User("Артем", "https://dadapproves.ru/usercontent/avatars/da0000002.jpg"),
        User("Виктория", "https://dadapproves.ru/usercontent/avatars/da0000003.jpg")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            HomeListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            imageLoader
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        Log.d("Моя проверка", "Адаптер / сработал onBindViewHolder")
        val user = users[position]
        user.name.let {
            holder.setName(user.name)
            holder.setImageAvatar(user.avatarUrl)
        }

    }

    override fun getItemCount(): Int {
        Log.d("Моя проверка", "Адаптер / расчет количества элементов произведен: ${users.count()}")
        return users.count()
    }
}