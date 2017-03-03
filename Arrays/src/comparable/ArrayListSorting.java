package comparable;

import java.util.*;
public class ArrayListSorting  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(223, "Chaitanya", 10));
	   arraylist.add(new Student(245, "Rahul", 9));
	   arraylist.add(new Student(209, "Ajeet", 11));

	   Collections.sort(arraylist);

	   for(Student str: arraylist){
			System.out.println(str);
	   }
	}
}