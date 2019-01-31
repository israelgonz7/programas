package programas_Prof_Raul;

import java.util.Scanner;

public class programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		double cal;
		
		System.out.println("Ingrese la calificación");
		cal=leer.nextDouble();
		
		if (cal >=80) {
			System.out.println("Aprobado");
		}
		if (cal<=79) {
			System.out.println("Reprobado");
		}
		
	}

}
