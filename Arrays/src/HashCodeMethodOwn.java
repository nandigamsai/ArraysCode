public class HashCodeMethodOwn 
{
	int i;	
	public HashCodeMethodOwn(int i) 
	{
				this.i=i;
		
	}	
	public int Hashcode()
	{
		
		return i;
	}
	public static void main(String[] args) 
	{
				
		HashCodeMethodOwn m1=new HashCodeMethodOwn(10);
		HashCodeMethodOwn m2=new HashCodeMethodOwn(100);
		System.out.println("The Hashcode value own: "  +m1);
		System.out.println("The Hashcode value own: "  +m2);				

	} 
}
