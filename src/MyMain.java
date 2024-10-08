import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        //getTask1();
        //getTask2();

    }

    static void getTask1() {
        HashMap <String, Integer> card = new HashMap<>();

        card.put("11111111", 1000);
        card.put("22222222", 2902);
        card.put("33333333", 3000);

        card.remove("11111111");
        card.remove("22222222");

        System.out.println("Balance of the card 33333333 is " + card.get("33333333"));
        System.out.println("Numbers of cards: " + card.keySet());
        System.out.println("Values of cards: " + card.values());

        String searchNum = "11111111";
        String searchNum2 = "33333333";
        check(card, searchNum);
        check(card, searchNum2);
    }

    static void check(HashMap <String, Integer> card, String searchNum) {
        if (card.containsKey(searchNum)) {
            System.out.println("This collection has a card with the number " + searchNum);
        } else System.out.println("This collection hasn't a card with the number " + searchNum);
    }

    static void getTask2() {
        System.out.print("Please enter a string: ");
        String input = getScanner();
        String[] words = input.split("\\s+");

        HashMap <String, Integer> counter = new HashMap<>();

        for (String word: words) {
            if (counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }

        System.out.println("Result: ");
        for (String word : counter.keySet()) {
            System.out.println(word + ": " + counter.get(word));
        }

    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }
}
