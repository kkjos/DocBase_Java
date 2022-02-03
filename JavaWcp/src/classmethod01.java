
public class classmethod01 {
	public static void main(String[] args) {
		human01 yamada = new human01();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		human01 sato = new human01("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
