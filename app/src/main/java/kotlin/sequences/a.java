package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final AtomicReference a;

    public a(h hVar) {
        this.a = new AtomicReference(hVar);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        h hVar = (h) this.a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        kotlinx.coroutines.future.a.u("This sequence can be consumed only once.");
        return null;
    }
}
