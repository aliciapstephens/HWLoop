package Box;

import java.util.*;
import java.ArrayList;
import java.Scanner;

public class Box1 {
    public static void main(String[] args) 
     {

      Scanner input= new Scanner (System.in);
      int sum=0;

    ArrayList<Integer> NumList = new ArrayList<Integer>(5);
    
    for(int i=0; i<5; i++)
    {
         System.out.println("Input the 5 numbers: ");
             int num = input.nextInt();
             sum +=  num;
             }  
         System.out.println(sum);
         
for(int x=0; x < NumList.size(); x++)
{
    sum += NumList.get(x);
}
    System.out.println("The sum of the ArrayList is " +sum);
     }
    Scanner input= new Scanner (System.in);
    int largestNumber=[int numbers];

      for(arrayIndex = 0; arrayIndex < arr.length; arrayIndex++) 
      {
          
          for(subArrayIndex = 0; subArrayIndex < arr[arrayIndex].length; subArrayIndex++) {
      }
          if(arr[arrayIndex][subArrayIndex] > largestNumber[arrayIndex]) 
          {
              largestNumber[arrayIndex] = arr[arrayIndex][subArrayIndex];
          }
      }
		int mult = 1;
		for (int i = 0; i < numGame.size(); i++) {
			mult = mult * numGame.get(i);
		}
		System.out.println("Product: " + mult);
		System.out.println("Largest Number: " + Collections.max(numGame));
		System.out.println("Smallest Number: " + Collections.min(numGame));
	}
}
}





