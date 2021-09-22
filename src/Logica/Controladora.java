/*
  CLASE CONTROLADORAS SOLO CONTENDRA METODOS QUE SE VAN A IMPLEMENTAR
  
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void altaProducto(int cod_prod, String nombre, int cant, String marca, String tipo, Date fecha_venc){
        //Creando mi objeto producto
        Producto prod = new Producto();
        
        //Seteando las variables de prod, preprando para dar de alta un producto
        prod.setCod_prod(cod_prod);
        prod.setNombre(nombre);
        prod.setCant(cant);
        prod.setMarca(marca);
        prod.setTipo(tipo);
        prod.setFecha_venc(fecha_venc);
        
        controlPersis.altaProducto(prod);
        
    
    }

    
    //Ordenamiento burbujeo con lista de objetos
    public static void ordenarLista(List<Producto> traerTodos) {
        
     for(int i=0;i<traerTodos.size();i++){
        Producto temporal;
        for(int j=i+1;j<traerTodos.size();j++){
            // si cambio .getCod_prod por otro se ordenara 
            if(traerTodos.get(i).getCod_prod()>traerTodos.get(j).getCod_prod()){
                temporal=traerTodos.get(j);
                traerTodos.set(j,traerTodos.get(i));
                traerTodos.set(i,temporal);
            }
        }
    }
     
    

    }

    public void editarProducto(int cod_prodEditar, String nombreEditar, int cantEditar, String marcaEditar, String tipoEditar, Date fecha_vencEditar) {
        
                //Creando mi objeto producto
        Producto prodEditar = new Producto();
        
        //Seteando las variables de prod, preprando para dar de alta un producto
        prodEditar.setCod_prod(cod_prodEditar);
        prodEditar.setNombre(nombreEditar);
        prodEditar.setCant(cantEditar);
        prodEditar.setMarca(marcaEditar);
        prodEditar.setTipo(tipoEditar);
        prodEditar.setFecha_venc(fecha_vencEditar);
        
        controlPersis.editarProducto(prodEditar);
        
        
        
    }

    public void eliminarProducto(int cod_prodEliminar) {
        
        
         controlPersis.eliminarProducto(cod_prodEliminar);
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
