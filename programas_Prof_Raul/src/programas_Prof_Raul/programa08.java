package programas_Prof_Raul;

import java.util.Scanner;

public class programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		
		int num;
		
		System.out.println("Ingrese el número del día");
		num=leer.nextInt();
		switch (num) {
		case 1:
			System.out.println("Es Lunes");
			break;
		case 2:
			System.out.println("Es Martes");
			break;
		case 3:
			System.out.println("Es Miercoles");
			break;
		case 4:
			System.out.println("Es Jueves");
			break;
		case 5:
			System.out.println("Es Viernes");
			break;
		case 6:
			System.out.println("Es Sabado");
			break;
		case 7:
			System.out.println("Es Domingo");
			break;
		}
		
		
		
	}

}
