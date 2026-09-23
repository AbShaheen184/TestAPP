package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static WeakReference b;
    public androidx.compose.runtime.internal.c a;

    public final synchronized o a() {
        String str;
        o oVar;
        androidx.compose.runtime.internal.c cVar = this.a;
        synchronized (((ArrayDeque) cVar.A)) {
            str = (String) ((ArrayDeque) cVar.A).peek();
        }
        Pattern pattern = o.d;
        oVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                oVar = new o(strArrSplit[0], strArrSplit[1]);
            }
        }
        return oVar;
    }
}
