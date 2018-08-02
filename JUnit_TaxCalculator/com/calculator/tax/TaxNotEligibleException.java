package com.calculator.tax;
//TaxNotEligibleException extends RunTimeException
//type of unchecked Exception
public class TaxNotEligibleException extends RuntimeException {
	public TaxNotEligibleException(String string) {
		super(string);
	}
}