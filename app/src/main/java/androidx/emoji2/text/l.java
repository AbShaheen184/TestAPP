package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.firebase.b {
    public final /* synthetic */ com.google.firebase.b k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public l(com.google.firebase.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.k = bVar;
        this.l = threadPoolExecutor;
    }

    @Override // com.google.firebase.b
    public final void Q(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.Q(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.google.firebase.b
    public final void R(com.google.firebase.messaging.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.R(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
