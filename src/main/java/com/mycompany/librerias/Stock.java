/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librerias;

import java.util.ArrayList;

/**
 * @author  Juan David Ojeda
 * @author Tatiana Almansa
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
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el buscar libro por titulo
     * @return null
     */
    public Libro buscarLibroPorTitulo( String tituloLibro )
    {
        return null;
       
        
    }
    
    /**
     * Retorna el buscar libro por clave
     * @return null
     */
    public Libro buscarClaveLibro( String codigo )
    {
        
        return null;
    }
    
    /**
     * Retorna el registrar libro
     * @return null
     */
    
    public Libro registrarLibro( String tituloLibro, String codigoLibro, double precioVentaLibro, double precioCompraLibro, String autorLibro )
    {
        return null;
       
    }
    /**
     * Retorna el eliminar libro
     * @return falso
     */

    public boolean eliminarLibro( String codigo )
    {
        
        return false;
    }

    /**
     * Retorna el rllenar Stock
     * @return falso
     */
    public boolean llenarStock( String codigo, int cantidad )
    {
        
        return false;
    }

   /**
     * Retorna el vender libro
     * @return falso
     */
    public boolean vender( String codigo, int cantidad )
    {

        return false;
    }
    
    /**
     * Retorna el número de unidades vendidas mas costosas
     * @return null
     */
    
    public Libro darLibroMasCostoso( )
    {
       
        return null;
    }
    
    /**
     * Retorna el número de unidades  mas vendidas 
     * @return null
     */
   
    public Libro darLibroMasVendido( )
    {
        return null;
        
    }
    
     /**
     * Retorna un vector con catalogo de los libros
     * @return catalogo
     */
    
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
