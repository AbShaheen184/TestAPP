package androidx.media3.common.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Exception {
    public l(String str, j jVar) {
        super(str + " " + jVar);
    }

    public l(j jVar) {
        this("Unhandled input format:", jVar);
    }
}
