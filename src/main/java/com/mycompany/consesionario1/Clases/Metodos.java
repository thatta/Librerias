/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Clases;

import com.mycompany.consesionario1.Clases.Empleado;

/**
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public interface Metodos {
    
    /**
     *Metodo a utilizar en comun para todas las clases del paquete Listas para vender el vehiculo
     * @return
     */
    public boolean vender();
    
    /**
     *Metodo a utilizar en comun para todas las clases del paquete Listas para buscar el vehiculo recibiendo como parametro un dato de tipo string llamado codigo
     * @param codigo
     * @return
     */
    public boolean Buscar(String codigo);
    
    /**
     *Metodo a utilizar en comun para todas las clases del paquete Listas para imprimir el vehiculo
     */
    public void imprimir();
   
}
