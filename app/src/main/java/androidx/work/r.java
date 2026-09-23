package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ AtomicBoolean y;
    public final /* synthetic */ androidx.concurrent.futures.i z;

    public /* synthetic */ r(AtomicBoolean atomicBoolean, androidx.concurrent.futures.i iVar, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.y = atomicBoolean;
        this.z = iVar;
        this.A = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.concurrent.futures.i iVar = this.z;
                kotlin.jvm.functions.a aVar = this.A;
                if (!this.y.get()) {
                    try {
                        iVar.a(aVar.invoke());
                    } catch (Throwable th) {
                        iVar.b(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                androidx.concurrent.futures.i iVar2 = this.z;
                kotlin.jvm.functions.a aVar2 = this.A;
                if (!this.y.get()) {
                    try {
                        iVar2.a(aVar2.invoke());
                    } catch (Throwable th2) {
                        iVar2.b(th2);
                    }
                    break;
                }
                break;
        }
    }
}
