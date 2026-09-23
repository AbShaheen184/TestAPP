package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo contentInfoF = fVar.a.f();
        Objects.requireNonNull(contentInfoF);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoF ? fVar : new f(new androidx.compose.ui.scrollcapture.h(contentInfoPerformReceiveContent));
    }
}
