package com.appsalt.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {
    public static final String[] a = a("creapslpinut.com; gapslpinch.com", "");
    public static final String[] b = a("grasplpond.com; clapslport.com", "");
    public static final String[] c = a("scapslwshell.com; trapslwsin.com", "wss://");

    public static String[] a(String str, String str2) {
        List listU = kotlin.text.k.U(kotlin.text.k.g0(str).toString(), new String[]{";", " ", ",", "\t", "\n", "\r\n", "\r"}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            String string = kotlin.text.k.g0((String) it.next()).toString();
            String strConcat = kotlin.text.k.J(string) ? null : str2.concat(string);
            if (strConcat != null) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
