package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Vehicle;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		//	String carModel = sc.nextLine();
		Vehicle carModel = new Vehicle(sc.nextLine());
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		Date pickup = sdf.parse(sc.nextLine());	
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		Date retorn = sdf.parse(sc.nextLine());
		System.out.print("Enter price per hour:");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day:");
		double pricePerDay = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("INVOICE:");
		
	}

}
