package ru.vdv.dadapprovescontrolpanel.ui.users

import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.UsersListItemBinding
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class UsersViewHolder(val vb: UsersListItemBinding) : RecyclerView.ViewHolder(vb.root) {
    fun setName(name: String) = with(vb){
        tvName.text = name
        Log.d("Моя проверка", "UsersViewHolder / сработал setName")
    }

    fun setImageAvatar(avatarUrl: String, imageLoader: IImageLoader<ImageView>) =  with(vb) {
        imageLoader.loadInfo(avatarUrl, ivUserAvatar)
        Log.d("Моя проверка", "UsersViewHolder / сработал setImageAvatar")
    }
}