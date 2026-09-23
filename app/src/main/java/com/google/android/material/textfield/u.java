package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements TextWatcher {
    public int e;
    public final /* synthetic */ EditText y;
    public final /* synthetic */ TextInputLayout z;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.z = textInputLayout;
        this.y = editText;
        this.e = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.z;
        textInputLayout.w(!textInputLayout.Y0, false);
        if (textInputLayout.I) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.Q) {
            textInputLayout.x(editable);
        }
        EditText editText = this.y;
        int lineCount = editText.getLineCount();
        int i = this.e;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.R0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.e = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
