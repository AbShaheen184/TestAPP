package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final g0 a = new g0();

    public final void a(View view, androidx.compose.ui.input.pointer.s sVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = sVar instanceof androidx.compose.ui.input.pointer.a ? PointerIcon.getSystemIcon(context, ((androidx.compose.ui.input.pointer.a) sVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.l.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
