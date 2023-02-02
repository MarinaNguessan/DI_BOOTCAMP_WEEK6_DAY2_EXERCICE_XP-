package atos;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		int number = 0;
		
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez entrer un nombre svp");
		     number = scanner.nextInt();
		
		if(number >= 0 && number <= 59) {
			System.out.println("l'alphabet correspondant au nombre  est : F" );
		}
		
		if(number >= 60 && number <= 69) {
			System.out.println("l'alphabet correspondant au nombre  est : ré" );
		}
		if(number >= 70 && number <= 76) {
			System.out.println("l'alphabet correspondant au nombre  est : C" );
		}
		if(number >= 77 && number <= 79) {
			System.out.println("l'alphabet correspondant au nombre  est : C+" );
		}
		if(number >= 80 && number <= 82) {
			System.out.println("l'alphabet correspondant au nombre  est : B-" );
		}
		if(number >= 83 && number <= 86) {
			System.out.println("l'alphabet correspondant au nombre  est : B" );
		}
		
		if(number >= 87 && number <= 89) {
			System.out.println("l'alphabet correspondant au nombre  est : B+" );
		}
		if(number >= 90 && number <= 92) {
			System.out.println("l'alphabet correspondant au nombre  est : A-" );
		}
		
		if(number >= 93 && number <= 100) {
			System.out.println("l'alphabet correspondant au nombre  est : UN" );
		}



	}

}
