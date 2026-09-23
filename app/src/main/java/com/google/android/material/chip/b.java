package com.google.android.material.chip;

import android.graphics.Typeface;
import coil3.network.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ b(Object obj, int i) {
        this.j = i;
        this.k = obj;
    }

    @Override // coil3.network.g
    public final void A(Typeface typeface, boolean z) {
        switch (this.j) {
            case 0:
                Chip chip = (Chip) this.k;
                e eVar = chip.B;
                chip.setText(eVar.i1 ? eVar.k0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    com.google.android.material.internal.g gVar = (com.google.android.material.internal.g) this.k;
                    gVar.d = true;
                    e eVar2 = (e) gVar.e.get();
                    if (eVar2 != null) {
                        eVar2.A();
                        eVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    @Override // coil3.network.g
    public final void z(int i) {
        switch (this.j) {
            case 0:
                break;
            default:
                com.google.android.material.internal.g gVar = (com.google.android.material.internal.g) this.k;
                gVar.d = true;
                e eVar = (e) gVar.e.get();
                if (eVar != null) {
                    eVar.A();
                    eVar.invalidateSelf();
                }
                break;
        }
    }

    private final void H(int i) {
    }
}
