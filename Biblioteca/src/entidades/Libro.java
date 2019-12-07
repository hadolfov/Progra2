/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Libro extends Entidad{
    private int idCategoria;
    public Libro(int id, int idCategoria){
        this.id = id;
        this.idCategoria = idCategoria;
    }
    public void setCategoria(int id){this.idCategoria = id;}
    public int getCategoria(){return this.idCategoria;}
}
