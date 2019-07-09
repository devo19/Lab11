import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		String decision = null;
		int count = 0;

		ArrayList<Movies> movieTitles = new ArrayList<>();
		movieTitles.add(new Movies(1, "Sholay", "Drama"));
		movieTitles.add(new Movies(2, "Amazing", "Animated"));
		movieTitles.add(new Movies(1, "Bom to Goa", "Drama"));
		movieTitles.add(new Movies(1, "Really", "Drama"));
		movieTitles.add(new Movies(2, "Sunny", "Animated"));
		movieTitles.add(new Movies(3, "123", "scifi"));
		movieTitles.add(new Movies(2, "Chu chu", "Animated"));
		movieTitles.add(new Movies(4, "Pie", "horror"));
		movieTitles.add(new Movies(4, "Life", "horror"));
		movieTitles.add(new Movies(3, "Star11", "scifi"));
		try {
			do {

				System.out.println("Welcome to the Movie List Application!");
				System.out.println();
				System.out.println("There are 10 movies in this list");

				System.out.println("What category are you interested in ?");
				System.out.println("1. Drama");
				System.out.println("2. Animated");
				System.out.println("3. Scifi");
				System.out.println("4. Horror");
				userChoice = scnr.nextInt();
				for (Movies s : movieTitles) {
					if (userChoice > 0 && userChoice < 5
							&& (userChoice == s.getNum())) {
						count++;

						System.out.println(s.getTitle());

					}

				}
				if (count == 0) {
					System.out.println("Invalid Input");
				}
				System.out.println("Continue? y/n");
				decision = scnr.next();

				count = 0;
			} while (decision.equalsIgnoreCase("y"));
			System.out.println("Thank you! Visit Again!");

			scnr.close();
		} catch (Exception exception) {
			System.out.println("The exception is " + exception);
		}
	}

}
