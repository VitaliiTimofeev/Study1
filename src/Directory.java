import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Directory {

    List<File> files = new ArrayList<>();

    public void addFiles(File file) {
        files.add(file);
        System.out.println(files );
    }

}
