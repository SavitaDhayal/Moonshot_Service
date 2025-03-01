package motorcycleModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page_object.Motorcycle_ExecutiveModule;
import com.page_object.Motorcycle_PerfromanceModule;
import com.page_object.Motorcycles_practical;
import com.page_object.home_page;
import com.utility.base_class;

@Listeners(com.utility.listner.class)

public class Perfromance_ProductPage_XPulse2004V extends base_class {
	
	
	public Motorcycle_PerfromanceModule pfm;
	public Motorcycles_practical ob;
	public Motorcycle_ExecutiveModule exe;
	public static home_page home;
	SoftAssert asert = new SoftAssert();
	
	@Test(priority=0)
	public void Performance_productPage_Xpulse2004V() throws Exception {
		
		
		pfm=new Motorcycle_PerfromanceModule();
		exe=new Motorcycle_ExecutiveModule();		
		home=new home_page();
		ob = new Motorcycles_practical();
		
		Wait(home.click_HeroLogo());
		Custom_click(home.click_HeroLogo(), "");
		
		PageLoaded();
		Wait(exe.motorcycles());
		Custom_click(exe.motorcycles(), "Motorcycles");
		PageLoaded();
		
		Custom_click(pfm.Xpulse2004V_BikeName() , " on Xpulse2004V Text ");
		Thread.sleep(2000);
		PageLoaded();
	}
	
	@Test(priority=1)
	public void TC_128_XPulse200T4V_OverView() throws Exception {
		
		Wait(pfm.TestRide_Button());
		Custom_click(pfm.TestRide_Button(), " click on a Test Ride Button");
		Wait(ob.RequestCB_bttn_PopUpMotorcycle());
		VerifyElementPresent(ob.RequestCB_bttn_PopUpMotorcycle(), " Request call Back Popup ");
		
//		custom_sendkeys(ob.RequestCB_name_Motorcycle() , config_getdata("Name"), "Name");
//		custom_sendkeys(ob.RequestCB_Mobile_Motorcycle(), config_getdata("MobileNo"), "Mobile No.");
//		custom_sendkeys(ob.RequestCB_otp_Motorcycle(), config_getdata("OTP"), "Enter OTP");
//		
//		Custom_click(ob.RequestCB_stateDD_Motorcycle(), " click on select state");
//		Custom_click(ob.RequestCB_selectState_Motorcycle(), "select state");
//		Custom_click(ob.RequestCB_cityDD_Motorcycle(), " click on select city");
//		Custom_click(ob.RequestCB_selectCity_Motorcycle(), "select city");	
//		Custom_click(ob.RequestCB_ClickSubmit_Motorcycle(), " Submit bttn clickable");
//		
//		Wait(home.get_ThankyouMsg());
//		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
//		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		Custom_click(home.click_Request_CB_closeBttn(), " click on cross button");
		
		Wait(pfm.BookNow_Button());
		VerifyElementPresent(pfm.BookNow_Button(), "Book Now Button");
		Custom_click(pfm.BookNow_Button(), " click on BookNow");
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

	@Test(priority=2)
	public void TC_129_XPulse200TV_Specification() throws Exception {
		
		Wait(ob.specification_headerTab());
		VerifyElementPresent(ob.specification_headerTab(), " tab: ");
		Custom_click(ob.specification_headerTab(), " Heading");
		Thread.sleep(1000);
		VerifyImagePresent(pfm.Specs_matteNexusBlue_Img(), "Matte Nexus Blue Image");
		Custom_click(pfm.Specs_matteNexusBlue_Img(), "Matte Nexus Blue Image clickable");
		VerifyElementPresent(pfm.Specs_matteNexusBlue_Text()," Text present  : ");
		String color1=pfm.Specs_matteNexusBlue_Text().getText();
		Assert.assertEquals(color1, "Matte Nexus Blue");
		
		Wait(pfm.Specs_TechnoBlue_Img());
		VerifyImagePresent(pfm.Specs_TechnoBlue_Img(), "Techno Blue Image");
		Custom_click(pfm.Specs_TechnoBlue_Img(), "Techno Blue Image clickable");
		VerifyElementPresent(pfm.Specs_TechnoBlue_Text()," Text present  : ");
		String color2=pfm.Specs_TechnoBlue_Text().getText();
		Assert.assertEquals(color2, "Techno Blue");
		
		Wait(pfm.Specs_BlackSportsRed_Img());
		VerifyImagePresent(pfm.Specs_BlackSportsRed_Img(), "Black Sports Red Image");
		Custom_click(pfm.Specs_BlackSportsRed_Img(), "Black Sports Red Image clickable");
		VerifyElementPresent(pfm.Specs_BlackSportsRed_Text()," Text present  : ");
		String color3=pfm.Specs_BlackSportsRed_Text().getText();
		Assert.assertEquals(color3, "Black Sports Red");
		
		VerifyImagePresent(pfm.Specs_PROWhite_Img(), "PRO White Image");
		Custom_click(pfm.Specs_PROWhite_Img(), "PRO White Image clickable");
		VerifyElementPresent(pfm.Specs_PROWhite_Text()," Text present  : ");
		String color4=pfm.Specs_PROWhite_Text().getText();
		Assert.assertEquals(color4, "PRO White");
		
	}
	
	@Test(priority=3)
	public void TC_130_XPulse200TV_Features() throws Exception {
		
//		exe=new Motorcycle_ExecutiveModule();
//		pfm=new Motorcycle_PerfromanceModule();
//		ob = new Motorcycles_practical();
//		Wait(exe.motorcycles());
//		Custom_click(exe.motorcycles(), "Motorcycles");
//		PageLoaded();
//		
//		Custom_click(pfm.Xpulse2004V_BikeName() , " on Xpulse2004V Text ");
		Thread.sleep(2000);
		Wait(ob.Feature_Tab());
		VerifyElementPresent(ob.Feature_Tab(), "Tab: ");
		VerifyImagePresent(ob.Feature_Icon(), " feature icon  ");
		Custom_click(ob.Feature_Tab(), " Feature Tab clickable ");
		
		Thread.sleep(2000);
		pfm.click_HotspotsLinks();

	}
	
	@Test(priority=4)
	public void TC_131_XPulse200TV_Price() throws Exception {
		
		PageLoaded();
		VerifyImagePresent(ob.Price_Icon(), " price icon");
		VerifyElementPresent(ob.Price_Tab(), " Price tab");
		Custom_click(ob.Price_Tab(), " Price tab clickable");
		VerifyElementPresent(ob.Price_Heading(), " Heading");
		//Wait(exe.Exe_Price_PassionPro_Image());
       // VerifyImagePresent(exe.Exe_Price_PassionPro_Image(), " Bike Image of Passion Pro"); //glamour img not present on price section
		Thread.sleep(2000);
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");
		Wait(ob.Price_SelectState1());
		VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");		
		Custom_click(ob.Price_SelectState1(), " Selected state");
		//VerifyElementPresent(ob.Price_SelectState1(), " State to be selected ");
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity1(), "City to be selected");
		Thread.sleep(2000);
		Custom_click(ob.Price_SelectCity1(), " selected City");
		Thread.sleep(2000);
		ob.check_Variant_and_priceText();
		ob.check_all_Variants_Price();
		//check price after changing state 
		Thread.sleep(2000);
		home.ReqCallBack();
		Wait(ob.Price_StateDD());
		Custom_click(ob.Price_StateDD()," state DropDown");		
		VerifyElementPresent(ob.Price_SelectState2(), " State to be selected ");
		Thread.sleep(2000);
		Custom_click(ob.Price_SelectState2(), " Selected state");
		Thread.sleep(2000);
		Custom_click(ob.Price_CityDD(), " City dropDown");
		VerifyElementPresent(ob.Price_SelectCity2(), "City to be selected");
	//	Thread.sleep(2000);
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
		
	}
	
