package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class j extends e implements SortedSet {
    public final /* synthetic */ x0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x0 x0Var, SortedMap sortedMap) {
        super(x0Var, sortedMap);
        this.z = x0Var;
    }

    public SortedMap b() {
        return (SortedMap) this.e;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.z, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.z, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.z, b().tailMap(obj));
    }
}
