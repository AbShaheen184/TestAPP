package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.m1;
import androidx.compose.foundation.o1;
import androidx.compose.foundation.text.contextmenu.internal.h;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public final androidx.compose.runtime.internal.f a;
    public final o1 b = new o1();
    public final j1 c = t.r(null);

    public c(androidx.compose.runtime.internal.f fVar) {
        this.a = fVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.f
    public final Object a(e eVar, i iVar) {
        h hVar = new h(this, new b(eVar), null, 1);
        o1 o1Var = this.b;
        o1Var.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new m1(androidx.compose.foundation.j1.e, o1Var, hVar, null), iVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public final void b(final kotlin.jvm.functions.a aVar, s sVar, final int i) {
        final kotlin.jvm.functions.a aVar2;
        s sVar2;
        sVar.c0(723898654);
        int i2 = (sVar.f(this) ? 32 : 16) | i;
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            b bVar = (b) this.c.getValue();
            if (bVar == null) {
                s1 s1VarT = sVar.t();
                if (s1VarT != null) {
                    final int i3 = 0;
                    s1VarT.d = new p(this, aVar, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.a
                        public final /* synthetic */ int e;
                        public final /* synthetic */ c y;
                        public final /* synthetic */ kotlin.jvm.functions.a z;

                        {
                            this.e = i3;
                            this.y = this;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.e;
                            s sVar3 = (s) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.y.b(this.z, sVar3, t.A(7));
                                    break;
                                default:
                                    this.y.b(this.z, sVar3, t.A(7));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            sVar2 = sVar;
            this.a.d(bVar, bVar.a, aVar2, sVar2, 384);
        } else {
            aVar2 = aVar;
            sVar2 = sVar;
            sVar2.W();
        }
        s1 s1VarT2 = sVar2.t();
        if (s1VarT2 != null) {
            final int i4 = 1;
            s1VarT2.d = new p(this, aVar2, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.a
                public final /* synthetic */ int e;
                public final /* synthetic */ c y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                {
                    this.e = i4;
                    this.y = this;
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.e;
                    s sVar3 = (s) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.y.b(this.z, sVar3, t.A(7));
                            break;
                        default:
                            this.y.b(this.z, sVar3, t.A(7));
                            break;
                    }
                    return y.a;
                }
            };
        }
    }
}
