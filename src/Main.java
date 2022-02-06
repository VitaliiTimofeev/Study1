import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Directory dir1 = new Directory();
       Date creationDateTimeDr1 = new Date();
       dir1.addFiles(new File("txt","Скрытый", Atributs.READ, 12,true,false ));
       System.out.println(creationDateTimeDr1);
       /* Directory dir2 = new Directory();
       dir1.addFiles(new File());
       System.out.println(dir2);  */

    }
}
