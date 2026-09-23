package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.a1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ a1 z;

    public h0(CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar, a1 a1Var, a1 a1Var2, kotlin.jvm.functions.a aVar2, a1 a1Var3) {
        this.e = coroutineScope;
        this.y = aVar;
        this.z = a1Var;
        this.A = a1Var2;
        this.B = aVar2;
        this.C = a1Var3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66) {
            int action = keyEvent.getAction();
            a1 a1Var = this.C;
            a1 a1Var2 = this.z;
            a1 a1Var3 = this.A;
            if (action != 0) {
                if (action == 1) {
                    if (((Boolean) a1Var2.getValue()).booleanValue()) {
                        Boolean bool = Boolean.FALSE;
                        a1Var2.setValue(bool);
                        Job job = (Job) a1Var3.getValue();
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        a1Var3.setValue(null);
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            a1Var.setValue(bool);
                        } else {
                            this.y.invoke();
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                a1Var2.setValue(Boolean.TRUE);
                if (((Job) a1Var3.getValue()) == null) {
                    a1Var3.setValue(BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new androidx.room.coroutines.c0(this.B, a1Var, a1Var3, (kotlin.coroutines.d) null, 10), 3, null));
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
