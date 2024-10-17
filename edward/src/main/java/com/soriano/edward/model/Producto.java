package com.soriano.edward.model;


public class Producto {
    private Integer idLibro;
    private String nombreLibro;
    
    private String editorial;
    private Integer cantidad;
    private String año;

    public Producto() {
        
    }

    public Producto(Integer idLibro, String nombreLibro, String editorial, Integer cantidad, String año) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.editorial = editorial;
        this.cantidad = cantidad;
        this.año = año;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Producto [idLibro=" + idLibro + ", nombreLibro=" + nombreLibro + ", editorial=" + editorial
                + ", cantidad=" + cantidad + ", año=" + año + "]";
    }

}
