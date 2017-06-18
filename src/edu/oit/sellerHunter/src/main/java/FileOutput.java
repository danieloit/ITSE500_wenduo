import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by wenduoguo on 6/15/17.
 */

public class FileOutput {
    private String file;
    private String data;



    public FileOutput (String file, String data) {
        this.file = file;
        this.data = data;
    }

    public FileOutput() {
    };

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
        return "FileOutput{" +
                "file='" + file + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public void write (boolean appendData) {
        File f = null;
        try {
            f = new File(this.file);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            FileUtils.writeStringToFile(f, this.data, appendData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
