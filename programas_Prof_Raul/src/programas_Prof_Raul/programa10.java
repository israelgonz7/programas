package programas_Prof_Raul;


import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		DecimalFormat formateador=new DecimalFormat ("###,###.##");
		double p1, p2, p3, sum, sum2;
	
		
		
		System.out.println("Ingrese el precio del primer producto");
		p1=leer.nextDouble();
		System.out.println("Ingrese el precio del segundo producto");
		p2=leer.nextDouble();
		System.out.println("Ingrese el precio del tercer producto");
		p3=leer.nextDouble();
		
		sum=p1+p2+p3;
		sum2=p1+p2+p3;
		if (sum>=1500) {
			sum*=.11;
			System.out.println(formateador.format(sum)+" de incremento");
			System.out.println(formateador.format(sum2)+" de monto total");
		}else {
			sum*=.10;
			System.out.println(formateador.format(sum)+" de incremento");
			System.out.println(formateador.format(sum2)+" de monto total");
		}
		
		
		
	}

}
