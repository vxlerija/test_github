package array;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	private static final Pattern vegatables = Pattern.compile("Zuchini|Paprikas?|Zwiebeln?|Tomaten?");
	
	public static void insertCheeseAroundVegatbles(List<String> ingredients) {
		//Initialisierung Laufvariable (iterator)
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator();literator.hasNext();) {
			String ingredient = iterator.next();
		}
	}

	public static void main(String[] args) {

	}

}
