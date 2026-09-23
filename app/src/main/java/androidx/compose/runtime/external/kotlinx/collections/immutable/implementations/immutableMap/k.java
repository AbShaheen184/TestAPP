package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.s2;
import androidx.core.view.d0;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.i0;
import kotlin.collections.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.collections.a {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ k(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.e) {
            case 0:
                b bVar = (b) this.y;
                bVar.getClass();
                return bVar.y;
            default:
                return ((kotlin.text.g) this.y).a.groupCount() + 1;
        }
    }

    public kotlin.text.f c(int i) {
        Matcher matcher = ((kotlin.text.g) this.y).a;
        kotlin.ranges.d dVarN = i0.n(matcher.start(i), matcher.end(i));
        if (dVarN.e < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new kotlin.text.f(strGroup, dVarN);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return ((b) this.y).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof kotlin.text.f) {
                    return super.contains((kotlin.text.f) obj);
                }
                return false;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                m mVar = ((b) this.y).e;
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(2);
                }
                return new j(mVar, nVarArr);
            default:
                return new d0(new kotlin.sequences.n(new u(new kotlin.ranges.d(0, size() - 1, 1), 0), new s2(this, 27), 1));
        }
    }
}
