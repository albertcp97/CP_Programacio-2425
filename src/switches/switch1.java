package switches;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean salir=true;

		int balance=1000;
		while(balance>0 && salir) {
		System.out.println("Tu balance es de "+balance+" €");
		System.out.println("Introducir opcion");
		System.out.println("1. Introducir dinero");
		System.out.println("2. Sacar dinero");
		System.out.println("3. Salir");
		
		int opcion = sc.nextInt();
		switch (opcion) {

		case 1: {
			System.out.println("Introducir dinero");
			balance+=sc.nextInt();
			//igual a balance = balance +sc.nextInt();
		}

			break;
		case 2: {
			System.out.println("Sacar dinero");
			balance-=sc.nextInt();
		}

			break;
		case 3: {
			System.out.println("Salir");
			salir=false;
			
		}

			break;
		default: {
			System.out.println("Error");
		}
		}
		}

	}

}
