package com.example.malamaster;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    // Declare fragments or pages for navigation
    private Fragment fragment1;
    private Fragment fragment2;
    private Fragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);


        // Set the initial Fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, fragment1).commit();

        // Handle Bottom Navigation item clicks
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.home) {
                    selectedFragment = fragment1;
                } else if (itemId == R.id.hotRecipes) {
                    selectedFragment = fragment2;
                } else if (itemId == R.id.about) {
                    selectedFragment = fragment3;
                }

                if(selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFragment).commit();
                    return  true;
                }
                return false;
            }

        });
    }
}