package androidx.compose.foundation.contextmenu;

import androidx.compose.material3.g6;
import androidx.compose.material3.j6;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.r;
import androidx.compose.ui.window.c0;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ kotlin.d E;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ l(c0 c0Var, j6 j6Var, CoroutineScope coroutineScope, boolean z, a1 a1Var, androidx.compose.runtime.internal.f fVar, int i) {
        this.B = c0Var;
        this.C = j6Var;
        this.y = coroutineScope;
        this.z = z;
        this.D = a1Var;
        this.E = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                m.c((String) this.B, this.z, (d) this.C, (r) this.y, (q) this.D, (kotlin.jvm.functions.a) this.E, (s) obj, t.A(this.A | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g6.b((c0) this.B, (androidx.compose.runtime.internal.f) this.C, (j6) this.D, (r) this.y, this.z, (androidx.compose.runtime.internal.f) this.E, (s) obj, t.A(this.A | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.i.c((c0) this.B, (j6) this.C, (CoroutineScope) this.y, this.z, (a1) this.D, (androidx.compose.runtime.internal.f) this.E, (s) obj, t.A(this.A | 1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ l(c0 c0Var, androidx.compose.runtime.internal.f fVar, j6 j6Var, r rVar, boolean z, androidx.compose.runtime.internal.f fVar2, int i) {
        this.B = c0Var;
        this.C = fVar;
        this.D = j6Var;
        this.y = rVar;
        this.z = z;
        this.E = fVar2;
        this.A = i;
    }

    public /* synthetic */ l(String str, boolean z, d dVar, r rVar, q qVar, kotlin.jvm.functions.a aVar, int i) {
        this.B = str;
        this.z = z;
        this.C = dVar;
        this.y = rVar;
        this.D = qVar;
        this.E = aVar;
        this.A = i;
    }
}
