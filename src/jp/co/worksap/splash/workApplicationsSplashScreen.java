package jp.co.worksap.splash;
import java.awt.Color;
import java.awt.Font;

import com.thehowtotutorial.splashscreen.JSplash;

public class workApplicationsSplashScreen {
	
	public workApplicationsSplashScreen(){
		
		JSplash wAPSplash1 = new JSplash(workApplicationsSplashScreen.class.getResource("slide00.jpg"),true,false,true, "",new Font("tahoma",Font.BOLD,14),Color.BLACK,Color.BLACK);
		wAPSplash1.splashOn();
		for(int index = 0; index <= 50; index++){
			wAPSplash1.setProgress(index);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		

		
		JSplash wAPSplash2 = new JSplash(workApplicationsSplashScreen.class.getResource("slide03.jpg"),true,false,true, "",new Font("tahoma",Font.BOLD,14),Color.BLACK,Color.BLACK);
		wAPSplash2.splashOn();
		for(int index = 51; index <= 100; index++){
			wAPSplash2.setProgress(index);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		wAPSplash1.splashOff();
		wAPSplash2.splashOff();
		
	}
	

}
