/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.consesionario1;
import com.mycompany.consesionario1.Clases.Estandar;
import com.mycompany.consesionario1.Clases.Deportivo;
import com.mycompany.consesionario1.Clases.Carga;
import com.mycompany.consesionario1.Clases.Modificados;
import com.mycompany.consesionario1.Listas.ListarCarga;
import com.mycompany.consesionario1.Listas.ListarDeportivo;
import com.mycompany.consesionario1.Listas.ListarEstandar;
import com.mycompany.consesionario1.Listas.ListarModificados;
import com.mycompany.consesionario1.Listas.ListarVendidos;
import java.util.Scanner;
/**
 *
 * @author Juan David Ojeda Bernal
 * @author Karen Tatiana Almansa jimenez
 */
public final class Principal {
    /**
     *declaracion de la clase como objeto para acceder a los metodos que la contienen
     */
    ListarVendidos listarVendidos = new ListarVendidos();
    /**
     *declaracion de la clase como objeto para acceder a los metodos que la contienen
     */
    ListarEstandar listarEstandar = new ListarEstandar();
    /**
     *declaracion de la clase como objeto para acceder a los metodos que la contienen
     */
    ListarDeportivo listarDeportivo = new ListarDeportivo();
    /**
     *declaracion de la clase como objeto para acceder a los metodos que la contienen
     */
    ListarCarga listarCarga = new ListarCarga();
    /**
     *declaracion de la clase como objeto para acceder a los metodos que la contienen
     */
    ListarModificados listarModificados = new ListarModificados();
    /**
     *variable que nos sirve para retornar un valor boleano para busquedas del vehiculo segun la categoria 
     */
    boolean encuentra = false;
    static Scanner leer = new Scanner(System.in);
    static Scanner op = new Scanner(System.in);
 
    
    
   

    /**
     *Constructor de la clase principal donde iniciaremos con el menú
     */

    
    public Principal (){
                menuPrincipal();
            }
    
    /**
     *metodo en donde esta alojado el menú principal
     */
    public void menuPrincipal(){
        System.out.println("¿que accion desea hacer? 1.deportivo 2.Estandar 3.Carga 4.Modificados 5.reportes 6.salir");
        int opcion = op.nextInt();
        switch (opcion){
            case 1:
                menuDeportivo();
                break;
            case 2:
                menuEstandar();
                break;
            case 3:
                menuCarga();
                break;
            case 4:
                menuModificado();
                break;
            case 5:
                menuReportes();
                break;
                        default:
                            break;
                            
        }
    }
    
    /**
     *Metodo en donde agregamos el vehiculo estandar a la clase ListarEstandar por medio del metodo incluirEstandar al array Estandar 
     */
    public void agregarEstandar(){
            System.out.println("Bienvenido");
            System.out.print("Ingresa codigo del vehiculo: ");
            String code = leer.nextLine();
            System.out.print("Ingresa la marca del vehiculo: ");
            String marca = leer.nextLine();
            System.out.print("Ingresa la referencia del vehiculo: ");   
            String ref = leer.nextLine();
            System.out.print("Ingresa el color del vehiculo: ");
            String color = leer.nextLine();
            System.out.print("Ingresa el número de puertas del vehiculo: ");
            int puertas = leer.nextInt();
            System.out.print("Ingresa el precio del vehiculo: ");
            double precio = leer.nextDouble();
            leer.skip("\n");
            
            Estandar est = new Estandar(code,ref,marca,color, puertas,precio);
            est.setReferencia(ref);
            est.setPrecio(precio);
            est.setMarca(marca);
            est.setColor(color);
            est.setPuertas(puertas);
            est.setCodigo(code);
            listarEstandar.incluirEstandar(est);
    }
    
    /**
     *Metodo en el que se agrega el vehiculo deportivo a la clase ListarDeportivo por medio del metodo incluirDeportivo al arraylist deportivo
     */
    public void agregarDeportivo(){
            System.out.println("Bienvenido");
            System.out.print("Ingresa codigo del vehiculo: ");
            String code = leer.nextLine();
            System.out.print("Ingresa la marca del vehiculo: ");
            String marca = leer.nextLine();
            System.out.print("Ingresa la referencia del vehiculo: ");   
            String ref = leer.nextLine();
            System.out.print("Ingresa la velocidad del vehiculo: ");   
            double vel = leer.nextDouble();
            leer.skip("\n");
            System.out.print("Ingresa el color del vehiculo: ");
            String color = leer.nextLine();
            System.out.print("Ingresa el número de puertas del vehiculo: ");
            int puertas = leer.nextInt();
            System.out.print("Ingresa el precio del vehiculo: ");
            double precio = leer.nextDouble();
            leer.skip("\n");
            
            Deportivo dep = new Deportivo(code,ref,vel,marca,color, puertas,precio);
            dep.setReferencia(ref);
            dep.setVelocidad(vel);
            dep.setPrecio(precio);
            dep.setMarca(marca);
            dep.setColor(color);
            dep.setPuertas(puertas);
            dep.setCodigo(code);
            listarDeportivo.incluirDeportivo(dep);
    }
     
