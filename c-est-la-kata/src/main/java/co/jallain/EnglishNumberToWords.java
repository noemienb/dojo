package co.jallain;

import java.text.DecimalFormat;

public class EnglishNumberToWords {

	private static final String[] dizainesNoms = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNoms = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private EnglishNumberToWords() {
	}

	private static String convertirMoinsQueMille(int nombre) {
		String tempStr;

		if (nombre % 100 < 20) {
			tempStr = numNoms[nombre % 100];
			nombre /= 100;
		} else {
			tempStr = numNoms[nombre % 10];
			nombre /= 10;

			tempStr = dizainesNoms[nombre % 10] + tempStr;
			nombre /= 10;
		}
		if (nombre == 0)
			return tempStr;
		return numNoms[nombre] + " hundred" + tempStr;
	}

	public static String convertir(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
			case 0:
				tradBillions = "";
				break;
			case 1:
				tradBillions = convertirMoinsQueMille(billions) + " billion ";
				break;
			default:
				tradBillions = convertirMoinsQueMille(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
			case 0:
				tradMillions = "";
				break;
			case 1:
				tradMillions = convertirMoinsQueMille(millions) + " million ";
				break;
			default:
				tradMillions = convertirMoinsQueMille(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
			case 0:
				tradHundredThousands = "";
				break;
			case 1:
				tradHundredThousands = "one thousand ";
				break;
			default:
				tradHundredThousands = convertirMoinsQueMille(hundredThousands) + " thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertirMoinsQueMille(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}
}