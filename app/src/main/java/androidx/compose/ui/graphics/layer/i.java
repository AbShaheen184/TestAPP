package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets d(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean e(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean f(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean g(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void h(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | LibretroCore.SCREEN_WIDTH);
        window.setDecorFitsSystemWindows(z);
    }

    public static void i(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void j(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void k(Outline outline, androidx.compose.ui.graphics.j jVar) {
        if (jVar instanceof androidx.compose.ui.graphics.j) {
            outline.setPath(jVar.a);
        } else {
            com.google.firebase.platforminfo.b.n("Unable to obtain android.graphics.Path");
        }
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void m(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            androidx.media3.common.util.b.g("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
