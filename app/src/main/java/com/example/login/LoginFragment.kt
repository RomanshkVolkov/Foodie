package com.example.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {
    private val myList = listOf("Item 1", "Item 2", "Item 3")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val listView = view.findViewById<ListView>(R.id.loginView)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, myList)
        listView.adapter = adapter

        return view
    }
}