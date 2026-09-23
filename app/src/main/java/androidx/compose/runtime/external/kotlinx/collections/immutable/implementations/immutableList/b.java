package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Collection y;

    public /* synthetic */ b(int i, Collection collection) {
        this.e = i;
        this.y = collection;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.e) {
            case 0:
                zContains = this.y.contains(obj);
                break;
            case 1:
                zContains = this.y.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.y);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
