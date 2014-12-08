public class Sarray {
    String[] data;
    String last;
    int len;
    
    public Sarray(){
	String[] temp = {"this","is","temp"};
	data = temp;
	len = data.length;
    }
    
    public Sarray(String[] d) {
	data = d;
	len = data.length;
    }
    
    public String toString(){
	String blah = "";
	for (int i = 0; i<data.length; i++){
	    blah += data[i] + " ";
	}
	return blah;
    }
    
    public boolean add(String i){
	String[] newA = new String[len+1];
	for (int j = 0; j<len+1; j++){
	    if (j<len && data[j] != null){
		newA[j] = data[j];
	    }
	    if (j==len){
		newA[len] = i;
	    }
	}
	data = newA;
	return true;
    }
    
    public void add(int index, String i){
	if (index > len-1){
	    throw new IndexOutOfBoundsException();
	}
	String[] newA = new String[len+1];
	for (int j = len-1; j>-1; j--){
	    if (j>index){
		newA[j+1] = data[j];
	    } else if (j == index){
		newA[j+1] = data[j];
		newA[j] = i;
	    } else
		newA[j] = data[j];
	}
	data = newA;
    }
    
    public int size() {
	int s = 0;
	for (int i = 0; i<data.length; i++){
	    s++;
	}
	return s;
    }
    
    public String get(int index) {
	return data[index];
    }
    
    public String set(int index, String i){
	last = get(index);
	data[index] = i;
	return last;
    }
    
    public String remove(int index){
	String ans = get(index);
	String[] newA = new String[len-1];
	for (int i = 0; i<newA.length-1; i++){
	    if (i>=index){
		newA[i] = data[i+1];
	    } else {
		newA[i] = data[i];
	    }
	}
	data = newA;
	return ans;
    }
    
    public void isort(){
	int last = 1;
	while (last<data.length){
	    int i = last;
	    String newvalue = data[i];
	    while(i > 0 && newvalue.compareTo(data[i-1])<0) {
		data[i] = data[i-1];
		i--;
	    }
	    data[i] = newvalue;
	    last++;
	    i = last;
	}
    }
    
    public void ssort(){
	for (int current = 0; current<data.length; current++){
	    int test = current+1;
	    int minIndex = current;
	    String min = data[current];
	    while (test+1<data.length){
		if (data[test].compareTo(data[test+1])>0){
		    min = data[test+1];
		    minIndex = test+1;
		}
		test++;
	    }
	    String temp = data[current];
	    data[current] = min;
	    data[minIndex] = temp;
	}
    }
    
    public void bsort(){
	boolean inOrder = false;
	int count = 0;
	for (int i = 0; !inOrder; i++){
	    if (data[i].compareTo(data[i+1])>0){
		String temp = data[i];
		data[i] = data[i+1];
		data[i+1] = temp;
		count = 0;
	    } else {
		count++;
	    }
	    if (count == data.length-1){
		inOrder = true;
	    }
	    if (i == data.length-2){
		i = -1;
	    }
	}
    }
    
    public static void main(String[] args){
	String[] stuff = {"stuff","new","other","what","blah","creative","not"};
	Sarray s = new Sarray(stuff);
	OrderedSarray os = new OrderedSarray(stuff);
	try{
	    System.out.println(s.toString());
	    s.bsort();
	    System.out.println(s.toString());
	} catch (IndexOutOfBoundsException e){
	    System.out.println("Use another index");
	}
    }
}	

	
