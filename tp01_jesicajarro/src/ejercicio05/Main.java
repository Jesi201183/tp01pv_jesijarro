package ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Ingresar un numero entre 1 y 9");
    Scanner num=new Scanner(System.in);
   Integer num2=num.nextInt();
    for ( int i=1;i <= num2;i++) {
    	System.out.println("2*"+i+"="+i*num2);
    }
	}

}
