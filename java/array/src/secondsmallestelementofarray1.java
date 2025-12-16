// sorted array 2nd smallest element of array
public class secondsmallestelementofarray1 {

   public static void main(String[] args)  {
    

       int arr[]={0,3,4,5,8,8,8} ;
       int len=arr.length;
       int smallest =arr[0];
       int secondsmallest =arr[0];
       boolean found = false;
       if(len<2)
        {
            System.out.println("array does not have second smallest element");
            return;
        } 
        
       for(int i=1;i<len;i++)
       {
        if(arr[i]!=smallest)
        {
            secondsmallest=arr[i];
            found = true;
            break;
        }
       }
       if(!found)
       {
        System.out.println("array does not have second smallest element");
         return;  }
    
       System.out.println("second smallest element is " + secondsmallest);

}
}