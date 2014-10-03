public class Shapes {
    public String box(int r, int c) {
        String s = "";

        while (r>0){
            int cc = 0;
            while (cc < c){
                s += "*";
                cc += 1;
            }
            s = s + "\n";
            r--;
        }

        return s;
    }

    public String tri1(int h) {
        String out = new String();
        int row = 1;
        while (row <= h) {
            int i = 0;
            while (i < row)  {
                out += "*";
                i++;
            }
            out += "\n";
            row++;
        }
        return out;
    }

    public String tri2(int h) {
        String out = new String();
        int row = 1;
        while (row <= h) {
            int i = 0;
            int spaces = h - row;
            while (i < spaces) {
                out += " ";
                i++;
            }
            while (i < h)  {
                out += "*";
                i++;
            }
            out += "\n";
            row++;
        }
        return out;
    }

	public String tri3(int h){
		String s = "";
		for(int i=0; i<h; i++){
		    for(int j=0; j<=h+i; j++){
			if(j+i<h-1){
			    s=s+" ";
			}else{
			    if(j==h+i){
				s=s+"\n";
			    }else{
				s=s+"*";
			    }
			}
		    }
		}
		return s;	
	    }
	
	    public String diamond(int h){
		if(h%2==0){
		    return "Input an odd number \n";
		}
		int mid=(h-1)/2;
		String s="";
		for(int i=0; i<h; i++){
		    for(int j=0; j<h; j++){
			if(Math.abs(mid-i)+Math.abs(mid-j)>mid){
			    s=s+" ";
			}else{
			    s=s+"*";
			}
		    }
		    s=s+"\n";
		}
		return s;
	    }
	
	    public String tri4(int h){
		String s = "";
		for(int i=0; i<h; i++){
		    for(int j=0; j<h; j++){
			if(i-j>0){
			    s=s+" ";
			}else{
			    s=s+"*";
			}
		    }
		    s=s+"\n";
		}
		return s;
	    }
	}