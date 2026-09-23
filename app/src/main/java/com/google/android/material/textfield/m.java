package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.a;
        l lVar = nVar.S;
        if (nVar.P == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.P;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.P.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.P.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.P = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().l(nVar.P);
        nVar.j(nVar.b());
    }
}
