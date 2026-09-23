package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final int a;
    public final long b;

    public h(int i, long j) {
        _COROUTINE.a.o(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static h b(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new h(j, i3);
    }

    public static h c(androidx.media3.extractor.o oVar, v vVar) {
        oVar.w(vVar.a, 0, 8);
        vVar.M(0);
        int iM = vVar.m();
        return new h(vVar.q(), iM, false);
    }

    public boolean a() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public h(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public /* synthetic */ h(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }
}
