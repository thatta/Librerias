/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Clases;

import com.mycompany.consesionario1.Clases.Empleado;
import com.mycompany.consesionario1.Clases.Carro;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class Estandar extends Carro {
   
    /**
     *variable donde se guarda el codigo del vehiculo
     */
    private String codigo;
    /**
     *variable donde se guarda la referencia del vehiculo
     */
    private String referencia;

    /**
     *
    * @param codigo variable donde se guarda el codigo del vehiculo
    * @param referencia variable donde se guarda la referencia del vehiculo
    * @param marca variable donde se guarda la marca del vehiculo
    * @param color variable donde se guarda el color del vehiculo
    * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
    * @param precio variable donde se guarda el precio del vehiculo
     */
    public Estandar(String codigo, String referencia, String marca, String color, int puertas, double precio) {
        super(marca, color, puertas, precio);
        this.codigo = codigo;
        this.referencia = referencia;
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

    
    
    
}
