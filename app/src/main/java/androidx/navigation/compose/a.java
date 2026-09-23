package androidx.navigation.compose;

import androidx.lifecycle.b0;
import androidx.lifecycle.j0;
import androidx.lifecycle.s0;
import androidx.media3.exoplayer.source.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {
    public final String b;
    public androidx.media3.exoplayer.hls.c c;

    public a(j0 j0Var) {
        String string = (String) j0Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            if (string != null) {
                ArrayList arrayList = androidx.lifecycle.internal.a.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((Class) it.next()).isInstance(string));
                }
                t0.g(string.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = androidx.lifecycle.internal.a.a;
            Object obj = j0Var.a.get("SaveableStateHolder_BackStackEntryKey");
            b0 b0Var = obj instanceof b0 ? (b0) obj : null;
            if (b0Var != null) {
                b0Var.c(string);
            }
            j0Var.b.F(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = string;
    }

    @Override // androidx.lifecycle.s0
    public final void d() {
        androidx.media3.exoplayer.hls.c cVar = this.c;
        if (cVar == null) {
            kotlin.jvm.internal.l.f("saveableStateHolderRef");
            throw null;
        }
        androidx.compose.runtime.saveable.d dVar = (androidx.compose.runtime.saveable.d) ((WeakReference) cVar.y).get();
        if (dVar != null) {
            dVar.f(this.b);
        }
        androidx.media3.exoplayer.hls.c cVar2 = this.c;
        if (cVar2 != null) {
            ((WeakReference) cVar2.y).clear();
        } else {
            kotlin.jvm.internal.l.f("saveableStateHolderRef");
            throw null;
        }
    }
}
