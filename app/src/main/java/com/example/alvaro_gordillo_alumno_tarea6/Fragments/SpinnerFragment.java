package com.example.alvaro_gordillo_alumno_tarea6.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.alvaro_gordillo_alumno_tarea6.LoginActivity;
import com.example.alvaro_gordillo_alumno_tarea6.MenuActivity;
import com.example.alvaro_gordillo_alumno_tarea6.R;

public class SpinnerFragment extends Fragment {

    Spinner spinner;
    ConstraintLayout constraintLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_spinner, container, false);

        return root;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinner = view.findViewById(R.id.spinner_color);
        constraintLayout = view.findViewById(R.id.cnst_colores);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.combo_color, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(getContext(),R.string.selectedRed,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.Rojo);
                        break;
                    case 1:
                        Toast.makeText(getContext(),R.string.selectedBlue,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.Azul);

                        break;
                    case 2:
                        Toast.makeText(getContext(),R.string.selectedGreen,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.Verde);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }






}