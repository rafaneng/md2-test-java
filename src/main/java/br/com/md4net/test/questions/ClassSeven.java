package br.com.md4net.test.questions;

public class ClassSeven extends ClassSevenB {
	public ClassSeven(String s) {
		this.s = s;
	}
	public static void main(String[] args) {
		ClassSeven b = ClassSeven.ClassSevenB("t");
		System.out.println(b.s);
	}

}
