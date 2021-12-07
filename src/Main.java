import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    List<Contact> contacts = new ArrayList<>();

    contacts.add(new Contact(3, "Sasha", "+7952048574"));
    contacts.add(new Contact(2, "Lesha", "+7965587466"));
    contacts.add(new Contact(2, "Kesha", "+7963243432"));
    contacts.add(new Contact(1, "Artem", "+7976864344"));
    contacts.add(new Contact(1, "Andrey", "+7909074432"));

   // Contact.show(contacts);
    Contact.Group(contacts);
    }
}
