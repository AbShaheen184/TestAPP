package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class g extends _COROUTINE.b {
    public static Class G = null;
    public static Constructor H = null;
    public static Method I = null;
    public static Method J = null;
    public static boolean K = false;

    public static boolean K(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        L();
        try {
            return ((Boolean) I.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            kotlinx.coroutines.future.a.l(e);
            return false;
        }
    }

    public static void L() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (K) {
            return;
        }
        K = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        H = constructor;
        G = cls;
        I = method2;
        J = method;
    }

    @Override // _COROUTINE.b
    public Typeface j(Context context, androidx.core.content.res.e eVar, Resources resources, int i) throws NoSuchMethodException {
        L();
        try {
            Object objNewInstance = H.newInstance(null);
            for (androidx.core.content.res.f fVar : eVar.a) {
                File fileQ = android.support.v4.media.session.b.q(context);
                if (fileQ == null) {
                    return null;
                }
                try {
                    if (!android.support.v4.media.session.b.h(fileQ, resources, fVar.f)) {
                        return null;
                    }
                    if (!K(objNewInstance, fileQ.getPath(), fVar.b, fVar.c)) {
                        return null;
                    }
                    fileQ.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileQ.delete();
                }
            }
            L();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) G, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) J.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                kotlinx.coroutines.future.a.l(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            kotlinx.coroutines.future.a.l(e2);
            return null;
        }
    }

    @Override // _COROUTINE.b
    public Typeface k(Context context, androidx.core.provider.i[] iVarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(_COROUTINE.b.p(iVarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile2;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            File fileQ = android.support.v4.media.session.b.q(context);
                            if (fileQ == null) {
                                typefaceCreateFromFile = null;
                            } else {
                                try {
                                    if (android.support.v4.media.session.b.i(fileQ, fileInputStream)) {
                                        typefaceCreateFromFile = Typeface.createFromFile(fileQ.getPath());
                                        fileQ.delete();
                                    } else {
                                        fileQ.delete();
                                        typefaceCreateFromFile = null;
                                    }
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    fileQ.delete();
                                    throw th;
                                }
                            }
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
