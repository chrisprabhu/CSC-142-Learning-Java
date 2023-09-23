import java.io.File;
import java.io.FileNotFoundException;

public interface ISavable
{
    public boolean writeFile(File file) throws FileNotFoundException;
    public boolean readFile(File file) throws FileNotFoundException;
}
