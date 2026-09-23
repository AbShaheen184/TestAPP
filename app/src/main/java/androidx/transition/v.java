package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class v extends _COROUTINE.a {
    public static boolean m = true;
    public static boolean n = true;
    public static boolean o = true;
    public static boolean p = true;

    public void d0(View view, int i, int i2, int i3, int i4) {
        if (o) {
            try {
                androidx.compose.ui.platform.coreshims.b.x(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                o = false;
            }
        }
    }

    public void e0(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (p) {
                try {
                    androidx.compose.ui.platform.coreshims.b.z(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    p = false;
                    return;
                }
            }
            return;
        }
        if (!_COROUTINE.a.j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                _COROUTINE.a.i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            _COROUTINE.a.j = true;
        }
        Field field = _COROUTINE.a.i;
        if (field != null) {
            try {
                _COROUTINE.a.i.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void f0(View view, Matrix matrix) {
        if (m) {
            try {
                androidx.compose.ui.platform.coreshims.b.F(view, matrix);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public void g0(ViewGroup viewGroup, Matrix matrix) {
        if (n) {
            try {
                androidx.compose.ui.platform.coreshims.b.G(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }
}
