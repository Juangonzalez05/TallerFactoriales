/*Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez
*/
package euler;


public class punto2 {
    
    public static void main(String[]args){
        int n=9;
        int resultado=suma(n);
        System.out.println(resultado);
            
    }
    
    public static int suma(int numero){
         int resta;
         if(numero==1){
             
           return 1;
         }
         else{
             resta=numero*suma(numero-1);
             
         }
         return resta;
         
        
    }
    
    
}
