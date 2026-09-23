package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Iterable {
    public final ArrayList e = new ArrayList();

    @Override // com.google.gson.g
    public final boolean b() {
        return j().b();
    }

    @Override // com.google.gson.g
    public final int c() {
        return j().c();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof f) && ((f) obj).e.equals(this.e);
        }
        return true;
    }

    @Override // com.google.gson.g
    public final long f() {
        return j().f();
    }

    @Override // com.google.gson.g
    public final String h() {
        return j().h();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final g i() {
        return (g) this.e.get(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.e.iterator();
    }

    public final g j() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.n(size, "Array must have size 1, but has size "));
        return null;
    }
}
