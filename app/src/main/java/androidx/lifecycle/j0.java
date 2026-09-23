package androidx.lifecycle;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final LinkedHashMap a;
    public final androidx.compose.runtime.internal.c b;

    public j0() {
        this.a = new LinkedHashMap();
        this.b = new androidx.compose.runtime.internal.c(kotlin.collections.x.e);
    }

    public final Object a(String str) {
        Object value;
        androidx.compose.runtime.internal.c cVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.A;
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) linkedHashMap2.get(str);
            if (mutableStateFlow != null && (value = mutableStateFlow.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) cVar.z).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public j0(kotlin.collections.builders.f fVar) {
        this.a = new LinkedHashMap();
        this.b = new androidx.compose.runtime.internal.c(fVar);
    }
}
