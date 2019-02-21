/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

import java.util.ArrayList;

/**
 *
 * @author JDMorrigan
 */
public class Stock {
     
    private ArrayList<Libro> catalogo;

    private double caja;

    public Stock( )
    {
        catalogo = new ArrayList<Libro>( );
        caja = 100000;
    }

    
    
    
    public void cambiarCaja( double cCaja )
    {
      
    }

    public Libro buscarLibroPorTitulo( String tituloLibro )
    {
        return null;
       
        
    }

   
    public Libro buscarClaveLibro( String codigo )
    {
        
        return null;
    }

    
    public Libro registrarLibro( String tituloLibro, String codigoLibro, double precioVentaLibro, double precioCompraLibro, String autorLibro )
    {
        return null;
       
    }

    public boolean eliminarLibro( String codigo )
    {
        
        return false;
    }

   
    public boolean llenarStock( String codigo, int cantidad )
    {
        
        return false;
    }

   
    public boolean vender( String codigo, int cantidad )
    {

        return false;
    }

    
    public Libro darLibroMasCostoso( )
    {
       
        return null;
    }

   
    public Libro darLibroMasVendido( )
    {
        return null;
        
    }
    
    
    
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }


}
