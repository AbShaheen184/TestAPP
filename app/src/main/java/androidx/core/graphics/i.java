package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class i extends g {
    public final Class L;
    public final Constructor M;
    public final Method N;
    public final Method O;
    public final Method P;
    public final Method Q;
    public final Method R;

    public i() throws NoSuchMethodException {
        Method methodQ;
        Constructor<?> constructor;
        Method methodP;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodP = P(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodQ = Q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodQ = null;
            constructor = null;
            methodP = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.L = cls;
        this.M = constructor;
        this.N = methodP;
        this.O = method;
        this.P = method2;
        this.Q = method3;
        this.R = methodQ;
    }

    public static Method P(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean M(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.N.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.L, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.R.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.P.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Q(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.g, _COROUTINE.b
    public final Typeface j(Context context, androidx.core.content.res.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.N;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, eVar, resources, i);
        }
        try {
            objNewInstance = this.M.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            androidx.core.content.res.f[] fVarArr = eVar.a;
            int length = fVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                androidx.core.content.res.f fVar = fVarArr[i2];
                Context context2 = context;
                if (M(context2, objNewInstance, fVar.a, fVar.e, fVar.b, fVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                    i2++;
                    context = context2;
                } else {
                    try {
                        this.Q.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (O(objNewInstance)) {
                return N(objNewInstance);
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.g, _COROUTINE.b
    public final Typeface k(Context context, androidx.core.provider.i[] iVarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceN;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.N;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (androidx.core.provider.i iVar : iVarArr) {
                        if (iVar.f == 0) {
                            Uri uri = iVar.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, android.support.v4.media.session.b.y(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.M.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = iVarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.Q;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!O(objNewInstance) || (typefaceN = N(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceN, i);
                            }
                            androidx.core.provider.i iVar2 = iVarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.O.invoke(objNewInstance, byteBuffer, Integer.valueOf(iVar2.b), null, Integer.valueOf(iVar2.c), Integer.valueOf(iVar2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    androidx.core.provider.i iVarP = _COROUTINE.b.p(iVarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarP.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarP.c).setItalic(iVarP.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // _COROUTINE.b
    public final Typeface m(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.N;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.M.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!M(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.Q.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (O(objNewInstance)) {
                return N(objNewInstance);
            }
        }
        return null;
    }
}
