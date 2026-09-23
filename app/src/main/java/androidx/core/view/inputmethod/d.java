package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, y yVar) {
        super(inputConnection, false);
        this.a = yVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        com.google.firebase.platforminfo.d dVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            dVar = new com.google.firebase.platforminfo.d(new f(inputContentInfo));
        }
        if (this.a.i(dVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
