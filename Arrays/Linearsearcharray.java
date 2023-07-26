public class Linearsearcharray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int i = 0 ;
        int key = 50;
        while(i< arr.length){
            if(key == arr[i]){
                System.out.println(" key " + key +" in position " +i);
                break;
            }
            i=i+1;
        }
        if(i== arr.length)
            System.out.println(key+"not present");
    }
}
