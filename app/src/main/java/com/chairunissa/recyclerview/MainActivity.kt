package com.chairunissa.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chairunissa.recyclerview.data.User

class MainActivity : AppCompatActivity() {

//    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        userRecyclerView = findViewById(R.id.user_recycler_view)
//
//        val userList = listOf(
//            User(
//                "Ronaldo",
//                +6228738492
//            ),
//            User(
//                "Ronaldo",
//                +6228738492
//            ),User(
//                "Ronaldo",
//                +6228738492
//            )
//        )
//
//        val userAdapter = UserAdapter(userList)
//        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        userRecyclerView.layoutManager = layoutManager
//        userRecyclerView.adapter = userAdapter
    }
}