

public class Main {
    public static void main(String[] args) {

       Directory dir1 = new Directory();
       dir1.addFiles(new File("txt","Скрытый", Atributs.READ, 12,true,false ));
       System.out.println(dir1);
       /* Directory dir2 = new Directory();
       dir1.addFiles(new File());
       System.out.println(dir2);  */

    }
}
