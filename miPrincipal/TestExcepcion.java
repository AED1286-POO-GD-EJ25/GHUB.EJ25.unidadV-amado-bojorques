package miPrincipal;
import java.util.Scanner;
public static void main(String[] args){
Scanner entrada = new  Scanner(System.in);
System.out.println("Introduce un número entero");
int valor = entrada.nextInt(); 
int resultado=5/valor;
System.out.println("El resultado es: " + resultado);
} catch (ArithmeticException ex) {
    System.out.println("No se puede dividir entre cero");
} 
 finally {
    entrada.close();
   
}




