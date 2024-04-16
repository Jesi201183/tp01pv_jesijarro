package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    Scanner num=new Scanner(System.in); 
    System.out.println("Ingresar numero para calcular factorial");
   Integer fact = num.nextInt();
   if(fact>=0 && fact<11) {
   Integer num2=1;
   while(fact>1) {
	   num2=num2*fact;
	   fact=fact-1;
	   
   }
   System.out.println("El factorial es:"+num2);
   }else {
	   System.out.println("El numero debe estar entre 1 y 10");
   }
   }

}
