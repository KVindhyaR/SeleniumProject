
public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing created method by declaring an object
		MethodsInJava created = new MethodsInJava();
		//created.getData();
		String name = created.getData();
		System.out.println(name);
		
		
		

	}
	
	//creating method
	public String getData()
	{
		System.out.println("Hello World");
		return "hi";
	}
	
	/*
	 void - it returns nothing
	 public void getData()
	 {
	 System.out.println("Hello World");
	 }
	 */

}
