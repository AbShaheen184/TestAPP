package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, int i) {
        super(1);
        this.y = i;
        this.z = zVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                androidx.compose.ui.layout.x xVarN = ((androidx.compose.ui.layout.x) obj).N();
                xVarN.getClass();
                this.z.n(xVarN);
                break;
            case 1:
                androidx.compose.ui.unit.l lVar = new androidx.compose.ui.unit.l(((androidx.compose.ui.unit.l) obj).a);
                z zVar = this.z;
                zVar.m12setPopupContentSizefhxjrPA(lVar);
                zVar.o();
                break;
            default:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj;
                z zVar2 = this.z;
                Handler handler = zVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = zVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new androidx.compose.foundation.text.contextmenu.internal.c(5, aVar));
                    }
                }
                break;
        }
        return kotlin.y.a;
    }
}
