package Practise_Playwright;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CaptureScreenshots {

	public static void main(String [] args) {
		
		Browser browser =Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		
		page.navigate("https://www.facebook.com/");
		
		System.out.println(page.title()+" "+page.title());
		
		//here we want to take the screenshots
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/screenshots1"+".png")));
		
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("/Screenshot/screenshots2"+".png")).setFullPage(true));
//		
//		byte [] buffer=page.screenshot();
//		System.out.println(Base64.getEncoder().encodeToString(buffer));
//		
		captureScreen(page);
		
		browser.close();
	}
		public static void captureScreen(Page page) {
			
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd_MMMMM_yyyyy_GGG_hh");
			Date date =new Date();
			String customerdateFormat=simpleDateFormat.format(date);
			
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshot/facebook_"+customerdateFormat+".png")));
			
			
		
	}
}
