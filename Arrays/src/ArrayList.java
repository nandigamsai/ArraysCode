import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayList implements List<String>
{
   private static final boolean String = false;

public static void main(String[] args)
   {
      String[] words = {"ace", "boom", "crew", "dog", "eon"};
  /*
      List<String> wordList = Arrays.asList(words);
  
      for (String e : wordList)
      {
         System.out.println(e);
      }
      */
      
      //using collections
      List<String> str=new ArrayList();
      Collections.addAll(str, words);
      for (String se:words)
      {
      System.out.println(se);
      }
      
      
      
      
   }

@Override
public boolean add(java.lang.String arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void add(int arg0, java.lang.String arg1) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean addAll(Collection<? extends java.lang.String> arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(int arg0, Collection<? extends java.lang.String> arg1) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean contains(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public java.lang.String get(int arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterator<java.lang.String> iterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int lastIndexOf(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ListIterator<java.lang.String> listIterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ListIterator<java.lang.String> listIterator(int arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean remove(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public java.lang.String remove(int arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean removeAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public java.lang.String set(int arg0, java.lang.String arg1) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List<java.lang.String> subList(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <T> T[] toArray(T[] arg0) {
	// TODO Auto-generated method stub
	return null;
}
}