package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ue extends com.google.common.util.concurrent.r {
    public com.caverock.androidsvg.x1 E;
    public final int F;

    public ue(com.caverock.androidsvg.x1 x1Var, int i) {
        this.E = x1Var;
        this.F = i;
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        com.caverock.androidsvg.x1 x1Var = this.E;
        this.E = null;
        if (x1Var == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) x1Var.c;
        do {
            atomicLong = (AtomicLong) x1Var.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                ve veVar = (ve) atomicReference.get();
                if (veVar != null) {
                    if (veVar.E <= this.F) {
                        veVar.cancel(true);
                        while (!atomicReference.compareAndSet(veVar, null)) {
                            if (atomicReference.get() != veVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        com.google.common.util.concurrent.y yVar;
        com.caverock.androidsvg.x1 x1Var = this.E;
        if (x1Var == null || (yVar = (com.google.common.util.concurrent.y) ((rc) x1Var.a).y) == null) {
            return null;
        }
        String string = yVar.toString();
        String strM = androidx.compose.runtime.j.m(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        ve veVar = (ve) ((AtomicReference) this.E.c).get();
        if (veVar == null) {
            return strM;
        }
        int length = strM.length();
        String string2 = veVar.toString();
        return androidx.compose.runtime.j.n(new StringBuilder(string2.length() + length + 9 + 1), strM, ", trial=[", string2, "]");
    }
}
