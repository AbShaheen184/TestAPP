package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class la {
    public static final androidx.collection.f a = new androidx.collection.f(0);

    public static synchronized Uri a() {
        androidx.collection.f fVar = a;
        Uri uri = (Uri) fVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        fVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            kotlinx.coroutines.future.a.q("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return androidx.compose.runtime.j.m(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
