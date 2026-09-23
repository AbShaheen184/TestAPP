package com.app.mlounge.ui.components;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.runtime.a1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ kotlin.jvm.functions.a D;
    public final /* synthetic */ String e;
    public final /* synthetic */ CoroutineScope y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public i0(String str, CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar, a1 a1Var, a1 a1Var2, a1 a1Var3, kotlin.jvm.functions.a aVar2) {
        this.e = str;
        this.y = coroutineScope;
        this.z = aVar;
        this.A = a1Var;
        this.B = a1Var2;
        this.C = a1Var3;
        this.D = aVar2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        a1 a1Var = this.C;
        String str = this.e;
        a1 a1Var2 = this.B;
        a1 a1Var3 = this.A;
        keyEvent.getClass();
        boolean z = false;
        if (keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (str != null) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", str, "KEY_DOWN repeat=" + keyEvent.getRepeatCount() + " keyDownReceived=" + ((Boolean) a1Var3.getValue()).booleanValue() + " longClickFired=" + ((Boolean) a1Var2.getValue()).booleanValue());
                }
                if (keyEvent.getRepeatCount() == 0) {
                    a1Var3.setValue(Boolean.TRUE);
                    if (((Job) a1Var.getValue()) == null) {
                        a1 a1Var4 = this.C;
                        a1Var4.setValue(BuildersKt__Builders_commonKt.launch$default(this.y, null, null, new androidx.compose.animation.core.f(this.e, this.D, this.B, a1Var4, null, 15), 3, null));
                    }
                }
            } else if (action == 1) {
                if (str != null) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", str, "KEY_UP keyDownReceived=" + ((Boolean) a1Var3.getValue()).booleanValue() + " longClickFired=" + ((Boolean) a1Var2.getValue()).booleanValue());
                }
                if (((Boolean) a1Var3.getValue()).booleanValue()) {
                    Boolean bool = Boolean.FALSE;
                    a1Var3.setValue(bool);
                    Job job = (Job) a1Var.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    a1Var.setValue(null);
                    if (((Boolean) a1Var2.getValue()).booleanValue()) {
                        if (str != null) {
                            Context context3 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", str, "KEY_UP swallowed after long-press");
                        }
                        a1Var2.setValue(bool);
                    } else {
                        if (str != null) {
                            Context context4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("D", str, "KEY_UP dispatching onClick");
                        }
                        this.z.invoke();
                    }
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
