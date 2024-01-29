
public class IfElseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,6,8,9,11,16};
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] % 2 ==0)
			{
			System.out.println(arr[i]);
			break;
			}
			else
			{
				System.out.println(arr[i] + "is not an even number");
			}
		}

	}

}
