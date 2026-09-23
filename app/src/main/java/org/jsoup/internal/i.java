package org.jsoup.internal;

import java.util.function.BinaryOperator;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements BinaryOperator {
    public final /* synthetic */ int e;

    public /* synthetic */ i(int i) {
        this.e = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                String strL = k.l(jVar2.a);
                jVar2.a = null;
                n.D(jVar.a);
                jVar.a.append((Object) strL);
                return jVar;
            default:
                return (String) obj2;
        }
    }
}
