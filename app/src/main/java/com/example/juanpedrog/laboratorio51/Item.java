package com.example.juanpedrog.laboratorio51;

public class Item {
    String nombre,fabricante,version;

    public Item(String nombre, String fabricante, String version) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
