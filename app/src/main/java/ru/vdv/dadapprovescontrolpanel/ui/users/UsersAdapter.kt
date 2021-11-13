package ru.vdv.dadapprovescontrolpanel.ui.users

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.dadapprovescontrolpanel.databinding.UsersListItemBinding
import ru.vdv.dadapprovescontrolpanel.domain.User

class UsersAdapter() : RecyclerView.Adapter<UsersViewHolder>() {
    private val users = listOf<User>(User("Артем"), User("Виктория"))
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder =
        UsersViewHolder(
            UsersListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        Log.d("Моя проверка", "Адаптер / сработал onBindViewHolder")
        val user = users[position]
        user.name.let {
            holder.setName(user.name)
        }
    }

    override fun getItemCount(): Int {
        Log.d("Моя проверка", "Адаптер / расчет количества элементов произведен: ${users.count()}")
        return users.count()
    }
}