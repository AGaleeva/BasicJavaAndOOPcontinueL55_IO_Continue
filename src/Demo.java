import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.dat");
        FileOutputStream out = new FileOutputStream("file_out.dat");
        int data;
        int counter = 0;
        while ((data = fis.read()) != -1 && counter < 600) {
            out.write(data);
            // handle data
            counter ++;
        }

        byte[] bytes = new byte[9];
        int count = fis.read(bytes); // здесь будет возвращено значение того, сколько реально байт было прочитано из файла

        fis.read(bytes, 0, 3);
        fis.skip(2);
        fis.read(bytes, 3, 4);
        fis.skip(1);
        fis.read(bytes, 7, 2);
    }
}
