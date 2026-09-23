package androidx.window.layout.util;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {
    public static final f b = new f();
    public static final f c = new f();

    @Override // androidx.window.layout.util.g
    public androidx.window.layout.a a(ContextWrapper contextWrapper, e eVar) {
        eVar.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new androidx.window.layout.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // androidx.window.layout.util.e
    public float c(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
