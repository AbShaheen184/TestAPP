package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ z(int i, int i2, int i3) {
        this.e = i3;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new y(this.y, this.z);
            default:
                return new androidx.compose.foundation.lazy.grid.x(this.y, this.z);
        }
    }
}
