package pl.edu.pwr.pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Podaj swoje imię: ");
		
		try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
			String name = bufferRead.readLine();
			Przepowiednie przepowiednie = new Przepowiednie(name);
			
			System.out.println("");
			System.out.println("Witaj " + name);
			System.out.println("Twoje przepowiednie: ");
			System.out.println("ZDROWIE: " + przepowiednie.healthProficy());
			System.out.println("MIŁOŚĆ: " + przepowiednie.loveProficy());
			System.out.println("PRACA: " + przepowiednie.workProficy());
			
		} catch(IOException ex) {
			 System.out.println("Błąd");
			 ex.printStackTrace();
		}

	}

}
