package com.google.common.util.concurrent;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends _COROUTINE.a {
    @Override // _COROUTINE.a
    public final void C(c0 c0Var, Set set) {
        synchronized (c0Var) {
            try {
                if (c0Var.E == null) {
                    c0Var.E = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // _COROUTINE.a
    public final int G(c0 c0Var) {
        int i;
        synchronized (c0Var) {
            i = c0Var.F - 1;
            c0Var.F = i;
        }
        return i;
    }
}
