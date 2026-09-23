package com.google.gson.internal;

import com.google.android.gms.measurement.internal.z;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public r(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strI = z.i(cls);
        if (strI == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        kotlinx.coroutines.future.a.o("UnsafeAllocator is used for non-instantiable type: ".concat(strI));
        return null;
    }
}
