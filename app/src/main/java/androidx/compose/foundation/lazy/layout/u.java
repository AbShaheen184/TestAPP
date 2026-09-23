package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparator {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.appcompat.widget.x y;

    public /* synthetic */ u(androidx.appcompat.widget.x xVar, int i) {
        this.e = i;
        this.y = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Object key = ((e0) obj).getKey();
                androidx.appcompat.widget.x xVar = this.y;
                return kotlin.comparisons.a.d(Integer.valueOf(xVar.k(key)), Integer.valueOf(xVar.k(((e0) obj2).getKey())));
            case 1:
                Object key2 = ((e0) obj).getKey();
                androidx.appcompat.widget.x xVar2 = this.y;
                return kotlin.comparisons.a.d(Integer.valueOf(xVar2.k(key2)), Integer.valueOf(xVar2.k(((e0) obj2).getKey())));
            case 2:
                Object key3 = ((e0) obj2).getKey();
                androidx.appcompat.widget.x xVar3 = this.y;
                return kotlin.comparisons.a.d(Integer.valueOf(xVar3.k(key3)), Integer.valueOf(xVar3.k(((e0) obj).getKey())));
            default:
                Object key4 = ((e0) obj2).getKey();
                androidx.appcompat.widget.x xVar4 = this.y;
                return kotlin.comparisons.a.d(Integer.valueOf(xVar4.k(key4)), Integer.valueOf(xVar4.k(((e0) obj).getKey())));
        }
    }
}
