package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    @Override // androidx.compose.ui.text.input.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        androidx.compose.foundation.text.input.internal.x xVar = this.b;
        if (xVar != null) {
            return xVar.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
