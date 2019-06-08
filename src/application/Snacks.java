package application;

public class Snacks {

	public static void main(String[] args) {
		
		String[][] snacks = { {"Pizza", "Hot-dog"},{"French Fries", "Tacos"}, {"Bacon", "Eggs"}, {"Kebab", "Burrito"} };
		
		for ( int i = 0; i < snacks.length; i++ ) {
			for ( int j = 0; j < snacks[i].length; j++ ) {
				if ( j != snacks[i].length - 1 ) {
					System.out.print(snacks[i][j] + " - ");
				}
				else {
					System.out.print(snacks[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Ordered: " + snacks[1][1] + " and " + snacks[3][0] + ".");
	}

}
