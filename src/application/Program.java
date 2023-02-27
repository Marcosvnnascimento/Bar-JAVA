package application;

import java.util.Locale;
import java.util.Scanner;
import util.Bill;

public class Program {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerante: ");
		bill.softDrink= sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		System.out.println();
		
		System.out.println("RELATORIO: ");
		System.out.printf("Consumo: %.2f%n", bill.feeding());
		System.out.printf("Couvert: %.2f%n", bill.cover());
		System.out.printf("Ingresso: %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor Total a pagar: %.2f%n", bill.total());
		
	}
	
	

}
