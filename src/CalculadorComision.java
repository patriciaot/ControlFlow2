import java.util.Scanner;

public class CalculadorComision {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
			System.out.println("Ingresa el monto total de tus ventas:"  );
			int totalVentas= in.nextInt();
			float comision;
	
	if (totalVentas >=10_000) {
		comision=0.30F;
	} else if((totalVentas<=5_0001)&&(totalVentas>=9_999)){
		comision=0.20F;
	} else if((totalVentas<=1_0001)&&(totalVentas>=4_999)) {
		comision=0.10F;
	} 
	else {
		comision=0;
	} //If else
	System.out.println("Sueldo total:" + (totalVentas*comision));
	in.close();
	}//main
}//CalculadorMision
