package classMethod;

import classMethod.human.human04;

public class classmethod04 {
	public static void main(String[] args) {
		human04 yamada = new human04("山田");
		human04.staticMethodPrint();
		System.out.println(human04.GREETING);
		yamada.instanceMethodPrint();
	}
}
