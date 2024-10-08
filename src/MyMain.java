import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        //getTask1();
        //getTask2();
        //getTaskWithQueue();
        //getTaskWithPriorityQueue();
        getTaskWithMyQueue();
        retainSets();
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

    static void getTaskWithQueue() {
        Queue<Customer> customers = new LinkedList<>();
        addCustomers(customers);
        serviceCustomers(customers);
    }

    public static void addCustomers(Queue<Customer> customers) {
        customers.add(new Customer("Katya", 1));
        customers.add(new Customer("Arseniy", 8));
        customers.add(new Customer("Vasya", 3));
        customers.add(new Customer("Masha", 4));
    }

    public static void serviceCustomers(Queue<Customer> customers) {
        while (!customers.isEmpty()) {
            Customer servicedCustomer = customers.poll();
            System.out.println(servicedCustomer + " is serviced");
        }
        System.out.println("All customers were serviced");
    }

    static void getTaskWithPriorityQueue() {
        PriorityQueue<Customer> priorityQueue = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return Integer.compare(c1.getTicketNumber(), c2.getTicketNumber());
            }
        });
        addCustomers(priorityQueue);
        serviceCustomers(priorityQueue);
    }

    public static void retainSets() {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5, 6);
        List<Integer> list2 = Arrays.asList(1, 1, 2, 5, 5, 7, 8);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        System.out.println("First set: " + set1);
        System.out.println("Second set: " + set2);

        set1.retainAll(set2);
        System.out.println("Result: " + set1);
    }

    public static void getTaskWithMyQueue() {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueue.displayQueue();

        System.out.println("Last 3 elements: " + myQueue.getLastElements(3));
    }

    public static String getScanner(){
        return new Scanner(System.in).nextLine();
    }


}
