package Practise_Playwright;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class fbScreenshot {
	
//	public static byte [] takeScreenshot(Page page) {
//		
//		SimpleDateFormat dateFormat=new SimpleDateFormat("yy_MM_dd_HH_mm_ss_Z");
//			Date date =new Date();
//			String dateformat=dateFormat.format(date);
//			byte[] arr=page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/fb"+dateformat+".png")));
//
//		
//		    return arr;
//		
//	}
//	
	
	public static void main(String [] args) {
		
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		
		page.navigate("https://www.facebook.com");
		
		System.out.println(page.title()+" "+page.url());
		
		Utilitymethod.takeScreenshot(page);
		
		
		
		
	}

}
