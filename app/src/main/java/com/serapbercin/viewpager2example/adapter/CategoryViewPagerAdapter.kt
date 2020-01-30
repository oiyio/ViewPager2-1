package com.serapbercin.viewpager2example.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.serapbercin.viewpager2example.views.MyFragment

class CategoryViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun createFragment(position: Int) = MyFragment.instance()
    override fun getItemCount(): Int = 2
}



