public class Problems {
	
	public String frame(int r, int c){
		//5 minutes
		String s = "";
		for(int row = 0; row <= r - 1; row++){
			for(int column = 1; column<=c; column++){
				if (row == 0 || row == r - 1 || column == 1 || column == c){
					s += "*";
				} else {
					s += " ";
				}
			} 
			s += "\n";
		}
		return s;
	}
	
	public String stringSplosion(String str){
		//2 minuntes
		String result = "";
		for(int i = 0; i < str.length(); i++){
			result += str.substring(0, i + 1);
		}
		return result;
	}
	
	public String stringX(String str){
		//4 minutes
		String result = "";
		for(int i = 0; i < str.length(); i++){
			if (str.charAt(i) != 'x' || i == 0 || i == str.length() - 1){
				result += str.charAt(i);
			}
		}
		return result;
	}



}
