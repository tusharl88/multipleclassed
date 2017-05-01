package multipleclassed;

public class son3 {
	public son3(String animal)             
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
