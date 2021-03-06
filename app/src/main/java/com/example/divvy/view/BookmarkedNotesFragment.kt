// Matt Ward B00671544
// Mobile Computing CSCI 4176 Autumn 2020
// Bookmarked Notes Fragment: Users can choose to bookmark any particular notes they want to follow more closely. They will appear on their home screens. Can also be accessed via user menu.

package com.example.divvy.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.divvy.R
import kotlinx.android.synthetic.main.fragment_archive.*
import kotlinx.android.synthetic.main.fragment_bookmarked_notes.*


class BookmarkedNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmarked_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate from Bookmarked Notes to HOME

        bnotes_to_home.setOnClickListener {
            val bnotestohomeuseraction = BookmarkedNotesFragmentDirections.bnotestohome()
            Navigation.findNavController(it).navigate(bnotestohomeuseraction)
        }

        // Navigate from Bookmarked Notes to User Menu

        bnotes_to_menu.setOnClickListener {
            val action = BookmarkedNotesFragmentDirections.bookmarkednotestousermenunav()
            Navigation.findNavController(it).navigate(action)
        }
    }

}