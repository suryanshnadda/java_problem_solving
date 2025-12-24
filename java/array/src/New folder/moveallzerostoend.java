;public class moveallzerostoend {

public static void main(String[] args) 
{

    int arr[]= {1,2,3,0,0,0,0,0,0,65,7};
    int length=arr.length;
    int newarr[]=new int[length];
    
    int index=0;

    for(int i=0;i<length;i++)
    {
        if(arr[i]>0)
        {
            newarr[index]=arr[i];
            index++;
        }
    }
  /*  
  Java initializes arrays with zeros by default.
   So this loop is redundant:
  
    for(int j=index;j<length;j++)
    {
        newarr[j]=0;
    }
*/

    for(int k=0;k<length;k++)
    {
        System.out.println(newarr[k] + " ");
    }
}
}
