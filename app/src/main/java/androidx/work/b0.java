package androidx.work;

import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends j0 {
    @Override // androidx.work.j0
    public final k0 c() {
        if (!this.b || !((androidx.work.impl.model.p) this.d).j.d) {
            return new c0((UUID) this.c, (androidx.work.impl.model.p) this.d, (LinkedHashSet) this.e);
        }
        kotlinx.coroutines.future.a.q("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    @Override // androidx.work.j0
    public final j0 j() {
        return this;
    }
}
