
package exemplolambda;

/**
 *
 * @author ifernandezblanco
 */
//interfaz funcional
@FunctionalInterface
public interface IOperable {
    //metodo operacion
    //recibe dos parametros double
    public abstract double operacion(double n1, double n2);
    //metodo amosar
    //devolve unha mensaxe
    default public void amosar(){
        System.out.println("mensaxe");
    }
    
}
