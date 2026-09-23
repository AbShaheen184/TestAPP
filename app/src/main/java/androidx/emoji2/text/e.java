package androidx.emoji2.text;

import android.os.Build;
import androidx.appcompat.widget.c2;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.firebase.b {
    public final /* synthetic */ f k;

    public e(f fVar) {
        this.k = fVar;
    }

    @Override // com.google.firebase.b
    public final void Q(Throwable th) {
        ((j) this.k.a).f(th);
    }

    @Override // com.google.firebase.b
    public final void R(com.google.firebase.messaging.n nVar) {
        f fVar = this.k;
        fVar.c = nVar;
        com.google.firebase.messaging.n nVar2 = (com.google.firebase.messaging.n) fVar.c;
        j jVar = (j) fVar.a;
        fVar.b = new c2(nVar2, jVar.g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : t1.x());
        j jVar2 = (j) fVar.a;
        ArrayList arrayList = new ArrayList();
        jVar2.a.writeLock().lock();
        try {
            jVar2.c = 1;
            arrayList.addAll(jVar2.b);
            jVar2.b.clear();
            jVar2.a.writeLock().unlock();
            jVar2.d.post(new androidx.core.provider.a(arrayList, jVar2.c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
