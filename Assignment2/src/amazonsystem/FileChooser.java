package amazonsystem;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

//JFileCHooser implementation. Thank you to ...
//https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html
//https://stackoverflow.com/questions/19302029/filter-file-types-with-jfilechooser
//And bing AI for code template

public class FileChooser {
	String chooserMethod() {
		JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
		
		String pathname;
		JFileChooser theChoice = new JFileChooser();
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Excel Documents", "xls", "xlsx", "xlsm");
		FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("Character Separated Value files", "csv");
		theChoice.setFileFilter(fileFilter);
		theChoice.setFileFilter(csvFilter);
		theChoice.setAcceptAllFileFilterUsed(false);
		int returnVal = theChoice.showOpenDialog(frame);
		theChoice.requestFocusInWindow();
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File chosenFile = theChoice.getSelectedFile();
			System.out.println("You have imported the data from file: " + theChoice.getSelectedFile().getName());
			pathname = chosenFile.getAbsolutePath(); // TODO convert file to pathname
			frame.dispose();
			return pathname;
		}
		frame.dispose();
		return null;
	}
	void saverMethod() {
		JFrame sFrame = new JFrame();
        sFrame.setAlwaysOnTop(true);
        sFrame.setVisible(true);
		
		JFileChooser saveFile = new JFileChooser();
		FileNameExtensionFilter excelFilter = new FileNameExtensionFilter("Excel Documents", "xls", "xlsx", "xlsm");
		FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("Character Separated Value files", "csv");
		saveFile.addChoosableFileFilter(excelFilter);
		saveFile.addChoosableFileFilter(csvFilter);
		int returnVal = saveFile.showSaveDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File savedFile = saveFile.getSelectedFile();
			System.out.println("You have saved data to file: " + saveFile.getSelectedFile().getName());
			sFrame.dispose();
		}
		sFrame.dispose();
		
	}
}