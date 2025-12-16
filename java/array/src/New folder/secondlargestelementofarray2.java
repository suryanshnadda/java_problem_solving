// if the array is not sorted  find the second largest element 
public class secondlargestelementofarray2 {

   public static void main(String[] args) throws Exception {
    
       int arr[]={1,2,3,4,78,80,8,8} ;
       int len=arr.length;
       int largest = arr[0];
       int secondlargest =arr[0];
       
       if(len<2)
        {
            System.out.println("array does not have second largest element");
            return;
        } 
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]>largest)
        {   secondlargest=largest;
            largest =arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest)
        {
            secondlargest=arr[i];
        }
       }
         if(secondlargest==largest)
         {
          System.out.println("array does not have second largest element");
            return;
         }
       System.out.println("second largest element is " + secondlargest);

}
}