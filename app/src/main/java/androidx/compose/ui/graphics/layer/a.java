package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.t;
import kotlin.jvm.internal.m;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements kotlin.jvm.functions.l {
    public static final a A;
    public static final a z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new a(i, 0);
        A = new a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                break;
            default:
                androidx.compose.ui.graphics.drawscope.d.G((androidx.compose.ui.graphics.drawscope.d) obj, t.h, 0L, 0L, 0.0f, Token.ELSE);
                break;
        }
        return y.a;
    }
}
