package androidx.media3.extractor.mp4;

import androidx.media3.common.j0;
import androidx.media3.common.util.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final v f;
    public final v g;
    public int h;
    public int i;

    public b(v vVar, v vVar2, boolean z) throws j0 {
        this.g = vVar;
        this.f = vVar2;
        this.e = z;
        vVar2.M(12);
        this.a = vVar2.D();
        vVar.M(12);
        this.i = vVar.D();
        androidx.media3.extractor.b.b("first_chunk must be 1", vVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        v vVar = this.f;
        this.d = z ? vVar.F() : vVar.B();
        if (this.b == this.h) {
            v vVar2 = this.g;
            this.c = vVar2.D();
            vVar2.N(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? vVar2.D() - 1 : -1;
        }
        return true;
    }
}
