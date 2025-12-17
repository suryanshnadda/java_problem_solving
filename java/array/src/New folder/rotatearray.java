//rotate array left by one position
public class rotatearray
 {
        public static void main(String[] args) 
        {
           
          int arr[]={1,2,3,4,5};
          int len=arr.length;
          int value=arr[0];
              
         for(int i=1;i<len;i++)
          {
           arr[i-1]=arr[i];
          }
         arr[len-1]=value;
         System.out.println("    ");
          for(int k=0;k<len;k++)
          {
            
            System.out.println(arr[k]);
          }
           
        }
}
