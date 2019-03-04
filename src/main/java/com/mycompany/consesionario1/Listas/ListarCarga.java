/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consesionario1.Listas;

import com.mycompany.consesionario1.Clases.Carga;
import com.mycompany.consesionario1.Clases.Venta;
import static com.mycompany.consesionario1.Listas.ListarDeportivo.leer;
import java.util.ArrayList;
import com.mycompany.consesionario1.Clases.Metodos;

/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class ListarCarga implements Metodos {
    /**
     *declaracion del arrailist para guardar el objeto carga
     */
    private ArrayList<Carga> carga = new ArrayList<Carga>();
    
    /**
     *llamado de la clase ListarVendidos para acceder a los metodos y guargar objetos
     */
    ListarVendidos vendidos = new ListarVendidos();
    
    /**
     *
     * @param carga
     */
    public ListarCarga(ArrayList<Carga> carga) {
        this.carga = carga;
    }

    /**
     *Constructor de la clase vacío
     */
    public ListarCarga() {
    }

    /**
     * metodo para incluir el objeto carga al arrayList
     * @param c
     */
    public void incluirCarga(Carga c){
        this.carga.add(c);
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Carga> getCarga() {
        return carga;
    }

    /**
     *
     * @param carga
     */
    public void setCarga(ArrayList<Carga> carga) {
        this.carga = carga;
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
          
         while(encontrado == false && j<carga.size()){
             if(carga.get(j).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 j++;
             }
         }
         if(encontrado == true){
            System.out.println("existe");
            System.out.println(carga.get(j).getCodigo()+"/"+carga.get(j).getReferencia()+"/"+carga.get(j).getCapacidad()+"/"+carga.get(j).getMarca()+"/"+carga.get(j).getColor()+"/"+carga.get(j).getPuertas()+"/"+ carga.get(j).getPrecio());
            System.out.print("Ingresa nombre cliente: ");
            String nombre = leer.nextLine();
            System.out.print("Ingresa apellido cliente: ");
            String apellido = leer.nextLine();
            
            String code = carga.get(j).getCodigo();
            String marca = carga.get(j).getMarca();
            double capacidad = carga.get(j).getCapacidad();
            String referencia =carga.get(j).getReferencia();
            String color =carga.get(j).getColor();
            int puertas = carga.get(j).getPuertas();
            double precio = carga.get(j).getPrecio();
            
            
            Venta ven = new Venta(nombre,apellido,code,referencia,marca,color,capacidad,puertas,precio);
            ven.setNombre(nombre);
            ven.setApellido(apellido);
            ven.setCodigo(codigo);
            ven.setMarca(marca);
            ven.setVelocidad(capacidad);
            ven.setReferencia(referencia);
            ven.setColor(color);
            ven.setPuertas(puertas);
            ven.setPrecio(precio);
            
            vendidos.incluirDeportivoVendido(ven);
           
            System.out.println("\n\n [::::::::::FACTURA:::::::::::]\n"+" El auto: "+marca+" "+referencia+ "\n Ha sido vendido al cliente: "+ nombre + " "+ apellido + "\n con el valor de: "+ precio+"\n [::::::::::FACTURA:::::::::::]\n\n" );
            carga.remove(j); 
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
         while(encontrado == false && i<carga.size()){
             if(carga.get(i).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
             System.out.println(carga.get(i).getCodigo()+"/"+carga.get(i).getReferencia()+"/"+carga.get(i).getCapacidad()+"/"+carga.get(i).getMarca()+"/"+carga.get(i).getColor()+"/"+carga.get(i).getPuertas()+"/"+ carga.get(i).getPrecio());
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
         if (carga != null) {
            for (Carga opc : carga) {
                System.out.println(opc.getCodigo()+"/"+opc.getReferencia()+"/"+opc.getCapacidad()+"/"+opc.getMarca()+"/"+opc.getColor()+"/"+opc.getPuertas()+"/"+opc.getPrecio()+"$");
                }
            }
          else {
            System.out.println("No hay Estudiantes para mostrar");
        }
          
    }
    
    
}
