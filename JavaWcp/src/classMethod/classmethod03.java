package classMethod;

import classMethod.human.human03;

public class classmethod03 {
	public static void main(String[] args) {
		human03 yamada = new human03();

		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");

		yamada.greet("田辺");
		yamada.greet(null);
	}
}