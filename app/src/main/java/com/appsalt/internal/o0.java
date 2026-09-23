package com.appsalt.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public static final long h;
    public final ArrayList a;
    public final ArrayList b;
    public final p0 c;
    public final int d;
    public n0 e;
    public n0 f;
    public androidx.appcompat.widget.c2 g;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        h = dagger.hilt.android.internal.a.h(3, kotlin.time.c.MINUTES);
    }

    public o0(ArrayList arrayList, ArrayList arrayList2, p0 p0Var, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = p0Var;
        this.d = i;
        kotlin.random.a aVar = kotlin.random.d.e;
        this.e = (n0) kotlin.collections.p.P(arrayList);
        this.f = (n0) kotlin.collections.p.P(arrayList2);
        p0Var.a.getClass();
    }
}
