 package motorcycleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;
@Listeners(com.utility.listner.class)
public class Practical_ProductPage_Splendorplus extends base_class{
	public Motorcycles_practical ob;
	public static home_page home;
	SoftAssert asert = new SoftAssert();
	@Test(priority = 0)
	public void Motorcycles_practicalPage_SplendorPlus() {
		ob = new Motorcycles_practical();
		home=new home_page();
		Wait(home.click_HeroLogo());
		Custom_click(home.click_HeroLogo(), "");
		
		Wait(ob.motorcycles());
		Custom_click(ob.motorcycles(), "Motorcycles");
		PageLoaded();
		Wait(ob.click_splendorplusText());
		Custom_click(ob.click_splendorplusText(), "splendor plus text");
		PageLoaded();
		
	}
	
	
	@Test(priority = 1)
	public void TC029_Splendorplus_Overview() throws Exception {  
		ob = new Motorcycles_practical();
		home=new home_page();
	
		home.ReqCallBack();
		PageLoaded();
		Thread.sleep(1000);
		
		Wait(ob.RequestCB_bttn_bannerMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_bannerMotorcycle(), "RCB button ");
		Custom_click(ob.RequestCB_bttn_bannerMotorcycle(), " ");
		Wait(ob.RequestCB_bttn_PopUpMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_PopUpMotorcycle(), " Request call Back Popup ");
		
		custom_sendkeys(ob.RequestCB_name_Motorcycle() , config_getdata("Name"), "Name");
		custom_sendkeys(ob.RequestCB_Mobile_Motorcycle(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(ob.RequestCB_otp_Motorcycle(), config_getdata("OTP"), "Enter OTP");
		
		Custom_click(ob.RequestCB_stateDD_Motorcycle(), " click on select state");
		Custom_click(ob.RequestCB_selectState_Motorcycle(), "select state");
		Custom_click(ob.RequestCB_cityDD_Motorcycle(), " click on select city");
		Custom_click(ob.RequestCB_selectCity_Motorcycle(), "select city");	
		Custom_click(ob.RequestCB_ClickSubmit_Motorcycle(), " Submit bttn clickable");
		
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Custom_click(home.click_Request_CB_closeBttn(), " click on cross button");
		Wait(ob.overview_ClickBookNow_Motorcycle());
		VerifyElementPresent(ob.overview_ClickBookNow_Motorcycle(), "");
		Custom_click(ob.overview_ClickBookNow_Motorcycle(), " click on BookNow");
		change_window(1, " Next window");
		Thread.sleep(2000);
		PageLoaded();
		Wait(ob.getBikeName_Header());
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		Wait(ob.getBikeName_Title());
		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
		String nameHeader=ob.getBikeName_Header().getText();
		String nameTitle=ob.getBikeName_Title().getText();
		Assert.assertEquals(nameHeader, nameTitle);
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		

	}

	
//	@Test(priority = 2,dependsOnMethods = "Motorcycles_practicalPage_SplendorPlus")
//	public void TC030_Splendorplus_FeatureCarousels() {
//		ob = new Motorcycles_practical();
		
		//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-prev slick-arrow']
		//div[@class='splender-feature-slider slick-initialized slick-slider']//button[@class='slick-next slick-arrow']
	
	//}
	
	@Test(priority=3)
	public void TC031_Splendorplus_Features_BookATest_Ride() throws Exception {
		ob = new Motorcycles_practical();
		home=new home_page();
		
		PageLoaded();
//		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='FEATURES']")).click();
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1600)");
		
		Wait(ob.BTR_HeadingText());
		VerifyElementPresent(ob.BTR_HeadingText(), " Heading ");
		Wait(ob.BTR_name());
		Thread.sleep(2000);
		custom_sendkeys(ob.BTR_name() , config_getdata("Name"), "Name");
		custom_sendkeys(ob.BTR_mobileNum(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(ob.BTR_otp(), config_getdata("OTP"), "Enter OTP");
		
		Custom_click(ob.BTR_StateDD(), " click on select state");
		Custom_click(ob.BTR_selectState(), "select state");
		Custom_click(ob.BTR_CityDD(), " click on select city");
		Custom_click(ob.BTR_citySelect(), "select city");
		if(driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).isEnabled()) {
		Custom_click(ob.BTR_submitBttn(), " Submit bttn clickable");}
		
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		
	//	Custom_click(home.click_RequestCB_closeBttn1(),"close bttn clickable");
		
	}
	
		
	@Test(priority = 4)
	public void TC032__Splendorplus_Specification() throws Exception {
		
		ob = new Motorcycles_practical();
		
		Wait(ob.specification_headerTab());
		VerifyElementPresent(ob.specification_headerTab(), " tab: ");
		Custom_click(ob.specification_headerTab(), " Heading");
		
		VerifyElementPresent(ob.specification_headingText(), "");
		VerifyImagePresent(ob.HF_Deluxe_Engine_Icon(), " engine icon");
		VerifyElementPresent(ob.Engine_Tab(), " engine text ");
	//	Custom_click(ob.Engine_Tab(), " engine tab clickable");
		Thread.sleep(3000);
		Wait(ob.SplendorPlus_Engine_Image());
		VerifyImagePresent(ob.SplendorPlus_Engine_Image(), "engine Image");
		
		VerifyImagePresent(ob.HF_Deluxe_Transmission_Icon(), " Transmission icon");
		VerifyElementPresent(ob.Transmission_Tab(), " Transmission  Text ");
		
		Wait(ob.Transmission_Tab());
		Custom_click(ob.Transmission_Tab(), " Transmission tab clickable");
		
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Transmission_Image());
		VerifyImagePresent(ob.SplendorPlus_Transmission_Image(), "Transmission Image");
		
		VerifyImagePresent(ob.HFDeluxe_Suspension_Icon(), " suspension icon");
		VerifyElementPresent(ob.Suspension_Tab(), " Suspension text ");
		Wait(ob.Suspension_Tab());
		Custom_click(ob.Suspension_Tab(), " suspension tab clickable");
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Suspension_Image());
		VerifyImagePresent(ob.SplendorPlus_Suspension_Image(),"suspension Image");
				
		VerifyImagePresent(ob.HF_Deluxe_Brakes_Icon(), " brakes icon");
		VerifyElementPresent(ob.Brakes_Tab(), " brakes text ");
		Custom_click(ob.Brakes_Tab(), " brakes tab clickable");
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Brakes_Img());
		VerifyImagePresent(ob.SplendorPlus_Brakes_Img(),"brakes Image");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
		VerifyImagePresent(ob.HF_Deluxe_wheels_and_tyres_Icon(), " wheels icon");
		VerifyElementPresent(ob.Wheels_and_tyres_Tab(), " wheels text ");
		Custom_click(ob.Wheels_and_tyres_Tab(), " wheels tab clickable");
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Wheels_and_tyres_Img());
		VerifyImagePresent(ob.SplendorPlus_Wheels_and_tyres_Img(),"wheels Image");
		
		VerifyImagePresent(ob.HF_Deluxe_Elecetrical_Icon(), " electrical icon");
		VerifyElementPresent(ob.Electrical_Tab(), " electrical text ");
		Custom_click(ob.Electrical_Tab(), " electrical tab clickable");
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Electrical_Img());
		VerifyImagePresent(ob.SplendorPlus_Electrical_Img(),"electrical Image");
		
		VerifyImagePresent(ob.HF_Deluxe_Dimension_Icon(), " Dimension icon");
		VerifyElementPresent(ob.Dimension_Tab(), " Dimension text ");
		Custom_click(ob.Dimension_Tab(), " Dimension tab clickable");
		Thread.sleep(2000);
		Wait(ob.SplendorPlus_Dimension_Img());
		VerifyImagePresent(ob.SplendorPlus_Dimension_Img(),"Dimension Image");
		
	}
	
	@Test(priority = 5)
	public void TC033_Splendorplus_Price() throws Exception {  //44 steps
		ob = new Motorcycles_practical();
		
		PageLoaded();
		VerifyImagePresent(ob.Price_Icon(), " price icon");
		VerifyElementPresent(ob.Price_Tab(), " Price tab");
		Custom_click(ob.Price_Tab(), " Price tab clickbale");
		VerifyElementPresent(ob.Price_Heading(), " Heading");
		Wait(ob.Price_SplendorPlus_BikeImg());
		VerifyImagePresent(ob.Price_SplendorPlus_BikeImg(), " Bike Image ");
		
		Thread.sleep(2000);
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");
		Wait(ob.Price_SelectState1());
		VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");		
		Custom_click(ob.Price_SelectState1(), " Selected state");
		//VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity1(), "City to be selected");
		Custom_click(ob.Price_SelectCity1(), " selected City");
		Thread.sleep(2000);
		ob.check_Variant_and_priceText();
		ob.check_all_Variants_Price();
		//check price after changing state 
		Thread.sleep(2000);
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");		
		VerifyElementPresent(ob.Price_SelectState2(), " State to be selected ");
		Thread.sleep(2000);
		Custom_click(ob.Price_SelectState2(), " Selected state");
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity2(), "City to be selected");
		Custom_click(ob.Price_SelectCity2(), " selected City");
