/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Clases;

/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class Empleado {
    private String nombre;
    private String NIT;
    boolean vendido= false;
    boolean ventaAutoEstandar = false;
    boolean ventaAutoDeportivo = false;
    boolean ventaAutoCarga = false;
    boolean ventaAutoPersonalizado = false;
    
    /**
     *
     */
    public Empleado(){
        
    }

    /**
     *
     * @param nombre
     * @param NIT
     */
    public Empleado(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }
    
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getNIT() {
        return NIT;
    }

    /**
     *
     * @param NIT
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     *
     * @return
     */
    public boolean isVendido() {
        return vendido;
    }

    /**
     *
     * @param vendido
     */
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    /**
     *
     * @return
     */
    public boolean isVentaAutoEstandar() {
        return ventaAutoEstandar;
    }

    /**
     *
     * @param ventaAutoEstandar
     */
    public void setVentaAutoEstandar(boolean ventaAutoEstandar) {
        this.ventaAutoEstandar = ventaAutoEstandar;
    }

    /**
     *
     * @return
     */
    public boolean isVentaAutoDeportivo() {
        return ventaAutoDeportivo;
    }

    /**
     *
     * @param ventaAutoDeportivo
     */
    public void setVentaAutoDeportivo(boolean ventaAutoDeportivo) {
        this.ventaAutoDeportivo = ventaAutoDeportivo;
    }

    /**
     *
     * @return
     */
    public boolean isVentaAutoCarga() {
        return ventaAutoCarga;
    }

    /**
     *
     * @param ventaAutoCarga
     */
    public void setVentaAutoCarga(boolean ventaAutoCarga) {
        this.ventaAutoCarga = ventaAutoCarga;
    }

    /**
     *
     * @return
     */
    public boolean isVentaAutoPersonalizado() {
        return ventaAutoPersonalizado;
    }

    /**
     *
     * @param ventaAutoPersonalizado
     */
    public void setVentaAutoPersonalizado(boolean ventaAutoPersonalizado) {
        this.ventaAutoPersonalizado = ventaAutoPersonalizado;
    }
    
    
}

