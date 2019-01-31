package programas_Prof_Raul;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		System.out.println("Bienvenido al convertidor de °F a °C");
		double c, f;
		System.out.println("Ingrese los grados Fahrenheit");
		f=leer.nextInt();
		
		c=(f-32)/1.8;
		
		System.out.println(c+" grados Celsius");
		
	}

}