	@Test(priority=5)
	public void TC_132_XPulse200TV_Find_A_Dealer() throws Exception {
		
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
		home.ReqCallBack();
		
	}
	
	@Test(priority=6)
	public void TC_133_XPulse200TV_Book_A_TestRide() throws Exception {
		
		Wait(ob.BTR_HeadingText());
		VerifyElementPresent(ob.BTR_HeadingText(), " Heading ");
		Wait(ob.BTR_name());
		//Thread.sleep(2000);
		custom_sendkeys(ob.BTR_name() , config_getdata("Name"), "Name");
		custom_sendkeys(ob.BTR_mobileNum(), config_getdata("MobileNo"), "Mobile No.");
		custom_sendkeys(ob.BTR_otp(), config_getdata("OTP"), "Enter OTP");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
		Wait(ob.BTR_StateDD());
		Custom_click(ob.BTR_StateDD(), " click on select state");
		Custom_click(ob.BTR_selectState(), "select state");
		Wait(ob.BTR_CityDD());
		Custom_click(ob.BTR_CityDD(), " click on select city");
		Custom_click(ob.BTR_citySelect(), "select city");
		if(driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).isEnabled()) {
		Custom_click(ob.BTR_submitBttn(), " Submit bttn clickable");}
		
//		Thread.sleep(2000);
		Wait(home.get_ThankyouMsg());
		VerifyElementPresent(home.get_ThankyouMsg(),"Text present ");
		VerifyElementPresent(home.get_connectMsg(),"Text Present ");
		
	//	Custom_click(home.click_RequestCB_closeBttn1(),"close bttn clickable");
	}
	
	@Test(priority=7)
	public void TC_134_XPulse200TV_Eshoplinks() throws Exception {
		
		Wait(pfm.Eshop_MotoSports_Link());
		Custom_click(pfm.Eshop_MotoSports_Link(), "Hero Moto Sports");		
		change_window(1, " Next window");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.close();
		change_window(0, " Previous window");
		PageLoaded();
		
		Wait(pfm.Eshop_Xclan_Link());
		Custom_click(pfm.Eshop_Xclan_Link(), "Xclan_Link");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		
		 Wait(pfm.Eshop_xpulseExpCentre_Link());
		Custom_click(pfm.Eshop_xpulseExpCentre_Link(), "xpulse-experience-centre");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.navigate().back();
		PageLoaded();
		
		Wait(pfm.Eshop_Xtracks_Link());
		Custom_click(pfm.Eshop_Xtracks_Link(), "Xtracks");
		Thread.sleep(2000);
		GetCurrentUrl();
		PageLoaded();
		driver.navigate().back();
		PageLoaded();

	}
	
	
	
}

