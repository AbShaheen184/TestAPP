package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.compose.foundation.text.input.internal.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {
    public final /* synthetic */ o a;

    public a(o oVar) {
        this.a = oVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.i(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.g(i);
    }
}
