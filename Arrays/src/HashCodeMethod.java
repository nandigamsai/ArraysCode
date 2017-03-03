public class HashCodeMethod 
{
	int i;	
	public HashCodeMethod(int i) 
	{
				this.i=i;
		
	}	
	public static void main(String[] args) 
	{
				
		HashCodeMethod m1=new HashCodeMethod(19);
		HashCodeMethod m2=new HashCodeMethod(20);
		System.out.println("The Hashcode value: "  +m1);
		System.out.println("The Hashcode value: "  +m2);				

	} 
}
