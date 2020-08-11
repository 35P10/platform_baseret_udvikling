package com.example.carteraclientes;

public class cliente {
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;

    public cliente(String nombre,String telefono)
    {
        this.nombre=nombre;
        this.telefono=telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
