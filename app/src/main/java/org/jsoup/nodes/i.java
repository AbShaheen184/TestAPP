package org.jsoup.nodes;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ArrayList {
    public boolean e;

    public i(int i) {
        super(i);
        this.e = true;
    }

    public final void b() {
        ((ArrayList) this).modCount++;
    }

    public final int c() {
        return ((ArrayList) this).modCount;
    }
}
