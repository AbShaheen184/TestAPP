package androidx.compose.ui.text.input;

import androidx.compose.ui.text.l0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.extractor.mp4.c {
    public int A;
    public int B;
    public Object C;
    public final /* synthetic */ int e = 1;
    public int y;
    public int z;

    public h(androidx.compose.ui.text.g gVar, long j) {
        String str = gVar.y;
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e(1, (byte) 0);
        eVar.d = str;
        eVar.b = -1;
        eVar.c = -1;
        this.C = eVar;
        this.y = l0.f(j);
        this.z = l0.e(j);
        this.A = -1;
        this.B = -1;
        int iF = l0.f(j);
        int iE = l0.e(j);
        if (iF < 0 || iF > str.length()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", iF, ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", iE, ") offset is outside of text region "), str.length());
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("Do not set reversed range: ", iF, " > ", iE));
        throw null;
    }

    public void a(int i, int i2) {
        long jB = androidx.compose.ui.text.d0.b(i, i2);
        ((androidx.compose.ui.text.android.selection.e) this.C).O(i, i2, "");
        long jS = com.google.android.gms.dynamite.g.S(androidx.compose.ui.text.d0.b(this.y, this.z), jB);
        j(l0.f(jS));
        i(l0.e(jS));
        int i3 = this.A;
        if (i3 != -1) {
            long jS2 = com.google.android.gms.dynamite.g.S(androidx.compose.ui.text.d0.b(i3, this.B), jB);
            if (l0.c(jS2)) {
                this.A = -1;
                this.B = -1;
            } else {
                this.A = l0.f(jS2);
                this.B = l0.e(jS2);
            }
        }
    }

    public char b(int i) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        androidx.compose.foundation.text.selection.w wVar = (androidx.compose.foundation.text.selection.w) eVar.e;
        if (wVar == null) {
            return ((String) eVar.d).charAt(i);
        }
        if (i < eVar.b) {
            return ((String) eVar.d).charAt(i);
        }
        int iB = wVar.b - wVar.b();
        int i2 = eVar.b;
        if (i >= iB + i2) {
            return ((String) eVar.d).charAt(i - ((iB - eVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = wVar.c;
        char[] cArr = (char[]) wVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + wVar.d];
    }

    public l0 c() {
        int i = this.A;
        if (i != -1) {
            return new l0(androidx.compose.ui.text.d0.b(i, this.B));
        }
        return null;
    }

    public long d() {
        int i = this.A;
        if (i == 0) {
            org.mozilla.javascript.typedarrays.c.a();
            return 0L;
        }
        long[] jArr = (long[]) this.C;
        int i2 = this.y;
        long j = jArr[i2];
        this.y = this.B & (i2 + 1);
        this.A = i - 1;
        return j;
    }

    public void e(int i, int i2, String str) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i > i2) {
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        eVar.O(i, i2, str);
        j(str.length() + i);
        i(str.length() + i);
        this.A = -1;
        this.B = -1;
    }

    public void f(int i, int i2) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
        } else if (i >= i2) {
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.A = i;
            this.B = i2;
        }
    }

    public void g(int i, int i2) {
        androidx.compose.ui.text.android.selection.e eVar = (androidx.compose.ui.text.android.selection.e) this.C;
        if (i < 0 || i > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("start (", i, ") offset is outside of text region "), eVar.s());
            return;
        }
        if (i2 < 0 || i2 > eVar.s()) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.v("end (", i2, ") offset is outside of text region "), eVar.s());
        } else if (i > i2) {
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("Do not set reversed range: ", i, " > ", i2));
        } else {
            j(i);
            i(i2);
        }
    }

    @Override // androidx.media3.extractor.mp4.c
    public int h() {
        return -1;
    }

    public void i(int i) {
        if (!(i >= 0)) {
            androidx.compose.ui.text.internal.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.z = i;
    }

    public void j(int i) {
        if (!(i >= 0)) {
            androidx.compose.ui.text.internal.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.y = i;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int r() {
        return this.y;
    }

    @Override // androidx.media3.extractor.mp4.c
    public int s() {
        androidx.media3.common.util.v vVar = (androidx.media3.common.util.v) this.C;
        int i = this.z;
        if (i == 8) {
            return vVar.z();
        }
        if (i == 16) {
            return vVar.G();
        }
        int i2 = this.A;
        this.A = i2 + 1;
        if (i2 % 2 != 0) {
            return this.B & 15;
        }
        int iZ = vVar.z();
        this.B = iZ;
        return (iZ & 240) >> 4;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return ((androidx.compose.ui.text.android.selection.e) this.C).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h() {
    }

    public h(androidx.media3.container.e eVar) {
        androidx.media3.common.util.v vVar = eVar.z;
        this.C = vVar;
        vVar.M(12);
        this.z = vVar.D() & 255;
        this.y = vVar.D();
    }
}
