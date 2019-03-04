/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Clases;

import java.awt.Color;
import java.util.Scanner;

/**
 * @author Juan David ojeda bernal
 * @author Karen Tatiana Almansa jimenez
 * 
 * 
 * Clase abstracta donde las variables se han de heredar a las clases hijas: Estandar, Carga, Modificados, Deportivos
 */
public abstract class Carro {
    private String marca;
    private String color;
    private int puertas;
    private double precio;

    /**
     *
     * @param marca variable donde se guarda la marca del vehiculo
     * @param color variable donde se guarda el color del vehiculo
     * @param puertas variable donde se guarda la cantidad de puertas del vehiculo
     * @param precio variable donde se guarda el precio del vehiculo
     */
    public Carro(String marca, String color, int puertas, double precio) {
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.precio = precio;
    }
    
    /**
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     *
     * @param puertas
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    
}
