package org.jsoup.internal;

import java.util.function.BiConsumer;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        j jVar = (j) obj;
        CharSequence charSequence = (CharSequence) obj2;
        n.D(jVar.a);
        if (!jVar.c) {
            jVar.a.append(jVar.b);
        }
        jVar.a.append((Object) charSequence);
        jVar.c = false;
    }
}
