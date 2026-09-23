package com.google.gson.internal.reflect;

import com.google.android.gms.dynamite.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    @Override // com.google.android.gms.dynamite.g
    public final boolean F(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.dynamite.g
    public final Method r(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // com.google.android.gms.dynamite.g
    public final Constructor t(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // com.google.android.gms.dynamite.g
    public final String[] w(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
