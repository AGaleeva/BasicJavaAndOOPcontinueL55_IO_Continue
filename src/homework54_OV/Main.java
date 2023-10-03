package homework54_OV;

/*
            for (int i = 0; i < 601; i++) {
                bos1.write(bis.read());
            }
*/

import java.io.*;
import java.util.Arrays;

public class Main {

    private static byte[] arr1 = new byte[601];
    private static byte[] arr2 = new byte[57053];
    private static byte[] arr3 = new byte[22494];


    /*
    1. читаем 3 массива заданного размера из файла
    2. анализируем сигнатуру
    3. записываем файлы
    */
    public static void main(String[] args) {
        try {
            read();
            write(arr1);
            write(arr2);
            write(arr3);

        } catch (IOException e) {
            System.out.println("! Reading file error");
            throw new RuntimeException(e);
        }
    }

    public static void write(byte[] arr) throws IOException {
        FileType fileType = getFileType(arr);
        String name = "picture";
        if (fileType == FileType.CLASS) {
            name = "Main";
        }
        name = name + fileType.getExt();

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name))) {
            bos.write(arr);
        }
    }

    public static void read() throws IOException {
        try (BufferedInputStream is =
                     new BufferedInputStream(new FileInputStream("src/homework54_OV/sorce_file.dat"));) {
            is.read(arr1);
            is.read(arr2);
            is.read(arr3);

        }
    }

    public static FileType getFileType(byte[] arr) {

        byte[] gif = new byte[]{0x47, 0x49, 0x46, 0x38, 0x39, 0x61}; // 0x - указывает на то, что число записано в 16-ричной системе
        byte[] jpeg = new byte[]{(byte) 0xff, (byte) 0xd8};
        byte[] klass = new byte[]{(byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe};

        boolean flag = true;
        for (int i = 0; i < gif.length; i++) {
            if (arr[i] != gif[i]) {
                flag = false;
                break;
            }
        }
        if (flag) return FileType.GIF;

        flag = true;
        for (int i = 0; i < jpeg.length; i++) {
            if (arr[i] != jpeg[i]) {
                flag = false;
                break;
            }
        }
        if (flag) return FileType.JPG;

        flag = true;
        for (int i = 0; i < klass.length; i++) {
            if (arr[i] != klass[i]) {
                flag = false;
                break;
            }
        }
        if (flag) return FileType.CLASS;

        return null;
    }

}
