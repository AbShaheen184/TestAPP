package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final b0 a = new b0();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
