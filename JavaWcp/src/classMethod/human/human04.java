package classMethod.human;

public class human04 {

	static public int humanCount = 0;
	public String name;
	public static final String GREETING = "こんにちは";

	public human04(String name) {
		this.name = name;
		human04.humanCount++;
	}

	static public void staticMethodPrint() {
		System.out.println("人の数は" + human04.humanCount);
	}

	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}
}
