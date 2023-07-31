public class Biggestelementinarray {
    public static void main(String[] args) {
        int[]arr = {20,-30,-50,67,-33,98,-99};
        int biggest = Integer.MIN_VALUE;
        int i=0 ;
        while (i< arr.length){
            if(arr[i]>biggest){
                biggest=arr[i];
            }
            i++;
        }
        System.out.println("Biggest element :"+biggest);
    }
}
