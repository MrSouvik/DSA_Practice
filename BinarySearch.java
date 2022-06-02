import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
	public static int findNum(int arr[],int n)
	{
		ArrayList<Integer> a=new ArrayList<>(); 
		a.get(3);
		int start=0;
		int end=arr.length;
		int mid=start+(end-start)/2;
		while(start<=end)
		{
			if(arr[mid]==n)
			{
				return mid;
			}
			if(n>arr[mid])
			{                             
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid=start+(end-start)/2;              //4 5 6         4+(6-4)/2=5
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Binary search will only work for sorted array
		int arrOdd[] = {2,4,6,8,10,31,43};
		int arrEven[]= {6,8,9,14,32,45};
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		System.out.println(findNum(arrEven,key));

    }
}
