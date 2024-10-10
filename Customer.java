package Task1;

//opgave 1.a lav en klasse Customer med givene felter
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter=0;


//opgave 1.d lav en toString() metode, der printer kundens detaljer. Gør alle klassens felter private, og tilføj getters og setters.

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //1.b lav en konstruktør, der tager kundens navn og brugernavn som parametre.
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
        //1.c counter tæller op med 1

    }

}
