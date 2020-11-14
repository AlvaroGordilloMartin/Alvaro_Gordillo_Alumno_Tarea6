package com.example.alvaro_gordillo_alumno_tarea6.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.alvaro_gordillo_alumno_tarea6.R;
import com.example.alvaro_gordillo_alumno_tarea6.model.Torneo;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private TextInputEditText tie_nomTorneo;
    private  TextInputEditText tie_organizadorTorneo;
    Button mostrarTorneo;
    TextView nomTorneo;
    TextView orgTorneo;
    Torneo torneo;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        mostrarTorneo = root.findViewById(R.id.bt_mostrar);
        tie_nomTorneo = root.findViewById(R.id.tie_nomTorneo);
        tie_organizadorTorneo = root.findViewById(R.id.tie_organizadorTorneo);
        nomTorneo = root.findViewById(R.id.txt_mostrarNom);
        orgTorneo = root.findViewById(R.id.txt_mostrarOrg);

        mostrarTorneo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                torneo = new Torneo(tie_nomTorneo.getText().toString(),tie_organizadorTorneo.getText().toString());

                nomTorneo.setText(torneo.getNombre());
                orgTorneo.setText(torneo.getOrganizador());

                //Toast.makeText(getContext(),"Nombre del torneo: "+torneo.getNombre()+"\nOrganizador: "+torneo.getOrganizador(),Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }




}