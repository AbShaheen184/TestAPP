package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new b(i, 0);
        A = new b(i, 1);
        B = new b(i, 2);
        C = new b(i, 3);
        D = new b(i, 4);
        E = new b(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                float[] fArr = ((androidx.compose.ui.graphics.f0) obj).a;
                break;
            case 1:
                float[] fArr2 = ((androidx.compose.ui.graphics.f0) obj).a;
                break;
            case 2:
                break;
            case 3:
                int i = ((j) obj).a;
                break;
            case 4:
                break;
            default:
                int i2 = ((j) obj).a;
                break;
        }
        return kotlin.y.a;
    }
}
