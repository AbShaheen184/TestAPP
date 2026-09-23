package org.mozilla.javascript;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Hashtable.Entry) obj).clear();
    }
}
