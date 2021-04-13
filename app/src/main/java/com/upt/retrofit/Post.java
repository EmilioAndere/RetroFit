package com.upt.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("name")
    @Expose
    private String nombre;

    @SerializedName("last_name")
    @Expose
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + nombre + '\'' +
                ", last_name='" + apellido +
                '}';
    }
}
