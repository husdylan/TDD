package iut.tdd;


public class RomanNumerals {
	public String convertToRoman(String arabe) {
		switch (arabe){
		case "1" : return "I";
		case "5" : return "V";
		case "10" : return "X";
		case "50" : return "L";
		}
		return "";
	}

	public String convertFromRoman(String roman) {
		switch(roman){	
		case "I" : return "1";
		case "V" : return "5";
		case "X" : return "10";
		case "L" : return "50";
		
	}
		return "";
	}

}
