package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {
    public final h a;
    public final boolean b;
    public final kotlin.jvm.functions.l c;

    public g(h hVar, boolean z, kotlin.jvm.functions.l lVar) {
        this.a = hVar;
        this.b = z;
        this.c = lVar;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new f(this);
    }
}
