public class Sarray {
    private int[] data;
    private int   last;
    private int   chunk; 

    public Sarray(int chunk) {
        this.chunk = chunk;
        last = -1;
        data = new int[chunk];
    }

    public Sarray() {
        this(100); 
    }

    private boolean hasSpace() {
        return last + 1 < data.length;
    }

    private void makeSpace() {
        if ( !hasSpace() ) { 
            int[] new_data = new int[data.length + chunk]; 
            for (int i = 0; i < data.length; i++) 
                new_data[i] = data[i];
            data = new_data;
        }
    }

    public boolean add(int i){
        makeSpace();
        last++;
        data[last] = i;
        return true;
    }

    public boolean add(int index, int i){
        makeSpace();
        if (index > last)
            return false;
        else {
            for (int j = last; j >= index; j--)
                data[j+1] = data[j];
            data[index] = i;
            last++;
            return true;
        }
    }

    public int size() {
        return last + 1;
    }

    public int get(int index) {
        if (index > last)
            return -1; 
        else
            return data[index];
    }

    public int set(int index, int i) {
        if (index > last)
            return -1;
        else {
            int old = data[index];
            data[index] = i;
            return old;
        }
    }

    public int remove(int index) {
        int old = data[index];
        for (int i=index; i < last; i++)
            data[i] = data[i+1];
        last--;
        return old;
    }

    public String toString() {
        String out = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i == last)
                out += data[i] + " ]";
            else  
                out += data[i] + ", ";
        }
        return out;
    }

    public static void main(String[] args) {
        Sarray s = new Sarray();
        System.out.println(s);
    }
}