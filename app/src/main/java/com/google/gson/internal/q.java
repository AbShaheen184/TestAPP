package com.google.gson.internal;

import com.google.android.gms.measurement.internal.z;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends u {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public q(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strI = z.i(cls);
        if (strI == null) {
            return this.b.invoke(this.c, cls);
        }
        kotlinx.coroutines.future.a.o("UnsafeAllocator is used for non-instantiable type: ".concat(strI));
        return null;
    }
}
