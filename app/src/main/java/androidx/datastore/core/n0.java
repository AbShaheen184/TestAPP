package androidx.datastore.core;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public FileOutputStream e;
    public long y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return j1.a(null, this);
    }
}
