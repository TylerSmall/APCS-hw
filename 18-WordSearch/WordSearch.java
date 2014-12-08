public class WordSearch{
    
    private char[][] board;
    
    public WordSearch(int r, int c){
	// create board of size r by c
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    
    public WordSearch(){
	// create 20 by 30 board
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void addWordHforward (String w,int row,int col){
	int r = row, c = col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    if (board[r][c]!='.'){
		if (board.length >= r+1){
		    r++;
		    break;
		}
	    }
	}
	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }
    
    public void addWordHbackward (String w,int row,int col){
	int r=row, c=col;
	if ((c + w.length()) > board[1].length){
	    c = c - ((c + w.length()) - board[1].length);
	}
	for (int i=0;i<w.length();i++){
	    if (board[r][c]!='.'){
		if (board.length >= r+1){
		    r++;
		    break;
		}
	    }
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }
    
    public void addWordVdown (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		if (board[1].length >= c+1){
		    r++;
		    break;
		}
	    }
	}
	for (int i=0;i<w.length();i++){
	    board[r][c]=w.charAt(i);
	    r++;
	}
    }
    
    public void addWordVup (String w,int row,int col){
	int r=row, c=col;
	if ((r + w.length()) > board.length){
	    r = r - ((r + w.length()) - board.length);
	}
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.'){
		if (board[1].length >= c+1){
		    r++;
		    break;
		}
	    }
	}
	for (int i=w.length()-1;i>=0;i--){
	    board[r][c]=w.charAt(i);
	    r++;
	}
    }
    
    public static void main(String[] args){
	WordSearch w = new WordSearch();
         w.addWordHforward("hello",1,3); 
	 w.addWordHforward("howdy",1,6);
	 w.addWordHforward("discombobulate",4,22); 
	 w.addWordHbackward("computer",1,19);
	 w.addWordHbackward("lemon",18,27);
	 w.addWordVdown("Tyler",4,3);
	 w.addWordVdown("monkey",2,6);
	 w.addWordVdown("elevator",17,10);
	 w.addWordVup("office",8,9); 
	 w.addWordVup("donkey",4,27); 
	 w.addWordVup("door",19,12);
	 System.out.println(w);
	
    }
}
