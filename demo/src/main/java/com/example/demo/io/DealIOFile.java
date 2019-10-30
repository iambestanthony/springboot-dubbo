package com.example.demo.io;

import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by JayJ on 2019/10/30.
 **/
public class DealIOFile {
    String path = "D:\\temp\\iofile\\" + getDate() + ".ok";

    private String getDate() {
        return new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
    }

    @Test
    public void test() {
        File file = createFile();
        ArrayList<String> list = new ArrayList<>();
        list.add("201811080000000094003153X10004 2018110814595920181107000000650945      0000000000000000000000000500000002298001000100210000                       156945");
        list.add("201811080000000094003165X11004 2018110809000120181106000000647945      0000000000000000000000000200000002298001000100110000                       156945");
        list.add("201811080000000094003175X10004 2018110809000120181106000000647945      0000000000000000000000002000000002298001000100110000                       156945");
        list.add("201811080000000094003176X10005 2018110809000120181106000000647945      0000000000000000000000002000000002298001000100110000                       156945");
        dataToFile(file,list);
    }

    private void dataToFile(File file, List<String> data) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream buff = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            buff = new BufferedOutputStream(fileOutputStream);
            for (String l : data) {
                l = l + System.getProperty("line.separator");
                buff.write(l.getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (buff != null) {
                try {
                    buff.flush();
                    buff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     *
     * @return
     */
    private File createFile() {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
