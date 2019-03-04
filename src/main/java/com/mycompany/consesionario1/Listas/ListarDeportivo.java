/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Listas;

import com.mycompany.consesionario1.Clases.Deportivo;
import com.mycompany.consesionario1.Clases.Venta;
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.consesionario1.Clases.Metodos;

/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class ListarDeportivo implements Metodos{
    /**
     *llamado de la clase ListarVendidos para acceder a los metodos y guargar objetos
     */
    ListarVendidos vendidos = new ListarVendidos();
    /**
     *declaracion del arrailist para guardar informacion en el objeto ventas
     */
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    /**
     *declaracion del arrailist para guardar informacion en el objeto deportivo
     */
    private ArrayList<Deportivo> deportivo = new ArrayList<Deportivo>();
    static Scanner leer = new Scanner(System.in);
    static Scanner op = new Scanner(System.in);
    
    /**
     *
     * @param deportivo
     */
    public ListarDeportivo(ArrayList<Deportivo> deportivo) {
        this.deportivo = deportivo;
    }

     /**
     *Constructor de la clase vacío
     */
    public ListarDeportivo() {
    }
    
    /**
     *
     * @param ventas
     */
    public void listarVendido(ArrayList<Venta> ventas){
        this.ventas = ventas;
    }
    
    
    /**
     * metodo para incluir el objeto Deportivo al arrayList
     * @param d
     */
    public void incluirDeportivo(Deportivo d){
        this.deportivo.add(d);
    }
    
    /**
     *Metodo para modificar el auto deportivo pidiendo como parametros el codigo, la marca y la referencia del vehiculo
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param Marca variable donde se guarda la marca del vehiculo
     * @param Referencia variable donde se guarda la referencia del vehiculo
     * @return
     */
    public boolean modificarDeportivo(String codigo, String Marca, String Referencia){
         boolean encontrado = false;
         int i = 0;
         while(encontrado == false && i<deportivo.size()){
             if(deportivo.get(i).getCodigo().compareToIgnoreCase(codigo)==0 && deportivo.get(i).getMarca().compareToIgnoreCase(Marca)==0 && deportivo.get(i).getReferencia().compareToIgnoreCase(Referencia)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
             System.out.println(deportivo.get(i).getCodigo()+"/"+deportivo.get(i).getMarca()+"/"+deportivo.get(i).getReferencia()+"/"+deportivo.get(i).getVelocidad()+"/"+deportivo.get(i).getColor()+"/"+deportivo.get(i).getPuertas()+"/"+deportivo.get(i).getPrecio());
             deportivo.remove(i);
             return false;
         }else{
             System.out.println("el auto no existe");
             return true;
         }
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
          
         while(encontrado == false && j<deportivo.size()){
             if(deportivo.get(j).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 j++;
             }
         }
         if(encontrado == true){
            System.out.println("existe");
            System.out.println(deportivo.get(j).getCodigo()+"/"+deportivo.get(j).getMarca()+"/"+deportivo.get(j).getReferencia()+"/"+deportivo.get(j).getVelocidad()+"/"+deportivo.get(j).getColor()+"/"+deportivo.get(j).getPuertas()+"/"+deportivo.get(j).getPrecio());
            System.out.print("Ingresa nombre cliente: ");
            String nombre = leer.nextLine();
            System.out.print("Ingresa apellido cliente: ");
            String apellido = leer.nextLine();
            
            String code = deportivo.get(j).getCodigo();
            String marca = deportivo.get(j).getMarca();
            double velocidad = deportivo.get(j).getVelocidad();
            String referencia =deportivo.get(j).getReferencia();
            String color =deportivo.get(j).getColor();
            int puertas = deportivo.get(j).getPuertas();
            double precio = deportivo.get(j).getPrecio();
            
            
            Venta ven = new Venta(nombre,apellido,code,referencia,velocidad,marca,color,puertas,precio);
            ven.setNombre(nombre);
            ven.setApellido(apellido);
            ven.setCodigo(codigo);
            ven.setMarca(marca);
            ven.setVelocidad(velocidad);
            ven.setReferencia(referencia);
            ven.setColor(color);
            ven.setPuertas(puertas);
            ven.setPrecio(precio);
            
            vendidos.incluirDeportivoVendido(ven);
           
            System.out.println("\n\n [::::::::::FACTURA:::::::::::]\n"+" El auto: "+marca+" "+referencia+ "\n Ha sido vendido al cliente: "+ nombre + " "+ apellido + "\n con el valor de: "+ precio+"\n [::::::::::FACTURA:::::::::::]\n\n");
            deportivo.remove(j); 
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
         while(encontrado == false && i<deportivo.size()){
             if(deportivo.get(i).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
            System.out.println(deportivo.get(i).getCodigo()+"/"+deportivo.get(i).getMarca()+"/"+deportivo.get(i).getReferencia()+"/"+deportivo.get(i).getVelocidad()+"/"+deportivo.get(i).getColor()+"/"+deportivo.get(i).getPuertas()+"/"+deportivo.get(i).getPrecio());
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
       if (deportivo != null) {
            for (Deportivo opc : deportivo) {
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
    public ArrayList<Deportivo> getDeportivo() {
        return deportivo;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Deportivo> getEstandar() {
        return deportivo;
    }

    /**
     *
     * @param deportivo
     */
    public void setDeportivo(ArrayList<Deportivo> deportivo) {
        this.deportivo = deportivo;
    }
    
    
   }

    
