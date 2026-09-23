package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends t {
    public final int c;

    public b(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c * 31;
    }
}
