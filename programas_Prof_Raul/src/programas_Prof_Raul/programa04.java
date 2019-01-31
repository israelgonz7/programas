package programas_Prof_Raul;

import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner (System.in);
		double ed;
		
		System.out.println("Ingrese su edad");
		ed=leer.nextDouble();
		if (ed>=18){
			System.out.println("Es mayor de edad");
			
		}
		if (ed<=17) {
			System.out.println("Es menor de edad");
			
		}
		
	}

}
