public class Countaletterinastring {
    public static void main(String[] args) {
        String word = "pallavaram";
        char search = 'm';
        int count=0;
        
        for(int i=0;i<word.length();i++){
            if(search == word.charAt(i))
                count++;
        }
        System.out.println("count of "  +search+ " " + "is " + count);
    }
}
