public class secondsmallestelementofarray2 {


    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8, 8, 8};

        if (arr.length < 2) {
            System.out.println("Array does not have second smallest element");
            return;
        }

        int smallest, secondSmallest;

        if (arr[0] < arr[1]) {
            smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (smallest == secondSmallest) {
            System.out.println("Array does not have second smallest element");
        } else {
            System.out.println("Second smallest element is " + secondSmallest);
        }
    }
  
}
