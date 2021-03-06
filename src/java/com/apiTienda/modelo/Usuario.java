package com.apiTienda.modelo;

import java.io.Serializable;

/**
 *
 * @author ruben
 */
public class Usuario implements Serializable{
    private int id;
    private String nombre;
    private String imagen = "img/user.jpg";

    public Usuario() {
    }

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    

    public Usuario(int id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
