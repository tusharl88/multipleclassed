package multipleclassed;

public class son2 {
	public son2(String animal)   
{
	mothercolumn= animal;

}
	
	private String mothercolumn;          
	
	public String getname()              
	{
		return mothercolumn;
	}
	public void saying()
	{
		System.out.println("your mother name is:" + mothercolumn);
	}
}



