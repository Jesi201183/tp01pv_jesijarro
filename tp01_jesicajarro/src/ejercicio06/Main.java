package ejercicio06;

import java.time.LocalDate;

import ejercicio06_model.persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
persona persona01=new persona();
persona persona02=new persona(32644329,"jesica",LocalDate.of(1986,12, 20),"Buenos Aires");
persona persona03=new persona(32644329,"jesica",LocalDate.of(1986,12, 20));
	}

}
