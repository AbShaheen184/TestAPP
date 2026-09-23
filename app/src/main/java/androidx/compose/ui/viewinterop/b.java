package androidx.compose.ui.viewinterop;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new b(i, 0);
        A = new b(i, 1);
        B = new b(i, 2);
        C = new b(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                h hVar = (h) obj;
                hVar.getHandler().post(new androidx.compose.foundation.text.contextmenu.internal.c(4, hVar.O));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return y.a;
    }
}
