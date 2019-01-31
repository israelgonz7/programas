package programas_Prof_Raul;

import java.util.Scanner;

public class programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		int num;
		System.out.println("Ingresa un número");
		num=leer.nextInt();
		
		
		if (num/2==0) {
			System.out.println(num+" es par");
			
		
		}else {
			System.out.println(num+" es impar");
		}
		
	}
}

