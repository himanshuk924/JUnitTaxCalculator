package com.calculator.tax;

//CountrynotvalidException extends RunTimeException
//type of unchecked Exception
public class CountrynotValidException extends RuntimeException {
	public CountrynotValidException(String string) {
		super(string);
	}
}
