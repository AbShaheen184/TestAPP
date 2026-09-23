package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(rVar, j, obj, obj2)) {
            if (unsafe.getObject(rVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
