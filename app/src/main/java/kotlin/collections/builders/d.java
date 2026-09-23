package kotlin.collections.builders;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.emoji2.text.flatbuffer.c implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int B;

    public d(f fVar, int i) {
        this.B = i;
        fVar.getClass();
        this.A = fVar;
        this.y = -1;
        this.z = fVar.E;
        d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.B) {
            case 0:
                c();
                int i = this.e;
                f fVar = (f) this.A;
                if (i >= fVar.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i + 1;
                this.y = i;
                e eVar = new e(fVar, i);
                d();
                return eVar;
            case 1:
                c();
                int i2 = this.e;
                f fVar2 = (f) this.A;
                if (i2 >= fVar2.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i2 + 1;
                this.y = i2;
                Object obj = fVar2.e[i2];
                d();
                return obj;
            default:
                c();
                int i3 = this.e;
                f fVar3 = (f) this.A;
                if (i3 >= fVar3.C) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                this.e = i3 + 1;
                this.y = i3;
                Object[] objArr = fVar3.y;
                objArr.getClass();
                Object obj2 = objArr[this.y];
                d();
                return obj2;
        }
    }
}
