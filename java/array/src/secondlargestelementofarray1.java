// if the array is sorted then we can easily find the second largest element by traversing from the end of the array
public class secondlargestelementofarray1 {

   public static void main(String[] args) throws Exception {
    

       int arr[]={1,2,3,4,5,8,8,8} ;
       int len=arr.length;
       int largest =arr[len-1];
       int secondlargest =-1;
       
       if(len<2)
        {
            System.out.println("array does not have second largest element");
            return;
        } 

       for(int i=len-2;i>=0;i--)
       {
        if(arr[i]!=largest)
        {
            secondlargest=arr[i];
            break;
        }
       }

       if(secondlargest==-1)
       {
        System.out.println("array does not have second largest element");
         return; 
    }
       
        
       System.out.println("second largest element is " + secondlargest);

}
}