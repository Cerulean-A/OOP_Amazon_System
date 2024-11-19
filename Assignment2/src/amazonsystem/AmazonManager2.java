package amazonsystem;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

import java.awt.*;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class AmazonManager2 {
	
	Scanner menuInput = new Scanner(System.in);
	FileChooser myChoice = new FileChooser();
	private static String csvFileNameSave = "D:\\Sample-Amazon-Products-v2.csv";
	
	
//	private static AmazonManagerList AML = new AmazonManagerList ();
	
//	public static AmazonProductUtil utilityClass = new AmazonProductUtil();
	
	
	public AmazonManager2() {
		menuInput = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		AmazonManager2 AM = new AmazonManager2();

		char charVal;
		boolean flag = true; //The flag marks correct option.
		while(flag) {
			Pattern pattern = Pattern.compile("[a-t;A-T]");
			mainMenu();
//			AM.loadProductList();

			System.out.print("Input a char: ");
			charVal = AM.menuInput.nextLine().charAt(0);
			
			//AM.loadProductList();
			//AM.loadProductList();
			System.out.print(charVal);
				if (pattern.matcher(String.valueOf(charVal)).matches()) {
			
					try {	// The start of a try catch block to catch and handle an exception that arises from putting a non-integer value in.
    					  
						switch (charVal) {
						case 'A' -> AM.loadProductList();
						case 'B' -> AM.showProductList();
						case 'C' -> AM.searchProductList();
						case 'D' -> AM.addCustomer();
						case 'E' -> AM.showCustomers();
						case 'F' -> AM.addCreditToCustomers();
						case 'G' -> AM.showCreditFromCustomer();
						case 'H' -> AM.addProductinWishList();
						case 'I' -> AM.removeProductFromWishList();
						case 'J' -> AM.showWishList();
						case 'K' -> AM.addProductinCart();
						case 'L' -> AM.removeProductinFromCart();
						case 'M' -> AM.showProductCart();
						case 'N' -> AM.payCart();
						case 'O' -> AM.addCommentToProduct();
						case 'P' -> AM.showComments();
						case 'R' -> AM.exit();
						//case 'S' -> AM.findCustomerById(cId);
						//case 'T' -> AM.findProductById(pId); 
						}	
					}
		    		catch(IllegalArgumentException e) {													// This catches the numberFormatException that occurs when you don't input an integer.
		    			System.err.println("Error: You did not input an integer value. Try again.\n");	// This handles the numberFormatException by printing out a line telling the user the error.
		    		}
				}
              else {														// If the value is NOT part of the acceptable range.
      			System.out.println(" --> There is no such option, please try again.");			// Then print out that there is no option. Menu is still in loop.
     			}// We're using our scanner named input to create a String named data from what is input
    		 														// This parses an integer out of data.

	}	
		AM.menuInput.close();
//		FileChooser myChoice = new FileChooser();
//		myChoice.chooserMethod();
//
//		myChoice.saverMethod();
	}
		


    public static void mainMenu() {
        
    String mainMenuItemBlock = """
===========================================================================
||\u001B[1;32m    ****    ****           ****    ****   *****\u001B[0m      ALGONQUIN COLLEGE ||
||\u001B[1;32m   **  **  **       \u001B[0m\u001B[1;90m**\u001B[0m\u001B[1;32m    **  **  **  **  ** **\u001B[0m    COURSE: OOP/CST8132 \u001B[32m\u001B[0m||
||\u001B[1;32m   ******  **       \u001B[0m\u001B[1;90m**\u001B[0m\u001B[1;32m    **  **  **  **  *****\u001B[0m            PROF: PAULO \u001B[32m\u001B[0m||
||\u001B[1;32m   **  **   ****           ****    ****   **\u001B[0m         TERM: FALL / 2024 \u001B[32m\u001B[0m||
===========================================================================
||                      [Menu A2 - Amazon Manager]                       ||
===========================================================================
||                                  ||               \u001B[1;36mUSER\u001B[0m                ||
||                                  ||\u001B[96m Credit options .................. \u001B[0m||
|| \u001B[1;32mADMIN\u001B[0m                            || \u001B[90m[\u001B[0mF\u001B[90m]\u001B[0m Add credit to customer        ||
||                                  || \u001B[90m[\u001B[0mG\u001B[90m]\u001B[0m Show credits from customer    ||
|| \u001B[92mProduct options ................\u001B[0m ||\u001B[96m Wishlist options ................ \u001B[0m||
|| \u001B[90m[\u001B[0mA\u001B[90m]\u001B[0m Load product list            || \u001B[90m[\u001B[0mH\u001B[90m]\u001B[0m Add product in wishlist       ||
|| \u001B[90m[\u001B[0mB\u001B[90m]\u001B[0m Show product list            || \u001B[90m[\u001B[0mI\u001B[90m]\u001B[0m Remove product from wishlist  ||
|| \u001B[90m[\u001B[0mC\u001B[90m]\u001B[0m Search products              || \u001B[90m[\u001B[0mJ\u001B[90m]\u001B[0m Show products from wishlist   ||
||                                  ||\u001B[96m Cart options .................... \u001B[0m||
|| \u001B[92mCustomer options ...............\u001B[0m || \u001B[90m[\u001B[0mK\u001B[90m]\u001B[0m Add product in cart           ||
|| \u001B[90m[\u001B[0mD\u001B[90m]\u001B[0m Add customer                 || \u001B[90m[\u001B[0mL\u001B[90m]\u001B[0m Remove product from cart      ||
|| \u001B[90m[\u001B[0mE\u001B[90m]\u001B[0m Show customers               || \u001B[90m[\u001B[0mM\u001B[90m]\u001B[0m Show products from cart       ||
||                                  || \u001B[90m[\u001B[0mN\u001B[90m]\u001B[0m Buy products from cart        ||
||                                  ||\u001B[96m Comment options ................. \u001B[0m||
|| ................................ || \u001B[90m[\u001B[0mO\u001B[90m]\u001B[0m Comment products bought       ||
||            \u001B[90m[\u001B[0m\u001B[91m\033[1mQ\u001B[90m]\u001B[0m Exit              || \u001B[90m[\u001B[0mP\u001B[90m]\u001B[0m List comments from products   ||
===========================================================================
                            Choose an option: \u001B[31m\033[1mQ\033[0m\u001B[0m
===========================================================================
||    [End of Application \u001B[35m(Authors: Taylor Houstoun & QianJun Liu)\u001B[0m]      ||
===========================================================================
""";
    System.out.print(mainMenuItemBlock + "");
    
    }
    
	private void loadProductList() {
		System.out.println("test/n");
	    FileChooser myChoice = new FileChooser();  
	    String filePath = myChoice.chooserMethod(); 

//		myChoice.chooserMethod();
		System.out.println(filePath);
	};
	private void showProductList(){};
	private void searchProductList(){};
	private void addCustomer(){};
	private void showCustomers(){};
	private void addCreditToCustomers(){};
	private void showCreditFromCustomer(){};
	private void addProductinWishList(){};
	private void removeProductFromWishList(){};
	private void showWishList(){};
	private void addProductinCart(){};
	private void removeProductinFromCart(){};
	private void showProductCart(){};
	private void payCart(){};
	private void addCommentToProduct(){};
	private void showComments(){};
	private void exit(){};
	private int findCustomerById(int cId){return 0;};
	private int findProductById(int pId){return 0;}; 

}

