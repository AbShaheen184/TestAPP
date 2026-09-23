package androidx.compose.ui.window;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {
    @Override // androidx.compose.ui.window.b0
    public final void a(z zVar, int i, int i2) {
        zVar.setSystemGestureExclusionRects(kotlin.collections.q.l(new Rect(0, 0, i, i2)));
    }
}
