package org.mozilla.classfile;

import androidx.room.b0;
import kotlin.collections.c0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    public static boolean c(int[] iArr, int[] iArr2, int i, h hVar) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            int iA = iArr2[i2];
            if (i3 == iA) {
                iA = i3;
            } else {
                int i4 = i3 & 255;
                int i5 = iA & 255;
                boolean z2 = i4 == 7;
                boolean z3 = i5 == 7;
                if (z2 && iA == 5) {
                    iA = i3;
                } else if (i4 == 0 || i5 == 0) {
                    iA = 0;
                } else if (i3 != 5 || !z3) {
                    if (z2 && z3) {
                        String strF = c0.f(i3, hVar);
                        String strF2 = c0.f(iA, hVar);
                        String str = (String) hVar.k(2);
                        String str2 = (String) hVar.k(4);
                        if (strF.equals(str)) {
                            strF = str2;
                        }
                        if (strF2.equals(str)) {
                            strF2 = str2;
                        }
                        try {
                            Class<?> cls = Class.forName(strF.replace('/', '.'));
                            try {
                                Class<?> cls2 = Class.forName(strF2.replace('/', '.'));
                                if (cls.isAssignableFrom(cls2)) {
                                    iA = i3;
                                } else if (!cls2.isAssignableFrom(cls)) {
                                    if (cls2.isInterface() || cls.isInterface()) {
                                        iA = c0.a(hVar.a("java/lang/Object"));
                                    } else {
                                        Class<? super Object> superclass = cls2.getSuperclass();
                                        while (true) {
                                            if (superclass != null) {
                                                if (superclass.isAssignableFrom(cls)) {
                                                    String name = superclass.getName();
                                                    int i6 = ClassFileWriter.E;
                                                    iA = c0.a(hVar.a(name.replace('.', '/')));
                                                    break;
                                                }
                                                superclass = superclass.getSuperclass();
                                            }
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                kotlinx.coroutines.future.a.l(e);
                                return false;
                            }
                        } catch (ClassNotFoundException e2) {
                            kotlinx.coroutines.future.a.l(e2);
                            return false;
                        }
                    }
                    kotlinx.coroutines.future.a.q(b0.e("bad merge attempt between ", c0.q(i3, hVar), " and ", c0.q(iA, hVar)));
                    return false;
                }
            }
            iArr[i2] = iA;
            if (i3 != iA) {
                z = true;
            }
        }
        return z;
    }

    public final int[] a() {
        int[] iArr = this.d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0 && !c0.i(iArr[length - 1])) {
            length--;
        }
        int i = length + 1;
        int i2 = 0;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            if (c0.i(iArr[i4])) {
                i3--;
            }
        }
        int[] iArr2 = new int[i3];
        int i5 = 0;
        while (i2 < i3) {
            iArr2[i2] = iArr[i5];
            if (c0.i(iArr[i5])) {
                i5++;
            }
            i2++;
            i5++;
        }
        return iArr2;
    }

    public final boolean b(int[] iArr, int i, int[] iArr2, int i2, h hVar) {
        boolean z = this.f;
        int[] iArr3 = this.d;
        if (z) {
            if (iArr3.length == i && this.e.length == i2) {
                return c(iArr3, iArr, i, hVar) || c(this.e, iArr2, i2, hVar);
            }
            kotlinx.coroutines.future.a.q("bad merge attempt");
            return false;
        }
        System.arraycopy(iArr, 0, iArr3, 0, i);
        int[] iArr4 = new int[i2];
        this.e = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        this.f = true;
        return true;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.a, "sb ");
    }
}
