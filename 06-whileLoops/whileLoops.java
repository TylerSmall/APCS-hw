public class whileLoops {
	public String frontTimes(String str, int n) {
		// 3 minutes
		String front;
		if (str.length() >= 3) {
			front = str.substring(0,3);
		} else {
			front = str;
		}
		String result = "";
		while (n > 0) {
			result += front;
			n--;
		}
		return result;
	}
	
	public String stringBits(String str) {
		// 2 minutes
		int index = 0;
		String result = "";
		while (index < str.length()) {
			result += str.charAt(index);
			index += 2;
		}
		return result;
	}
	
	public String stringYak(String str) {
		// 4 minutes
		int index = 0;
		String result = "";
		while (index < str.length()) {
			if (str.charAt(index) == 'y' && (index + 3 <= str.length()) && str.charAt(index + 2) == 'k') {
				index += 3;
			} else {
				result += str.charAt(index);
				index++;
			}
		}
		return result;
	}
	
	public int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;
		int index = 0;
		while (index + 2 <= len) {
			if (a.substring(index, index + 2).equals(b.substring(index, index + 2))) {
				count++;
				index++;
			} else {
				index++;
			}
		}
		return count;
	}
}