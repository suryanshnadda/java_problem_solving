public class largestelementinarray 
{
    public static void main(String[] args) throws Exception {
        
        int arr[] ={1,2,3,400,5,6,7,8};
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("largest element is " + max);
    }
}
