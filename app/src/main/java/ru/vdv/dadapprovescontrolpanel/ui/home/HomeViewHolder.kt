package ru.vdv.dadapprovescontrolpanel.ui.home

import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.HomeListItemBinding
import ru.vdv.dadapprovescontrolpanel.interfaces.BaseUserItemView
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class HomeViewHolder(
    private val vb: HomeListItemBinding,
    private val imageLoader: IImageLoader<ImageView>
) : RecyclerView.ViewHolder(vb.root),
    BaseUserItemView {
    override fun setName(name: String): Unit = with(vb) {
        tvName.text = name
        Log.d("Моя проверка", "HomeViewHolder  / сработал setName")
    }

    override fun setImageAvatar(url: String): Unit =
        with(vb) {
            imageLoader.loadInfo(url, ivUserAvatar)
            Log.d("Моя проверка", "HomeViewHolder  / сработал setImageAvatar")
        }

    override fun setCustomBackgroundImage(url: String): Unit =
        with(vb) {
            imageLoader.loadBg(url, ivUserCustomBgImage)
            Log.d("Моя проверка", "HomeViewHolder  / сработал setImageAvatar")
        }
}