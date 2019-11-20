package com.example.realm.models;

import com.example.realm.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Cliente extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String nombre;
    @Required
    private String apellidos;
    @Required
    private  String correo;
    @Required
    private String numero_de_telefono;

    public Cliente() {
    }

    public void setId(int id){
        this.id = MyApplication.ClienteId.incrementAndGet();
        this.id=0;
    }
    public int getId(){
        return id;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getCorreo(){
        return correo;
    }
    public void setNumero_de_telefono(String numero_de_telefono){
        this.numero_de_telefono=numero_de_telefono;
    }
    public String getNumero_de_telefono(){
        return numero_de_telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
}
