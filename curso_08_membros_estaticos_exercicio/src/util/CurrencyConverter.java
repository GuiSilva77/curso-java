package util;

public class CurrencyConverter {
	public static double convertUSDtoBRL(double dollarQuantity, double dollarPrice) {
		double grossConvert = dollarPrice * dollarQuantity;

		double IOF = grossConvert * 0.06;

		return grossConvert - IOF;
	}
}
