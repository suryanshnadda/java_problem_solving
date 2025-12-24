public class rotatearrayleftbynpositions {
    
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int len=arr.length;
        int n=2; // number of positions to rotate left
        for(int i=0;i<n;i++)
            {
             int value=arr[0];
             for(int j=1;j<len;j++)
             {
                arr[j-1]=arr[j];
             }
               arr[len-1]=value;
            }
        System.out.println("    ");
        for(int k=0;k<len;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
