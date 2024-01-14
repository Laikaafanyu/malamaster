package com.example.malamaster.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.malamaster.R;
import com.example.malamaster.databinding.ActivityRecipeDetailBinding;

public class RecipeDetailActivity extends AppCompatActivity {

    private ActivityRecipeDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

//        Button getstartedButton = findViewById(R.id.Milk_button);
//        getstartedButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Create an intent to open the next activity
//                Intent intent = new Intent(RecipeDetailActivity.this, HomeActivity.class);
//
//                // Starting the next activity
//                startActivity(intent);
//            }
//        });
    }
}