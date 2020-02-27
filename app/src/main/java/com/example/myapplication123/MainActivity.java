package com.example.myapplication123;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView=findViewById(R.id.btm_nav);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();

                if(id==R.id.home){
                    HomeFragment fragment=new HomeFragment();
                    FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.frame_layout, fragment);
                    fragmentTransaction1.commit();
                }

                if(id==R.id.profile){
                    ProfileFragment fragment=new ProfileFragment();
                    FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.frame_layout, fragment);
                    fragmentTransaction2.commit();
                }

                if(id==R.id.contact){
                    ContactFragment fragment=new ContactFragment();
                    FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.frame_layout, fragment);
                    fragmentTransaction3.commit();
                }
                if(id==R.id.textView){
                    ContactFragment fragment1=new ContactFragment();
                    FragmentTransaction fragmentTransaction4=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.frame_layout, fragment1);
                    fragmentTransaction4.commit();
                }
                return true;
            }
        });

        navigationView.setSelectedItemId(R.id.home);


    }


}
