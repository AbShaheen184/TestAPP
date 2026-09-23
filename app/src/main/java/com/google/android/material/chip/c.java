package com.google.android.material.chip;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public c(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        e eVar = this.a.B;
        if (eVar != null) {
            eVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
