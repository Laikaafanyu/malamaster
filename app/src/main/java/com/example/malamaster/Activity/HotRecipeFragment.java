package com.example.malamaster.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.malamaster.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HotRecipeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot_recipe, container, false);
        CardView saladCard = view.findViewById(R.id.cardViewSalad);
        CardView fufunEruCard = view.findViewById(R.id.cardViewFufunEru);
        CardView ndoleCard = view.findViewById(R.id.cardViewNdole);
        CardView blacksoupCard = view.findViewById(R.id.cardViewBlackSoup);

        saladCard.setOnClickListener(this::onClick);
        fufunEruCard.setOnClickListener(this::onClick);
        ndoleCard.setOnClickListener(this::onClick);
        blacksoupCard.setOnClickListener(this::onClick);

//        switch (view.getId()) {
//                case

//        }

        // Inflate the layout for this fragment
        return view;
    }
    public void onClick(View v) {
        int itemId = v.getId();
        if (itemId == R.id.cardViewSalad) {
            Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
            intent.putExtra("cardNum", 1);
            // Starting the next activity
            startActivity(intent);
        } else if (itemId == R.id.cardViewFufunEru) {
            Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
            intent.putExtra("cardNum", 2);
            // Starting the next activity
            startActivity(intent);
        } else if (itemId == R.id.cardViewNdole) {
            Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
            intent.putExtra("cardNum", 3);
            // Starting the next activity
            startActivity(intent);
        }else if (itemId == R.id.cardViewBlackSoup) {
            Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
            intent.putExtra("cardNum", 4);
            // Starting the next activity
            startActivity(intent);
        }

    }
}