package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements r1 {
    public final String b;
    public final q c;
    public final q d;

    public s1(String str) {
        this.b = str;
        this.c = new q(str);
        this.d = new q(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
