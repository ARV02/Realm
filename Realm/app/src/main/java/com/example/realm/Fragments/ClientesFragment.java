package com.example.realm.Fragments;


import android.os.Bundle;

import androidx.constraintlayout.solver.widgets.Snapshot;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.realm.R;
import com.example.realm.app.MyApplication;
import com.example.realm.models.Cliente;

import java.util.UUID;

import io.realm.Realm;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientesFragment extends Fragment {
    private EditText nomb,apellidos,nume,correo;
    private Button guardar;
    Realm realmDb;

    public ClientesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_clientes, container, false);
        nomb= rootView.findViewById(R.id.nom);
        apellidos = rootView.findViewById(R.id.apellidos);
        nume = rootView.findViewById(R.id.numero);
        correo = rootView.findViewById(R.id.correo);
        guardar = rootView.findViewById(R.id.guardar);
        Realm.init(getActivity());
        realmDb=Realm.getDefaultInstance();
        Registrar(rootView);
        return rootView;
    }
    public void Registrar(View v){
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    realmDb.beginTransaction();
                    Number maxId = realmDb.where(Cliente.class).max("id");
                    int nextId = (maxId == null) ? 1 : maxId.intValue() + 1;
                    Cliente cliente = realmDb.createObject(Cliente.class, nextId);
                    String numero = nume.getText().toString();
                    String nom = nomb.getText().toString();
                    String apellido = apellidos.getText().toString();
                    String email = correo.getText().toString();
                    cliente.setNombre(nom);
                    cliente.setApellidos(apellido);
                    cliente.setCorreo(email);
                    cliente.setNumero_de_telefono(numero);
                    realmDb.insertOrUpdate(cliente);
                    realmDb.commitTransaction();
                    limpiar();
                    Toast.makeText(getContext(),"Cliente registrado exitosamente",Toast.LENGTH_LONG).show();
                }catch (Exception ex){
                    Log.d("RError",ex.toString());
                    Toast.makeText(getContext(), "Error en realm", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void limpiar(){
        nomb.setText("");
        apellidos.setText("");
        correo.setText("");
        nume.setText("");
    }
}
