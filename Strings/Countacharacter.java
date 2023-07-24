public class Countacharacter {
    public static void main(String[] args) {
        //count of first character in a String//
        String word = "malayalam";
                     //012345678
        char first  = word.charAt(0);
        int count = 1;
        for(int i=1;i<=word.length()-1;i++){
            if(first == word.charAt(i))
                count++;
        }
        System.out.println("count of 2 char:"+" "+count);
    }
}
