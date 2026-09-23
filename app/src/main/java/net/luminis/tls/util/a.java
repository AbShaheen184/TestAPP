package net.luminis.tls.util;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        Pattern.compile("\\p{XDigit}+");
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != length; i++) {
            byte b = bArr[i];
            stringBuffer.append("0123456789abcdef".charAt((b & 255) >> 4));
            stringBuffer.append("0123456789abcdef".charAt(b & 15));
        }
        return stringBuffer.toString();
    }
}
