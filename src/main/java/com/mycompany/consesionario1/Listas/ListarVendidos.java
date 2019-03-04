/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Listas;

import com.mycompany.consesionario1.Clases.Carga;
import com.mycompany.consesionario1.Clases.Deportivo;
import com.mycompany.consesionario1.Clases.Estandar;
import com.mycompany.consesionario1.Clases.Modificados;
import com.mycompany.consesionario1.Clases.Venta;
import java.util.ArrayList;
import com.mycompany.consesionario1.Clases.Metodos;

/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class ListarVendidos {
     /**
     *declaracion del arrailist para guardar informacion en el objeto ventas
     */
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
     /**
     *declaracion del arrailist para obtener informacion en el objeto deportivo
     */
    private ArrayList<Deportivo> deportivo = new ArrayList<Deportivo>();
    /**
     *declaracion del arrailist para obtener informacion en el objeto Modificados
     */
    private ArrayList<Modificados> modificados = new ArrayList<Modificados>();
    /**
     *declaracion del arrailist para obtener informacion en el objeto estandar
     */
    private ArrayList<Estandar> estandar = new ArrayList<Estandar>();
    /**
     *declaracion del arrailist para obtener informacion en el objeto carga
     */
    private ArrayList<Carga> carga = new ArrayList<Carga>();
    
    /**
     *
     * @param venta
     */
    public ListarVendidos(ArrayList<Venta> venta) {
        this.ventas = venta;
    }
    
    /**
     *constructor vacio de la clase
     */
    public ListarVendidos(){
        
    }
    
    /**
     *Metodo para incluir el objeto deportivo vendido dentro del array ventas
     * @param v
     */
    public void incluirDeportivoVendido(Venta v){
        this.ventas.add(v);
    }
    
    /**
     *Metodo para incluir el objeto carga vendido dentro del array ventas
     * @param a
     */
    public void incluirCarga(Venta a){
        this.ventas.add(a);
    }
    
    /**
     *Metodo para incluir el objeto Estandar vendido dentro del array ventas
     * @param b
     */
    public void incluirEstandar(Venta b){
        this.ventas.add(b);
    }
    
    /**
     *Metodo para incluir el objeto Modificado vendido dentro del array ventas
     * @param c
     */
    public void incluirModificado(Venta c){
        this.ventas.add(c);
    }
    
    /**
     *metodo que imprime el listado de todos los autos vendidos
     */
    public void imprimirVendidos(){
         if (ventas != null) {
            for (Venta opc : ventas) {
                System.out.println(opc.getNombre()+"/"+opc.getApellido()+"/"+opc.getCodigo()+"/"+opc.getReferencia()+"/"+opc.getVelocidad()+"/"+opc.getMarca()+"/"+opc.getColor()+"/"+opc.getPuertas()+"/"+opc.getPrecio()+"$");
            }
            
            }
          else {
            System.out.println("No hay autos para mostrar");
        }
      }

   
    
    
    
}
