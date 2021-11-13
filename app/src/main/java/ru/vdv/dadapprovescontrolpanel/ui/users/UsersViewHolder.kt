package ru.vdv.dadapprovescontrolpanel.ui.users

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.UsersListItemBinding

class UsersViewHolder(val vb: UsersListItemBinding) : RecyclerView.ViewHolder(vb.root) {
    fun setName(name: String) = with(vb){
        tvName.text = name
        Log.d("Моя проверка", "Адаптер / сработал UsersViewHolder")
    }
}