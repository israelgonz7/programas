package programas_Prof_Raul;

import java.util.Scanner;

public class programa03 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner (System.in);
		Scanner sc=new Scanner (System.in);
		String nom;
		int ed;
		double alt;
		
		
		
		System.out.println("Ingresa tu nombre");
		nom=leer.next();
		System.out.println("Ingresa tu edad");
		ed=leer.nextInt();
		System.out.println("Ingresa tu altura");
		alt=leer.nextDouble();
		
		System.out.println("Bienvenido "+nom+" tu edad es "+ed+" años, y tu estatura es de "+alt+" metros");

		
		
	}

}
