package stringmethod;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
String s ;
String ss="the name of my country is Bangladesh   ";
System.out.print("Input your String:");
s = input.nextLine();
String x;
System.out.print("Input your second string m:");
x = input.nextLine();
int len = s.length();
int le = x.length();
System.out.println(len);
System.out.println(le);
int sss =ss.length();
System.out.println(sss);
if (s.equals(x)) {
	System.out.println("yes");
}
else {
	System.out.println("Not equals");
}
boolean con = (s.contains("KIL"));
System.out.println(con);
boolean k = s.equalsIgnoreCase(x);
System.out.println(k);
if(s.isEmpty()) {
	System.out.println("Yes Empty :");
}
String fullname = s.concat(x);
System.out.println(fullname);
String  upper = fullname.toUpperCase();
System.out.println(upper);
String lower = fullname.toLowerCase();
System.out.println(lower);
boolean start = s.startsWith("s");
System.out.println(start);
boolean lastn = s.endsWith("l");
System.out.println(lastn);

String cut = ss.trim( );
System.out.println(cut);
	
char index = ss.charAt(6);
System.out.println(index);
int ssss=ss.codePointAt(6);
System.out.println(ssss);
int num = ss.indexOf('e');
System.out.println(num);

	}
}
