public class StringStuff {
	
	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}
	
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	
	public int diff21(int n) {
		if (n > 21) {
			return (n - 21) * 2; 
		} else {
			return 21 - n;
		}
	}
    // working
        public boolean nearHundred(int n) {
	    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
	}
    // working
        public boolean mixStart (String str) {
	    if (str.length() >= 3) {
		return str.substring(1,3).equals("ix");
	    } else {
		return false;
		    }
	}
    // working
    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5) {
	    return 0;
	}
	else if (tea >= candy * 2 || candy >= tea * 2) {
	    return 2;
	}
	else return 1;
    }
    // working
    public boolean lastDigit(int a, int b, int c) {
	int a1 = a % 10;
	int b1 = b % 10;
	int c1 = c % 10;
	return (a1 == b1 || a1 == c1 || b1 == c1);
    }
	

}
