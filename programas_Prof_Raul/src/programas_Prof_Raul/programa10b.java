package programas_Prof_Raul;

import java.util.Scanner;

public class programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		int num, suma, prom, c;
		suma=0;
		c=0;
		do {
			System.out.println("Inserte un n�mero");
			num = leer.nextInt();
			if (num>=0 & num<77){
				suma=suma+num;
				c++;
		}
			}
		while (num>=0 & num<77);
		if (num>=77){
			prom = suma/c;
			System.out.println("El promedio es de: " + prom);		
		}else{
			System.out.println("A�n no ha ingresado el n�mero 77 o uno mayor a este");
		}
		
	}

}
