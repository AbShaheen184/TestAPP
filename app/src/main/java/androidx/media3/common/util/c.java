package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.appcompat.widget.o y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c(androidx.appcompat.widget.o oVar, Object obj, int i) {
        this.e = i;
        this.y = oVar;
        this.z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.appcompat.widget.o oVar = this.y;
                if (oVar.a == 0) {
                    oVar.o(this.z);
                }
                break;
            default:
                androidx.appcompat.widget.o oVar2 = this.y;
                int i = oVar2.a - 1;
                oVar2.a = i;
                if (i == 0) {
                    oVar2.o(this.z);
                }
                break;
        }
    }
}
