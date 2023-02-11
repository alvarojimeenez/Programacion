package mock.exam;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		Ejercicio 1.
		Realiza un programa que calcule el precio de unas entradas de cine en función del número de
		personas y del día de la semana. El precio general de una entrada son 8 euros. El miércoles (día del
		espectador), el precio es de 5 euros. Los jueves es el día de la pareja, por lo que la entrada para dos
		cuesta 11 euros.
		Por ejemplo, si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33
		euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual
		que son 41 euros (33 + 8).
		Además si dispone de la tarjeta CineJacaranda se obtiene un 10% de descuento.
		Se debe seguir vendiendo entradas hasta que se introduzca 0 en el número de entradas.
		Si se confunde al pedir el día de la semana o si tiene tarjeta del CineJacaranda se debe volver a
		pedir la información.
		No nos importa que salga más de dos decimales.
		Realiza el programa para que si en un futuro cambia el precio de las entradas, ya sea el general, el
		del día del espectador o el del día de la pareja, se pueda modificar fácilmente.
		*/
		
		final double GENERAL = 8;
		final double DIA_ESPECTADOR = 5;
		final double DIA_PAREJA = 11;
		final double DESCUENTO = 0.10;
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		
		double precio = 0;
		while (num>0) {
			System.out.println("Numero de entradas: ");
			num = Integer.valueOf(sc.nextLine());
			System.out.println("Dia de la semana(L,M,X,J,V,S,D): ");
			String dia = sc.nextLine().toUpperCase();
			while (!(dia.equals("L") || dia.equals("M") || dia.equals("X") || dia.equals("V") || dia.equals("S") || dia.equals("D"))) {
				System.out.println("Introduzca un dia correcto de la semana(L,M,X,J,V,S,D): ");
				dia = sc.nextLine().toUpperCase();
				
			}
			System.out.println("¿Tienes tarjeta de CineJacaranda(S/N)? ");
			String tarjeta = sc.nextLine().toUpperCase();	
			while (!(tarjeta.equals("S") || (tarjeta.equals("N")))) {
				System.out.println("Introduzca una respuesta correcta. ¿Tienes tarjeta de CineJacaranda(S/N)? ");
				tarjeta = sc.nextLine().toUpperCase();	
			}
			if (dia.equals("L") || dia.equals("M") || dia.equals("V") || dia.equals("S") || dia.equals("D")) {
				if (tarjeta.equals("S")) {
					precio = (GENERAL- GENERAL*DESCUENTO)*num;
				}else {
					precio = GENERAL*num;
				}
			}else if (dia.equals("X")) {
				if (tarjeta.equals("S")) {
					precio = (DIA_ESPECTADOR- DIA_ESPECTADOR*DESCUENTO)*num;
				}else {
					precio = DIA_ESPECTADOR*num;				
				}
			}else if (dia.equals("J")) {
				if (num%2==0) {
					if (tarjeta.equals("S")) {
						precio = (num/2*DIA_PAREJA)- (num/2*DIA_PAREJA)*DESCUENTO;
					}else {
						precio = num/2*DIA_PAREJA;
					}
				}else {
					if (tarjeta.equals("S")) {
						precio = ((num/2*DIA_PAREJA)+ (num%2)*GENERAL) - ((num/2*DIA_PAREJA)+ (num%2)*GENERAL)*DESCUENTO;
					}else {
						precio = (num/2*DIA_PAREJA)+ (num%2)*GENERAL;
					}
				}
			}

			System.out.println("El precio de su compra es "+precio);
			
		}
		
		
	}
	

}