    /**
     * metodo en el que se agrega vehiculo carga a ListarCarga mediante el metodo incluirCarga al arraylist Carga
     */
    public void agregarCarga(){
            System.out.println("Bienvenido");
            System.out.print("Ingresa codigo del vehiculo: ");
            String code = leer.nextLine();
            System.out.print("Ingresa la marca del vehiculo: ");
            String marca = leer.nextLine();
            System.out.print("Ingresa la referencia del vehiculo: ");   
            String ref = leer.nextLine();
            System.out.print("Ingresa la capacidad de carga del vehiculo: ");   
            double capacidad = leer.nextDouble();
            leer.skip("\n");
            System.out.print("Ingresa el color del vehiculo: ");
            String color = leer.nextLine();
            System.out.print("Ingresa el número de puertas del vehiculo: ");
            int puertas = leer.nextInt();
            System.out.print("Ingresa el precio del vehiculo: ");
            double precio = leer.nextDouble();
            leer.skip("\n");
            
            Carga car = new Carga(code,ref,capacidad,marca,color, puertas,precio);
            car.setReferencia(ref);
            car.setCapacidad(capacidad);
            car.setPrecio(precio);
            car.setMarca(marca);
            car.setColor(color);
            car.setPuertas(puertas);
            car.setCodigo(code);
            listarCarga.incluirCarga(car);
    }
     
    /**
     *Metodo de la clase Modificar en la que se obtiene el vehiculo deportivo para modificarlo y guardarlo en el array eliminando el registro del array deportivo
     */
    public void modificarDeportivo(){
            System.out.println("Bienvenido");
            String code, marca, ref;
            do{
                System.out.print("Ingresa el codigo del vehiculo a modificar: ");
                code = leer.nextLine();
                System.out.print("Ingresa la marca del vehiculo: ");
                marca = leer.nextLine();
                System.out.print("Ingresa la referencia del vehiculo: ");   
                ref = leer.nextLine();
                encuentra = listarDeportivo.modificarDeportivo(code, marca, ref);
                
                if(encuentra == true){
                    menuDeportivo();
                }
                
            }while(encuentra);
                System.out.print("Ingresa la nueva velocidad del vehiculo: ");
                double vel = leer.nextDouble();
                leer.skip("\n");
                System.out.print("Ingresa el nuevo color del vehiculo: ");
                String color = leer.nextLine();
                System.out.print("Ingresa el nuevo número de puertas del vehiculo: ");
                int puertas = leer.nextInt();
                leer.skip("\n");
                System.out.print("Ingresa el nuevo precio del vehiculo: ");
                double precio = leer.nextDouble();
                leer.skip("\n");


            Modificados mod = new Modificados(code,ref,vel,marca,color, puertas,precio);
            mod.setReferencia(ref);
            mod.setVelocidad(vel);
            mod.setPrecio(precio);
            mod.setMarca(marca);
            mod.setColor(color);
            mod.setPuertas(puertas);
            mod.setCodigo(code);
            listarModificados.incluirModificados(mod);
    }
     
    /**
     *Metodo de la clase Modificar para obtener el vehiculo estandar y así ser modificado agregandolo al array modificar eliminando el registro del arraylist estandar
     */
    public void modificarEstandar(){
            System.out.println("Bienvenido");
            String code, marca, ref;
            
            do{
                
                System.out.print("Ingresa el codigo del vehiculo a modificar: ");
                code = leer.nextLine();
                System.out.print("Ingresa la marca del vehiculo: ");
                marca = leer.nextLine();
                System.out.print("Ingresa la referencia del vehiculo: ");   
                ref = leer.nextLine();
                encuentra = listarEstandar.modificarEstandar(code, marca, ref);
                
                if(encuentra == true){
                    menuModificado();
                }
                
            }while(encuentra);
            
                System.out.print("Ingresa la velocidad que desea tener en su vehiculo: ");
                double vel = leer.nextDouble();
                leer.skip("\n");
                System.out.print("Ingresa el nuevo color del vehiculo: ");
                String color = leer.nextLine();
                System.out.print("Ingresa el nuevo número de puertas del vehiculo: ");
                int puertas = leer.nextInt();
                leer.skip("\n");
                System.out.print("Ingresa el nuevo precio del vehiculo: ");
                double precio = leer.nextDouble();
                leer.skip("\n");
            
            
            Modificados mod = new Modificados(code,ref,vel,marca,color, puertas,precio);
            mod.setReferencia(ref);
            mod.setVelocidad(vel);
            mod.setPrecio(precio);
            mod.setMarca(marca);
            mod.setColor(color);
            mod.setPuertas(puertas);
            mod.setCodigo(code);
            listarModificados.incluirModificados(mod);
            
            
            
            
    }
     
