package com.example.kotlinpool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.hyg.widget.bottombar.CustomBottomBar
import com.hyg.widget.bottombar.CustomBottomEntity

class BottomBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)
        val bottomBar = findViewById<CustomBottomBar>(R.id.bottom_bar)
        val vp = findViewById<ViewPager2>(R.id.bottom_vp)
        bottomBar.setBottomItemEntities(initBottomBarData())
        vp.adapter = FragmentAdapter(this,bottomBar.getItemCount())
        bottomBar.bindViewPager2(vp)
        bottomBar.setCurrentPosition(1)
    }

    private fun initBottomBarData():MutableList<CustomBottomEntity>{
        val data = mutableListOf<CustomBottomEntity>()
        val entity1 = CustomBottomEntity()
        entity1.text = "首页"
        entity1.unSelectedIconId = R.mipmap.ic_home
        entity1.selectedIconId = R.mipmap.ic_home_selected
        data += entity1

        val entity2 = CustomBottomEntity()
        entity2.text = "留学"
        entity2.unSelectedIconId = R.mipmap.ic_home
        entity2.selectedIconId = R.mipmap.ic_home_selected
        data += entity2

        val entity3 = CustomBottomEntity()
        entity3.text = "发现"
        entity3.unSelectedIconId = R.mipmap.ic_home
        entity3.selectedIconId = R.mipmap.ic_home_selected
        data += entity3
        return data
    }

    class FragmentAdapter(activity: FragmentActivity,val count: Int): FragmentStateAdapter(activity){

        override fun getItemCount(): Int = count

        override fun createFragment(position: Int): Fragment {
            val fragment = BottomFragment()
            val bundle = Bundle()
            bundle.putInt("position",position)
            fragment.arguments = bundle
            return fragment
        }

    }
}