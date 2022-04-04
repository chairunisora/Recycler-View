package com.chairunissa.recyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.NavArgsLazy
import androidx.navigation.fragment.navArgs
import com.chairunissa.recyclerview.R
import com.chairunissa.recyclerview.databinding.FragmentBlankBinding
import com.chairunissa.recyclerview.databinding.FragmentHomeBinding


class FragmentBlank : Fragment() {

    private val args: FragmentBlankArgs by navArgs()

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

//    private lateinit var txtName: TextView
//    private lateinit var txtPhone: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        txtName = view.findViewById(R.id.txt_name_detail)
//        txtPhone = view.findViewById(R.id.txt_phone_number_detail)

        val name = args.user.username
        val phone = args.user.phoneNumber

        binding.txtNameDetail.text = name
        binding.txtPhoneNumberDetail.text = phone.toString()
    }
}