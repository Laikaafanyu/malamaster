package com.example.malamaster.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.malamaster.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class HomeFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home2, container, false);
        // debugging
        Log.d("itemId", String.valueOf(R.id.add_button));
        Button addButton = view.findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to open the next activity
                Intent intent = new Intent(getActivity(), Adding.class);

                // Starting the next activity
//                startActivity(intent);
//        Setting up te Adding Activity as bottom sheet
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext());
                View bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_layout, null);
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
//                getActivity().overridePendingTransition(R.anim.slide_in_up, R.anim.stay);
            }
        });
        // Returning the view
        return view;
    }


}