
import java.util.*;
import java.util.ArrayList;
public class ArraysToArraysList {
	public static void main(String[] args) {

		/*ArrayList declaration and initialization*/
		ArrayList<String> friendsnames= new ArrayList<String>();
		friendsnames.add("India");
		friendsnames.add("Us");
		friendsnames.add("China");
		friendsnames.add("Denmark");
		System.out.println("The sorting of arraylist is:");
		Collections.sort(friendsnames);
		for (String sort:friendsnames)
		{
			System.out.println(sort);
		}
		
		
		/*ArrayList to Array Conversion */
		String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);
		/*Displaying Array elements*/
		for(String k: frnames)
		{
			System.out.println(k);
		}
	}
}