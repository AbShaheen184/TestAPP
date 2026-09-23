package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.collection.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j implements Set, Collection, kotlin.jvm.internal.markers.a {
    public static final b A;
    public final Object e;
    public final Object y;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b z;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b bVar = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b.a;
        A = new b(bVar, bVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b.z);
    }

    public b(Object obj, Object obj2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVar) {
        this.e = obj;
        this.y = obj2;
        this.z = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z.y;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.z.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m0(this.e, this.z);
    }
}
