package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final TextView a;
    public final com.google.firebase.heartbeatinfo.e b;

    public b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e(6);
        super(inputConnection, false);
        this.a = textView;
        this.b = eVar;
        if (androidx.emoji2.text.j.d()) {
            androidx.emoji2.text.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return com.google.firebase.heartbeatinfo.e.f(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return com.google.firebase.heartbeatinfo.e.f(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
