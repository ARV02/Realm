package com.example.realm.models;

import com.example.realm.app.MyApplication;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Board extends RealmObject {
    private int id;
    private String nombre;
    private String apellidos;
    private int numero_pedido;
    private Date createdAt;
    private RealmList <Cliente> datos;
    public Board(){
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setDatos(RealmList<Cliente> datos) {
        this.datos = datos;
    }

    public RealmList<Cliente> getDatos(){
        return datos;
    }
}
