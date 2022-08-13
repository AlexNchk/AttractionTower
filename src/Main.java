import java.sql.ClientInfoStatus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    static Person client1 = new Person("Александр", "Яковлев", 4);
    static Person client2 = new Person("Алексей", "Ефремов", 5);
    static Person client3 = new Person("Павел", "Сунгуров", 3);
    static Person client4 = new Person("Филипп", "Тимофеев", 6);
    static Person client5 = new Person("Игорь", "Самсонов", 4);
    static Person client6 = new Person("Константин", "Агафошкин", 2);

    static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(client1);
        list.add(client2);
        list.add(client3);
        list.add(client4);
        list.add(client5);
        list.add(client6);
        return list;
    }

    public static void main(String[] args) {
        //int tick = 0;
        Deque<Person> chain = new ArrayDeque<>();
        chain.addAll(generateClients());
        while (!chain.isEmpty()) {
            int tick = 0;
            String ready = String.valueOf(chain.element().getName());
            String ready2 = String.valueOf(chain.element().getSurname());
            System.out.println(ready + " " + ready2 + " прокатился на атракционе!");
            tick = chain.element().getTicket();
            tick--;
            chain.element().setTicket();
            chain.pollFirst();
            if (tick != 0) {
                chain.offerLast(new Person(ready, ready2, tick));
            }

        }

    }

}
