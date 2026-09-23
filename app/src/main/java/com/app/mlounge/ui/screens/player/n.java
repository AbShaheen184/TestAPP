package com.app.mlounge.ui.screens.player;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ n(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String str;
        Object value;
        androidx.media3.exoplayer.c0 c0Var;
        switch (this.e) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                a1.l(this.y, f, null, null, 6);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                a1.l(this.y, null, num, null, 5);
                break;
            case 2:
                Integer num2 = (Integer) obj;
                num2.getClass();
                a1.l(this.y, null, null, num2, 3);
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                a1 a1Var = this.y;
                MutableStateFlow mutableStateFlow = a1Var.g;
                while (true) {
                    Object value2 = mutableStateFlow.getValue();
                    MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                    long j = jLongValue;
                    a1 a1Var2 = a1Var;
                    if (mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, j, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -262145, 7))) {
                        c1 c1Var = ((p0) mutableStateFlow2.getValue()).n;
                        if (c1Var != null && (str = ((p0) mutableStateFlow2.getValue()).t) != null) {
                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var2), null, null, new androidx.compose.foundation.d(str, j, a1Var2, c1Var, null, 5), 3, null);
                        }
                        return kotlin.y.a;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    jLongValue = j;
                    a1Var = a1Var2;
                }
                break;
            case 4:
                long jLongValue2 = ((Long) obj).longValue();
                a1 a1Var3 = this.y;
                androidx.media3.exoplayer.c0 c0Var2 = a1Var3.i;
                if (c0Var2 != null) {
                    c0Var2.G(jLongValue2);
                }
                Job job = a1Var3.l;
                kotlin.coroutines.d dVar = null;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                a1Var3.l = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var3), null, null, new x0(a1Var3, dVar, 1), 3, null);
                return kotlin.y.a;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                this.y.k(str2, true);
                return kotlin.y.a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                a1 a1Var4 = this.y;
                MutableStateFlow mutableStateFlow3 = a1Var4.g;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -9, 7)));
                if (zBooleanValue && (c0Var = a1Var4.i) != null) {
                    c0Var.G(((p0) mutableStateFlow3.getValue()).k);
                }
                androidx.media3.exoplayer.c0 c0Var3 = a1Var4.i;
                if (c0Var3 != null) {
                    c0Var3.M(true);
                }
                return kotlin.y.a;
            case 7:
                k0.a(this.y, (a) obj);
                return kotlin.y.a;
            case 8:
                c1 c1Var2 = (c1) obj;
                c1Var2.getClass();
                a1 a1Var5 = this.y;
                a1Var5.i(c1Var2);
                a1Var5.k("subtitle", false);
                return kotlin.y.a;
            default:
                this.y.j();
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }
}
