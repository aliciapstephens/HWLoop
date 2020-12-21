package Box;

import java.util.*;

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
         
         input.close();
    
for(int x=0; x < NumList.size(); x++)
{
    sum += NumList.get(x);
}
    System.out.println("The sum of the ArrayList is " +sum);
     }
public class function void largestofFive(arr){
       largestNumber=[int numbers];

      for(arrayIndex = 0; arrayIndex < arr.length; arrayIndex++) 
      {
          
          for(subArrayIndex = 0; subArrayIndex < arr[arrayIndex].length; subArrayIndex++) {
      }
          if(arr[arrayIndex][subArrayIndex] > largestNumber[arrayIndex]) 
          {
              largestNumber[arrayIndex] = arr[arrayIndex][subArrayIndex];
          }
      }
}

break;




