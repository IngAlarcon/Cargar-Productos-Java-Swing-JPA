
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//lo que esta con @ es el mapeo para mi persistencia
@Entity
public class Producto implements Serializable{
    
    @Id
    private int cod_prod;
    
    @Basic
    private String nombre;
    private int cant;
    private String marca;
    private String tipo;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_venc;

    
    public Producto() {
    
    }
    

    public Producto(int cod_prod, String nombre, int cant, String marca, String tipo, Date fecha_venc) {
        this.cod_prod = cod_prod;
        this.nombre = nombre;
        this.cant = cant;
        this.marca = marca;
        this.tipo = tipo;
        this.fecha_venc = fecha_venc;
        
    }
    

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(Date fecha_venc) {
        this.fecha_venc = fecha_venc;
    }
    
    
    
}
