package androidx.window.layout.util;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b, g {
    public static final d b = new d();
    public static final d c = new d();

    @Override // androidx.window.layout.util.g
    public androidx.window.layout.a a(ContextWrapper contextWrapper, e eVar) {
        eVar.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new androidx.window.layout.a(bounds, f);
    }

    @Override // androidx.window.layout.util.b
    public Rect b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
