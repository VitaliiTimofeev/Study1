import java.util.List;
import java.util.Scanner;

public class Contact {
    private int numberGroup;
    private String name;
    private String numberPhone;

    public Contact(int numberGroup, String name, String numberPhone) {
        this.numberGroup = numberGroup;
        this.name = name;
        this.numberPhone = numberPhone;
    }

   /* public static void show (List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact.name + " " + contact.numberPhone);
        }
    } */

    public static void Group (List<Contact> contacts) {
        Scanner sc = new Scanner(System.in);
        int numberGroup = 1;

        while (true) {
            System.out.println("Введите группу (1-5): ");
            numberGroup = sc.nextInt(); // Integer.parseInt(sc.nextLine());
            if (numberGroup >= 1  && numberGroup <= 5)
                break;
        }

        System.out.println("Контакты группы " + numberGroup + ": " );
        for (Contact contact : contacts) {
            if (contact.numberGroup == numberGroup)
                System.out.println(contact.name + " " + contact.numberPhone);
        }
    }
}

