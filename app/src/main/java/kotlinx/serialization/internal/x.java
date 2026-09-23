package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends o0 {
    public final boolean l;

    public x(String str, y yVar) {
        super(str, yVar, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.h] */
    @Override // kotlinx.serialization.internal.o0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) obj;
            if (this.a.equals(eVar.a())) {
                x xVar = (x) obj;
                if (xVar.l && Arrays.equals((kotlinx.serialization.descriptors.e[]) this.j.getValue(), (kotlinx.serialization.descriptors.e[]) xVar.j.getValue())) {
                    int iF = eVar.f();
                    int i = this.c;
                    if (i == iF) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (kotlin.jvm.internal.l.a(i(i2).a(), eVar.i(i2).a()) && kotlin.jvm.internal.l.a(i(i2).e(), eVar.i(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.o0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.o0, kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return this.l;
    }
}
