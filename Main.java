
public class Main {
    public static void main(String[] args) {

        EmailContact emailContact = new EmailContact("aneuman1", "aneuman1@cscc.edu");
        PhoneContact phoneContact = new PhoneContact("John", "123-456-7890");


        emailContact.contact();
        phoneContact.contact();
    }
}
abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();

}

class EmailContact extends Contact {
    private String email;

    public  EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing: " + email);
    }
}

class PhoneContact extends Contact {
    private String number;

    public PhoneContact(String name, String number) {
        super(name);
        this.number = number;
    }

    @Override
    public void contact() {
        System.out.println("Calling: " + number);
    }
}