package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(x xVar, int i) {
        super(1);
        this.y = i;
        this.z = xVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                x xVar = this.z;
                xVar.show();
                return new androidx.activity.compose.d(xVar, 10);
            default:
                x xVar2 = this.z;
                if (xVar2.C.a) {
                    xVar2.B.invoke();
                }
                return kotlin.y.a;
        }
    }
}
