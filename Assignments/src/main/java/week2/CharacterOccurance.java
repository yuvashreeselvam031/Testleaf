package week2;

import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;

public class CharacterOccurance {

	public static void main(String[] args) {

		String str="PayPal India";
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new LinkedMap<Character,Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				if (map.get(c)==2) {
					System.out.println(c+"-"+map.get(c));
					break;
				}
			} else {
				map.put(c, 1);

			}
		}
		//System.out.println(map);
	}

}
