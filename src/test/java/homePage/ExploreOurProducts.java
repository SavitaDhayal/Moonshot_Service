package homePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.home_page;
import com.utility.base_class;
@Listeners(com.utility.listner.class)
public class ExploreOurProducts extends base_class{
	
	public home_page home;
	
	@Test(priority=0)
	public void ExploreProducts_NewRelease() {
		home= new home_page();
		
		Custom_click(home.click_NewRelease(), " tab clickable");
	//	home.products();    // this action will mouse hover and get text of bike present
		
	//	home.productsClick();
		
	}	
	
	
	@Test(priority=1)
	public void ExploreProducts_Practical() throws Exception {
		
		home= new home_page();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Wait(home.click_Practical());
		Custom_click(home.click_Practical(), " click on practical tab");
		List<WebElement> exploreTabs = driver.findElements(By.xpath("(//div[@id='menu-2004248306']//div[@class='bike-product-prant']//img)"));
	    int s = exploreTabs.size();
	    List<WebElement> explorebiketext = driver.findElements(By.xpath("(//div[@id='menu-2004248306']//div[@class='bike-product-prant']//p)"));
	   // int s1 = explorebiketext.size();
//	    for(int i=0;i<s;i++) {
//	    	mouse_hover(exploreTabs.get(i), "Bike");
//			
//			i++;
//			Thread.sleep(2000);
//			for(int j=1;j<explorebiketext.size();j++) {
//				VerifyElementPresent(explorebiketext.get(j), "bike ");
//			}
//			}
	    
	    for(int i=0;i<s;i++) {
	    	//Custom_click(home.click_Practical(), " click on practical tab");
//	    	Custom_click(exploreTabs.get(i), "image clickable");
	    	  Thread.sleep(1000);
				PageLoaded();
				driver.navigate().back();
				Thread.sleep(1000);
				
				Wait(exploreTabs.get(i));
	    	mouse_hover(exploreTabs.get(i), "Bike");
//			
			i++;
			Thread.sleep(1000);
			for(int j=1;j<explorebiketext.size();j++) {
			Custom_click(home.click_Practical(), " click on practical tab");
				Wait(explorebiketext.get(j));
	//			Custom_click(explorebiketext.get(j), "Text clickable");
				VerifyElementPresent(explorebiketext.get(j), "bike ");
		    	  Thread.sleep(2000);
					PageLoaded();
					driver.navigate().back();
								 }
			}

	    }
	
	@Test(priority=2)
	public void ExploreProducts_Executive() throws Exception {
		home=new home_page();
		Custom_click(home.click_Executive(), " click on Executive tab");
		List<WebElement> exploreTabs = driver.findElements(By.xpath("(//div[@id='menu-2004248305']//div[@class='bike-product-prant']//img)"));
	    int s = exploreTabs.size();
	    List<WebElement> explorebiketext = driver.findElements(By.xpath("(//div[@id='menu-2004248305']//div[@class='bike-product-prant']//p)"));
	   // int s1 = explorebiketext.size();
	    for(int i=0;i<s;i++) {
	    	mouse_hover(exploreTabs.get(i), "Bike");
			
			i++;
			Thread.sleep(2000);
			for(int j=1;j<explorebiketext.size();j++) {
				VerifyElementPresent(explorebiketext.get(j), "bike ");
			}
			
			}

	}
	
	
	@Test(priority=3)
	public void ExploreProducts_Performance() throws Exception {
		home=new home_page();
		Wait(home.click_Performance());
		Custom_click(home.click_Performance(), " click on Performance tab");
		//Thread.sleep(2000);
	//WebElement image1=driver.findElement(By.xpath("//img[@src='/content/dam/hero-aem-website/explore-our-products/performance/Xtreme%20160R.png']"));
	//	VerifyImagePresent(image1, "image ");
		List<WebElement> performanceBikes = driver.findElements(By.xpath("(//div[@id='menu-2004248304']//div[@class='bike-product-prant']//img)"));
	    int s = performanceBikes.size();
	    List<WebElement> performanceBikesText = driver.findElements(By.xpath("(//div[@id='menu-2004248304']//div[@class='bike-product-prant']//p)"));
	   // int s1 = explorebiketext.size();
	    for(int i=0;i<s;i++) {
	    	Wait(performanceBikes.get(i));
	    	mouse_hover(performanceBikes.get(i), "Bike");
			
			i++;
			Thread.sleep(2000);
			for(int j=1;j<performanceBikesText.size();j++) {
				Wait(performanceBikesText.get(i));
				VerifyElementPresent(performanceBikesText.get(j), "bike ");
			}
			
			}

		
	}
	
	@Test(priority=4)
	public void ExploreProducts_Scooters() throws Exception {
		home=new home_page();
		Custom_click(home.click_ExploreScooters(), " click on scoooters tab");
		List<WebElement> scooters = driver.findElements(By.xpath("(//div[@id='menu-2004248303']//div[@class='bike-product-prant']//img)"));
	    int n = scooters.size();
	    System.out.println(n);
	    List<WebElement> explorescootertext = driver.findElements(By.xpath("(//div[@id='menu-2004248303']//div[@class='bike-product-prant']//p)"));
	    int s1 = explorescootertext.size();
	    System.out.println(s1);
	    for(int i=0;i<n;i++) {
	    	Wait(scooters.get(i));
	    	mouse_hover(scooters.get(i), "scooters Image");			
			i++;
			Thread.sleep(2000);
			for(int j=1;j<explorescootertext.size();j++) {
				Wait(explorescootertext.get(j));
				VerifyElementPresent(explorescootertext.get(j), "scooters Name ");
			}
			
			}

	}
		
}
