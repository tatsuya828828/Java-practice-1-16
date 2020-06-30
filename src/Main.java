import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args) {
		// Setの基本特性
		// それぞれの要素には、重複が許されない
		// それぞれの要素には、基本的に順序関係がない
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		colors.add("藍");
		colors.add("茶");
		System.out.println("色は"+colors.size()+"種類です");
		for(String s : colors) {
			System.out.print(s + "→");
		}

		System.out.println("");

		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		words.add("あ");
		words.add("い");
		words.add("さ");
		words.add("か");
		for(String s :words) {
			System.out.print(s + "→");
		}
	}
}
