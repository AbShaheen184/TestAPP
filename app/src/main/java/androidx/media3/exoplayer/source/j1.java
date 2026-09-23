package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final j1 d = new j1(new androidx.media3.common.w0[0]);
    public final int a;
    public final com.google.common.collect.a1 b;
    public int c;

    static {
        androidx.media3.common.util.i0.K(0);
    }

    public j1(androidx.media3.common.w0... w0VarArr) {
        com.google.common.collect.a1 a1VarP = com.google.common.collect.h0.p(w0VarArr);
        this.b = a1VarP;
        this.a = w0VarArr.length;
        int i = 0;
        while (i < a1VarP.A) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < a1VarP.A; i3++) {
                if (((androidx.media3.common.w0) a1VarP.get(i)).equals(a1VarP.get(i3))) {
                    androidx.media3.common.util.b.g("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final androidx.media3.common.w0 a(int i) {
        return (androidx.media3.common.w0) this.b.get(i);
    }

    public final int b(androidx.media3.common.w0 w0Var) {
        int iIndexOf = this.b.indexOf(w0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a == j1Var.a && this.b.equals(j1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
