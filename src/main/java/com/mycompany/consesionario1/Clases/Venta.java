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
public class Venta extends Carro {
    String nombre, apellido;
    String codigo, referencia;
    double velocidad, capacidad;

    /**
     *
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Venta(String marca, String color, int puertas, double precio) {
        super(marca, color, puertas, precio);
    }

    /**
     *
    * @param nombre variable donde se guarda el nombre del cliente
    * @param apellido variable donde se guarda el apellido del cliente
    * @param codigo variable donde se guarda el codigo del vehiculo
    * @param referencia variable donde se guarda la referencia del vehiculo
    * @param marca variable donde se guarda la marca del vehiculo
    * @param color variable donde se guarda el color del vehiculo
    * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
    * @param precio variable donde se guarda el precio del vehiculo
     */
    public Venta(String nombre, String apellido, String codigo, String referencia, String marca, String color, int puertas, double precio) {
        super(marca, color, puertas, precio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.referencia = referencia;
    }

    /**
     *
     * @param nombre variable donde se guarda el nombre del cliente
     * @param apellido variable donde se guarda el apellido del cliente
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param referencia variable donde se guarda la referencia del vehiculo
     * @param velocidad variable donde se guarda la velocidad del vehiculo
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Venta(String nombre, String apellido, String codigo, String referencia, double velocidad, String marca, String color, int puertas, double precio) {
        super(marca, color, puertas, precio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.referencia = referencia;
        this.velocidad = velocidad;
    }

    /**
     *
     * @param nombre variable donde se guarda el nombre del cliente
     * @param apellido variable donde se guarda el apellido del clienteo
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param referencia variable donde se guarda la referencia del vehiculo
     * @param velocidad variable donde se guarda la capacidad de carga del vehiculo
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Venta(String nombre, String apellido, String codigo, String referencia, String marca, String color, int puertas,double velocidad, double precio) {
        super(marca, color, puertas, precio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.referencia = referencia;
        this.velocidad = velocidad;
    }
    
    /**
     *
     * @param nombre variable donde se guarda el nombre del cliente
     * @param apellido variable donde se guarda el apellido del cliente
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param referencia variable donde se guarda la referencia del vehiculo
     * @param capacidad variable donde se guarda la capacidad de carga del vehiculo
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Venta(String nombre, String apellido, String codigo, String referencia, String marca, String color, double capacidad, int puertas, double precio) {
        super(marca, color, puertas, precio);
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.referencia = referencia;
        this.capacidad = capacidad;
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
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public double getVelocidad() {
        return velocidad;
    }

    /**
     *
     * @param velocidad
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
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
