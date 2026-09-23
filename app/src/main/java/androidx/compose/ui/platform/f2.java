package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final f2 A;
    public static final f2 z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new f2(i, 0);
        A = new f2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.y) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