//		ob.check_Variant_and_priceText();
		
		ob.check_all_Variants_Price();
		
		Custom_click(ob.Price_BookNow(), " click Button Book now ");
		change_window(1, " Next window");
		Thread.sleep(3000);
		PageLoaded();
		VerifyElementPresent(ob.getBikeName_Header(), "Header bike name ");  
		VerifyElementPresent(ob.getBikeName_Title(), " Bike title name");
		String nameHeader=ob.getBikeName_Header().getText();
		String nameTitle=ob.getBikeName_Title().getText();
		Assert.assertEquals(nameHeader, nameTitle);

		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
	}
	
	@Test(priority = 6)
	public void TC034_Splendorplus_Compare() {   
		ob = new Motorcycles_practical();
		
		PageLoaded();
		Wait(ob.CompareIcon());
		VerifyImagePresent(ob.CompareIcon(), " compare icon");
		VerifyElementPresent(ob.CompareTab(), " tab text ");
		Custom_click(ob.CompareTab(), " check custom tab clickable");
		VerifyElementPresent(ob.Compare_Heading(), " Compare Heading"); 
		Wait(ob.Compare_BikeName1());
		VerifyElementPresent(ob.Compare_BikeName1(), " Name of first Bike");
		VerifyElementPresent(ob.Compare_BikeName2(), " Name of second Bike");
		Wait(ob.SplendorPlus_Compare_BikeIMG1());
		VerifyImagePresent(ob.SplendorPlus_Compare_BikeIMG1(), " image of first bike ");
		VerifyImagePresent(ob.SplendorPlus_Compare_BikeIMG2(), " image of second bike ");
		ob.Compare2Bikes();
		
	}
	
	
	@Test(priority = 7)
	public void TC035_Splendorplus_Find_A_Dealer() throws InterruptedException {
		ob = new Motorcycles_practical();
		
		PageLoaded();
		driver.navigate().refresh();
		Wait(ob.FindDealer_Icon());
		VerifyImagePresent(ob.FindDealer_Icon(), " Find Dealer Icon ");
		Wait(ob.FindDealer_Tab());
		VerifyElementPresent(ob.FindDealer_Tab(), " Find Dealer Tab");
		Custom_click(ob.FindDealer_Tab(), " Tab clickable ");
		VerifyElementPresent(ob.FindDealer_HeadingLeft(), " Heading on left ");
		VerifyElementPresent(ob.FindDealer_HeadingRight(), "Heading on right ");
		Thread.sleep(2000);
		Wait(ob.FindDealer_stateDD());
		Custom_click(ob.FindDealer_stateDD(), " State DropDown");
		Wait(ob.FindDealer_selectState());
		VerifyElementPresent(ob.FindDealer_selectState(), " state to be selected");
		Custom_click(ob.FindDealer_selectState(), " select state");
		Thread.sleep(2000);
		Wait(ob.FindDealer_CityDD());
		Custom_click(ob.FindDealer_CityDD(), " City DropDown");
		
		Wait(ob.FindDealer_selectCity());
		VerifyElementPresent(ob.FindDealer_selectCity(), " city to be selected");
		Wait(ob.FindDealer_selectCity());
		Custom_click(ob.FindDealer_selectCity()," select City");
		Thread.sleep(2000);
		ob.DealersName();
		
	}
	
	@Test(priority = 8)
	public void TC036_Splendorplus_Exchange() throws Exception {   
		ob = new Motorcycles_practical();
		
	//	PageLoaded();
		home.ReqCallBack();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1800)");
		VerifyElementPresent(ob.Exchange_heading1(), " Heading 1 - ");
		VerifyElementPresent(ob.Exchange_heading2(), " Heading 2 - ");
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1800)");
		
		Wait(ob.SplendorPlus_Exchange_BikeImage());
		VerifyImagePresent(ob.SplendorPlus_Exchange_BikeImage(), " Image of bike");
		VerifyElementPresent(ob.Exchange_Button(), " Button Text ");
		Custom_click(ob.Exchange_Button(), "Exchange Button Clickable");
		
		change_window(1, " Next window");
		Thread.sleep(3000);
		PageLoaded();

		driver.close();
		change_window(0, " Previous window");
		PageLoaded();			
	}	
	
	@Test(priority = 9)
	public void TC037_Splendorplus_Calculate_EMI() throws Exception {
		ob = new Motorcycles_practical();
		
		PageLoaded(); 
		
		Wait(ob.EMI_heading());
		VerifyElementPresent(ob.EMI_heading(), " Heading ");
		
		
		VerifyElementPresent(ob.Payment_Heading(), " payment Heading");		
		VerifyElementPresent(ob.EMI_Payment(), " payment Heading");

		
		VerifyElementPresent(ob.Amount_NeededText(), " ");		
		VerifyElementPresent(ob.Min_AmtNeeded(), "Minimum Amount ");
		VerifyElementPresent(ob.Max_AmtNeeded(), "Maximum Amount ");

		String v1=ob.Amt_needed_Value().getAttribute("value");
		System.out.println(v1);
		Wait(ob.Amt_needed_Value());
		VerifyTextByAttribute(ob.Amt_needed_Value(), "Initial value ", " is ");
		
		 Actions move = new Actions(driver);
		 move.moveToElement(ob.Slider1()).clickAndHold().moveByOffset(100, 0).release().perform();
		 Wait(ob.Amt_needed_Value());
			VerifyTextByAttribute(ob.Amt_needed_Value(), "value after sliding once ", " is ");
			VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
		 Thread.sleep(2000);
		 move.moveToElement(ob.Slider1()).clickAndHold().moveByOffset(150, 0).release().perform();
		 Wait(ob.Amt_needed_Value());
			VerifyTextByAttribute(ob.Amt_needed_Value(), "value after sliding again ", " is ");
			VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
			
			
			VerifyElementPresent(ob.InterestRate_Text(), " ");		
			VerifyElementPresent(ob.Min_Interest(), "Minimum Interest ");
			VerifyElementPresent(ob.Max_Interest(), "Maximum Interest ");

			String v2=ob.Interest_Value().getAttribute("value");
			System.out.println(v2);
			Wait(ob.Interest_Value());
			VerifyTextByAttribute(ob.Interest_Value(), "Initial value ", " is ");
					
			 move.moveToElement(ob.Slider2()).clickAndHold().moveByOffset(100, 0).release().perform();
			 Wait(ob.Interest_Value());
				VerifyTextByAttribute(ob.Interest_Value(), "Interest rate after sliding once ", " is ");
				VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
			 Thread.sleep(2000);
			 move.moveToElement(ob.Slider2()).clickAndHold().moveByOffset(150, 0).release().perform();
			 Wait(ob.Interest_Value());
				VerifyTextByAttribute(ob.Interest_Value(), "Interest rate after sliding again ", " is ");
				VerifyElementPresent(ob.EMI_Payment(), " payment Heading");

				
				VerifyElementPresent(ob.Duration_Text(), " ");		
				VerifyElementPresent(ob.Min_Duration(), "Minimum Duration ");
				VerifyElementPresent(ob.Max_Duartion(), "Maximum Duration ");

				String v3=ob.Duration_Value().getAttribute("value");
				System.out.println(v3);
				Wait(ob.Duration_Value());
				VerifyTextByAttribute(ob.Duration_Value(), "Initial value ", " is ");
						
				 move.moveToElement(ob.Slider3()).clickAndHold().moveByOffset(80, 0).release().perform();
				 Wait(ob.Duration_Value());
					VerifyTextByAttribute(ob.Duration_Value(), "Duration after sliding once ", " is ");
					VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
				 Thread.sleep(2000);
				 move.moveToElement(ob.Slider3()).clickAndHold().moveByOffset(180, 0).release().perform();
				 Wait(ob.Duration_Value());
					VerifyTextByAttribute(ob.Duration_Value(), "Duration after sliding again ", " is ");
					VerifyElementPresent(ob.EMI_Payment(), " payment Heading");
				//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -2800)");
		
	}
	
	
	//
	@Test(priority = 10)
	public void TC_038_Splendorplus_Colours_And_VirtualView() throws Exception {
		ob = new Motorcycles_practical();
	Thread.sleep(2000);
		//PageLoaded();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -3000)");
		Wait(ob.color360_Heading());
		VerifyElementPresent(ob.color360_Heading(), " Heading ");
		
		WebElement slideUp=driver.findElement(By.xpath("//ul[@class='nav nav-tabs explore-360-tab']"));
		mouse_hover(slideUp, "mouse hover ");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)");
		
		ob.Colors_Text();    // check color text clickable
			
		Thread.sleep(2000);
	//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		// 	((JavascriptExecutor) driver).executeScript("document.getElementById('gvLocationHorizontalRail').scrollTop += 250", "");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver; 
