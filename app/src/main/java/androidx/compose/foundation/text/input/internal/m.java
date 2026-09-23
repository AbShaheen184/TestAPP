package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.ui.text.l0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                if (b1Var != null) {
                    r0 r0Var = b1Var.d;
                    if (r0Var != null) {
                        r0Var.e(l0.b);
                    }
                    r0 r0Var2 = b1Var.d;
                    if (r0Var2 != null) {
                        r0Var2.f(l0.b);
                    }
                }
                break;
            default:
                Job.DefaultImpls.cancel$default((Job) this.b, (CancellationException) null, 1, (Object) null);
                break;
        }
    }
}
