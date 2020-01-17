package com.rapido.test.RapidoAutomation.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rapido.test.RapidoAutomation.BasePage;
import com.rapido.test.RapidoAutomation.WebPojo;
import com.rapido.test.RapidoAutomation.WebProducts;

/**
 * @author Harikrishna Recharla
 *
 */

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id ="twotabsearchtextbox")
	public WebElement search_BAR;
	
	
	@FindBy(xpath ="//input[@class='nav-input']")
	public WebElement search_BT;
	
	@FindBy(xpath ="//h2")
	public WebElement header ;
	
	
	private String path ="(//h2)";
	
	
	public HomePage enter_ItemsDetails() {
		
		//waitUntilElementClickable(search_BAR);
		driver.getCurrentUrl();
		search_BAR.click();
		search_BAR.sendKeys("iphone 11");
		return this;
	}
	
	public HomePage clickon_Search() {
		waitUntilElementClickable(search_BT);
		search_BT.click();
		return this;
	}
	
	public HashMap<String, String>  getProductails() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		waitUntilElementClickable(header);
		List<WebElement> list = driver.findElements(By.xpath(path));
		List<WebElement> list1 = driver.findElements(By.xpath("(//span[text()='Get it by '])"));
		
		for (int i = 1; i <=list.size()-1; i++) {
			String updatePath = path+"["+i+"]";
			WebElement header_Element = driver.findElement(By.xpath(path+"["+i+"]"));
			String product_txt = getText(header_Element);
			System.out.println(product_txt);
			map.put("product", product_txt);
			
			WebElement price = driver.findElement(By.xpath("(//span[@class='a-price'])["+i+"]/span[2]/span[2]"));
			String price_txt = getText(price);
			System.out.println(price_txt);
			map.put("price", price_txt);
			
			WebElement del=  driver.findElement(By.xpath("(//span[text()='Get it by '])["+i+"]/.."));
			String delivery_txt = getText(del);
			System.out.println(delivery_txt);
			map.put("deliver", delivery_txt);
			
		}
		return map;
		
	}
	
	
	public WebElement locatElement(String path) {
		 return driver.findElement(By.xpath(path));
	}
	
	String pricePath = "/../../div[3]/div/div/span/span[2]/span[2]";
	String delPath = "/../../div[4]/div/div[1]/span";
	
	public String getProductName() {
		String pricePath =path+"[1]/../../div[3]";
		return getText(driver.findElement(By.xpath(path+"["+1+"]")));
	}
	
	
	public void clickon_Product() {
		waitUntilElementClickable(header);
		driver.findElement(By.xpath(path+"["+1+"]")).click();
		System.out.println("Clicking on Element");
	}
	
	
	public String getPrice() {
		String pricePath =path+"[1]/../../div[3]";
		return getText(driver.findElement(By.xpath(pricePath)));
	}
	
	
	public String getDeliveryDate() {
		String delPath = path+"[1]/../../div[4]/div/div[1]/span[2]";
		return getText(driver.findElement(By.xpath(delPath)));
	}
	
	
//	public void setdata() {
//		
//		HashMap<String, String> mapDetails = getProductails();
//		
//		System.out.println(mapDetails.values());
//		
//		int ls = mapDetails.size();
//		WebPojo poj = new WebPojo();
//		WebProducts we =new WebProducts();
//		for (String iterable_element : mapDetails.values()) {
//			poj.setProduct(mapDetails.get("product"));
//			poj.setPrice(mapDetails.get("price"));
//			poj.setDelivery(mapDetails.get("deliver"));
//			
//			we.setWeb(poj);
//		}
//		
//		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//		try {
//			String json = ow.writeValueAsString(we);
//		} catch (JsonGenerationException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	
	public static int main(String[] args) {
		return (1);
	}
	
	
}
