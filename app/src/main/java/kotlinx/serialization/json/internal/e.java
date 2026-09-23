package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.core.text.f {
    public final boolean c;

    public e(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        super(lVar);
        this.c = z;
    }

    @Override // androidx.core.text.f
    public final void g(byte b) {
        if (this.c) {
            l(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.b).p(strValueOf);
    }

    @Override // androidx.core.text.f
    public final void i(int i) {
        if (this.c) {
            l(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.b).p(string);
    }

    @Override // androidx.core.text.f
    public final void j(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            l(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.b).p(str);
    }

    @Override // androidx.core.text.f
    public final void k(short s) {
        if (this.c) {
            l(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.b).p(strValueOf);
    }
}
