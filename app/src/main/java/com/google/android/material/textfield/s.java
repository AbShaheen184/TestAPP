package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends o {
    public final int e;
    public EditText f;
    public final androidx.media3.ui.h g;

    public s(n nVar, int i) {
        super(nVar);
        this.e = R.drawable.design_password_eye;
        this.g = new androidx.media3.ui.h(this, 9);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void b() {
        p();
    }

    @Override // com.google.android.material.textfield.o
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.o
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.o
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // com.google.android.material.textfield.o
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
