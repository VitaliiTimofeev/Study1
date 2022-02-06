import java.util.Date;
import java.util.Map;

public class File extends FileInfo{
    // Date changingDate;
    boolean isDelited;
    boolean isSelected;

    public File(String name, String extension, Atributs atr, int size , boolean isDelited, boolean isSelected) {
        super(name, extension, atr, size);
        // this.changingDate = changingDate;
        this.isDelited = isDelited;
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "File{" + super.toString() +
                ", isDelited=" + isDelited +
                ", isSelected=" + isSelected +
                '}';
    }
}