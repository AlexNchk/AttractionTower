public class Person {
    private final String name;
    private final String surname;
    protected int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket() {
    }
}
