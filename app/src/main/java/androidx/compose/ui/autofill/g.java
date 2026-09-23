package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements q {
    public final AutofillValue a;

    public g(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Boolean a() {
        if (this.a.isToggle()) {
            return Boolean.valueOf(this.a.getToggleValue());
        }
        return null;
    }

    public final CharSequence b() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
