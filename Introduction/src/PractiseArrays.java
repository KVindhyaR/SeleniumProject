import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array and convert to ArrayList
		
		String[] name = {"welcome", "home", "happy"};
		/*
		for(int i=0; i<3; i++)
		{
			if(name[i] == "happy")
			{
				System.out.println(name[i]);
			}
		}
		*/
		
		List<String> newArrayList = Arrays.asList(name);
		System.out.println(newArrayList.contains("happy"));

	}

}
