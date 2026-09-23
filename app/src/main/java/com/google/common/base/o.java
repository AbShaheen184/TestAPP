package com.google.common.base;

import androidx.compose.ui.platform.u1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable {
    public final /* synthetic */ String e;
    public final /* synthetic */ u1 y;

    public o(u1 u1Var, String str) {
        this.e = str;
        this.y = u1Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        u1 u1Var = this.y;
        return ((p) u1Var.e).b(u1Var, this.e);
    }

    public final String toString() {
        androidx.emoji2.text.r rVar = new androidx.emoji2.text.r(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        rVar.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
