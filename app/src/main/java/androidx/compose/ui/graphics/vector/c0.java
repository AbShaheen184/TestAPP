package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public final boolean a;
    public final boolean b;

    public c0(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.a = z;
        this.b = z2;
    }
}
