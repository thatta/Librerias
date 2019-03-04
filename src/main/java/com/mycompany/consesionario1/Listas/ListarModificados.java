/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Listas;

import com.mycompany.consesionario1.Clases.Modificados;
import com.mycompany.consesionario1.Clases.Venta;
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.consesionario1.Clases.Metodos;

/**
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class ListarModificados implements Metodos{
    private ArrayList<Modificados> modificados = new ArrayList<Modificados>();
    ListarVendidos vendidos = new ListarVendidos();
    static Scanner leer = new Scanner(System.in);
    static Scanner op = new Scanner(System.in);
    
    /**
     *
     * @param modificado
     */
    public ListarModificados(ArrayList<Modificados> modificado) {
        this.modificados = modificado;
    }

    /**
     *Constructor de la clase vacío
     */
    public ListarModificados() {
    }
 
    /**
     * metodo para incluir el objeto Modificados al arrayList
     * @param m
     */
    public void incluirModificados(Modificados m){
        this.modificados.add(m);
    }

   
     
     /**
     *Metodo vender heredado de la interface metodos del paquete clases
     */

    @Override
    public boolean vender() {
      boolean encontrado = false;
         int j = 0;
          System.out.print("Ingresa codigo del vehiculo que va a vender: ");
          String codigo = leer.nextLine();
          
         while(encontrado == false && j<modificados.size()){
             if(modificados.get(j).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 j++;
             }
         }
         if(encontrado == true){
            System.out.println("existe");
            System.out.println(modificados.get(j).getCodigo()+"/"+modificados.get(j).getMarca()+"/"+modificados.get(j).getReferencia()+"/"+modificados.get(j).getColor()+"/"+modificados.get(j).getPuertas()+"/"+modificados.get(j).getPrecio());
            System.out.print("Ingresa nombre cliente: ");
            String nombre = leer.nextLine();
            System.out.print("Ingresa apellido cliente: ");
            String apellido = leer.nextLine();
            
            String code = modificados.get(j).getCodigo();
            String marca = modificados.get(j).getMarca();
            double velocidad = modificados.get(j).getVelocidad();
            String referencia = modificados.get(j).getReferencia();
            String color = modificados.get(j).getColor();
            int puertas = modificados.get(j).getPuertas();
            double precio = modificados.get(j).getPrecio();
            
            
            Venta ven = new Venta(nombre,apellido,code,referencia,marca,color,puertas,velocidad,precio);
            ven.setNombre(nombre);
            ven.setApellido(apellido);
            ven.setCodigo(codigo);
            ven.setMarca(marca);
            ven.setVelocidad(velocidad);
            ven.setReferencia(referencia);
            ven.setColor(color);
            ven.setPuertas(puertas);
            ven.setPrecio(precio);
            
            vendidos.incluirModificado(ven);
           
            System.out.println("\n\n [::::::::::FACTURA:::::::::::]\n"+" El auto: "+marca+" "+referencia+ "\n Ha sido vendido al cliente: "+ nombre + " "+ apellido + "\n con el valor de: "+ precio+"\n [::::::::::FACTURA:::::::::::]\n\n");
            modificados.remove(j); 
            return true;
             
         }else{
             System.out.println("el auto no existe");
             return false;
         }
        
    }
    
     /**
     *Metodo buscar heredado de la interface metodos del paquete clases que recibe como parametros un string codigo
     */
    
    @Override
    public boolean Buscar(String codigo) {
        boolean encontrado = false;
         int i = 0;
         while(encontrado == false && i<modificados.size()){
             if(modificados.get(i).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
             System.out.println(modificados.get(i).getCodigo()+"/"+modificados.get(i).getMarca()+"/"+modificados.get(i).getReferencia()+"/"+modificados.get(i).getColor()+"/"+modificados.get(i).getPuertas()+"/"+modificados.get(i).getPrecio());
             return false;
         }else{
             System.out.println("el auto no existe");
             return true;
         }
    }

     /**
     *Metodo imprimir heredado de la interface metodos del paquete clases
     */
    
    @Override
    public void imprimir() {
         if (modificados != null) {
            for (Modificados opc : modificados) {
                System.out.println(opc.getCodigo()+"/"+opc.getReferencia()+"/"+opc.getVelocidad()+"/"+opc.getMarca()+"/"+opc.getColor()+"/"+opc.getPuertas()+"/"+opc.getPrecio()+"$");
                }
            }
          else {
            System.out.println("No hay autos para mostrar");
        }
    }
    
    
     /**
     *
     * @return
     */
    public ArrayList<Modificados> getModificados() {
        return modificados;
    }

    /**
     *
     * @param modificados
     */
    public void setModificados(ArrayList<Modificados> modificados) {
        this.modificados = modificados;
    }
    
}
