package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ com.google.gson.m e;
    public final /* synthetic */ com.google.gson.m f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public v(String str, Field field, Method method, com.google.gson.m mVar, com.google.gson.m mVar2, boolean z, boolean z2) {
        this.d = method;
        this.e = mVar;
        this.f = mVar2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(com.google.gson.stream.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new com.google.gson.h(8, androidx.privacysandbox.ads.adservices.java.internal.a.r("Accessor ", com.google.gson.internal.reflect.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.N(this.a);
        this.e.c(bVar, objInvoke);
    }
}
