package co.jallain;

import java.util.Arrays;
import java.util.List;

public final class App {
	private App() {
	}

	// public static void main(String[] args) {
	// System.out.println("Hello World!");
	// }

	public static List<String> transformerNombreEnArray(String nombre) {
		String[] arrayChiffres = nombre.split(""); // ["2", "2", "bonjour"]
		return Arrays.asList(arrayChiffres); // hop c'est une liste cool top top
	}

	public static String getMultipleString(String nb) {
		int nombre = Integer.parseInt(nb);
		String resultat = "";
		if (nombre != 0) {
			if (nombre % 3 == 0) {
				resultat += "Foo";
			}
			if (nombre % 5 == 0) {
				resultat += "Bar";
			}
			if (nombre % 7 == 0) {
				resultat += "Qix";
			}
		}
		return resultat;
	}

	public static String getHasChiffreString(String nb) {
		String resultat = "";
		List<String> chiffres = transformerNombreEnArray(nb);

		for (String chiffre : chiffres) {
			System.out.println(chiffre);
			if (chiffre.equals("3")) {
				resultat += "Foo";
			} else if (chiffre.equals("5")) {
				resultat += "Bar";
			} else if (chiffre.equals("7")) {
				resultat += "Qix";
			} else if (chiffre.equals("0")) {
				resultat += "*";
			}

		}
		return resultat;
	}

	public static String FooBarQix(String i) {
		String resultat = (getMultipleString(i) + getHasChiffreString(i));

		if (resultat.equals("")) {
			return i;
		} else {
			return resultat;
		}
	}
}