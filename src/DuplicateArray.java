/**
 * Create a method which accepts an integer array and removes all the 
 * duplicates in the array. 
 * Return the resulting array in descending order
 * 
 * @author Haritha
 *
 */
import java.util.Arrays;
public class DuplicateArray{
	public static void main(String[] args) {
		

		int array[]= {10,20,20,40,40,10,5};
		changeArray(array);
	}
	public static void changeArray(int[] array) {
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=array[len-1];
					len--;
					j--;
				}
			}
		}
		System.out.println("Removing Duplicates" );
		int[] array1=Arrays.copyOf(array, len);
		for(int i=0;i<len;i++)
		{
		System.out.print( array1[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(array1);
		System.out.println("Ascending Order");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();

		System.out.println("Descending Order");

		for(int i=array1.length-1;i>=0;i--)
		{
			System.out.print(array1[i]+" ");
		}
		
		
	}

}

