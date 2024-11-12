package AmazonSystem;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

import java.awt.*;
import java.util.*;

public class AmazonManager {
	
	Scanner menuInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		mainMenu();
		FileChooser myChoice = new FileChooser();
		myChoice.chooserMethod();
		myChoice.saverMethod();
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
    System.out.print(mainMenuItemBlock + " ");
    
    }

}

// JFileCHooser implementation. Thank you to ...
// https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html
// https://stackoverflow.com/questions/19302029/filter-file-types-with-jfilechooser
// And bing AI for code template

class FileChooser {
	void chooserMethod() {
		JFileChooser theChoice = new JFileChooser();
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Excel Documents", "xls", "xlsx", "xlsm");
		theChoice.setFileFilter(fileFilter);
		theChoice.setAcceptAllFileFilterUsed(false);
		int returnVal = theChoice.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File chosenFile = theChoice.getSelectedFile();
			System.out.println("You have imported the data from file: " + theChoice.getSelectedFile().getName());
		}
	}
	void saverMethod() {
		JFileChooser saveFile = new JFileChooser();
		FileNameExtensionFilter excelFilter = new FileNameExtensionFilter("Excel Documents", "xls", "xlsx", "xlsm");
		FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("Character Separated Value files", "csv");
		saveFile.addChoosableFileFilter(excelFilter);
		saveFile.addChoosableFileFilter(csvFilter);
		int returnVal = saveFile.showSaveDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File savedFile = saveFile.getSelectedFile();
			System.out.println("You have saved data to file: " + saveFile.getSelectedFile().getName());
		}
		
	}
}


