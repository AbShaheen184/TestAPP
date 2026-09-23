package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface d5 {
    public static final h5 m = new h5();
    public static final b5 n = new b5();
    public static final r2 o = new r2("continue");
    public static final r2 p = new r2("break");
    public static final r2 q = new r2("return");
    public static final b2 r = new b2(Boolean.TRUE);
    public static final b2 s = new b2(Boolean.FALSE);
    public static final g5 t = new g5("");

    Iterator b();

    Boolean d();

    String e();

    Double h();

    d5 j(String str, b7 b7Var, ArrayList arrayList);

    d5 l();
}
