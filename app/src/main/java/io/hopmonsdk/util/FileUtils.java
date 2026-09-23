package io.hopmonsdk.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class FileUtils {
    private FileUtils() {
    }

    public static String toString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    public static String toString(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        String string = toString(fileInputStream);
        fileInputStream.close();
        return string;
    }

    public static String toString(String str) {
        return toString(new File(str));
    }
}
