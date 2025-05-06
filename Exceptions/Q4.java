public class Q4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
//        arr = null;
        try {
                System.out.println("Value at index " + arr[2]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Invalid index!");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
