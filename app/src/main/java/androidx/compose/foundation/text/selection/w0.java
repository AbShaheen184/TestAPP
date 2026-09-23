package androidx.compose.foundation.text.selection;

import com.app.mlounge.MainActivity;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Object obj, boolean z, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.z = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w0((b1) this.A, this.z, dVar, 0);
            case 1:
                return new w0((MainActivity) this.A, this.z, dVar, 1);
            default:
                return new w0((com.app.mlounge.ui.viewmodel.k) this.A, this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((w0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.text.g gVarQ;
        androidx.compose.ui.platform.g1 g1Var;
        switch (this.e) {
            case 0:
                b1 b1Var = (b1) this.A;
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                if (androidx.compose.ui.text.l0.c(b1Var.n().b) || (b1Var.f instanceof androidx.compose.ui.text.input.r)) {
                    gVarQ = null;
                } else {
                    gVarQ = com.imsdk.a.q(b1Var.n());
                    if (this.z) {
                        int iE = androidx.compose.ui.text.l0.e(b1Var.n().b);
                        b1Var.c.invoke(b1.e(b1Var.n().a, androidx.compose.ui.text.d0.b(iE, iE)));
                        b1Var.q(androidx.compose.foundation.text.g0.e);
                    }
                }
                if (gVarQ == null || (g1Var = b1Var.h) == null) {
                    return yVar;
                }
                androidx.compose.ui.platform.f1 f1VarA = androidx.compose.foundation.internal.d.a(gVarQ);
                this.y = 1;
                ((androidx.compose.ui.platform.g) g1Var).a(f1VarA);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return yVar == aVar ? aVar : yVar;
            case 1:
                MainActivity mainActivity = (MainActivity) this.A;
                int i2 = this.y;
                kotlin.y yVar2 = kotlin.y.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return yVar2;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowB = ((androidx.datastore.preferences.core.c) z1.a(mainActivity)).a.b();
                androidx.compose.foundation.text.input.internal.a aVar2 = new androidx.compose.foundation.text.input.internal.a(mainActivity, 3);
                this.y = 1;
                Object objCollect = flowB.collect(new com.app.mlounge.p(aVar2, this.z), this);
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (objCollect != aVar3) {
                    objCollect = yVar2;
                }
                return objCollect == aVar3 ? aVar3 : yVar2;
            default:
                int i3 = this.y;
                kotlin.y yVar3 = kotlin.y.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return yVar3;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                y1 y1Var = ((com.app.mlounge.ui.viewmodel.k) this.A).b;
                this.y = 1;
                Object objH = _COROUTINE.a.H(z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.b(this.z, null, 4), this);
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                if (objH != aVar4) {
                    objH = yVar3;
                }
                return objH == aVar4 ? aVar4 : yVar3;
        }
    }
}
