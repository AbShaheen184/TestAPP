package com.google.firebase.platforminfo;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.n1;
import androidx.compose.animation.core.c0;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.p2;
import androidx.compose.animation.core.t;
import androidx.compose.animation.core.u;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.lazy.layout.l0;
import androidx.compose.foundation.lazy.s;
import androidx.compose.foundation.lazy.y;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.snapshots.f;
import androidx.compose.runtime.snapshots.r;
import androidx.compose.runtime.w2;
import androidx.compose.ui.unit.q;
import androidx.core.view.a0;
import com.google.common.util.concurrent.x0;
import com.google.firebase.messaging.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.l;
import okhttp3.g0;
import okhttp3.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n1, m, t, p2, h {
    public static volatile d y;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
  0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public d(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        u[][] uVarArr = new u[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i2 != 1) {
                            i2 = 1;
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            u[] uVarArr2 = new u[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                u[] uVarArr3 = uVarArr2;
                int i10 = i8;
                int i11 = i9 + 1;
                uVarArr3[i10] = new u(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                i8 = i10 + 1;
                uVarArr2 = uVarArr3;
            }
            uVarArr[i4] = uVarArr2;
            i4 = i7;
            i3 = i;
        }
        this.e = uVarArr;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList l(com.google.firebase.platforminfo.d r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.platforminfo.d.l(com.google.firebase.platforminfo.d, java.lang.String):java.util.ArrayList");
    }

    public static l0 o(d dVar, int i) {
        y yVar = (y) dVar.e;
        f fVarE = r.e();
        l lVarE = fVarE != null ? fVarE.e() : null;
        f fVarH = r.h(fVarE);
        try {
            s sVar = (s) yVar.f.getValue();
            return yVar.p.a(i, sVar.j, yVar.d, new w1(i, sVar));
        } finally {
            r.k(fVarE, fVarH, lVarE);
        }
    }

    @Override // androidx.compose.animation.core.p2, androidx.compose.animation.core.m2
    public boolean a() {
        ((n) this.e).getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.m2
    public long b(androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        return ((n) this.e).b(sVar, sVar2, sVar3);
    }

    @Override // androidx.appcompat.widget.n1
    public void c(j jVar, k kVar) {
        g gVar = (g) this.e;
        Handler handler = gVar.C;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.E;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jVar == ((androidx.appcompat.view.menu.f) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new e(this, i2 < arrayList.size() ? (androidx.appcompat.view.menu.f) arrayList.get(i2) : null, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // okhttp3.h
    public void d(okhttp3.internal.connection.m mVar, g0 g0Var) {
        ((x0) this.e).l(g0Var);
    }

    @Override // androidx.appcompat.widget.n1
    public void e(j jVar, MenuItem menuItem) {
        ((g) this.e).C.removeCallbacksAndMessages(jVar);
    }

    public void f(int i, boolean z) {
        androidx.core.text.f fVar = (androidx.core.text.f) this.e;
        if (z) {
            fVar.b(i);
        } else {
            fVar.getClass();
        }
    }

    public long g(long j) {
        androidx.compose.ui.input.pointer.util.b bVar = (androidx.compose.ui.input.pointer.util.b) this.e;
        bVar.getClass();
        if (q.b(j) <= 0.0f || q.c(j) <= 0.0f) {
            androidx.compose.ui.internal.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) q.g(j)));
        }
        return com.google.android.gms.dynamite.g.d(((androidx.compose.ui.input.pointer.util.e) bVar.b).b(q.b(j)), ((androidx.compose.ui.input.pointer.util.e) bVar.c).b(q.c(j)));
    }

    @Override // androidx.compose.animation.core.t
    public c0 get(int i) {
        return (d0) this.e;
    }

    @Override // okhttp3.h
    public void h(okhttp3.internal.connection.m mVar, IOException iOException) {
        ((x0) this.e).m(iOException);
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s i(long j, androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        return ((n) this.e).i(j, sVar, sVar2, sVar3);
    }

    public w2 j() {
        androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
        if (jVarA.c() == 1) {
            return new androidx.compose.ui.text.platform.l(true);
        }
        j1 j1VarR = androidx.compose.runtime.t.r(Boolean.FALSE);
        jVarA.h(new androidx.compose.ui.text.platform.h(j1VarR, this));
        return j1VarR;
    }

    public void k(float f, float f2, float f3, float f4) {
        c2 c2Var = (c2) this.e;
        androidx.compose.ui.graphics.r rVarV = c2Var.v();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2Var.G() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c2Var.G() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            androidx.compose.ui.graphics.d0.a("Width and height must be greater than or equal to zero");
        }
        c2Var.b0(jFloatToRawIntBits);
        rVarV.p(f, f2);
    }

    public void m(float f, long j) {
        androidx.compose.ui.graphics.r rVarV = ((c2) this.e).v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        rVarV.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        rVarV.c(f);
        rVarV.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void n(float f, float f2, long j) {
        androidx.compose.ui.graphics.r rVarV = ((c2) this.e).v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        rVarV.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        rVarV.b(f, f2);
        rVarV.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s q(androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        return ((n) this.e).q(sVar, sVar2, sVar3);
    }

    public void r(float f, float f2) {
        ((c2) this.e).v().p(f, f2);
    }

    @Override // androidx.compose.animation.core.m2
    public androidx.compose.animation.core.s t(long j, androidx.compose.animation.core.s sVar, androidx.compose.animation.core.s sVar2, androidx.compose.animation.core.s sVar3) {
        return ((n) this.e).t(j, sVar, sVar2, sVar3);
    }

    public d(int i) {
        Object fVar;
        switch (i) {
            case 9:
                this.e = new androidx.compose.runtime.collection.b(new androidx.compose.foundation.lazy.layout.k[16]);
                break;
            case 15:
                this.e = new androidx.compose.ui.input.pointer.util.b();
                break;
            case 17:
                if (Build.VERSION.SDK_INT >= 28) {
                    fVar = new androidx.compose.ui.text.font.q();
                } else {
                    fVar = new com.google.android.material.shape.f(3);
                }
                this.e = fVar;
                break;
            case 22:
                this.e = new AtomicInteger(0);
                break;
            case 26:
                this.e = new androidx.core.text.f();
                break;
            default:
                this.e = new HashSet();
                break;
        }
    }

    public /* synthetic */ d(Object obj) {
        this.e = obj;
    }

    public d(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.c0 c0Var = new androidx.core.view.c0(view);
            c0Var.b = view;
            this.e = c0Var;
            return;
        }
        this.e = new a0(view);
    }
}
