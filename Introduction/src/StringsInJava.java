
public class StringsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal
		/*
		String s1 = "rahul shetty academy";
		String s2 = "rahul shetty academy";
		
		System.out.println(s1 +s2);
		
		/*
		//new memory allocator
		String s3 = new String("welcome home");
		String s4 = new String("welcome home");
		*/
		
		String s = "welcome vindhya reddy";
		//String[] splittedString = s.split(" ");
		//System.out.println(splittedString[1]);
		
		String[] splittedString = s.split("vindhya");
		//System.out.println(splittedString[0]);
		//for the below output there is spacing on the left to remove that we use trim method
		//System.out.println(splittedString[1]); 
		//System.out.println(splittedString[1].trim());
		
		// to print letter by letter
		/*
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	
		for(String i:s.)
		{
			System.out.println(i);
		}
		*/
		// To print in reverse order
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
