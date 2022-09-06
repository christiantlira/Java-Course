package application;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int indice = 13;
		int soma = 0, k = 0;
		
		while(k < indice) {
			k = k + 1;
			soma += k;
		}
		
		System.out.println(soma);
	}

}

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter a folder path: "); String strPath = sc.nextLine();
 * 
 * File path = new File(strPath); File[] folder =
 * path.listFiles(File::isDirectory); System.out.println("FOLDERS:"); for(File f
 * : folder) { System.out.println(f); }
 * 
 * File[] files = path.listFiles(File::isFile); System.out.println("FILES:");
 * for(File f : files) { System.out.println(f); }
 * 
 * boolean success = new File(strPath + "\\subdir").mkdir();
 * System.out.println("Directory created successfuly: " + success);
 * 
 * sc.close();
 * 
 * 
 * 
 * 
 * String[] lines = new String[] { "Boa noite é o krl",
 * "Vai toma no teu cu porra!", "Filha da puta do krl" };
 * 
 * String path = "c:\\TEMP\\out.txt";
 * 
 * try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
 * for(String line : lines) { bw.write(line); bw.newLine(); }
 * 
 * } catch(IOException e) { System.out.println("Error: " + e); }
 */

/*
 * String path = "c:\\TEMP\\in.txt";
 * 
 * try (BufferedReader br = new BufferedReader(new FileReader(path))) { String
 * line = br.readLine();
 * 
 * while (line != null) { System.out.println(line); line = br.readLine(); }
 * 
 * } catch (IOException e) { System.out.println("Error: " + e); }
 */
