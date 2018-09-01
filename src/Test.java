import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();
		System.out.println(a.add("Okodfnkdm"));
		System.out.println(a.add("asd"));
		System.out.println(a.add("qwertyuio"));
		System.out.println(a.add(null));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.iterator());
		System.out.println(a.toArray());
		System.out.println(a.clone());
		System.out.println(a.subList(1, 2));
		System.out.println(a.isEmpty());
		System.out.println(a.remove(3));
		System.out.println(a.removeAll(a));

		Set<String> strings = new TreeSet();
		System.out.println(strings.add("qwe"));
		System.out.println(strings.add("tyu"));
		System.out.println(strings.add("bvhjkj"));
		System.out.println(strings);

		Map<Integer, String> list = new TreeMap();
		System.out.println(list.put(1, "asd"));
		System.out.println(list.put(2, "qwe"));
		System.out.println(list);

		Map<Integer, String> list1 = new HashMap();
		System.out.println(list1.put(1, "ghj"));
		System.out.println(list1.put(2, "tyu"));
		System.out.println(list1);
		System.out.println(list1.containsKey(1));
		System.out.println(list1.remove(1));
		System.out.println(list1);

	}

}
