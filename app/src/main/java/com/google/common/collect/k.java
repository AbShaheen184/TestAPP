package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c implements ListIterator {
    public final /* synthetic */ l B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i) {
        super(lVar, ((List) lVar.y).listIterator(i));
        this.B = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l lVar = this.B;
        boolean zIsEmpty = lVar.isEmpty();
        c().add(obj);
        lVar.C.B++;
        if (zIsEmpty) {
            lVar.b();
        }
    }

    public final ListIterator c() {
        b();
        return (ListIterator) this.y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(lVar);
        this.B = lVar;
    }
}
