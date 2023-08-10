public class Secondhighestelement {
    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15,61 };
        int high = Integer.MIN_VALUE;
        int secondhigh = Integer.MIN_VALUE;
        //traversing//
        for(int i=0;i< arr.length;i++){
            if(arr[i] > high){
                secondhigh = high;
                high = arr[i];
            }
            if(arr[i] < high && arr[i] > secondhigh){
                secondhigh = arr[i];
            }
        }
        System.out.println("Second highest :"+" "+secondhigh);
    }
}
