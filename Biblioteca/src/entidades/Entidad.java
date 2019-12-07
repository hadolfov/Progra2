/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Jherom Chacon
 */
public abstract class Entidad {
    protected int id;
    protected String nombre;
    protected Date fecha;
    protected boolean estado;
    public void setId(int id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaCreacion(Date fecha){this.fecha = fecha;}
    public void setEstado(boolean estado){this.estado = estado;}
    public int getId(){return this.id;}
    public String getNombre(){return this.nombre;}
    public Date getFechaCreacion(){return this.fecha;}
    public boolean getEstado(){return this.estado;}
}
