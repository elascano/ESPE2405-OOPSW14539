
package numerodeber;

import java.util.Scanner;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class NumeroDeber {
    private int valor;
    
    public NumeroDeber(int numero){
        valor=numero;
    }
    
    
    public NumeroDeber(){
        System.out.println("Ingresa un numero");
        Scanner leer=new Scanner(System.in);
        valor=leer.nextInt();
    }

       public void mostrar(){
           System.out.println("El numero es " + valor);
       }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NumeroDeber numero = new NumeroDeber(65);
       
       numero.mostrar();
    }
}

