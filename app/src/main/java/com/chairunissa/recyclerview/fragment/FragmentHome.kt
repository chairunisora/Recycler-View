package com.chairunissa.recyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chairunissa.recyclerview.R
import com.chairunissa.recyclerview.UserAdapter
import com.chairunissa.recyclerview.data.User


class FragmentHome : Fragment() {

    private lateinit var recyclerview: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerview = view.findViewById(R.id.rv_user)

        val userList = listOf(
            User("Chairunissa", +628329873492),
            User("Ananda", +628198371298),
            User("Benyamin", +6282736271)
        )
        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = userAdapter
    }
}
