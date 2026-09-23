package androidx.arch.core.executor;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.compose.foundation.text.selection.x;
import coil3.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void A(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void B(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void C(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean D(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static final DisplayCutout a(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            androidx.window.layout.util.b.a.getClass();
            Log.w(androidx.window.layout.util.a.b, e);
            return null;
        }
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap d(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static TextClassifier e(Context context, x xVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = xVar.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                g.a();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] g(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Network h(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static int i(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String j(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params p(l0 l0Var) {
        return l0Var.getTextMetricsParams();
    }

    public static int q(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri r(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void s(View view) {
        view.resetPivot();
    }

    public static int t(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int u(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void x(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void y(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void z(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }
}
