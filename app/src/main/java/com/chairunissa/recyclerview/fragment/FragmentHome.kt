package com.chairunissa.recyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.chairunissa.recyclerview.UserAdapter
import com.chairunissa.recyclerview.data.User
import com.chairunissa.recyclerview.databinding.FragmentHomeBinding


class FragmentHome : Fragment() {

//    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        recyclerView = view.findViewById(R.id.rv_user)

        val userList = listOf(
            User("Chairunissa", +628329873492),
            User("Ananda", +628198371298),
            User("Benyamin", +6282736271)
        )

        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvUser.layoutManager = layoutManager
        binding.rvUser.adapter = userAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
