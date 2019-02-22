/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

/**
 * @author  Juan David Ojeda
 * @author Tatiana Almansa
 */
public class Compra {
    
    
    public enum Compras{
        comprarLibros,venderLibros;
        }
    
    private Compras tipo;

    private int cantidad;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
     /**
     * 
     * @param tipo
     * @param cantidad
     
     */
    public Compra(Compras tipo, int cantidad) {
        
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    /**
     * Retorna el tipo del libro
     * @return tipo
     */
    
    public Compras getTipo() {
        return tipo;
    }
    
    /**
     * Modifica tipo de libro
     * @param tipo
     */
    public void setTipo(Compras tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna la cantidad del libro
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Modifica cantidad de libros
     * @param cantidad
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
