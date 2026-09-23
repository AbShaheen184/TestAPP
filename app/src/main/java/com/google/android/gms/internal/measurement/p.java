package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends w2 {
    public final Level b;
    public final Set c;
    public final bh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = q.f;
        this.b = level;
        this.c = q.f;
        this.d = q.g;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final boolean e(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final void f(zf zfVar) {
        String strA = (String) zfVar.d().k(sg.a);
        if (strA == null) {
            strA = (String) this.a;
        }
        if (strA == null) {
            gg ggVar = zfVar.d;
            if (ggVar == null) {
                kotlinx.coroutines.future.a.u("cannot request log site information prior to postProcess()");
                return;
            }
            strA = ggVar.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        q.m(zfVar, h.b(strA), this.b, this.c, this.d);
    }
}
