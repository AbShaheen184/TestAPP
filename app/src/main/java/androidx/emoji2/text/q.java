package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p {
    public final int e;
    public int y = -1;
    public int z = -1;

    public q(int i) {
        this.e = i;
    }

    @Override // androidx.emoji2.text.p
    public final boolean f(CharSequence charSequence, int i, int i2, y yVar) {
        int i3 = this.e;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.y = i;
        this.z = i2;
        return false;
    }

    @Override // androidx.emoji2.text.p
    public final Object e() {
        return this;
    }
}
