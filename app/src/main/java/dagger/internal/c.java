package dagger.internal;

import com.google.common.collect.f1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map {
    public final f1 e;

    public c(f1 f1Var) {
        this.e = f1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.e.containsKey(((Class) obj).getName());
        }
        kotlinx.coroutines.future.a.q("Key must be a class");
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.e.get(((Class) obj).getName());
        }
        kotlinx.coroutines.future.a.q("Key must be a class");
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.C;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.e.values();
    }
}
