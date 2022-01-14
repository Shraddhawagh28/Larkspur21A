package com.util.constants;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Proputils {
	public String getValue(String filePath,String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties Prop=new Properties();
		String value=null;
		//Prop.load(fis);
		try {
			Prop.load(fis);
			value=Prop.getProperty(key);
			}
		catch(IOException e) {
			e.printStackTrace();
		}
		return value;
	}
public String[] getLocator(String key) {
	String dir=System.getProperty("user.dir")+"/src/main/resources/OR.Pproperties";
	String locator=getValue(dir,key);
	 String[] parts=locator.split("##");
	 return parts;
	
}
}
