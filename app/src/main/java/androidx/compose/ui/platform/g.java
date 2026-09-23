package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g1 {
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final void a(f1 f1Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (f1Var != null) {
            clipboardManager.setPrimaryClip(f1Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            y0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
