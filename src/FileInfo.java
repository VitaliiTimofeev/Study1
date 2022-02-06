import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class FileInfo {
    private String name;
    private String extension;
    private Atributs atr;
    private int size;
    // Date creationDateTime;

    protected FileInfo(String name, String extension, Atributs atr, int size) {
        this.name = name;
        this.extension = extension;
        this.atr = atr;
        this.size = size;
        //this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", atr=" + atr +
                ", size=" + size +
                '}';
    }
}
