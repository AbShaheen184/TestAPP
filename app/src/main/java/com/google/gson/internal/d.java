package com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.gson.n, Cloneable {
    public static final d z = new d();
    public final List e;
    public final List y;

    public d() {
        List list = Collections.EMPTY_LIST;
        this.e = list;
        this.y = list;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        boolean zB = b(clsA, true);
        boolean zB2 = b(clsA, false);
        if (zB || zB2) {
            return new c(this, zB2, zB, eVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z2) {
        if (!z2 && !Enum.class.isAssignableFrom(cls)) {
            com.google.android.gms.dynamite.g gVar = com.google.gson.internal.reflect.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z2 ? this.e : this.y).iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.j.b(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            kotlinx.coroutines.future.a.o(e);
            return null;
        }
    }
}
