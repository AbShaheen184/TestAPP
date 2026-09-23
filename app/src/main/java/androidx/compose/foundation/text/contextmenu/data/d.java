package androidx.compose.foundation.text.contextmenu.data;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final String b;
    public final int c;
    public final l d;

    public d(Object obj, String str, int i, l lVar) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = lVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.c, ')');
    }
}
