import java.util.*;
import java.io.*;
public class Knight{

    private int[][]board;
    private int startx,starty;
    private int currentx, currenty;
    private boolean solved = false;
    private boolean foundstart = false;
    private int jumpcount = 0;

    public Knight(int n){
	board = new int[n][n];
	startx = 0;
	starty = 0;
    }

    public String go(int x,int y){
	return ("["+x+";"+y+"H");
    }
    
    public String clear(){
	return  "[2J";
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public String toString(){
	
	String ans = currentx + "," + currenty + "\n";
	for (int i = 0; i < board.length; i++) {
	    
	    for (int j = 0; j < board[i].length; j++) {
		ans += "[" + board[i][j] + "]";
	    }
	    ans += "\n";
	    
	}
	return clear()+go(0,0)+ans+"\n";
    }
    
    public void solve(){
	
	board[startx][starty]= 0;
	solve(startx,starty);
	
    }

    public void solve(int x,int y){
	wait(20);
	System.out.println(this);
	
	if (jumpcount == board.length * board.length) {
	    solved = true;
	}
	
	else if (board[y][x] == 0) {
 
		board[y][x] = jumpcount;
		jumpcount += 1;
		System.out.println(this);
		try {	//jumpcount += 1;
			if(!solved)this.solve(y+2,x+1);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y+2,x-1);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y-2,x+1);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y-2,x-1);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y+1,x-2);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y+1,x+2);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y-1,x+2);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		try {	//jumpcount += 1;
			if(!solved)this.solve(y-1,x-2);
		}
		catch (Exception e) {
			board[y][x] = 0;
			jumpcount--;		
		}
		
	    
	}	
	
		
	//try to solve the maze here...

    }

    public static void main (String[] args) {
	Knight ollie;
	int a;
	try {
	    a = Integer.parseInt(args[0]);
	    if (a > 0)  
		{ollie = new Knight(a);}
	    else 
		{ollie = new Knight(6);}
	}
	catch (Exception e){
	    ollie = new Knight(6);
	}
	ollie.solve();
    }


}
