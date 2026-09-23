package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final com.google.android.material.internal.k h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, com.google.android.material.internal.k kVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = kVar;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, com.google.android.material.internal.k kVar) {
        String packageName = context.getPackageName();
        String strD = vVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strD, packageName, string, str3, kVar);
    }
}
