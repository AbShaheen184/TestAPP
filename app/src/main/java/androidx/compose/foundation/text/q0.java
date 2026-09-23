package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final q0 c = new q0(0, 127);
    public final int a;
    public final int b;

    public q0(int i, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        int i3 = (i2 & 8) != 0 ? -1 : 3;
        this.a = i;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && this.b == q0Var.b;
    }

    public final int hashCode() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) androidx.compose.ui.text.input.l.a(this.a)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.j.a(this.b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
