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
public class Libro {
    
     
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
     
    /**
     * Es el codigo del libro
     */
    
    private String Codigo;
    
    /**
     * Es el titulo del libro
     */
    
    private String TituloLibro;
    
    /**
     * Es el autor del libro
     */
    
    private String autoresLibro;

    
    /**
     * Es el precio venta del libro
     */
    private double precioVenta;

    /**
     * Es el precio compra del libro
     */
    
    private double precioCompra;

   /**
     * cantidad actual del libro
     */
    
    private int cantidadActual;

    /**
     * Es el vector con las transacciones que se hicieron 
     */
    private ArrayList<Compra> transacciones;
    
     // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo libro con los datos suministrados 
     * @param Codigo
     * @param TituloLibro
     * @param autoresLibro
     * @param precioCompra
     * @param transacciones
     * @param precioVenta
     */

    public Libro(String Codigo, String TituloLibro, String autoresLibro, double precioVenta, double precioCompra, int cantidadActual, ArrayList<Compra> transacciones) {
        this.Codigo = Codigo;
        this.TituloLibro = TituloLibro;
        this.autoresLibro = autoresLibro;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidadActual = 0;
        this.transacciones = transacciones;
    }

  
     
    /**
     * Retorna el codigo del libro
     * @return Codigo
     */

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    /**
     * Retorna el titulo del libro
     * @return TituloLibro
     */
    public String getTituloLibro() {
        return TituloLibro;
    }
     /**
     * Modifica titulo
     * @param TituloLibro 
     */
    public void setTituloLibro(String TituloLibro) {
        this.TituloLibro = TituloLibro;
    }
    /**
     * Retorna el autor del libro
     * @return autoresLibro
     */

    public String getAutoresLibro() {
        return autoresLibro;
    }
    /**
     * Modifica autor
     * @param autoresLibro 
     */

    public void setAutoresLibro(String autoresLibro) {
        this.autoresLibro = autoresLibro;
    }
    /**
     * Retorna el precio venta del libro
     * @return precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }
    /**
     * Modifica precio de venta
     * @param precioVenta 
     */

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    /**
     * Retorna el precio compra del libro
     * @return precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }
    /**
     * Modifica precio de compra
     * @param precioCompra 
     */

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    /**
     * Modifica cantidad actual
     * @param cantidadActual 
     */

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public ArrayList<Compra> getTransacciones() {
        return transacciones;
    }
    /**
     * Modifica el arreglo de las transacciones
     * @param transacciones 
     */
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
