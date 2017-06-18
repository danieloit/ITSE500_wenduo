import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by wenduoguo on 6/17/17.
 */
public class WriteFile {

    private String file;
    private String data;


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WriteFile{" +
                "file='" + file + '\'' +
                ", data='" + data + '\'' +
                '}';
    }


    public void run(){
        try {
        FileUtils.writeStringToFile(new File(file), data);
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
