
public class Arrays {
    public static void main(String[] args) {
        //testing largestElement()
        int[] arr = {1,5,6,5,10,3};
        System.out.println("Largest element in the array is: " + largestElement(arr));
    }

    //FINDING THE LARGEST ELEMENT IN AN ARRAY
    public static int largestElement(int[] arr){
        //initialize a var to store largest element and set it to the first element in the arr for now
        int largest = arr[0];
        //loop through all the elements in the array
        for(int i = 0; i < arr.length; i++){
            //if the current element in the arr is larger than current largest
            if(arr[i] > largest){
                //set the curr element to be the largest
                largest = arr[i];
            }
        }
        //return the largest element in the array
        return largest;
    }
}