//		js.executeScript(
//		    "document.getElementById('gvLocationHorizontalRail').scrollLeft += 250", "");
			
		

		mouse_hover(slideUp, "mouse hover ");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		
		
		Wait(ob.colorSwitch_RubyRed());
		VerifyImagePresent(ob.colorSwitch_RubyRed(), "SplendorPlus- Ruby Red");
		Wait(ob.colorSwitch_RubyRed());
		Custom_click(ob.colorSwitch_RubyRed(), "Ruby Red switch Clickable ");
		
		VerifyImagePresent(ob.colorSwitch_SunshineGold(), "SplendorPlus- Sunshine Gold");
		Custom_click(ob.colorSwitch_SunshineGold(), "Sunshine Gold switch Clickable ");
		
		VerifyImagePresent(ob.colorSwitch_ButterflyYellow(), "SplendorPlus- Butterfly Yellow" );
		Custom_click(ob.colorSwitch_ButterflyYellow(), "Butterfly Yellow switch Clickable ");
		
		VerifyImagePresent(ob.colorSwitch_SilverNexusBlue(), "SplendorPlus- Silver Nexus Blue" );
		Custom_click(ob.colorSwitch_SilverNexusBlue(), "Silver Nexus Blue switch Clickable ");

		VerifyImagePresent(ob.colorSwitch_MatteShieldGold(), "SplendorPlus- Matte Shield Gold" );
		Custom_click(ob.colorSwitch_MatteShieldGold(), "Matte Shield Gold switch Clickable ");
		
		
		VerifyImagePresent(ob.colorSwitch_SplendorPlusBlackRed(), "SplendorPlus- Black Red");
		Custom_click(ob.colorSwitch_SplendorPlusBlackRed(), "Black red switch Clickable ");
		
		VerifyImagePresent(ob.colorSwitch_SplendorPlusBlackPurple(), "SplendorPlus- Black Purple");
		Custom_click(ob.colorSwitch_SplendorPlusBlackPurple(), "Black purple switch Clickable");
		
		VerifyImagePresent(ob.colorSwitch_HeavyGreenGrey(), "SplendorPlus- Heavy Green Grey");
		Custom_click(ob.colorSwitch_HeavyGreenGrey(), "Heavy Green Grey switch Clickable");
		
		VerifyImagePresent(ob.colorSwitch_Gold(), " SplendorPlus-Firefly Golden Switch");
		Wait(ob.colorSwitch_Gold());
		Custom_click(ob.colorSwitch_Gold(), " Firefly Golden Switch clickable ");
				
		VerifyImagePresent(ob.colorSwitch_BeetelRed(), "SplendorPlus- Beetel Red");
		Custom_click(ob.colorSwitch_BeetelRed(), "Beetel Red switch Clickable");
		
		VerifyElementPresent(ob.Explore360(), " ");
		Custom_click(ob.Explore360(), " clicked");
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();		
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
		
	}

	
	
}
