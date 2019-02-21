/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

import java.util.ArrayList;

/**
 * @author  Juan David Ojeda
 * @author THATA
 */
public class Libro {
    
    private String Codigo;

   
    private String TituloLibro;
    
    
    private String autoresLibro;

    
    private double precioVenta;

    
    private double precioCompra;

   
    private int cantidadActual;

    
    private ArrayList<Compra> transacciones;

    public Libro(String Codigo, String TituloLibro, String autoresLibro, double precioVenta, double precioCompra, int cantidadActual, ArrayList<Compra> transacciones) {
        this.Codigo = Codigo;
        this.TituloLibro = TituloLibro;
        this.autoresLibro = autoresLibro;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidadActual = 0;
        this.transacciones = transacciones;
    }

  
     
   

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTituloLibro() {
        return TituloLibro;
    }

    public void setTituloLibro(String TituloLibro) {
        this.TituloLibro = TituloLibro;
    }

    public String getAutoresLibro() {
        return autoresLibro;
    }

    public void setAutoresLibro(String autoresLibro) {
        this.autoresLibro = autoresLibro;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public ArrayList<Compra> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Compra> transacciones) {
        this.transacciones = transacciones;
    }

    
  

    public boolean vender( int cCantidad )
    {
        return false;
        
    }

    
    public void llenarStock( int cCantidad )
    {

    }

}
