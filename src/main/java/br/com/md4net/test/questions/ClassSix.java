package br.com.md4net.test.questions;

public class ClassSix {
	static int a(ClassSixD d) {return 1;}
	static int a(ClassSixC c) {return 2;}
	static int a(ClassSixB b) {return 3;}
	static int a(ClassSix a) {return 4;}
	public static void main(String[] args) {
		System.out.println(a(new ClassSixD()));
	}
}
