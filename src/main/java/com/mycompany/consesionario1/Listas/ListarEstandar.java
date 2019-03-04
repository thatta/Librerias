package com.mycompany.consesionario1.Listas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.consesionario1.Clases.Estandar;
import com.mycompany.consesionario1.Clases.Venta;
import static com.mycompany.consesionario1.Listas.ListarDeportivo.leer;
import java.util.ArrayList;
import com.mycompany.consesionario1.Clases.Metodos;

/**
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public class ListarEstandar implements Metodos{
    /**
     *declaracion del arrailist para guardar informacion en el objeto estandar
     */
    private ArrayList<Estandar> estandar = new ArrayList<Estandar>();
    /**
     *llamado de la clase ListarVendidos para acceder a los metodos y guargar objetos
     */
    ListarVendidos vendidos = new ListarVendidos();

    /**
     *
     * @param estandar
     */
    public ListarEstandar(ArrayList<Estandar> estandar) {
        this.estandar = estandar;
    }

    /**
     *Constructor de la clase vacío
     */
    public ListarEstandar() {
    }
    
    /**
     *
     *Metodo para modificar el auto estandar pidiendo como parametros el codigo, la marca y la referencia del vehiculo
     * @param codigo variable donde se guarda el codigo del vehiculo
     * @param Marca variable donde se guarda la marca del vehiculo
     * @param Referencia variable donde se guarda la referencia del vehiculo
     * @return
     */
    public boolean modificarEstandar(String codigo, String Marca, String Referencia){
         boolean encontrado = false;
         int i = 0;
         while(encontrado == false && i<estandar.size()){
             if(estandar.get(i).getCodigo().compareToIgnoreCase(codigo)==0 && estandar.get(i).getMarca().compareToIgnoreCase(Marca)==0 && estandar.get(i).getReferencia().compareToIgnoreCase(Referencia)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
             System.out.println(estandar.get(i).getCodigo()+"/"+estandar.get(i).getMarca()+"/"+estandar.get(i).getReferencia()+"/"+estandar.get(i).getColor()+"/"+estandar.get(i).getPuertas()+"/"+estandar.get(i).getPrecio());
             estandar.remove(i);
             return false;
         }else{
             System.out.println("el auto no existe");
             return true;
         }
    }
    
    /**
     * metodo para incluir el objeto Estandar al arrayList
     * @param e
     */
    public void incluirEstandar(Estandar e){
        this.estandar.add(e);
    }
  
    
    /**
     *Metodo vender heredado de la interface metodos del paquete clases
     */
    @Override
    public boolean vender() {
    boolean encontrado = false;
         int i = 0;
          System.out.print("Ingresa codigo del vehiculo que va a vender: ");
          String codigo = leer.nextLine();
          
         while(encontrado == false && i<estandar.size()){
             if(estandar.get(i).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado == true){
            System.out.println("existe");
            System.out.println(estandar.get(i).getCodigo()+"/"+estandar.get(i).getMarca()+"/"+estandar.get(i).getReferencia()+"/"+estandar.get(i).getColor()+"/"+estandar.get(i).getPuertas()+"/"+estandar.get(i).getPrecio());
            System.out.print("Ingresa nombre cliente: ");
            String nombre = leer.nextLine();
            System.out.print("Ingresa apellido cliente: ");
            String apellido = leer.nextLine();
            
            String code = estandar.get(i).getCodigo();
            String marca = estandar.get(i).getMarca();
            String referencia =estandar.get(i).getReferencia();
            String color =estandar.get(i).getColor();
            int puertas = estandar.get(i).getPuertas();
            double precio = estandar.get(i).getPrecio();
            
            
            Venta ven = new Venta(nombre,apellido,code,referencia,marca,color,puertas,precio);
            ven.setNombre(nombre);
            ven.setApellido(apellido);
            ven.setCodigo(codigo);
            ven.setMarca(marca);
            ven.setReferencia(referencia);
            ven.setColor(color);
            ven.setPuertas(puertas);
            ven.setPrecio(precio);
            
            vendidos.incluirEstandar(ven);
           
            System.out.println("\n\n [::::::::::FACTURA:::::::::::]\n"+" El auto: "+marca+" "+referencia+ "\n Ha sido vendido al cliente: "+ nombre + " "+ apellido + "\n con el valor de: "+ precio+"\n [::::::::::FACTURA:::::::::::]\n\n" );
            estandar.remove(i);
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
         while(encontrado == false && i<estandar.size()){
             if(estandar.get(i).getCodigo().compareToIgnoreCase(codigo)==0){
                 encontrado = true;
             }else{
                 i++;
             }
         }
         if(encontrado){
             System.out.println(estandar.get(i).getCodigo()+"/"+estandar.get(i).getMarca()+"/"+estandar.get(i).getReferencia()+"/"+estandar.get(i).getColor()+"/"+estandar.get(i).getPuertas()+"/"+estandar.get(i).getPrecio());
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
        if (estandar != null) {
            for (Estandar opc : estandar) {
                System.out.println(opc.getCodigo()+"/"+opc.getReferencia()+"/"+opc.getMarca()+"/"+opc.getColor()+"/"+opc.getPuertas()+"/"+opc.getPrecio()+"$");
                }
            }
        else {
            System.out.println("No hay Estudiantes para mostrar");
        }
    }
    
    
     /**
     *
     * @return
     */
    public ArrayList<Estandar> getEstandar() {
        return estandar;
    }

    /**
     *
     * @param estandar
     */
    public void setEstandar(ArrayList<Estandar> estandar) {
        this.estandar = estandar;
    }
    
   
}
