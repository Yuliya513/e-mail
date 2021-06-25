package com.company;
import.java.util.regex.Matcher;
import.java.util.regex.Pattern;

public class e-mail {

    public static void main(String[] args) {
	int counter=0;
	String e-mail="example ukr_net.com";
	Pattern pattern=Pattern.compile ("((" \\w(-+)+(\\[v-]*)*);
	Matcher matcher=pattern.matcher(e-mail);
	while (matcher.find()){
		counter++;
	System.out.println("Match found"+ e-mail, (matcher.start(), matcher.end())+ Starting at index"+"matcher.end());
	System.out.println("Matcher found"+ counter);
		System.out.println("Matcher doesn't found"+ counter);

		}
    }
}
