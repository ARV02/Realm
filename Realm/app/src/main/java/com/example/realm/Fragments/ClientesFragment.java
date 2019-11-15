package com.example.realm.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.realm.R;
import com.example.realm.models.Cliente;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClientesFragment extends Fragment {
    private EditText nomb,apellidos,nume,correo;
    private Button guardar;

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
        Registrar(rootView);
        return rootView;
    }
    public void Registrar(View v){
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cliente cliente = new Cliente();
                int numero = Integer.parseInt(nume.getText().toString());
                String nom = nomb.getText().toString();
                String apellido = apellidos.getText().toString();
                String email = correo.getText().toString();
                cliente.setNombre(nom);
                cliente.setApellidos(apellido);
                cliente.setCorreo(email);
                cliente.setNumero_de_telefono(numero);
                limpiar();
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
