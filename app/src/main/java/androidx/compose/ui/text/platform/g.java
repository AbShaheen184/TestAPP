package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.m;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ClickableSpan {
    public final m e;

    public g(m mVar) {
        this.e = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.getClass();
    }
}
