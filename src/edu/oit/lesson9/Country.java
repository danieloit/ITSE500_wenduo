package edu.oit.lesson9;

public enum Country {
	US,UK,DE,FR,ES,IT,JP,CA,MX,IN;

	public static enum EURO{US,UK,DE,CA,FR};
	
	
	public String getUrl(Country country){
		
		
		String surfix = null;
		String url = "http://www.amazon";
		switch(country){
		case US:
			surfix = ".com";
		break;
		case UK:
			surfix =".co.uk";
		case CA:
			surfix = ".ca";
		case JP:
			surfix = ".co.jp";
		case MX:
			surfix = ".com.mx";
		case IT:
			surfix = ".it";
		case FR:
			surfix = ".fr";
		case ES:
			surfix = ".es";
		case IN:
			surfix = ".in";
		case DE:
			surfix = ".in";
	
	}
		
		return url+surfix;
	}
	
	
}


/*https://www.amazon.com
    https://www.amazon.co.uk
    https://www.amazon.de
    https://www.amazon.fr
    https://www.amazon.es
    https://www.amazon.it
    https://www.amazon.ca
    https://www.amazon.co.jp
    https://www.amazon.com.mx
    https://www.amazon.in*/