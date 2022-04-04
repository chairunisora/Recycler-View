package com.chairunissa.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chairunissa.recyclerview.data.User
import com.chairunissa.recyclerview.databinding.ItemUserBinding
import com.chairunissa.recyclerview.fragment.FragmentHomeDirections

class UserAdapter(private val user: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
//        val usernameTextView: TextView = view.findViewById(R.id.username_text_view)
//        val phoneNumberTextView: TextView = view.findViewById(R.id.phone_number_text_view)
//        val rvItem: ConstraintLayout = view.findViewById(R.id.item_user)

    }

    //nge attach item user
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    //get data sesuai dengan posisi
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.usernameTextView.text = user[position].username
        holder.binding.phoneNumberTextView.text = user[position].phoneNumber.toString()
        holder.binding.itemUser.setOnClickListener {
            val action = FragmentHomeDirections.actionFragmentHomeToFragmentBlank(user[position])
            it.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = user.size
}