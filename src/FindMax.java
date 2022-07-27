import java.util.Scanner;

public class FindMax {
	public static int findMax(int arr[])
	{
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=FindMax.findMax(arr);
		System.out.println(result);
	}

}
