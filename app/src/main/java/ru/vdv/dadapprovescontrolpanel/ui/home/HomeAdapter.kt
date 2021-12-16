package ru.vdv.dadapprovescontrolpanel.ui.home

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import app.futured.donut.DonutSection
import ru.vdv.dadapprovescontrolpanel.databinding.HomeListItemBinding
import ru.vdv.dadapprovescontrolpanel.domain.User
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class HomeAdapter(
    private val imageLoader: IImageLoader<ImageView>
) : RecyclerView.Adapter<HomeViewHolder>() {
    private val users = listOf(
        User(
            "Артем",
            "https://dadapproves.ru/usercontent/avatars/da0000002.jpg",
            "https://dadapproves.ru/usercontent/bg/da_bg0000002.jpg"
        ),
        User(
            "Виктория",
            "https://dadapproves.ru/usercontent/avatars/da0000003.jpg",
            "https://dadapproves.ru/usercontent/bg/da_bg0000003.jpg"
        )
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
            holder.setCustomBackgroundImage(user.backgroundUrl)
            val section1 = DonutSection(
                name = "section_1",
                color = Color.parseColor("#FB1D32"),
                amount = 1f
            )

            val section2 = DonutSection(
                name = "section_2",
                color = Color.parseColor("#FFB98E"),
                amount = 2f
            )

            holder.setDonatChartData(section1, section2)
            holder.setDonatChartData2(section1, section2)
        }

    }

    override fun getItemCount(): Int {
        Log.d("Моя проверка", "Адаптер / расчет количества элементов произведен: ${users.count()}")
        return users.count()
    }
}