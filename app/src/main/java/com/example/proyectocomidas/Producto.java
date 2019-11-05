package com.example.proyectocomidas;

public class Producto {
    private String nombre;
    private String descripcion;
    private String imagen;
    private Boolean disponible;
    private String idCategorias;

    public Producto(String nombre, String descripcion, String imagen, Boolean disponible, String idCategorias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.disponible = disponible;
        this.idCategorias = idCategorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(String idCategorias) {
        this.idCategorias = idCategorias;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", disponible=" + disponible +
                ", idCategorias='" + idCategorias + '\'' +
                '}';
    }
}