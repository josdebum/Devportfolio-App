package com.example.devportfolio

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class DevPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
         val fragmentList : MutableList<Fragment> = ArrayList()
        when (position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillsFragment()
            3 -> return ContactFragment()
        }
        return fragmentList [position]

    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "ABOUT"
            1 -> return "WORKS"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }

        return null

    }


}