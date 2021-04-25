package co.com.mercadolibrer.humans.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static boolean validateDNA(String [] dna) {
		Pattern pattern = Pattern.compile("[ACGT]+");
		
		for (String s : dna)  {
			Matcher matcher = pattern.matcher(s);
			if (!matcher.matches()) {
				return false;
			}
		}
		
		return true;
	}

}
