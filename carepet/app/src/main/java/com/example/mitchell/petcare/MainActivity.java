package com.example.mitchell.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton FAB;
    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.pet1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first_pet = new Intent(MainActivity.this, Pet1.class);
                startActivity(first_pet);
            }
        });

        Button bt2 = (Button) findViewById(R.id.pet2);
        bt2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent second_pet = new Intent(MainActivity.this, Pet2.class);
                startActivity(second_pet);
            }
        });

        Button bt3 = (Button) findViewById(R.id.pet3);
        bt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent third_pet = new Intent(MainActivity.this, pet3.class);
                startActivity(third_pet);
            }
        });

        Button bt4 = (Button) findViewById(R.id.pet4);
        bt4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent forth_pet = new Intent(MainActivity.this, Pet4.class);
                startActivity(forth_pet);
            }
        });
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));


        FAB = (ImageButton) findViewById(R.id.fab);
        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_page = new Intent(MainActivity.this, AddActivity.class);
                startActivity(add_page);
            }
        });
    }

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the emnu; this adds items to the action bar if it is present
        // getMenuInflater().inflate(R.menu.menu_main, menu);
    //}

    public ImageButton getFAB() {
        return FAB;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        if(i==0){
            fragment = new FragmentToday();
        }
        else if(i==1){
            fragment = new FragmentTomorrow();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}