package androidx.compose.foundation;

import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.app.mlounge.ui.viewmodel.a0 a0Var) {
        super(0, 0, com.app.mlounge.ui.viewmodel.a0.class, a0Var, "searchChannels", "searchChannels()V");
        this.e = 8;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Exception {
        androidx.compose.ui.node.a1 a1Var;
        char c;
        ContentCaptureSession contentCaptureSessionN;
        switch (this.e) {
            case 0:
                return Boolean.valueOf(((u0) this.receiver).S.T0(7));
            case 1:
                return ((androidx.compose.foundation.text.contextmenu.provider.e) this.receiver).N();
            case 2:
                androidx.compose.ui.focus.i iVar = (androidx.compose.ui.focus.i) this.receiver;
                androidx.collection.p0 p0Var = iVar.c;
                androidx.collection.p0 p0Var2 = iVar.d;
                androidx.compose.ui.focus.p pVar = iVar.a;
                androidx.compose.ui.focus.e0 e0VarF = pVar.f();
                androidx.compose.ui.focus.c0 c0Var = androidx.compose.ui.focus.c0.z;
                if (e0VarF == null) {
                    Object[] objArr = p0Var2.b;
                    long[] jArr = p0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        char c2 = 7;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (i3 < i2) {
                                    if ((j & 255) < 128) {
                                        ((androidx.compose.ui.focus.g) objArr[(i << 3) + i3]).Y(c0Var);
                                    }
                                    j >>= 8;
                                    i3++;
                                    c2 = c2;
                                }
                                c = c2;
                                if (i2 == 8) {
                                }
                            } else {
                                c = c2;
                            }
                            if (i != length) {
                                i++;
                                c2 = c;
                            }
                        }
                    }
                } else if (e0VarF.K) {
                    if (p0Var.c(e0VarF)) {
                        e0VarF.S0();
                    }
                    androidx.compose.ui.focus.c0 c0VarR0 = e0VarF.R0();
                    if (!e0VarF.e.K) {
                        androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                    }
                    androidx.compose.ui.q qVar = e0VarF.e;
                    androidx.compose.ui.node.f0 f0VarV = androidx.compose.ui.node.l.v(e0VarF);
                    int i4 = 0;
                    while (f0VarV != null) {
                        if ((((androidx.compose.ui.q) f0VarV.d0.g).A & 5120) != 0) {
                            while (qVar != null) {
                                int i5 = qVar.z;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                    }
                                    if ((qVar instanceof androidx.compose.ui.focus.g) && p0Var2.c(qVar)) {
                                        if (i4 <= 1) {
                                            ((androidx.compose.ui.focus.g) qVar).Y(c0VarR0);
                                        } else {
                                            ((androidx.compose.ui.focus.g) qVar).Y(androidx.compose.ui.focus.c0.y);
                                        }
                                        p0Var2.l(qVar);
                                    }
                                }
                                qVar = qVar.B;
                            }
                        }
                        f0VarV = f0VarV.v();
                        qVar = (f0VarV == null || (a1Var = f0VarV.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
                    }
                    Object[] objArr2 = p0Var2.b;
                    long[] jArr2 = p0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((androidx.compose.ui.focus.g) objArr2[(i6 << 3) + i8]).Y(c0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                }
                            }
                            if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (pVar.f() == null || pVar.c.R0() == c0Var) {
                    pVar.c();
                }
                p0Var.b();
                p0Var2.b();
                iVar.e = false;
                return kotlin.y.a;
            case 3:
                View view = (View) this.receiver;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    androidx.compose.ui.graphics.layer.i.j(view);
                }
                if (i9 < 29 || (contentCaptureSessionN = androidx.compose.ui.platform.coreshims.b.n(view)) == null) {
                    return null;
                }
                return new androidx.compose.ui.platform.coreshims.a(contentCaptureSessionN, view);
            case 4:
                androidx.room.r rVar = (androidx.room.r) this.receiver;
                CoroutineScope coroutineScope = rVar.a;
                if (coroutineScope == null) {
                    kotlin.jvm.internal.l.f("coroutineScope");
                    throw null;
                }
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                rVar.g();
                androidx.constraintlayout.core.widgets.analyzer.e eVar = rVar.e;
                if (eVar == null) {
                    kotlin.jvm.internal.l.f("connectionManager");
                    throw null;
                }
                ((androidx.room.coroutines.b) eVar.g).close();
                androidx.sqlite.db.b bVar = (androidx.sqlite.db.b) eVar.h;
                if (bVar != null) {
                    bVar.close();
                }
                return kotlin.y.a;
            case 5:
                ((com.app.mlounge.ui.viewmodel.g) this.receiver).e();
                return kotlin.y.a;
            case 6:
                ((com.app.mlounge.ui.viewmodel.r) this.receiver).f();
                return kotlin.y.a;
            case 7:
                com.app.mlounge.ui.viewmodel.s sVar = (com.app.mlounge.ui.viewmodel.s) this.receiver;
                sVar.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(sVar), null, null, new androidx.compose.animation.core.c1(sVar, null, 26), 3, null);
                return kotlin.y.a;
            case 8:
                ((com.app.mlounge.ui.viewmodel.a0) this.receiver).n();
                return kotlin.y.a;
            case 9:
                ((com.app.mlounge.ui.viewmodel.f0) this.receiver).g();
                return kotlin.y.a;
            case 10:
                ((com.app.mlounge.ui.viewmodel.w1) this.receiver).n.setValue(new com.app.mlounge.ui.viewmodel.m(null, null, null, null, 63));
                return kotlin.y.a;
            case 11:
                ((com.app.mlounge.ui.viewmodel.b2) this.receiver).f();
                return kotlin.y.a;
            case 12:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                return Boolean.valueOf(kotlin.text.k.z(name, "Firebase Background Thread #", false));
            case 13:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                return Boolean.valueOf(kotlin.text.k.z(name2, "Firebase Blocking Thread #", false));
            default:
                ((com.google.firebase.crashlytics.internal.concurrency.c) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }
}
