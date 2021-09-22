
package Logica;

import IGU.CargaProducto;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class ProyectoIguLogPerJPA {


    public static void main(String[] args) {
        
        CargaProducto pantalla = new CargaProducto();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        System.out.println("\n##Todos los registros de  productos: ##\n");
        
        List<Producto> listaProductos = new ArrayList<Producto>();
        
        listaProductos = control.traerTodos();
        
        for (Producto prod : listaProductos) {
            
            System.out.println("Codigo producto: #" + prod.getCod_prod() + " \nNombre: " + prod.getNombre() + " \nMarca: " + prod.getMarca()+ " \nFecha: " + prod.getFecha_venc()); 
        
        }
        
        
        
        
        
        
    }

}
