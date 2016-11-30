package com.javarush.test;

import java.io.*;
import java.util.*;

/**
 * Created by vb on 5/16/16.
 */
public class ParseJAVA {
    public static void main(String[] args) {
        String path = "/Project/github/tests/android/src/main/java/com/wearezeta/auto/android/pages";

    }

    public static List<String> getFilesInPath(String path, final String filter) {
        List<String> fileList = new ArrayList<String>();
        File[] files;
        if (filter != null) {
             files = new File(path).listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains(filter);// || name.endsWith(filter);
                }
            });
        } else {
            files = new File(path).listFiles();
        }

        for (File file : files) {
            if (file.isFile()) {
                fileList.add(file.getName());
            }
        }
        return fileList;
    }

    public static String getFileContent(String fileName, String path) {
        File file = new File(path + "/" + fileName);
        return file.toString();
    }
}
