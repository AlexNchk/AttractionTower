
import java.util.*;

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
        Queue<Person> chain = new LinkedList<>(generateClients());
        while (!chain.isEmpty()) {
            int tick;
            Person person = chain.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе!");
            tick = person.getTicket();
            tick--;
            person.setTicket();
            if (tick != 0) {
                chain.offer(new Person(person.getName(), person.getSurname(), tick));
            }

        }

    }

}
