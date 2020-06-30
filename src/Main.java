import java.util.ArrayList;
import java.util.List;
class Hero {
	public String name;
}

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		Hero hero = new Hero();
		list.add(hero);
		hero.name = "スガワラ";
		System.out.println(list.get(0).name);
		System.out.println(h.name);
	}
}
