/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Clases;

/**
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 * 
 * Clase donde se obtienen atributos la clase padre para obtener las variables en comun y poder usarlas para crear el objeto Carga
 */
public class Carga extends Carro{
    /**
     *variable donde se guarda el codigo del vehiculo
     */
    private String codigo;
    /**
     *variable donde se guarda la referencia del vehiculo
     */
    private String referencia;
    /**
     *variable donde se guarda la capacidad de carga del vehiculo
     */
    private double capacidad;

    /**
     *
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param referencia variable donde se guarda la referencia del vehiculo
     * @param capacidad variable donde se guarda la capacidad de carga del vehiculo
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Carga(String codigo, String referencia, double capacidad, String marca, String color, int puertas, double precio) {
        super(marca, color, puertas, precio);
        this.codigo = codigo;
        this.referencia = referencia;
        this.capacidad = capacidad;
    }

    /**
     *
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     *
     * @param referencia
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     *
     * @return
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     *
     * @param capacidad
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    
}
