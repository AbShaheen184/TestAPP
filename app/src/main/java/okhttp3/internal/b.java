package okhttp3.internal;

import com.app.mlounge.ui.viewmodel.q0;
import kotlin.collections.g0;
import kotlin.collections.p;
import kotlin.sequences.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g0 {
    public final kotlin.jvm.internal.e d;
    public final Object e;
    public final g0 f;

    public b(kotlin.jvm.internal.e eVar, Object obj, g0 g0Var) {
        obj.getClass();
        g0Var.getClass();
        this.d = eVar;
        this.e = obj;
        this.f = g0Var;
    }

    @Override // kotlin.collections.g0
    public final Object d(kotlin.jvm.internal.e eVar) {
        if (!eVar.equals(this.d)) {
            return this.f.d(eVar);
        }
        Class clsA = eVar.a();
        clsA.getClass();
        return clsA.cast(this.e);
    }

    @Override // kotlin.collections.g0
    public final g0 j(kotlin.jvm.internal.e eVar, Object obj) {
        kotlin.jvm.internal.e eVar2 = this.d;
        boolean zEquals = eVar.equals(eVar2);
        g0 bVar = this.f;
        if (!zEquals) {
            g0 g0VarJ = bVar.j(eVar, null);
            bVar = g0VarJ == bVar ? this : new b(eVar2, this.e, g0VarJ);
        }
        return obj != null ? new b(eVar, obj, bVar) : bVar;
    }

    public final String toString() {
        return p.I(p.U(k.O(k.L(this, new q0(18)))), null, "{", "}", new q0(19), 25);
    }
}
