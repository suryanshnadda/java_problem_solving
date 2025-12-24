public class rotatearrayright
 {
        public static void main(String[] args) 
        {
           int arr[]={1,2,3,4,5};
           int len=arr.length;
           int value=arr[len-1];
            
          for(int i=len-2;i>=0;i--)
           {
            arr[i+1]=arr[i];
           }
           arr[0]=value;
           System.out.println("    ");
            for(int k=0;k<len;k++)
           {
             System.out.println(arr[k]);
           }
        }
}