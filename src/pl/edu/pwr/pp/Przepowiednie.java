package pl.edu.pwr.pp;

import java.util.Calendar;
import java.util.Random;

public class Przepowiednie {
	
	public Przepowiednie(String name) {
		clientName = name;
		
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		
		Random rn = new Random();
		randomNumber = Math.abs(rn.nextInt() % 12);
	}

	/**
	 * Wszystkie wróżby zostały zaczerpnięte z horoskopu dziennego na dzień 16.04.2016 z portalu magia.onet.pl.
	 */
	
	private String clientName;
	private int currentDay;
	private int randomNumber;
	
	public static String[] MILOSC = {
			"Staraj się nie zawieść jako kochanek.", 
			"Zatęsknisz za gorącą miłością.", 
			"Unikaj spięć z ukochaną osobą.", 
			"Postępuj spokojnie i delikatnie.", 
			"Możliwe trudne relacje z otoczeniem.",
			"Dobrze ułożą się stosunki z rodziną.", 
			"Bądź milszy dla bliskich.", 
			"Potrzeba Ci serdecznego przyjaciela.", 
			"Znajdziesz się w centrum zainteresowania.", 
			"Bądź bardziej powściągliwy w krytykowaniu innych.", 
			"Zawierz intuicji.",
			"Możliwy jest koniec samotności."};
	
	public static String[] PRACA = {
			"Nie narzucaj innym swojej woli.",
			"Będziesz pożądać mocnych wrażeń.",
			"Plany podróży zaczną się urealniać.", 
			"Znajdź trochę czasu dla siebie.", 
			"Rozsądnie planuj wydatki.",
			"Obawy odnośnie pieniędzy są bezzasadne.", 
			"Zajmij się własnymi sprawami.",
			"Postaraj się bardziej wyluzować.",
			"Pamiętaj, że każda przesada bywa szkodliwa.", 
			"Nie dopuszczaj do napiętych sytuacji.",
			"Twoje wysiłki przyniosą dobre rezultaty.", 
			"Nie podejmuj się trudnych zadań." 
	};
	
	public static String[] ZDROWIE = {
			"Przezwyciężaj lenistwo.", 
			"Odprężenie znajdziesz na łonie rodziny.", 
			"Wskazana ostrożność na drodze.", 
			"Popracuj nad swoją kondycją psychiczną.", 
			"Potrzeba Ci kontaktu z przyrodą.", 
			"Postaraj się o właściwy wypoczynek.", 
			"Panuj nad nerwami.",
			"Daj upust swojej niewykorzystanej energii.",
			"Nie rozpraszaj dobrej energii.",
			"Unikaj ciężkostrawnych potraw.", 
			"Naucz się relaksować.",
			"Wprowadź do swego życia więcej radości." 
	};

	public int healthIndex() {
		return (clientName.length() % 12);
	}
	
	public int loveIndex() {
		return ((currentDay - 1) % 12);
	}
	
	public int workIndex() {
		return randomNumber;
	}
	
	public String healthProficy() {
		return ZDROWIE[healthIndex()];
	}
	
	public String loveProficy() {
		return MILOSC[loveIndex()];
	}
	
	public String workProficy() {
		return PRACA[workIndex()];
	}
}
