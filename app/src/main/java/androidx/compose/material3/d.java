package androidx.compose.material3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ d(int i, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, com.app.mlounge.ui.viewmodel.k0 k0Var, int i2) {
        this.e = 6;
        this.z = i;
        this.A = aVar;
        this.B = lVar;
        this.C = lVar2;
        this.y = k0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                j.d((kotlin.jvm.functions.a) this.A, (androidx.compose.ui.r) this.B, (androidx.compose.ui.window.w) this.C, (androidx.compose.runtime.internal.f) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.internal.i.a((androidx.compose.ui.window.c0) this.A, (androidx.compose.runtime.internal.f) this.y, (j6) this.B, (androidx.compose.runtime.internal.f) this.C, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.y).i(this.A, this.B, this.C, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z) | 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                _COROUTINE.a.a((Boolean) this.A, this.B, (androidx.lifecycle.v) this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.components.b0.k((String) this.A, (ArrayList) this.B, this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.b((String) this.A, (ArrayList) this.B, (String) this.C, (kotlin.jvm.functions.l) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(1);
                com.app.mlounge.ui.screens.person.a.a(this.z, (kotlin.jvm.functions.a) this.A, (kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.l) this.C, (com.app.mlounge.ui.viewmodel.k0) this.y, (androidx.compose.runtime.s) obj, iA);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ d(androidx.compose.runtime.internal.f fVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = 2;
        this.y = fVar;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = i;
    }

    public /* synthetic */ d(androidx.compose.ui.window.c0 c0Var, androidx.compose.runtime.internal.f fVar, j6 j6Var, androidx.compose.runtime.internal.f fVar2, int i) {
        this.e = 1;
        this.A = c0Var;
        this.y = fVar;
        this.B = j6Var;
        this.C = fVar2;
        this.z = i;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, kotlin.d dVar, int i, int i2) {
        this.e = i2;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.y = dVar;
        this.z = i;
    }
}
