public class Missingnumberinarray {
        public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        //1+2+3+4+6 = 16
        //1+2+3+4+5+6 = 21
        //16-21=5
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        System.out.println("Array Elements");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        int sum2 = 0;
        for(int i=1;i<=8;i++){
            sum2=sum2+i;
        }
        System.out.println("Missing number is : "+(sum2-sum1));
    }
    }

