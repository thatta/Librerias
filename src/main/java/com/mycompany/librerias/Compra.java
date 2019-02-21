/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

/**
 * @author  Juan David Ojeda
 * @author THATA
 */
public class Compra {
    
    
    public enum Compras{
        comprarLibros,venderLibros;
        }
    
    private Compras tipo;

    private int cantidad;

    public Compra(Compras tipo, int cantidad) {
        
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Compras getTipo() {
        return tipo;
    }

    public void setTipo(Compras tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
