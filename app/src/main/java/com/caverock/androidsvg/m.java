package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((n) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ']');
    }
}
