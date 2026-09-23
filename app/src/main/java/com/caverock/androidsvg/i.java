package com.caverock.androidsvg;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e {
    public List a;

    @Override // com.caverock.androidsvg.e
    public final boolean a(w0 w0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (androidx.media3.common.audio.e.g((m) it.next(), w0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return androidx.room.b0.f(new StringBuilder("not("), this.a, ")");
    }
}
