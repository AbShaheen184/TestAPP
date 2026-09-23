package com.google.android.material.shape;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends coil3.svg.internal.a {
    public final int k;

    public h(int i) {
        this.k = i;
    }

    @Override // coil3.svg.internal.a
    public final void R(w wVar, float f) {
        i iVar = (i) wVar;
        float[] fArr = iVar.Y;
        if (fArr != null) {
            int i = this.k;
            if (fArr[i] != f) {
                fArr[i] = f;
                com.google.android.datatransport.runtime.scheduling.jobscheduling.j jVar = iVar.a0;
                if (jVar != null) {
                    float fH = iVar.h();
                    MaterialButton materialButton = (MaterialButton) jVar.y;
                    int i2 = (int) (fH * 0.11f);
                    if (materialButton.U != i2) {
                        materialButton.U = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }

    @Override // coil3.svg.internal.a
    public final float z(w wVar) {
        float[] fArr = ((i) wVar).Y;
        if (fArr != null) {
            return fArr[this.k];
        }
        return 0.0f;
    }
}
