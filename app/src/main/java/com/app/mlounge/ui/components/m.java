package com.app.mlounge.ui.components;

import android.media.audiofx.Visualizer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ androidx.compose.runtime.snapshots.q a;

    public m(androidx.compose.runtime.snapshots.q qVar) {
        this.a = qVar;
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length / 2;
            double dLog10 = Math.log10(length);
            int i2 = 0;
            while (i2 < 48) {
                double d = 48;
                int i3 = length - 1;
                int iD = kotlin.collections.i0.d((int) Math.pow(10.0d, (((double) i2) * dLog10) / d), 0, i3);
                int i4 = i2 + 1;
                int iD2 = kotlin.collections.i0.d((int) Math.pow(10.0d, (((double) i4) * dLog10) / d), 0, i3);
                int i5 = 0;
                float fSqrt = 0.0f;
                if (iD <= iD2) {
                    while (true) {
                        int i6 = iD * 2;
                        byte b = bArr[i6];
                        byte b2 = bArr[i6 + 1];
                        fSqrt += (float) Math.sqrt((b2 * b2) + (b * b));
                        i5++;
                        if (iD == iD2) {
                            break;
                        } else {
                            iD++;
                        }
                    }
                }
                float fC = kotlin.collections.i0.c(((((i2 / 48) * 2.0f) + 1.0f) * (i5 > 0 ? fSqrt / i5 : 0.0f)) / 128.0f, 0.0f, 1.0f);
                androidx.compose.runtime.snapshots.q qVar = this.a;
                float fFloatValue = ((Number) qVar.get(i2)).floatValue();
                if (fC >= fFloatValue) {
                    qVar.set(i2, Float.valueOf(fC));
                } else {
                    qVar.set(i2, Float.valueOf(fFloatValue * 0.85f));
                }
                i2 = i4;
            }
        }
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }
}
