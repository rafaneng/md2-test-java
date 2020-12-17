package br.com.md4net.test.questions;

public class ClassFour{
	public static void main (String[] args) {
		ClassFourB x = new ClassFourB();
		ClassFourB y = x;
		y.v++;
		x.v++;
		ClassFourB z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);		
	}
}
