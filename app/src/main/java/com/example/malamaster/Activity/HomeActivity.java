package com.example.malamaster.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.malamaster.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import com.example.malamaster.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityHomeBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

//     replaceFragment(new AboutFragment());

     binding.bottomNavgationView.setBackground(null);

        replaceFragment(new HomeFragment());

     binding.bottomNavgationView.setOnItemSelectedListener(item -> {
         int itemId = item.getItemId();
//         Log.d("itemId", String.valueOf(itemId));
//
//         Log.d("HomeId", String.valueOf(R.id.Home));
         if (itemId == R.id.Home) {
             replaceFragment(new HomeFragment());
         } else if (itemId == R.id.HotRecipes) {
             replaceFragment(new HotRecipeFragment());
         } else if (itemId == R.id.About) {
             replaceFragment(new AboutFragment());
         }
                 return true;
     }
     );

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}