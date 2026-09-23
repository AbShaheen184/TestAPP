package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ AtomicReference y;
    public final /* synthetic */ s2 z;

    public l2(s2 s2Var, AtomicReference atomicReference, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = atomicReference;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
            case 2:
                this.y = atomicReference;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
            case 3:
                this.y = atomicReference;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
            case 4:
                this.y = atomicReference;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
            default:
                this.y = atomicReference;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.y;
        synchronized (atomicReference) {
            try {
                try {
                    p1 p1Var = (p1) this.z.e;
                    atomicReference.set(Double.valueOf(p1Var.A.F(p1Var.r().B(), f0.e0)));
                    this.y.notify();
                } catch (Throwable th) {
                    this.y.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                AtomicReference atomicReference = this.y;
                synchronized (atomicReference) {
                    try {
                        try {
                            p1 p1Var = (p1) this.z.e;
                            atomicReference.set(Boolean.valueOf(p1Var.A.G(p1Var.r().B(), f0.a0)));
                            this.y.notify();
                        } catch (Throwable th) {
                            this.y.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p1 p1Var2 = (p1) this.z.e;
                            atomicReference2.set(p1Var2.A.C(p1Var2.r().B(), f0.b0));
                            this.y.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.y.notify();
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.y;
                synchronized (atomicReference3) {
                    try {
                        try {
                            p1 p1Var3 = (p1) this.z.e;
                            atomicReference3.set(Long.valueOf(p1Var3.A.D(p1Var3.r().B(), f0.c0)));
                            this.y.notify();
                        } catch (Throwable th5) {
                            this.y.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.y;
                synchronized (atomicReference4) {
                    try {
                        try {
                            p1 p1Var4 = (p1) this.z.e;
                            atomicReference4.set(Integer.valueOf(p1Var4.A.E(p1Var4.r().B(), f0.d0)));
                            this.y.notify();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        this.y.notify();
                        throw th8;
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                s2 s2Var = this.z;
                d1 d1Var = ((p1) s2Var.e).B;
                p1.k(d1Var);
                Bundle bundleJ = d1Var.K.J();
                m3 m3VarP = ((p1) s2Var.e).p();
                AtomicReference atomicReference5 = this.y;
                m3VarP.v();
                m3VarP.w();
                m3VarP.J(new androidx.appcompat.view.menu.e(m3VarP, atomicReference5, m3VarP.L(false), bundleJ, 8, false));
                return;
            default:
                m3 m3VarP2 = ((p1) this.z.e).p();
                c4 c4VarD = c4.d(z2.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.y;
                m3VarP2.v();
                m3VarP2.w();
                m3VarP2.J(new androidx.appcompat.view.menu.e(m3VarP2, atomicReference6, m3VarP2.L(false), c4VarD, 9, false));
                return;
        }
    }

    public /* synthetic */ l2(s2 s2Var, AtomicReference atomicReference, int i, boolean z) {
        this.e = i;
        this.z = s2Var;
        this.y = atomicReference;
    }
}
