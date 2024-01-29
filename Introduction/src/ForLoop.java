
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Int Array
		int[] arrays = new int[3];
		arrays[0] = 1;
		arrays[1] = 5;
		arrays[2] = 8;
		/*
		for (int i=0; i<arrays.length; i++)
		{
			System.out.println(arrays[i]);
		}
		//System.out.println(arrays[1]+ "is the value present");
		*/
		
		//String Array
		
		String[] str = new String[2];
		str[0] = "Apple";
		str[1] = "Banana";
		
		//System.out.println(str[1]);
		/*
		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		*/
		
		//Enhanced For Loop:
		
		for( int s: arrays)
		{
			System.out.println(s);
		}
	}

}
