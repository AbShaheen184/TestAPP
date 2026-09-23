package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final f0 a = new f0();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(e0.a);
    }
}
