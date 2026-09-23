package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(n nVar, int i) {
        super(nVar);
        this.e = i;
    }

    @Override // com.google.android.material.textfield.o
    public void q() {
        switch (this.e) {
            case 0:
                n nVar = this.b;
                nVar.L = null;
                CheckableImageButton checkableImageButton = nVar.D;
                checkableImageButton.setOnLongClickListener(null);
                t1.A(checkableImageButton, null);
                break;
        }
    }
}
