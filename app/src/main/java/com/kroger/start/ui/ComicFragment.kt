package com.kroger.start.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kroger.start.ComicViewModel
import com.kroger.start.R
import com.kroger.start.databinding.FragmentComicDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComicFragment : Fragment() {

    private val comicViewModel: ComicViewModel by viewModels()

    private val binding by lazy { FragmentComicDetailsBinding.inflate(layoutInflater, null, false) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
