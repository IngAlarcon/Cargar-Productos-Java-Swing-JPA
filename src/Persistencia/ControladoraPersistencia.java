
package Persistencia;

import Logica.Producto;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class ControladoraPersistencia {
    
    ProductoJpaController jpaProducto = new ProductoJpaController();
    
    public void altaProducto ( Producto prod){
        
        try {
            
            jpaProducto.create(prod);
        
        } catch (Exception ex) {
        
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
        
        
    
    }
    

   //Metodo para traer todos los productos de la base de datos
    
    public List<Producto> traerTodos () {
       
      return jpaProducto.findProductoEntities();
      
    
    
    }

    public void editarProducto(Producto prodEditar) {
         
        try {
        
            jpaProducto.edit(prodEditar);
       
        } catch (Exception ex) {
        
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }

    public void eliminarProducto(int cod_prodEliminar) {
        
        try {
            
            jpaProducto.destroy(cod_prodEliminar);
        
        } catch (NonexistentEntityException ex) {
        
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       
        }
        
        
    }

    public List<Producto> buscarProducto(String nombre) {
        
        EntityManager em = jpaProducto.getEntityManager();//Conexion a la base de datos
        Query query = em.createQuery("SELECT p FROM Producto p WHERE p.nombre LIKE :nombre");//Consulta JPQL Query
        query.setParameter("nombre", nombre+"%");
        List<Producto> lista = query.getResultList();        
        return lista;
    
    
    }
    

    
}
