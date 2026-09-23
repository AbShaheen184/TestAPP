package androidx.compose.foundation.text;

import androidx.compose.material3.a2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(long j, androidx.compose.material3.tokens.d0 d0Var, kotlin.jvm.functions.p pVar, int i) {
        this.y = j;
        this.z = d0Var;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(1);
                d.a((androidx.compose.foundation.text.selection.m) this.z, (androidx.compose.ui.r) this.A, this.y, (androidx.compose.runtime.s) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.t.A(49);
                a2.c(this.y, (androidx.compose.material3.tokens.d0) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.s) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = androidx.compose.runtime.t.A(7);
                com.app.mlounge.ui.components.b0.l((String) this.z, this.y, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, iA3);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b(androidx.compose.foundation.text.selection.m mVar, androidx.compose.ui.r rVar, long j, int i) {
        this.z = mVar;
        this.A = rVar;
        this.y = j;
    }

    public /* synthetic */ b(String str, long j, kotlin.jvm.functions.a aVar, int i) {
        this.z = str;
        this.y = j;
        this.A = aVar;
    }
}
