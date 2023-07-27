import java.util.Scanner;

public class DescuentoPelicula {

	public static void main(String[] args) {
		java.util.Scanner in = new Scanner(System.in);
		System.out.println("Ingresa tu edad:"  );
		int rangoEdad = in.nextInt();
		float precioBoleto=131;
		
		if (rangoEdad <=5) {
			precioBoleto *= 0.60F;
		} else if(rangoEdad >=60){
			precioBoleto *=0.55F;
		} 
		else {precioBoleto=131F;
	}//If else
		System.out.println("Precio del boleto:$"+precioBoleto);
		in.close();
	}//main

}//Descuento pelicula
