package JavaEclipseCode;
import java.io.*;
import java.util.Arrays;
 
class Sort1
	{
 
    public static void main(String[] args) 
    {
        String str = "apple";
       
        char arr[] = str.toCharArray();
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] > arr[i]) {
                   
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }

        System.out.println(arr);
		for( int j=0;j<arr.length;j++){
		
        if(arr[j]=='a' ||arr[j]=='e' || arr[j]=='i' || arr[j]=='o'|| arr[j]=='u') 
			{
				System.out.println("Vowel: "+arr[j]);
			}
			else
			{
				System.out.println("Consonant: "+arr[j]);
			}
		}
    }
}

