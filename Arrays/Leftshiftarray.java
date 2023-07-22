public class Leftshiftarray {
    public static void main(String[] args) {
        int [] arr ={44,54,65,23,95};
        System.out.println("Before left shift");
        for(int j=0;j< arr.length;j++){
            System.out.println(arr[j]+" ");
        }
        int temp = arr[0];
        int i=0;
        while(i< arr.length-1){
            arr[i] = arr[i+1];
            i=i+1;
        }
        arr[i]=temp;
        System.out.println("After swap");
        for(int j=0;j< arr.length;j++){
            System.out.println(arr[j]+" ");
        }

    }

}
