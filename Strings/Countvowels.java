public class Countvowels {
    public static void main(String[] args) {
        String word = "education";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
            switch (ch) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println("count of vowels :" + count);
    }
}

