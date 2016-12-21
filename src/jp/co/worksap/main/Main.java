/*
 * The program is supported with an user interface and can be viewed by clicking the jar file submitted.
 * Note :- The code of user interface is made in java but may not work correctly if directly compiled with ecllipse.
 * So to get the best experience out of the user interface it is expected that the program is started from the jar file.
*/
package jp.co.worksap.main;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import jp.co.worksap.help.HelpMenu;
import jp.co.worksap.mainmenu.WorksAppMainMenu;
import jp.co.worksap.splash.workApplicationsSplashScreen;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			String[] li = {"Licensee=Gaurav Harchwani ", "LicenseRegistrationNumber=NCGH140328", "Product=Synthetica", "LicenseType=Non Commercial", "ExpireDate=--.--.----", "MaxVersion=2.18.999"};
			UIManager.put("Synthetica.license.info", li);
			UIManager.put("Synthetica.license.key", "E4A575BF-E1F7F87E-0E245416-767E1426-131B0D73");
			UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		@SuppressWarnings("unused")
		workApplicationsSplashScreen startWAPSplash = new workApplicationsSplashScreen();
		initUserInterface();
	}
	
	public static void initUserInterface(){
		WorksAppMainMenu wapMainMenu = new WorksAppMainMenu();
		wapMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wapMainMenu.setVisible(true);
		wapMainMenu.setSize(1145, 500);	
		
		HelpMenu helpMenu = new HelpMenu();
		helpMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		helpMenu.setVisible(true);
		helpMenu.setSize(700, 355);
		
	}
}
