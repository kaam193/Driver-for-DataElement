package driver;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		Movie theMovie = new Movie();
		String title;
		String rating;
		int tickets;
		char anwser;


		do {
			System.out.println("enter the name of a movie");
			title = keyboard.nextLine();
			theMovie.setTitle(title);

			System.out.println("enter the rating of the movie");
			rating = keyboard.nextLine();
			theMovie.setRating(rating);

			System.out.println("enter the number of tickets sold for this movie");
			tickets = keyboard.nextInt();
			theMovie.setSoldTickets(tickets);
			System.out.println(theMovie.toString());

			System.out.println("Do you want to enter another movie? (y or n)");
			keyboard.nextLine();
			anwser =  keyboard.next().charAt(0);

		}while(anwser == 'y'); 




	}



}
