package androidx.compose.runtime.internal;

import androidx.compose.runtime.r1;
import androidx.compose.runtime.z2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.collections.h {
    public int A;
    public int B;
    public j C;
    public androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b e = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b();
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m y;
    public Object z;

    public i(j jVar) {
        this.y = jVar.e;
        this.B = jVar.y;
        this.C = jVar;
    }

    public final j a() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVar = this.y;
        j jVar = this.C;
        if (mVar != jVar.e) {
            this.e = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b();
            jVar = new j(this.y, size());
        }
        this.C = jVar;
        return jVar;
    }

    public final boolean b(Object obj) {
        return this.y.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.y.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.y = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof r1) {
            return b((r1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.z = null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVarN = this.y.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.e;
        }
        this.y = mVarN;
        return this.z;
    }

    public final void e(int i) {
        this.B = i;
        this.A++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof r1) {
            return (z2) c((r1) obj);
        }
        return null;
    }

    @Override // kotlin.collections.h
    public final Set getEntries() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e(0, this);
    }

    @Override // kotlin.collections.h
    public final Set getKeys() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e(1, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof r1) ? obj2 : (z2) super.getOrDefault((r1) obj, (z2) obj2);
    }

    @Override // kotlin.collections.h
    public final int getSize() {
        return this.B;
    }

    @Override // kotlin.collections.h
    public final Collection getValues() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.h(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.z = null;
        this.y = this.y.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVarA = null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVar = map instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b) map : null;
        if (bVar == null) {
            i iVar = map instanceof i ? (i) map : null;
            if (iVar != null) {
                bVarA = iVar.a();
            }
        } else {
            bVarA = bVar;
        }
        if (bVarA == null) {
            super.putAll(map);
            return;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a aVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a();
        aVar.a = 0;
        int size = size();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVar = this.y;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVar2 = bVarA.e;
        mVar2.getClass();
        this.y = mVar.m(mVar2, 0, aVar, this);
        int i = (bVarA.y + size) - aVar.a;
        if (size != i) {
            e(i);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m mVarO = this.y.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.e;
        }
        this.y = mVarO;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof r1) {
            return (z2) d((r1) obj);
        }
        return null;
    }
}
