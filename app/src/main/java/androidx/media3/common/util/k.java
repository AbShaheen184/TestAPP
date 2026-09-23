package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.compose.ui.node.a1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Handler.Callback {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ k(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                m mVar = oVar.c;
                mVar.getClass();
                for (n nVar : oVar.d) {
                    if (!nVar.d && nVar.c) {
                        androidx.media3.common.o oVarC = nVar.b.c();
                        nVar.b = new androidx.core.text.f();
                        nVar.c = false;
                        mVar.f(nVar.a, oVarC);
                    }
                    f0 f0Var = oVar.b;
                    f0Var.getClass();
                    if (f0Var.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                a1 a1Var = (a1) this.y;
                int i = message.what;
                if (i == 1) {
                    ((y) a1Var.h).a();
                    return true;
                }
                if (i == 2) {
                    ((z) a1Var.i).a();
                    return true;
                }
                if (i == 3) {
                    ((a0) a1Var.j).a();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                ((b0) a1Var.k).a();
                return true;
        }
    }
}
