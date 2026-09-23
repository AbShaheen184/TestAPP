package com.google.android.material.textfield;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.android.material.internal.h {
    public final /* synthetic */ n e;

    public l(n nVar) {
        this.e = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.e.b().a();
    }

    @Override // com.google.android.material.internal.h, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e.b().b();
    }
}
