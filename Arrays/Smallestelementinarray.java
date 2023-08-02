public class Smallestelementinarray {
    public static void main(String[] args) {
        int[]arr = {10,20,30,5,55};
        int smallest =Integer.MAX_VALUE;
        int i=0;
        while(i<arr.length){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
            i++;
        }
        System.out.println("Smallest element in array : " + smallest);
    }
}
