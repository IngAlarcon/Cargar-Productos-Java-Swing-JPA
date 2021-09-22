package Logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-21T20:53:13")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, Date> fecha_venc;
    public static volatile SingularAttribute<Producto, Integer> cod_prod;
    public static volatile SingularAttribute<Producto, String> tipo;
    public static volatile SingularAttribute<Producto, Integer> cant;
    public static volatile SingularAttribute<Producto, String> nombre;

}