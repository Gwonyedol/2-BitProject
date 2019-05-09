package org.masterjung.util;

public class StringSkip {
	
	public String stringSkip(String beforeString) {
		String stringSkip="";
		if(beforeString.length()>20) {
			stringSkip = beforeString.substring(0, 20) + "...";
		}else {
			stringSkip = beforeString;
		}
		return stringSkip;
	}
	
	public String stringSkip(String beforeString, int location) {
		String stringSkip="";
		if(beforeString.length()>location) {
			stringSkip = beforeString.substring(0, location) + "...";
		}else {
			stringSkip = beforeString;
		}
		return stringSkip;
	}
	
	public String stringSkip(String beforeString, int location, String separator) {
		String stringSkip="";
		if(beforeString.length()>location) {
			stringSkip = beforeString.substring(0, location) + separator;
		}else {
			stringSkip = beforeString;
		}
		return stringSkip;
	}
}
