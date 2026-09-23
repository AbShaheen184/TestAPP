package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {
    public final InputContentInfo e;

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.e = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // androidx.core.view.inputmethod.g
    public final ClipDescription a() {
        return this.e.getDescription();
    }

    @Override // androidx.core.view.inputmethod.g
    public final Uri e() {
        return this.e.getContentUri();
    }

    @Override // androidx.core.view.inputmethod.g
    public final void h() {
        this.e.requestPermission();
    }

    @Override // androidx.core.view.inputmethod.g
    public final Uri i() {
        return this.e.getLinkUri();
    }

    @Override // androidx.core.view.inputmethod.g
    public final Object m() {
        return this.e;
    }

    public f(Object obj) {
        this.e = (InputContentInfo) obj;
    }
}
