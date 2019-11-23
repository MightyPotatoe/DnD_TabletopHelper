package com.example.dnd_tabletophelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class ChooseClassMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_multi_image_menu);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Barbarian"));
        tabLayout.addTab(tabLayout.newTab().setText("Bard"));
        tabLayout.addTab(tabLayout.newTab().setText("Cleric"));
        tabLayout.addTab(tabLayout.newTab().setText("Druid"));
        tabLayout.addTab(tabLayout.newTab().setText("Fighter"));
        tabLayout.addTab(tabLayout.newTab().setText("Monk"));
        tabLayout.addTab(tabLayout.newTab().setText("Paladin"));
        tabLayout.addTab(tabLayout.newTab().setText("Ranger"));
        tabLayout.addTab(tabLayout.newTab().setText("Rogue"));
        tabLayout.addTab(tabLayout.newTab().setText("Sorcerer"));
        tabLayout.addTab(tabLayout.newTab().setText("Warlock"));
        tabLayout.addTab(tabLayout.newTab().setText("Wizard"));
        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapterClassChoice pagerAdapterClassChoice = new PagerAdapterClassChoice(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapterClassChoice);

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //-----------------------Info Button OnClick Listener------------------------
        ImageButton infoButton = findViewById(R.id.pager_infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClassInfoActivity.class);
                int currentItem = viewPager.getCurrentItem();
                intent.putExtra("item1", currentItem);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}