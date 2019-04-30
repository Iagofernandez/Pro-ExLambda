
package exemplolambda;

/**
 *
 * @author ifernandezblanco
 */
public class Metodos{
    
    public void crearLambda(){
        //instancia da interface 
        //empreganse unha clase interna
        IOperable op = new IOperable() {
            @Override
            public double operacion(double n1, double n2) {
                return (n1 + n2);
            }
        };
        //maneira similar de facer o de arriba
        //empregase as expresions lambda
        IOperable op2 = (double n1, double n2)->{
          return (n1 + n2);  
        };
                
        //chamdo ao metodo amosar
        //visualización
        op2.amosar();
        System.out.println("operacion ->" + op2.operacion(5, 10));
        
        //multiplicacion
        //non e necesario escribir os tipos
        //deben concordar cos do primeiro metodo
        IOperable op3 = (n1, n2)->{
            return (n1 * n2);
        };
        op3.amosar();
         System.out.println("operacion ->" + op3.operacion(2, 3));
        }
                
    }
    

