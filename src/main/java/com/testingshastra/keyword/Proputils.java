package com.testingshastra.keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.codec.binary.Base16;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Proputils {
	public String getValue(String filepath, String Key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		String value = null;
		try {
			prop.load(fis);
			value = prop.getProperty(Key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}

 public String[]  getLocator(String key) {
	String dir=System.getProperty("user.dir")+"/src/main/resource/or.properties";
	String Locator= getValue(dir,key);
	String[]parts=Locator.split("##");
	return parts;
}
}
