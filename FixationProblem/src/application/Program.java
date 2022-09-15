package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();

		Contract contract = new Contract(number, data, value);

		System.out.print("Enter number of installments: ");
		int installmentsNumber = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, installmentsNumber);

		System.out.println();

		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}

		sc.close();
	}

}
