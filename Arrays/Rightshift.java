public class Rightshift {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        System.out.println("Before right shift");
        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]+" ");
        }
        int temp = arr[arr.length-1];
        int i = arr.length-1;
        while (i>0){
            arr[i] = arr[i-1];
            i=i-1;
        }
        arr[0] = temp;
        System.out.println("after right shift");
        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]+" ");
        }
    }
}
