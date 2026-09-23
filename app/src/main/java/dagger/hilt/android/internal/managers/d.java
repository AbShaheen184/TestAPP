package dagger.hilt.android.internal.managers;

import androidx.lifecycle.s0;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends s0 {
    public final com.app.mlounge.f b;
    public final androidx.core.text.f c;

    public d(com.app.mlounge.f fVar, androidx.core.text.f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    @Override // androidx.lifecycle.s0
    public final void d() {
        ((dagger.hilt.android.internal.lifecycle.g) ((com.app.mlounge.f) ((e) n.r(this.b, e.class))).c.get()).a();
    }
}
