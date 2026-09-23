package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.lazy.layout.y;
import androidx.compose.foundation.text.contextmenu.internal.n;
import androidx.compose.material3.j6;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.r;
import androidx.lifecycle.v;
import com.app.mlounge.ui.screens.settings.e0;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j(d dVar, r rVar, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 1;
        this.y = dVar;
        this.z = rVar;
        this.B = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                m.b((r) this.z, (d) this.y, (kotlin.jvm.functions.l) this.B, (s) obj, t.A(1), this.A);
                break;
            case 1:
                ((Integer) obj2).getClass();
                m.a((d) this.y, (r) this.z, (androidx.compose.runtime.internal.f) this.B, (s) obj, t.A(this.A | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA = t.A(1);
                androidx.compose.foundation.lazy.layout.m.d((y) this.z, this.y, this.A, this.B, (s) obj, iA);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA2 = t.A(this.A | 1);
                ((w0) this.z).e(this.y, (androidx.compose.runtime.internal.f) this.B, (s) obj, iA2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                n.c((androidx.compose.foundation.text.contextmenu.data.g) this.z, (androidx.compose.foundation.text.contextmenu.provider.e) this.y, (kotlin.jvm.functions.a) this.B, (s) obj, t.A(this.A | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.google.firebase.b.b((r) this.z, (r1) this.y, (androidx.compose.runtime.internal.f) this.B, (s) obj, t.A(this.A | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                kotlin.math.a.a((androidx.compose.foundation.text.selection.m) this.z, (androidx.compose.ui.e) this.y, (androidx.compose.runtime.internal.f) this.B, (s) obj, t.A(this.A | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.i.d((j6) this.z, (a1) this.y, (androidx.compose.runtime.internal.f) this.B, (s) obj, t.A(this.A | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iA3 = t.A(this.A) | 1;
                ((androidx.compose.runtime.internal.f) this.z).h(this.y, this.B, (s) obj, iA3);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iA4 = t.A(this.A | 1);
                ((androidx.compose.runtime.saveable.e) this.z).e(this.y, (androidx.compose.runtime.internal.f) this.B, (s) obj, iA4);
                break;
            case 10:
                ((Integer) obj2).intValue();
                _COROUTINE.a.b((v) this.z, (androidx.lifecycle.compose.b) this.y, (kotlin.jvm.functions.l) this.B, (s) obj, t.A(this.A | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e0.j((String) this.z, (androidx.compose.ui.graphics.vector.f) this.y, (kotlin.jvm.functions.a) this.B, (s) obj, t.A(this.A | 1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j(y yVar, Object obj, int i, Object obj2, int i2) {
        this.e = 2;
        this.z = yVar;
        this.y = obj;
        this.A = i;
        this.B = obj2;
    }

    public /* synthetic */ j(j6 j6Var, a1 a1Var, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 7;
        this.z = j6Var;
        this.y = a1Var;
        this.B = fVar;
        this.A = i;
    }

    public /* synthetic */ j(r rVar, d dVar, kotlin.jvm.functions.l lVar, int i, int i2) {
        this.e = 0;
        this.z = rVar;
        this.y = dVar;
        this.B = lVar;
        this.A = i2;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = obj2;
        this.B = obj3;
        this.A = i;
    }
}
