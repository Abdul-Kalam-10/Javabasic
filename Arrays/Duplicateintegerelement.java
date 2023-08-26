public class Duplicateintegerelement {
    public static void main(String[] args) {
        int[]  arr = {1,3,4,1,5,6,2,3};
        int i,j;
        for (i=0;i< arr.length-1;i++){
            for (j=i+1;j< arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate element :"+" "+arr[i]);
                }
            }
        }
    }
}
