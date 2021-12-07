package com.example.mytabviewsoccer.ui.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.mytabviewsoccer.R

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel
    lateinit var viewer: WebView
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        root = inflater.inflate(R.layout.profile_fragment, container, false)
        viewer = root.findViewById(R.id.webWindow2)

        viewer.webViewClient = WebViewClient()

        viewer.apply {
            loadUrl("https://clshs.rschoolteams.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }


        return root
    }
}