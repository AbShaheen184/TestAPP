package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public final TextClassification b;
    public final int c;

    public h(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.c, ')');
    }
}
