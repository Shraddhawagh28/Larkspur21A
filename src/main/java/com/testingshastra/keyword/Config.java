package com.testingshastra.keyword;

import com.util.constants.Proputils;

public class Config {
	
	/**
	 * this method will return url mention in application.properties file
	 */
	public String getAppUrl() {
		return getProperty("app.url");
		//Proputils prop=new Proputils();
	//	String dir=System.getProperty("user.dir");
	//	return prop.getValue(dir+"/src/main/resource/application.properties","app.url");
		
	}
	
public String getBrowserName() {
	return getProperty("browsername");
	//Proputils prop=new Proputils();
	//String dir=System.getProperty("user.dir");
	//return prop.getValue(dir+"/src/main/resource/application.properties","browsername");

	}
private String getProperty(String Property) {
	Proputils prop=new Proputils();
	String dir=System.getProperty("user.dir");
	return prop.getValue(dir+"/src/main/resource/application.properties",Property);

}
}
