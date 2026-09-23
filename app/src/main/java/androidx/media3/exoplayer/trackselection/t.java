package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.c1;
import androidx.media3.exoplayer.h1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final h1[] b;
    public final q[] c;
    public final c1 d;
    public final Object e;

    public t(h1[] h1VarArr, q[] qVarArr, c1 c1Var, Object obj) {
        _COROUTINE.a.o(h1VarArr.length == qVarArr.length);
        this.b = h1VarArr;
        this.c = (q[]) qVarArr.clone();
        this.d = c1Var;
        this.e = obj;
        this.a = h1VarArr.length;
    }

    public final boolean a(t tVar, int i) {
        return tVar != null && Objects.equals(this.b[i], tVar.b[i]) && Objects.equals(this.c[i], tVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
