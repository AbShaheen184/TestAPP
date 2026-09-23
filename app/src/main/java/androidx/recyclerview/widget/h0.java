package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public SparseArray a;
    public int b;
    public Set c;

    public final g0 a(int i) {
        SparseArray sparseArray = this.a;
        g0 g0Var = (g0) sparseArray.get(i);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        sparseArray.put(i, g0Var2);
        return g0Var2;
    }
}
