public class Copynegativeelementsinanotherarray {
    public static void main(String[] args) {
        int[] arr1 = {10, -20, 30, -40, -50, 60, -70, 80, -90};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        int j = 0;
        System.out.println("arr2 elements are :");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                arr2[j] = arr1[i];
                System.out.println(arr2[j] + " ");
            }
        }
    }
}

