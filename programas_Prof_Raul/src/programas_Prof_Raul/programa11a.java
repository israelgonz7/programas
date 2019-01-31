package programas_Prof_Raul;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer=new Scanner (System.in);
		byte nEmp, i;
		double sueldo=0.0, max=0.0, min=99999999.0, total=0.0, isr=0;
		
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		System.out.println("Ingrese el número de empleados");
		nEmp=leer.nextByte();
		
		i=0;
		do {
			System.out.println("Ingresa el sueldo del empleado "+(i+1));
			sueldo=leer.nextDouble();
			total+=sueldo;
			if (sueldo<min){
				min=sueldo;
			}
			if (sueldo>max){
				max=sueldo;
			}
			
			i++;
			
		}while(i<=nEmp-1);
		
		isr=total*.33;
		System.out.println("El total es:"+formateador.format(total));
		System.out.println("El ISR es:"+formateador.format(isr));
		System.out.println("Salario máximo:"+formateador.format(max));
		System.out.println("Salario minimo:"+formateador.format(min));
		
	}

}
