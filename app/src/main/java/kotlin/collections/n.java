package kotlin.collections;

import androidx.collection.b1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ n(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                Object[] objArr = (Object[]) this.y;
                objArr.getClass();
                return new b1(objArr);
            case 1:
                Object[] objArr2 = (Object[]) ((androidx.navigation.internal.h) this.y).y;
                objArr2.getClass();
                return new a0(new b1(objArr2));
            default:
                return new kotlin.text.b((kotlin.text.c) this.y);
        }
    }
}
