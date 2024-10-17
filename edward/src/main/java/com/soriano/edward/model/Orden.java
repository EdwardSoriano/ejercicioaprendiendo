package com.soriano.edward.model;

import java.util.Date;

public class Orden {
    
    private Integer idOrden;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;

    public Orden() {
    }
    
    
    public Orden(Integer idOrden, String numero, Date fechaCreacion, Date fechaRecibido) {
        this.idOrden = idOrden;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibido = fechaRecibido;
    }


    public Integer getIdOrden() {
        return idOrden;
    }
    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaRecibido() {
        return fechaRecibido;
    }
    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }
    @Override
    public String toString() {
        return "Orden [idOrden=" + idOrden + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion
                + ", fechaRecibido=" + fechaRecibido + "]";
    }
}
