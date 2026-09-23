package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;
    public final /* synthetic */ int z;

    public /* synthetic */ l(p pVar, int i, List list, boolean z) {
        this.e = 2;
        this.y = pVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                p pVar = this.y;
                int i = this.z;
                pVar.H.getClass();
                try {
                    pVar.U.N(i, b.CANCEL);
                    synchronized (pVar) {
                        pVar.W.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return kotlin.y.a;
            case 1:
                p pVar2 = this.y;
                int i2 = this.z;
                pVar2.H.getClass();
                synchronized (pVar2) {
                    pVar2.W.remove(Integer.valueOf(i2));
                }
                return kotlin.y.a;
            default:
                p pVar3 = this.y;
                int i3 = this.z;
                pVar3.H.getClass();
                try {
                    pVar3.U.N(i3, b.CANCEL);
                    synchronized (pVar3) {
                        pVar3.W.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ l(p pVar, int i, Object obj, int i2) {
        this.e = i2;
        this.y = pVar;
        this.z = i;
    }
}
