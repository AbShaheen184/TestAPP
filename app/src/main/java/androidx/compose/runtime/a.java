package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.a, " }", sb);
    }
}
