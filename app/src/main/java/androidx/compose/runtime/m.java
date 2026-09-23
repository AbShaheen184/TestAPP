package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends IllegalStateException {
    public final String e;

    public m(String str) {
        this.e = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}
