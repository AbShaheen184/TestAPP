package androidx.media3.datasource.cache;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final TreeSet a = new TreeSet(new j());
    public long b;

    public final void a(n nVar, long j) {
        while (this.b + j > 4294967296L && !this.a.isEmpty()) {
            o oVar = (o) this.a.first();
            synchronized (nVar) {
                nVar.j(oVar);
            }
        }
    }

    public final void b(n nVar, o oVar) {
        this.a.add(oVar);
        this.b += oVar.z;
        a(nVar, 0L);
    }
}
