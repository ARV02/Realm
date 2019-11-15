package com.example.realm.models;

import com.example.realm.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;

public class Cliente extends RealmObject {
    private int id;
    private String nombre;
    private String apellidos;
    private  String correo;
    private int numero_de_telefono;
    private Date createdAt;

    public Cliente() {
    }

    public void setId(int id){
        this.id = MyApplication.NoteId.incrementAndGet();
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
    public void setNumero_de_telefono(int numero_de_telefono){
        this.numero_de_telefono=numero_de_telefono;
    }
    public int getNumero_de_telefono(){
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
    public void setCreatedAt(Date createdAt){
        this.createdAt=createdAt;
    }
    public Date getCreatedAt(){
        return createdAt;
    }
}