    /**
     *Metodo donde se encuentra el menu de las acciones a realizar sobre el vehiculo estandar
     */
    public void menuEstandar(){
         
        System.out.println(" [:::::MENU ESTANDAR:::::]\n ¿que accion desea hacer?\n 1.agregar\n 2.listar\n 3.Buscar\n 4.vender\n 5.volver");
        int opcion = op.nextInt();
        if(opcion == 1){
           agregarEstandar();
           menuEstandar();
        }else if(opcion==2){
            listarEstandar.imprimir();
            menuEstandar();
        }else if(opcion==3){
                System.out.print("Ingresa el codigo del vehiculo a Buscar: ");
                String code = leer.nextLine();
                encuentra = listarEstandar.Buscar(code);
                menuEstandar();  
        }else if (opcion == 4){
            listarEstandar.imprimir();
            listarEstandar.vender();
            menuEstandar(); 
        }else if (opcion == 5){
         menuPrincipal();   
        }
            
    }
    
    /**
     *menu donde se encontrara el menu de las acciones a ejecutar sobre el vehiculo deportivo
     */
    public void menuDeportivo(){ 
        System.out.println(" [:::::MENU DEPORTIVO:::::]\n ¿que accion desea hacer?\n 1.Agregar\n 2.Listar\n 3.Buscar\n 4.Vender\n 5.VOLVER");
        int opcion = op.nextInt();
        if(opcion == 1){
           agregarDeportivo();
           menuDeportivo();
        }else if(opcion==2){
            listarDeportivo.imprimir();
            menuDeportivo();
        }else if (opcion == 3){
            do{
                System.out.print("Ingresa el codigo del vehiculo a Buscar: ");
                String code = leer.nextLine();
                encuentra = listarDeportivo.Buscar(code);
            }while(encuentra);
                menuDeportivo();   
         
        }else if (opcion == 4){
            listarDeportivo.imprimir();
            listarDeportivo.vender();
            menuDeportivo(); 
        }else if (opcion == 5){
         menuPrincipal();   
        }
    }
    
    /**
     *menu donde se encuentra el menu de las acciones a ejecutar para el vehiculo modificado
     */
    public void menuModificado(){ 
        System.out.println(" [:::::MENU MODIFICAR:::::]\n ¿cual desea modificar?\n 1.Modificar DEPORTIVO\n 2.Modificar ESTANDAR\n 3.MOSTRAR Modificados\n 4.BUSCAR Modificado\n 5.VENDER Modificado\n 6.VOLVER");
        int opcion = op.nextInt();
        if(opcion == 1){
           listarDeportivo.imprimir();
           modificarDeportivo();
           menuModificado();
        }else if(opcion == 2){
            listarEstandar.imprimir();
            modificarEstandar();
            menuModificado();
        }else if(opcion==3){
            listarModificados.imprimir();
            menuModificado();
        }else if (opcion == 4){
            System.out.print("Ingresa el codigo del vehiculo a Buscar: ");
            String code = leer.nextLine();
            listarModificados.Buscar(code);
            menuModificado();
        }else if (opcion == 5){
            listarModificados.imprimir();
            listarModificados.vender();
            menuModificado();
        }else if(opcion == 6){
            menuPrincipal();
        }
    }
    
    /**
     *metodo donde se encuentra el menu de las acciones a ejecutar al vehiculo carga
     */
    public void menuCarga(){ 
        System.out.println(" [:::::MENU MAQUINARIA:::::]\n ¿que accion desea hacer?\n 1.Agregar\n 2.Listar\n 3.Buscar\n 4.Vender\n 5.VOLVER");
        int opcion = op.nextInt();
        if(opcion == 1){
           agregarCarga();
           menuCarga();
        }else if(opcion==2){
            listarCarga.imprimir();
            menuCarga();
        }else if (opcion == 3){
            System.out.print("Ingresa el codigo del vehiculo a Buscar: ");
            String code = leer.nextLine();
            listarCarga.Buscar(code);
            menuCarga(); 
        }else if (opcion==4){
            listarCarga.imprimir();
            listarCarga.vender();
            menuCarga();
        }else if (opcion == 5){
         menuPrincipal();   
        }
     
      /**
     *metodo donde se encuentran las acciones a ejecutar en el menu reportes
     */
        
    }
    public void menuReportes(){ 
        System.out.println("[:::::MENU REPORTES:::::]\n ¿que accion desea hacer?\n 1.vendidos\n  2.volver");
        int opcion = op.nextInt();
        if(opcion == 1){
            listarVendidos.imprimirVendidos();
            System.out.println("si entra");
            menuPrincipal();
        }else if(opcion==2){
            menuPrincipal();
          
        } 
    }

    

   

    

   
    
    
    
}
