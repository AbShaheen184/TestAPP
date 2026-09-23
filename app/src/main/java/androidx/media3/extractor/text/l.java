package androidx.media3.extractor.text;

import androidx.activity.y;
import com.google.common.collect.d0;
import com.google.common.collect.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    int B();

    void j(byte[] bArr, int i, int i2, k kVar, androidx.media3.common.util.h hVar);

    default d o(byte[] bArr, int i, int i2) {
        d0 d0VarK = h0.k();
        j(bArr, 0, i2, k.c, new y(d0VarK, 22));
        return new b(d0VarK.g());
    }

    default void reset() {
    }
}
