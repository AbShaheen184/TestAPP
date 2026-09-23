package com.google.gson.internal.reflect;

import androidx.media3.exoplayer.source.t0;
import com.google.android.gms.dynamite.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final Method m = Class.class.getMethod("isRecord", null);
    public final Method n = Class.class.getMethod("getRecordComponents", null);
    public final Method o;
    public final Method p;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.o = cls.getMethod("getName", null);
        this.p = cls.getMethod("getType", null);
    }

    @Override // com.google.android.gms.dynamite.g
    public final boolean F(Class cls) {
        try {
            return ((Boolean) this.m.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            t0.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final Method r(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            t0.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final Constructor t(Class cls) {
        try {
            Object[] objArr = (Object[]) this.n.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.p.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            t0.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final String[] w(Class cls) {
        try {
            Object[] objArr = (Object[]) this.n.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.o.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            t0.j("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }
}
