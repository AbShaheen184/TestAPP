package androidx.compose.ui.autofill;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final u a;
    public final m b;
    public final AutofillManager c;
    public final AutofillId d;

    public a(u uVar, m mVar) {
        this.a = uVar;
        this.b = mVar;
        AutofillManager autofillManager = (AutofillManager) uVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            kotlinx.coroutines.future.a.u("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        uVar.setImportantForAutofill(1);
        r rVarR = coil3.svg.internal.a.r(uVar);
        AutofillId autofillId = rVarR != null ? (AutofillId) rVarR.a : null;
        if (autofillId == null) {
            throw androidx.compose.runtime.j.a("Required value was null.");
        }
        this.d = autofillId;
    }
}
