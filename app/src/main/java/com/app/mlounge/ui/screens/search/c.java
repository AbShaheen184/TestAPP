package com.app.mlounge.ui.screens.search;

import androidx.lifecycle.m0;
import com.app.mlounge.ui.viewmodel.a1;
import com.app.mlounge.ui.viewmodel.b1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ b1 y;
    public final /* synthetic */ int z;

    public /* synthetic */ c(b1 b1Var, int i, int i2) {
        this.e = i2;
        this.y = b1Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean zIsEmpty;
        switch (this.e) {
            case 0:
                b1 b1Var = this.y;
                MutableStateFlow mutableStateFlow = b1Var.H;
                int iIntValue = ((Number) mutableStateFlow.getValue()).intValue();
                int i = this.z;
                if (iIntValue != i) {
                    mutableStateFlow.setValue(Integer.valueOf(i));
                    String str = (String) b1Var.h.getValue();
                    if (str.length() >= 2 && ((Number) b1Var.F.getValue()).intValue() == 3) {
                        if (i != 0 ? i != 1 ? ((List) b1Var.z.getValue()).isEmpty() : ((List) b1Var.x.getValue()).isEmpty() : ((List) b1Var.v.getValue()).isEmpty()) {
                            Job job = b1Var.O;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                            }
                            b1Var.O = BuildersKt__Builders_commonKt.launch$default(m0.g(b1Var), null, null, new a1(b1Var, str, null, 1), 3, null);
                        }
                    }
                }
                break;
            default:
                b1 b1Var2 = this.y;
                MutableStateFlow mutableStateFlow2 = b1Var2.F;
                int iIntValue2 = ((Number) mutableStateFlow2.getValue()).intValue();
                int i2 = this.z;
                if (iIntValue2 != i2) {
                    mutableStateFlow2.setValue(Integer.valueOf(i2));
                    String str2 = (String) b1Var2.h.getValue();
                    if (str2.length() >= 2) {
                        switch (i2) {
                            case 0:
                                zIsEmpty = ((List) b1Var2.j.getValue()).isEmpty();
                                break;
                            case 1:
                                zIsEmpty = ((List) b1Var2.l.getValue()).isEmpty();
                                break;
                            case 2:
                                zIsEmpty = ((List) b1Var2.n.getValue()).isEmpty();
                                break;
                            case 3:
                                int iIntValue3 = ((Number) b1Var2.H.getValue()).intValue();
                                if (iIntValue3 == 0) {
                                    zIsEmpty = ((List) b1Var2.v.getValue()).isEmpty();
                                } else if (iIntValue3 == 1) {
                                    zIsEmpty = ((List) b1Var2.x.getValue()).isEmpty();
                                } else {
                                    zIsEmpty = ((List) b1Var2.z.getValue()).isEmpty();
                                }
                                break;
                            case 4:
                                zIsEmpty = ((List) b1Var2.p.getValue()).isEmpty();
                                break;
                            case 5:
                                zIsEmpty = ((List) b1Var2.r.getValue()).isEmpty();
                                break;
                            case 6:
                                zIsEmpty = ((List) b1Var2.t.getValue()).isEmpty();
                                break;
                            default:
                                zIsEmpty = true;
                                break;
                        }
                        if (zIsEmpty) {
                            Job job2 = b1Var2.O;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                            }
                            b1Var2.O = BuildersKt__Builders_commonKt.launch$default(m0.g(b1Var2), null, null, new a1(b1Var2, str2, null, 4), 3, null);
                        }
                    }
                }
                break;
        }
        return y.a;
    }
}
