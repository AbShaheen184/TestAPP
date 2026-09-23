package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class lf extends mf {
    public static final mf e;
    public static final mf f;

    static {
        mf mfVarB = new lf(null, new androidx.collection.y0(0)).b();
        e = mfVarB;
        lf lfVar = new lf(mfVarB, new androidx.collection.y0(0));
        boolean z = !lfVar.c;
        Boolean bool = Boolean.TRUE;
        _COROUTINE.a.z("Can't mutate after handing to trace", z);
        _COROUTINE.a.z("Key already present", !lfVar.c());
        lfVar.b.put(mf.d, bool);
        f = lfVar.b();
    }
}
