package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.work.impl.k;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.j;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final k a;
    public final j b;
    public final HashMap c;

    public e(Context context, j jVar) {
        k kVar = new k(context, 16);
        this.c = new HashMap();
        this.a = kVar;
        this.b = jVar;
    }

    public final synchronized g a(String str) {
        if (this.c.containsKey(str)) {
            return (g) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryL = this.a.l(str);
        if (cctBackendFactoryL == null) {
            return null;
        }
        j jVar = this.b;
        g gVarCreate = cctBackendFactoryL.create(new b((Context) jVar.y, (com.google.android.datatransport.runtime.time.a) jVar.z, (com.google.android.datatransport.runtime.time.a) jVar.A, str));
        this.c.put(str, gVarCreate);
        return gVarCreate;
    }
}
