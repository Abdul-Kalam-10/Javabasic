public class Checkvowelpresentornot {
    public static void main(String[] args) {
        String word = "bcd";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        if (count == 0) {
            System.out.println("vowel not present in a string");
        } else {
            System.out.println("vowels present");
        }
    }
}
