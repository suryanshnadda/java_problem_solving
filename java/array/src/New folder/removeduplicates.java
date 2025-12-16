public class removeduplicates {
    
    public static void main(String[] args) throws Exception
    {

        int arr[] ={1,2,3,4,5,6,3,2,1,7,8,8,9,9};
        int length=arr.length;
        boolean found= false;
        int arrnew[]=new int[length];
        int index=0;

        for(int i=0;i<length;i++)
        {
          for(int j=0;j<index;j++)
          {
           if (arr[i]==arrnew[j])
           {
            found=true;
            break;
           }
           }


           if(!found)
           {
            arrnew[index]=arr[i];
            index++;
           }
          
           }
          

            for(int k=0;k<index;k++)
            {
                System.out.println(arrnew[k]);
            }
        
        }
        




       
    
}
