package drinksshopsalesproject;
import java.util.Scanner;
public class Drink {
      //DATA INITIALION
	public static void main(String[] args) {
		String[] drinks= {"Coke", "Fanta", "Sprite"};
		int[] prices = {2000, 1000, 1500};
		int[] stock = {30, 28, 45};
	Scanner scanner = new Scanner(System.in);
	
	
	//for displays all drinks
	System.out.println("--AVAILABLE DRINKS--");
	for (int i =0; i<drinks.length; i++) {
		System.out.println(drinks[i] + "- UGX"+ prices[i] +"-Stock:"+ stock[i]);
		
	}
	
	//records sales
	System.out.println("------------");
	boolean record = true;
	while (record) {
		System.out.print("Enter drink name sold:");
		String drinkName= scanner.nextLine();
		System.out.print("Enter quantity sold:");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		for(int i =0; i< drinks.length; i++) {
			if (drinks[i].equalsIgnoreCase("no")) {
				stock[i]-= quantity;
			}
		}
		System.out.print("Record another sale? yes/no:");
		String answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			record = false;
			
			
			
			
		}
	}
 //do while loop
	String answer;
	do {
		System.out.print("Enter drink name sold:");
        String drinkName = scanner.nextLine();
        System.out.print("Enter drink quantity sold:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i].equalsIgnoreCase(drinkName)) {
                stock[i] -= quantity;
            }
        }
        System.out.print("Do you want to continue? yes/no: ");
        answer = scanner.nextLine();
    } while (answer.equalsIgnoreCase("yes"));
	
	
	
	//ternary
	
	for (int i = 0; i < drinks.length; i++) {
	String status = stock[i] <5? "Low Stock" : "Stock Available";
	System.out.println(drinks[i]+ "-Stock:" + stock[i] + "-Status:" + status); 
	
	
	}
	scanner.close();
	}


}