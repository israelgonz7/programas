package programas_Prof_Raul;

import java.util.Scanner;

public class programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		
		double pul, cm, pies, res;
		int op;
		System.out.println("Opción 1 (pulgadas a centimetros)");
		System.out.println("Opción 2  (pies a centimetros)");
		System.out.println("Opción 3   (pies a pulgadas)");
		op=leer.nextInt();
		switch (op) {
		case 1:
			
			System.out.println("Ingrese las pulgadas");
			pul=leer.nextDouble();
			res=pul*2.54;
			System.out.println(res+" centimetros");
			break;
		case 2:
			
			System.out.println("Ingrese los pies");
			pies=leer.nextDouble();
			res=pies*30.48;
			System.out.println(res+" centimetros");
			break;
		case 3:
			
			System.out.println("Ingrese los pies");
			pies=leer.nextDouble();
			res=pies*12;
			System.out.println(res+" pulgadas");
			break;
		
		
		}
	}

}
