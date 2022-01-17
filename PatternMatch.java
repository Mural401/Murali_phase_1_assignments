package regepression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		System.out.println ("murali@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","murali@gmail.com"));
		System.out.println ("virendra@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","virendra@gmail.com"));
		System.out.println ("baluprepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9398823390 : "+Pattern.matches("\\d{10}","9398823390"));
		System.out.println ("Murali939balu401 : "+Pattern.matches("[MUR][a-z]+\\d{3}+[a-z0-9]+","Murali939balu401"));
		
	}

}