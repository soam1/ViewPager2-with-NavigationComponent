package com.example.navigationusingviewpager.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.navigationusingviewpager.R
import com.example.navigationusingviewpager.onboarding.screens.FirstOnBoardingScreen
import com.example.navigationusingviewpager.onboarding.screens.SecondOnBoardingScreen
import com.example.navigationusingviewpager.onboarding.screens.ThirdOnBoardingScreen

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList = arrayListOf<Fragment>(
            FirstOnBoardingScreen(),
            SecondOnBoardingScreen(),
            ThirdOnBoardingScreen(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.findViewById<ViewPager2>(R.id.viewPager).adapter = adapter
        return view


    }


}