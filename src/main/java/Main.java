import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurrence("Never look back", 'k');
        System.out.println();

        findWordPosition("Pineapple", "apple");
        System.out.println();
        findWordPosition("Apple", "Plant");
        System.out.println();

        stringReverse("Hello");
        System.out.println();

        isPalindrome("ERE");
        isPalindrome("Allo");
        System.out.println();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String guessesWord = words[random.nextInt(words.length)];
        System.out.println("Write the word that the computer guessed");
        String userWord = scanner.nextLine();
        while (!userWord.equals(guessesWord)) {
            if (userWord.charAt(0) == guessesWord.charAt(0)) {
                String hashtag = "###############";
                String result = "";
                try {
                    for (int i = 0, j = 0; i < guessesWord.length(); i++, j++) {
                        int valueGuesses = guessesWord.charAt(i);
                        int valueUser = userWord.charAt(j);

                        if (valueGuesses == valueUser) {
                            result += guessesWord.charAt(i);
                        }
                        if (valueGuesses != valueUser) {
                            result += hashtag.substring(result.length() - 1);
                        }
                    }
                } catch (Exception e) {
                    result += hashtag.substring(result.length() - 1);
                }
                System.out.println(result + " Some letters match, guess all the letters");
                userWord = scanner.nextLine();
            } else {
                System.out.println("Wrong, try again!");
                userWord = scanner.nextLine();
            }
        }
        System.out.println("That's great! You guessed the word");
    }

    public static void findSymbolOccurrence(String enterTheString, char enterTheSymbol) {
        char[] charArray = enterTheString.toCharArray();
        int counter = 0;
        for (char c : charArray) {
            if (c == enterTheSymbol) {
                counter += 1;
            }
        }
        System.out.println("Number of matching characters " + counter);
    }

    // method findSymbolOccurrence version two
//   public static void findSymbolOccurrence(String enterTheString, char enterTheSymbol) {
//        int counter = 0;
//        for (int i = 0; i <= enterTheString.length() - 1; i++) {
//            if (enterTheString.charAt(i) == enterTheSymbol) {
//                counter++;
//            }
//        }
//        System.out.println("Number of matching characters " + counter);
//    }

    public static void findWordPosition(String source, String target) {
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        if (source.contains(target)) {
            System.out.println("Result: " + source.indexOf(target));
        } else {
            System.out.println("Result: -1");
        }
    }

    public static void stringReverse(String enterTheString) {
        char[] charArray = enterTheString.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        System.out.println(enterTheString + " -> " + result);
    }

    // method stringReverse version two
//    public static void stringReverse(String enterTheString) {
//        String result = new StringBuilder(enterTheString).reverse().toString();
//        System.out.println(enterTheString + " -> " + result);
//    }

    public static void isPalindrome(String enterTheString) {
        char[] charArray = enterTheString.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        System.out.println(enterTheString + " -> " + enterTheString.equals(result));
    }

    // method isPalindrome version two
//    public static void isPalindrome(String enterTheString){
//        String result = new StringBuilder(enterTheString).reverse().toString();
//        System.out.println(enterTheString + " -> " + enterTheString.equals(result));
//    }
}
