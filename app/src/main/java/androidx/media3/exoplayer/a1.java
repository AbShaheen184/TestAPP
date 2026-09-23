package androidx.media3.exoplayer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements s0 {
    public final androidx.media3.exoplayer.source.r a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public a1(androidx.media3.exoplayer.source.a aVar, boolean z) {
        this.a = new androidx.media3.exoplayer.source.r(aVar, z);
    }

    @Override // androidx.media3.exoplayer.s0
    public final Object a() {
        return this.b;
    }

    @Override // androidx.media3.exoplayer.s0
    public final androidx.media3.common.v0 b() {
        return this.a.o;
    }
}
