package reuseables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CodeReusables {
	Properties prop;
	String data;
	public String readPropertise(String property) {
		File file = new File ("C:\\Users\\user\\Parameshwari\\Framworknew\\object_repository\\datas.properties");
	try {
		FileInputStream inputStrm = new FileInputStream(file);
		prop = new Properties();
		prop.load(inputStrm);
		data=prop.getProperty(property);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return data;
	}
	public void screenshot(WebDriver driver, String filename) {
		String filePath = "C:\\Users\\user\\Parameshwari\\Framworknew\\Screenshots";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File(filePath+filename+".png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
