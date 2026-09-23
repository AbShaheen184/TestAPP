package dagger.hilt.android.internal.lifecycle;

import androidx.activity.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.work.impl.k;
import com.google.android.gms.measurement.internal.b0;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements u0 {
    public static final b0 d = new b0(25);
    public final dagger.internal.c a;
    public final u0 b;
    public final androidx.lifecycle.viewmodel.d c;

    public e(dagger.internal.c cVar, u0 u0Var, k kVar) {
        this.a = cVar;
        this.b = u0Var;
        this.c = new androidx.lifecycle.viewmodel.d(kVar, 1);
    }

    public static e d(p pVar, u0 u0Var) {
        com.app.mlounge.d dVar = (com.app.mlounge.d) ((c) n.r(pVar, c.class));
        return new e(dVar.a(), u0Var, new k(8, dVar.a, dVar.b));
    }

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        com.google.firebase.platforminfo.b.n("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        return this.a.containsKey(cls) ? this.c.b(cls, eVar) : this.b.b(cls, eVar);
    }
}
