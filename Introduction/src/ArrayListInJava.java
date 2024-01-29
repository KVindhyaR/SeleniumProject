import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vindhya");
		a.add("Reddy");
		//a.remove(1);
		//System.out.println(a.get(1));
		
		/*
		 // One method of for loop
		for (String s: a)
		{
		System.out.println(s);
		}
		*/
		// second method of for loop condition
		
		for(int i =0; i< a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		//Item present in ArrayList
		System.out.println(a.contains("Reddy"));
		

	}

}
