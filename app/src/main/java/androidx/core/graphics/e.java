package androidx.core.graphics;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
