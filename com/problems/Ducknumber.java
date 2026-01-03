package com.problems;

public class Ducknumber {
	public static boolean checkisDuck(int n ) {
	    String s = Integer.toString(n);
	    int len = s.length();
	    boolean hasZero = false;
	    for (int i = 1; i < len; i++) {
	      if (s.charAt(i) == '0') {
	        hasZero = true;
	        break;
	      }
	    }
	    return (hasZero && s.charAt(0) != '0');
	  }
	  public static void main(String[] args) {
	    int n = 123;
	    if (checkisDuck(n)) {
	      System.out.println("It is a Duck Number");
	    } else {
	      System.out.println("It is not a Duck Number");
	    }
	  }
}
