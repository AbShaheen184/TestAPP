package androidx.window.layout.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, e, g {
    public static final c c = new c(0);
    public static final c d = new c(1);
    public static final c e = new c(2);
    public static final c f = new c(3);
    public static final c g = new c(4);
    public final /* synthetic */ int b;

    public /* synthetic */ c(int i) {
        this.b = i;
    }

    @Override // androidx.window.layout.util.g
    public androidx.window.layout.a a(ContextWrapper contextWrapper, e eVar) {
        b bVar;
        eVar.getClass();
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            b.a.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                bVar = d.b;
            } else if (i >= 29) {
                bVar = e;
            } else {
                bVar = i >= 28 ? d : c;
            }
            return new androidx.window.layout.a(new androidx.window.core.a(bVar.b(activity)), eVar.c(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            kotlinx.coroutines.future.a.q("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new androidx.window.layout.a(new Rect(0, 0, point.x, point.y), eVar.c(contextWrapper));
    }

    @Override // androidx.window.layout.util.b
    public Rect b(Activity activity) throws Exception {
        DisplayCutout displayCutoutA;
        switch (this.b) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i2 = rect.right + dimensionPixelSize;
                        if (i2 == point.x) {
                            rect.right = i2;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    b.a.getClass();
                    Log.w(a.b, e2);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i3 = rect2.bottom + dimensionPixelSize2;
                    if (i3 == point2.y) {
                        rect2.bottom = i3;
                    } else {
                        int i4 = rect2.right + dimensionPixelSize2;
                        if (i4 == point2.x) {
                            rect2.right = i4;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode() && (displayCutoutA = androidx.arch.core.executor.d.a(defaultDisplay2)) != null) {
                    if (rect2.left == androidx.arch.core.executor.d.u(displayCutoutA)) {
                        rect2.left = 0;
                    }
                    if (point2.x - rect2.right == androidx.arch.core.executor.d.v(displayCutoutA)) {
                        rect2.right = androidx.arch.core.executor.d.v(displayCutoutA) + rect2.right;
                    }
                    if (rect2.top == androidx.arch.core.executor.d.w(displayCutoutA)) {
                        rect2.top = 0;
                    }
                    if (point2.y - rect2.bottom == androidx.arch.core.executor.d.t(displayCutoutA)) {
                        rect2.bottom = androidx.arch.core.executor.d.t(displayCutoutA) + rect2.bottom;
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object objInvoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    b.a.getClass();
                    Log.w(a.b, e3);
                    return d.b(activity);
                }
        }
    }

    @Override // androidx.window.layout.util.e
    public float c(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }
}
