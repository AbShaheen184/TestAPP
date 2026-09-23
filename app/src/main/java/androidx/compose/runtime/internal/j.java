package androidx.compose.runtime.internal;

import androidx.compose.runtime.b0;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.z2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b implements b0 {
    public static final j A = new j(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.e, 0);

    public final j b(r1 r1Var, z2 z2Var) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarU = this.e.u(r1Var.hashCode(), r1Var, z2Var, 0);
        return lVarU == null ? this : new j((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m) lVarU.z, this.y + lVarU.y);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof r1) {
            return super.containsKey((r1) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof r1) {
            return (z2) super.get((r1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof r1) ? obj2 : (z2) super.getOrDefault((r1) obj, (z2) obj2);
    }
}
