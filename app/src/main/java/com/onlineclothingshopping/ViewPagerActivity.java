package com.onlineclothingshopping;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import Adapter_Shopping.ViewPagerAdapter_Shopping;
import Fragments_Shopping.LoginFragment_Shopping;
import Fragments_Shopping.RegisterFragment_Shopping;

public class ViewPagerActivity extends AppCompatActivity  {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view_pager);

                viewPager=findViewById(R.id.viewpager);
                tabLayout=findViewById(R.id.tabId);

                ViewPagerAdapter_Shopping viewPagerAdapter=new ViewPagerAdapter_Shopping(getSupportFragmentManager());

                viewPagerAdapter.addFragment(new LoginFragment_Shopping(),"Login");
                viewPagerAdapter.addFragment(new RegisterFragment_Shopping(),"Register");

                viewPager.setAdapter(viewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);

        }
    }

