package com.example.realm.models;

import com.example.realm.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;

public class Cliente extends RealmObject {
    private int id;
    private String nombre;
    private String apellidos;
    private int pedido;
    private Date createdAt;
    public void setId(int id){
        this.id = MyApplication.NoteId.incrementAndGet();
        this.id=0;
    }
    public int getId(){
        return id;
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
    public void setPedido(int pedido){
        this.pedido=pedido;
    }
    public int getPedido(){
        return pedido;
    }
    public void setCreatedAt(Date createdAt){
        this.createdAt=createdAt;
    }
    public Date getCreatedAt(){
        return createdAt;
    }
}
