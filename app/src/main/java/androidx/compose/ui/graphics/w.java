package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final ColorSpace a(androidx.compose.ui.graphics.colorspace.c cVar) {
        if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
