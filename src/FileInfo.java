import java.sql.Time;
import java.util.Date;
import java.util.Map;

public class FileInfo {
    private String name;
    private String extension;
    private Atributs atr;
    private int size;
    private Map<Date, Time> creationDateTime;

    protected FileInfo(String name, String extension, Atributs atr, int size, Map<Date, Time> creationDateTime) {
        this.name = name;
        this.extension = extension;
        this.atr = atr;
        this.size = size;
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", atr=" + atr +
                ", size=" + size +
                ", creationDateTime=" + creationDateTime +
                '}';
    }
}


