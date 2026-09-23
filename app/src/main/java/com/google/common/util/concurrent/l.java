package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(Unsafe unsafe, r rVar, long j, q qVar, q qVar2) {
        while (!unsafe.compareAndSwapObject(rVar, j, qVar, qVar2)) {
            if (unsafe.getObject(rVar, j) != qVar) {
                return false;
            }
        }
        return true;
    }
}
