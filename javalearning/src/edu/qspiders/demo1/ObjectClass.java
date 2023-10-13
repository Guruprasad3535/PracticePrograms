package edu.qspiders.demo1;

public class ObjectClass {
	public static void main(String[] args) {
		
		ObjectClass a1=new ObjectClass();
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a1));
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
