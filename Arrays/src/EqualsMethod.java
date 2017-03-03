
public class EqualsMethod {

	int rollnum;
	String name;	
	public EqualsMethod(int rollnum, String name)
	{
		this.rollnum=rollnum;
		this.name=name; 
	}		
	public static void main(String[] args) 
	{
		EqualsMethod s1=new EqualsMethod(100,"sai");
		EqualsMethod s2=new EqualsMethod(101,"Krishna");
		EqualsMethod s3=new EqualsMethod(100,"sai");
		EqualsMethod s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
