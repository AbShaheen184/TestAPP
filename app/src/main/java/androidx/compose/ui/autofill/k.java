package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AutofillManager$AutofillCallback {
    public static final k a = new k();

    public final void a(a aVar) {
        aVar.c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i, int i2) {
        String str;
        super.onAutofillEvent(view, i, i2);
        if (i2 == 1) {
            str = "Autofill popup was shown.";
        } else if (i2 != 2) {
            str = i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
