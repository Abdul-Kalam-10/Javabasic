public class Leftshifttwice {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("before");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        int temp1 = arr[0];
        int temp2 = arr[1];
        int i=0;
        while(i<arr.length-2){
            arr[i] = arr[i+2];
            i=i+1;
        }
        arr[i] = temp1;
        arr[i+1] = temp2;
        System.out.println("after");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);

        }
    }
}