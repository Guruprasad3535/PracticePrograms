package edu.qspiders.demo2;

public abstract class Browser1 {

	public abstract void open();
	
	public abstract void close();
	
	public static void main(String[] args) {
		Browser1 a1=new Firefox();
		a1.open();
		a1.close();
		
		Firefox a2=(Firefox)a1;
		a2.open();
		a2.close();
		
	}
}
