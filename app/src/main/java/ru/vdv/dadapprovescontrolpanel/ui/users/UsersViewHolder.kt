package ru.vdv.dadapprovescontrolpanel.ui.users

import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.UsersListItemBinding
import ru.vdv.dadapprovescontrolpanel.interfaces.BaseUserItemView
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class UsersViewHolder(
    private val vb: UsersListItemBinding,
    private val imageLoader: IImageLoader<ImageView>
) : RecyclerView.ViewHolder(vb.root),
    BaseUserItemView {
    override fun setName(name: String): Unit = with(vb){
        tvName.text = name
        Log.d("Моя проверка", "UsersViewHolder / сработал setName")
    }

    override fun setImageAvatar(url: String): Unit =  with(vb) {
        imageLoader.loadInfo(url, ivUserAvatar)
        Log.d("Моя проверка", "UsersViewHolder / сработал setImageAvatar")
    }

    override fun setCustomBackgroundImage(url: String) {
        //TODO("Not yet implemented")
    }
}