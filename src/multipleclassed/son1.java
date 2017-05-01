package multipleclassed;

public class son1 {
	
	public void simpleMessage(String animal)   // String animal receives actual argument from temp and then animal stores it in mothercolumn
{
	mothercolumn= animal;

}
	
	private String mothercolumn;             //private is a variable of name mothercolumn which takes value of animal coming from temp.
	
	
	public String getname()                // here we have used String as return type 
	{
		return mothercolumn;
	}
	public void saying()
	{
		System.out.println("your mother name is:" + mothercolumn);
	}
}
