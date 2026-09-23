package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static AutofillValue b(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static void c(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void d(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void e(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void f(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void g(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void h(ViewStructure viewStructure) {
        viewStructure.setInputType(Token.DEFAULT);
    }
}
