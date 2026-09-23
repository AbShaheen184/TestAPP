package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.collection.y0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends _COROUTINE.b {
    public static final Class G;
    public static final Constructor H;
    public static final Method I;
    public static final Method J;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        H = constructor;
        G = cls;
        I = method2;
        J = method;
    }

    public static boolean K(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) I.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface L(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) G, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) J.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // _COROUTINE.b
    public final Typeface j(Context context, androidx.core.content.res.e eVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = H.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (androidx.core.content.res.f fVar : eVar.a) {
                int i2 = fVar.f;
                File fileQ = android.support.v4.media.session.b.q(context);
                if (fileQ != null) {
                    try {
                        if (android.support.v4.media.session.b.h(fileQ, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileQ);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            fileQ.delete();
                        } else {
                            fileQ.delete();
                        }
                        if (map != null && K(objNewInstance, map, fVar.e, fVar.b, fVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileQ.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return L(objNewInstance);
        }
        return null;
    }

    @Override // _COROUTINE.b
    public final Typeface k(Context context, androidx.core.provider.i[] iVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = H.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            y0 y0Var = new y0(0);
            for (androidx.core.provider.i iVar : iVarArr) {
                Uri uri = iVar.a;
                ByteBuffer byteBufferY = (ByteBuffer) y0Var.get(uri);
                if (byteBufferY == null) {
                    byteBufferY = android.support.v4.media.session.b.y(context, uri);
                    y0Var.put(uri, byteBufferY);
                }
                if (byteBufferY != null && K(objNewInstance, byteBufferY, iVar.b, iVar.c, iVar.d)) {
                }
            }
            Typeface typefaceL = L(objNewInstance);
            if (typefaceL != null) {
                return Typeface.create(typefaceL, i);
            }
        }
        return null;
    }
}
