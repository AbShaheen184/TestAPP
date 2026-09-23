package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends androidx.compose.ui.node.k implements androidx.compose.ui.node.r1, androidx.compose.ui.input.indirect.c, androidx.compose.ui.node.i {
    public o1 N;
    public kotlin.jvm.functions.l O;
    public boolean P;
    public androidx.compose.foundation.interaction.k Q;
    public Channel R;
    public androidx.compose.foundation.interaction.b S;
    public boolean T;
    public boolean U;
    public p V;
    public s W;
    public r X;
    public q Y;
    public com.google.firebase.b Z;
    public com.google.firebase.platforminfo.d a0;
    public d3 c0;
    public z0 d0;
    public long b0 = 9205357640488583168L;
    public long e0 = 0;

    public l0(kotlin.jvm.functions.l lVar, boolean z, androidx.compose.foundation.interaction.k kVar, o1 o1Var) {
        this.N = o1Var;
        this.O = lVar;
        this.P = z;
        this.Q = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P0(l0 l0Var, kotlin.coroutines.jvm.internal.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i = h0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0Var.z = i - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(l0Var, cVar);
            }
        } else {
            h0Var = new h0(l0Var, cVar);
        }
        Object obj = h0Var.e;
        int i2 = h0Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar = l0Var.S;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = l0Var.Q;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.a aVar = new androidx.compose.foundation.interaction.a(bVar);
                    h0Var.z = 1;
                    Object objB = kVar.b(aVar, h0Var);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                }
            }
            l0Var.Z0(new w(0L, false));
            return kotlin.y.a;
        }
        if (i2 != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        l0Var.S = null;
        l0Var.Z0(new w(0L, false));
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q0(l0 l0Var, v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        i0 i0Var;
        androidx.compose.foundation.interaction.k kVar;
        androidx.compose.foundation.interaction.b bVar;
        v vVar2;
        androidx.compose.foundation.interaction.b bVar2;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.B = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(l0Var, cVar);
            }
        } else {
            i0Var = new i0(l0Var, cVar);
        }
        Object obj = i0Var.z;
        int i2 = i0Var.B;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar3 = l0Var.S;
            if (bVar3 != null && (kVar = l0Var.Q) != null) {
                androidx.compose.foundation.interaction.a aVar2 = new androidx.compose.foundation.interaction.a(bVar3);
                i0Var.e = vVar;
                i0Var.B = 1;
                if (kVar.b(aVar2, i0Var) != aVar) {
                }
                return aVar;
            }
            l0Var.S = bVar;
            l0Var.Y0(vVar.a);
            return kotlin.y.a;
        }
        if (i2 == 1) {
            vVar = i0Var.e;
            kotlin.a.e(obj);
        } else {
            if (i2 != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = i0Var.y;
            vVar2 = i0Var.e;
            kotlin.a.e(obj);
        }
        bVar = bVar2;
        vVar = vVar2;
        l0Var.S = bVar;
        l0Var.Y0(vVar.a);
        return kotlin.y.a;
        bVar = new androidx.compose.foundation.interaction.b();
        androidx.compose.foundation.interaction.k kVar2 = l0Var.Q;
        if (kVar2 != null) {
            i0Var.e = vVar;
            i0Var.y = bVar;
            i0Var.B = 2;
            if (kVar2.b(bVar, i0Var) != aVar) {
                vVar2 = vVar;
                bVar2 = bVar;
                bVar = bVar2;
                vVar = vVar2;
            }
            return aVar;
        }
        l0Var.S = bVar;
        l0Var.Y0(vVar.a);
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object R0(l0 l0Var, w wVar, kotlin.coroutines.jvm.internal.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i = j0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.A = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(l0Var, cVar);
            }
        } else {
            j0Var = new j0(l0Var, cVar);
        }
        Object obj = j0Var.y;
        int i2 = j0Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.compose.foundation.interaction.b bVar = l0Var.S;
            if (bVar != null) {
                androidx.compose.foundation.interaction.k kVar = l0Var.Q;
                if (kVar != null) {
                    androidx.compose.foundation.interaction.c cVar2 = new androidx.compose.foundation.interaction.c(bVar);
                    j0Var.e = wVar;
                    j0Var.A = 1;
                    Object objB = kVar.b(cVar2, j0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objB == aVar) {
                        return aVar;
                    }
                }
            }
            l0Var.Z0(wVar);
            return kotlin.y.a;
        }
        if (i2 != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wVar = j0Var.e;
        kotlin.a.e(obj);
        l0Var.S = null;
        l0Var.Z0(wVar);
        return kotlin.y.a;
    }

    public static void W0(l0 l0Var, androidx.compose.ui.input.pointer.v vVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        r rVar = l0Var.X;
        if (rVar == null) {
            rVar = new r();
            rVar.k = null;
            rVar.l = Long.MAX_VALUE;
            rVar.m = false;
            l0Var.X = rVar;
        }
        rVar.k = vVar;
        rVar.l = j;
        d3 d3Var = l0Var.c0;
        o1 o1Var = l0Var.N;
        if (d3Var == null) {
            l0Var.c0 = new d3(o1Var);
        } else {
            d3Var.z = o1Var;
            d3Var.y = j2;
        }
        rVar.m = false;
        l0Var.Z = rVar;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.util.List] */
    public void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z = true;
        this.U = true;
        if (this.P) {
            if (this.Z == null) {
                p pVar = this.V;
                if (pVar == null) {
                    pVar = new p();
                    pVar.k = o.z;
                    pVar.l = false;
                    this.V = pVar;
                }
                this.Z = pVar;
            }
            com.google.firebase.b bVar = this.Z;
            if (bVar == null) {
                kotlinx.coroutines.future.a.q("currentDragState should not be null");
                return;
            }
            boolean z2 = bVar instanceof p;
            androidx.compose.ui.input.pointer.n nVar2 = androidx.compose.ui.input.pointer.n.e;
            androidx.compose.ui.input.pointer.n nVar3 = androidx.compose.ui.input.pointer.n.y;
            if (z2) {
                p pVar2 = (p) bVar;
                if (!mVar.a.isEmpty() && c3.e(mVar, false)) {
                    androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) kotlin.collections.p.B(mVar.a);
                    int i = g0.a[pVar2.k.ordinal()];
                    o oVar = o.y;
                    o oVar2 = o.e;
                    o oVar3 = i == 1 ? !e1() ? oVar2 : oVar : pVar2.k;
                    pVar2.k = oVar3;
                    if (nVar == nVar2 && oVar3 == oVar) {
                        vVar.a();
                        pVar2.l = true;
                    }
                    if (nVar == nVar3) {
                        if (oVar3 == oVar2) {
                            W0(this, vVar, vVar.a, 0L, 12);
                            return;
                        }
                        if (pVar2.l) {
                            d1(vVar, vVar, 0L);
                            c1(vVar, 0L);
                            long j2 = vVar.a;
                            s sVar = this.W;
                            if (sVar == null) {
                                sVar = new s();
                                sVar.k = Long.MAX_VALUE;
                                this.W = sVar;
                            }
                            sVar.k = j2;
                            this.Z = sVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = bVar instanceof r;
            androidx.compose.ui.input.pointer.n nVar4 = androidx.compose.ui.input.pointer.n.z;
            if (z3) {
                r rVar = (r) bVar;
                if (nVar == nVar2) {
                    return;
                }
                ?? r1 = mVar.a;
                int size = r1.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r1.get(i2);
                    int i3 = size;
                    if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj3).a, rVar.l)) {
                        break;
                    }
                    i2++;
                    size = i3;
                }
                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) obj3;
                if (vVar2 == null) {
                    int size2 = r1.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            obj5 = null;
                            break;
                        }
                        obj5 = r1.get(i4);
                        if (((androidx.compose.ui.input.pointer.v) obj5).d) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    vVar2 = (androidx.compose.ui.input.pointer.v) obj5;
                    if (vVar2 == null) {
                        U0();
                        return;
                    }
                    rVar.l = vVar2.a;
                }
                if (nVar == nVar3) {
                    if (vVar2.b()) {
                        androidx.compose.ui.input.pointer.v vVar3 = rVar.k;
                        if (vVar3 == null) {
                            kotlinx.coroutines.future.a.q("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = rVar.l;
                        d3 d3Var = this.c0;
                        if (d3Var == null) {
                            kotlinx.coroutines.future.a.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        V0(vVar3, j3, d3Var);
                    } else if (androidx.compose.ui.input.pointer.u.d(vVar2)) {
                        int size3 = r1.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = r1.get(i5);
                            if (((androidx.compose.ui.input.pointer.v) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i5++;
                        }
                        androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) obj4;
                        if (vVar4 == null) {
                            U0();
                        } else {
                            rVar.l = vVar4.a;
                        }
                    } else {
                        float f = f0.f((androidx.compose.ui.platform.q2) androidx.compose.ui.node.l.h(this, androidx.compose.ui.platform.l1.s), vVar2.i);
                        d3 d3Var2 = this.c0;
                        if (d3Var2 == null) {
                            kotlinx.coroutines.future.a.q("Touch slop detector not initialized.");
                            return;
                        }
                        long jX = d3Var2.x(vVar2.c, vVar2.g, f);
                        if ((9223372034707292159L & jX) != 9205357640488583168L) {
                            vVar2.a();
                            androidx.compose.ui.input.pointer.v vVar5 = rVar.k;
                            vVar5.getClass();
                            d1(vVar5, vVar2, jX);
                            c1(vVar2, jX);
                            long j4 = vVar2.a;
                            s sVar2 = this.W;
                            if (sVar2 == null) {
                                sVar2 = new s();
                                sVar2.k = Long.MAX_VALUE;
                                this.W = sVar2;
                            }
                            sVar2.k = j4;
                            this.Z = sVar2;
                        } else {
                            rVar.m = true;
                        }
                    }
                }
                if (nVar == nVar4 && rVar.m) {
                    if (!vVar2.b()) {
                        rVar.m = false;
                        return;
                    }
                    androidx.compose.ui.input.pointer.v vVar6 = rVar.k;
                    if (vVar6 == null) {
                        kotlinx.coroutines.future.a.q("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = rVar.l;
                    d3 d3Var3 = this.c0;
                    if (d3Var3 != null) {
                        V0(vVar6, j5, d3Var3);
                        return;
                    } else {
                        kotlinx.coroutines.future.a.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                }
                return;
            }
            if (bVar instanceof q) {
                q qVar = (q) bVar;
                if (nVar != nVar4) {
                    return;
                }
                ?? r2 = mVar.a;
                int size4 = r2.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    if (((androidx.compose.ui.input.pointer.v) r2.get(i6)).b()) {
                        z = false;
                        break;
                    }
                }
                int size5 = r2.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    if (((androidx.compose.ui.input.pointer.v) r2.get(i7)).d) {
                        if (r2.isEmpty()) {
                            break;
                        }
                        if (z) {
                            long j6 = ((androidx.compose.ui.input.pointer.v) kotlin.collections.p.B(r2)).c;
                            androidx.compose.ui.input.pointer.v vVar7 = qVar.k;
                            vVar7.getClass();
                            long jD = androidx.compose.ui.geometry.b.d(j6, vVar7.c);
                            androidx.compose.ui.input.pointer.v vVar8 = qVar.k;
                            if (vVar8 != null) {
                                W0(this, vVar8, qVar.l, jD, 8);
                                return;
                            } else {
                                kotlinx.coroutines.future.a.q("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                        }
                        return;
                    }
                }
                U0();
                return;
            }
            if (!(bVar instanceof s)) {
                coil3.g.a();
                return;
            }
            s sVar3 = (s) bVar;
            if (nVar != nVar3) {
                return;
            }
            long j7 = sVar3.k;
            ?? r3 = mVar.a;
            int size6 = r3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size6) {
                    obj = null;
                    break;
                }
                obj = r3.get(i8);
                if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.v) obj).a, j7)) {
                    break;
                } else {
                    i8++;
                }
            }
            androidx.compose.ui.input.pointer.v vVar9 = (androidx.compose.ui.input.pointer.v) obj;
            if (vVar9 == null) {
                return;
            }
            boolean zD = androidx.compose.ui.input.pointer.u.d(vVar9);
            t tVar = t.a;
            if (!zD) {
                if (vVar9.b()) {
                    a1().mo28trySendJP2dKIU(tVar);
                    return;
                } else {
                    if (androidx.compose.ui.geometry.b.c(androidx.compose.ui.input.pointer.u.g(vVar9, true)) == 0.0f) {
                        return;
                    }
                    c1(vVar9, androidx.compose.ui.input.pointer.u.g(vVar9, false));
                    vVar9.a();
                    return;
                }
            }
            ?? r4 = mVar.a;
            int size7 = r4.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size7) {
                    obj2 = null;
                    break;
                }
                obj2 = r4.get(i9);
                if (((androidx.compose.ui.input.pointer.v) obj2).d) {
                    break;
                } else {
                    i9++;
                }
            }
            androidx.compose.ui.input.pointer.v vVar10 = (androidx.compose.ui.input.pointer.v) obj2;
            if (vVar10 != null) {
                sVar3.k = vVar10.a;
                return;
            }
            if (vVar9.b() || !androidx.compose.ui.input.pointer.u.d(vVar9)) {
                a1().mo28trySendJP2dKIU(tVar);
            } else {
                androidx.room.t.c(b1(), vVar9, 0L);
                float fE = ((androidx.compose.ui.platform.q2) androidx.compose.ui.node.l.h(this, androidx.compose.ui.platform.l1.s)).e();
                long jG = b1().g(com.google.android.gms.dynamite.g.d(fE, fE));
                androidx.compose.ui.input.pointer.util.b bVar2 = (androidx.compose.ui.input.pointer.util.b) b1().e;
                androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar2.b;
                kotlin.collections.o.p(eVar.d, null);
                eVar.e = 0;
                androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar2.c;
                kotlin.collections.o.p(eVar2.d, null);
                eVar2.e = 0;
                bVar2.a = 0L;
                a1().mo28trySendJP2dKIU(new w(o0.a(jG), false));
                this.U = false;
            }
            U0();
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        if (this.U) {
            U0();
            if (this.T) {
                a1().mo28trySendJP2dKIU(t.a);
            }
            this.a0 = null;
        }
        this.U = false;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.T = false;
        S0();
        this.e0 = 0L;
    }

    @Override // androidx.compose.ui.input.indirect.c
    public final void R(androidx.appcompat.widget.x xVar, androidx.compose.ui.input.pointer.n nVar) {
        Object obj;
        Object obj2;
        boolean z;
        androidx.compose.ui.input.pointer.n nVar2;
        androidx.compose.ui.input.pointer.n nVar3;
        Object obj3;
        float fIntBitsToFloat;
        Object obj4;
        int i = xVar.y;
        ArrayList arrayList = (ArrayList) xVar.z;
        if (this.P) {
            if (this.d0 == null) {
                this.d0 = new z0(this);
            }
            z0 z0Var = this.d0;
            if (z0Var != null) {
                l0 l0Var = z0Var.a;
                if (z0Var.f == null) {
                    u0 u0Var = z0Var.b;
                    if (u0Var == null) {
                        u0Var = new u0();
                        u0Var.o = t0.z;
                        u0Var.p = false;
                        z0Var.b = u0Var;
                    }
                    z0Var.f = u0Var;
                }
                com.imsdk.a aVar = z0Var.f;
                if (aVar == null) {
                    kotlinx.coroutines.future.a.q("currentDragState should not be null");
                    return;
                }
                boolean z2 = aVar instanceof u0;
                androidx.compose.ui.input.pointer.n nVar4 = androidx.compose.ui.input.pointer.n.e;
                androidx.compose.ui.input.pointer.n nVar5 = androidx.compose.ui.input.pointer.n.y;
                if (z2) {
                    u0 u0Var2 = (u0) aVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        androidx.compose.ui.input.indirect.b bVar = (androidx.compose.ui.input.indirect.b) arrayList.get(i2);
                        if (bVar.h || !bVar.d) {
                            return;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar2 = (androidx.compose.ui.input.indirect.b) kotlin.collections.p.B(arrayList);
                    int i3 = y0.a[u0Var2.o.ordinal()];
                    t0 t0Var = t0.y;
                    t0 t0Var2 = t0.e;
                    t0 t0Var3 = i3 == 1 ? !l0Var.e1() ? t0Var2 : t0Var : u0Var2.o;
                    u0Var2.o = t0Var3;
                    if (nVar == nVar4 && t0Var3 == t0Var) {
                        bVar2.i = true;
                        u0Var2.p = true;
                    }
                    if (nVar == nVar5) {
                        if (t0Var3 == t0Var2) {
                            z0.c(z0Var, bVar2, bVar2.a, 0L, 12);
                            return;
                        }
                        if (u0Var2.p) {
                            z0Var.f(bVar2, bVar2, new androidx.compose.ui.input.indirect.a(i), 0L);
                            z0Var.e(bVar2, new androidx.compose.ui.input.indirect.a(i), 0L);
                            long j = bVar2.a;
                            x0 x0Var = z0Var.c;
                            if (x0Var == null) {
                                x0Var = new x0();
                                x0Var.o = Long.MAX_VALUE;
                                z0Var.c = x0Var;
                            }
                            x0Var.o = j;
                            z0Var.f = x0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = aVar instanceof w0;
                androidx.compose.ui.input.pointer.n nVar6 = androidx.compose.ui.input.pointer.n.z;
                Object obj5 = null;
                if (!z3) {
                    if (aVar instanceof v0) {
                        v0 v0Var = (v0) aVar;
                        if (nVar != nVar6) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                z = true;
                                break;
                            } else {
                                if (((androidx.compose.ui.input.indirect.b) arrayList.get(i4)).i) {
                                    z = false;
                                    break;
                                }
                                i4++;
                            }
                        }
                        int size3 = arrayList.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            if (((androidx.compose.ui.input.indirect.b) arrayList.get(i5)).d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    long jC = kotlin.math.a.C((androidx.compose.ui.input.indirect.b) kotlin.collections.p.B(arrayList), l0Var.N, new androidx.compose.ui.input.indirect.a(i));
                                    androidx.compose.ui.input.indirect.b bVar3 = v0Var.o;
                                    bVar3.getClass();
                                    long jD = androidx.compose.ui.geometry.b.d(jC, kotlin.math.a.C(bVar3, l0Var.N, new androidx.compose.ui.input.indirect.a(i)));
                                    androidx.compose.ui.input.indirect.b bVar4 = v0Var.o;
                                    if (bVar4 != null) {
                                        z0.c(z0Var, bVar4, v0Var.p, jD, 8);
                                        return;
                                    } else {
                                        kotlinx.coroutines.future.a.q("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        z0Var.a();
                        return;
                    }
                    if (!(aVar instanceof x0)) {
                        coil3.g.a();
                        return;
                    }
                    x0 x0Var2 = (x0) aVar;
                    if (nVar != nVar5) {
                        return;
                    }
                    long j2 = x0Var2.o;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.indirect.b) obj).a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar5 = (androidx.compose.ui.input.indirect.b) obj;
                    if (bVar5 == null) {
                        return;
                    }
                    boolean zG = kotlin.math.a.g(bVar5);
                    t tVar = t.a;
                    if (!zG) {
                        if (bVar5.i) {
                            l0Var.X0(tVar);
                            return;
                        }
                        o1 o1Var = l0Var.N;
                        androidx.compose.ui.input.indirect.a aVar2 = new androidx.compose.ui.input.indirect.a(i);
                        if (androidx.compose.ui.geometry.b.c(androidx.compose.ui.geometry.b.d(kotlin.math.a.C(bVar5, o1Var, aVar2), kotlin.math.a.D(bVar5, o1Var, aVar2))) == 0.0f) {
                            return;
                        }
                        o1 o1Var2 = l0Var.N;
                        androidx.compose.ui.input.indirect.a aVar3 = new androidx.compose.ui.input.indirect.a(i);
                        z0Var.e(bVar5, new androidx.compose.ui.input.indirect.a(i), bVar5.i ? 0L : androidx.compose.ui.geometry.b.d(kotlin.math.a.C(bVar5, o1Var2, aVar3), kotlin.math.a.D(bVar5, o1Var2, aVar3)));
                        bVar5.i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i7);
                        if (((androidx.compose.ui.input.indirect.b) obj2).d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    androidx.compose.ui.input.indirect.b bVar6 = (androidx.compose.ui.input.indirect.b) obj2;
                    if (bVar6 != null) {
                        x0Var2.o = bVar6.a;
                        return;
                    }
                    if (bVar5.i || !kotlin.math.a.g(bVar5)) {
                        l0Var.X0(tVar);
                    } else {
                        kotlin.math.a.f(z0Var.d(), bVar5, l0Var.N, new androidx.compose.ui.input.indirect.a(i), z0Var.j, z0Var.l);
                        float fE = ((androidx.compose.ui.platform.q2) androidx.compose.ui.node.l.h(l0Var, androidx.compose.ui.platform.l1.s)).e();
                        long jG = z0Var.d().g(com.google.android.gms.dynamite.g.d(fE, fE));
                        androidx.compose.ui.input.pointer.util.b bVar7 = (androidx.compose.ui.input.pointer.util.b) z0Var.d().e;
                        androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar7.b;
                        kotlin.collections.o.p(eVar.d, null);
                        eVar.e = 0;
                        androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar7.c;
                        kotlin.collections.o.p(eVar2.d, null);
                        eVar2.e = 0;
                        bVar7.a = 0L;
                        l0Var.X0(new w(o0.a(jG), true));
                    }
                    z0Var.a();
                    return;
                }
                w0 w0Var = (w0) aVar;
                if (nVar == nVar4) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        nVar2 = nVar5;
                        nVar3 = nVar6;
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i8);
                    nVar3 = nVar6;
                    nVar2 = nVar5;
                    if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.indirect.b) obj3).a, w0Var.p)) {
                        break;
                    }
                    i8++;
                    nVar6 = nVar3;
                    nVar5 = nVar2;
                }
                androidx.compose.ui.input.indirect.b bVar8 = (androidx.compose.ui.input.indirect.b) obj3;
                if (bVar8 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i9);
                        if (((androidx.compose.ui.input.indirect.b) obj4).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    bVar8 = (androidx.compose.ui.input.indirect.b) obj4;
                    if (bVar8 == null) {
                        z0Var.a();
                        return;
                    }
                    w0Var.p = bVar8.a;
                }
                androidx.compose.ui.input.indirect.b bVar9 = bVar8;
                if (nVar == nVar2) {
                    if (bVar9.i) {
                        androidx.compose.ui.input.indirect.b bVar10 = w0Var.o;
                        if (bVar10 == null) {
                            kotlinx.coroutines.future.a.q("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = w0Var.p;
                        d3 d3Var = z0Var.i;
                        if (d3Var == null) {
                            kotlinx.coroutines.future.a.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        z0Var.b(bVar10, j3, d3Var);
                    } else if (kotlin.math.a.g(bVar9)) {
                        int size8 = arrayList.size();
                        for (int i10 = 0; i10 < size8; i10++) {
                            Object obj6 = arrayList.get(i10);
                            if (((androidx.compose.ui.input.indirect.b) obj6).d) {
                                obj5 = obj6;
                                break;
                            }
                        }
                        androidx.compose.ui.input.indirect.b bVar11 = (androidx.compose.ui.input.indirect.b) obj5;
                        if (bVar11 == null) {
                            z0Var.a();
                        } else {
                            w0Var.p = bVar11.a;
                        }
                    } else {
                        androidx.compose.ui.platform.q2 q2Var = (androidx.compose.ui.platform.q2) androidx.compose.ui.node.l.h(l0Var, androidx.compose.ui.platform.l1.s);
                        float f = f0.a;
                        float f2 = q2Var.f();
                        d3 d3Var2 = z0Var.i;
                        if (d3Var2 == null) {
                            kotlinx.coroutines.future.a.q("Touch slop detector not initialized.");
                            return;
                        }
                        long jC2 = kotlin.math.a.C(bVar9, l0Var.N, new androidx.compose.ui.input.indirect.a(i));
                        o1 o1Var3 = l0Var.N;
                        long jFloatToRawIntBits = bVar9.g;
                        if (o1Var3 == null) {
                            bVar9 = bVar9;
                        } else {
                            if (i == 1) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                            } else if (i == 2) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                            }
                            jFloatToRawIntBits = o1Var3 == o1.y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                        }
                        long jX = d3Var2.x(jC2, jFloatToRawIntBits, f2);
                        if ((9223372034707292159L & jX) != 9205357640488583168L) {
                            bVar9.i = true;
                            bVar9 = bVar9;
                            androidx.compose.ui.input.indirect.b bVar12 = w0Var.o;
                            bVar12.getClass();
                            z0Var.f(bVar12, bVar9, new androidx.compose.ui.input.indirect.a(i), jX);
                            z0Var.e(bVar9, new androidx.compose.ui.input.indirect.a(i), jX);
                            long j4 = bVar9.a;
                            x0 x0Var3 = z0Var.c;
                            if (x0Var3 == null) {
                                x0Var3 = new x0();
                                x0Var3.o = Long.MAX_VALUE;
                                z0Var.c = x0Var3;
                            }
                            x0Var3.o = j4;
                            z0Var.f = x0Var3;
                        } else {
                            bVar9 = bVar9;
                            w0Var.q = true;
                        }
                    }
                }
                if (nVar == nVar3 && w0Var.q) {
                    if (!bVar9.i) {
                        w0Var.q = false;
                        return;
                    }
                    androidx.compose.ui.input.indirect.b bVar13 = w0Var.o;
                    if (bVar13 == null) {
                        kotlinx.coroutines.future.a.q("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = w0Var.p;
                    d3 d3Var3 = z0Var.i;
                    if (d3Var3 != null) {
                        z0Var.b(bVar13, j5, d3Var3);
                    } else {
                        kotlinx.coroutines.future.a.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    public final void S0() {
        androidx.compose.foundation.interaction.b bVar = this.S;
        if (bVar != null) {
            androidx.compose.foundation.interaction.k kVar = this.Q;
            if (kVar != null) {
                kVar.c(new androidx.compose.foundation.interaction.a(bVar));
            }
            this.S = null;
        }
    }

    public abstract Object T0(k0 k0Var, k0 k0Var2);

    public final void U0() {
        p pVar = this.V;
        o oVar = o.z;
        if (pVar == null) {
            pVar = new p();
            pVar.k = oVar;
            pVar.l = false;
            this.V = pVar;
        }
        pVar.k = oVar;
        pVar.l = false;
        this.Z = pVar;
    }

    public final void V0(androidx.compose.ui.input.pointer.v vVar, long j, d3 d3Var) {
        q qVar = this.Y;
        if (qVar == null) {
            qVar = new q();
            qVar.k = null;
            qVar.l = Long.MAX_VALUE;
            this.Y = qVar;
        }
        qVar.k = vVar;
        qVar.l = j;
        d3Var.y = 0L;
        this.Z = qVar;
    }

    public final void X0(x xVar) {
        if ((xVar instanceof v) && !this.T) {
            this.T = true;
            f1();
        }
        a1().mo28trySendJP2dKIU(xVar);
    }

    public abstract void Y0(long j);

    public abstract void Z0(w wVar);

    @Override // androidx.compose.ui.input.indirect.c
    public final void a0() {
        z0 z0Var = this.d0;
        if (z0Var != null) {
            z0Var.a();
            l0 l0Var = z0Var.a;
            if (l0Var.T) {
                l0Var.X0(t.a);
            }
            z0Var.g = null;
            a1 a1Var = z0Var.k;
            a1Var.a = 0;
            a1Var.b.clear();
        }
    }

    public final Channel a1() {
        Channel channel = this.R;
        if (channel != null) {
            return channel;
        }
        kotlinx.coroutines.future.a.q("Events channel not initialized.");
        return null;
    }

    public final com.google.firebase.platforminfo.d b1() {
        com.google.firebase.platforminfo.d dVar = this.a0;
        if (dVar != null) {
            return dVar;
        }
        kotlinx.coroutines.future.a.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void c1(androidx.compose.ui.input.pointer.v vVar, long j) {
        long jE = androidx.compose.ui.node.l.u(this.e).E(0L);
        if (!androidx.compose.ui.geometry.b.b(this.b0, 9205357640488583168L) && !androidx.compose.ui.geometry.b.b(jE, this.b0)) {
            this.e0 = androidx.compose.ui.geometry.b.e(this.e0, androidx.compose.ui.geometry.b.d(jE, this.b0));
        }
        this.b0 = jE;
        androidx.room.t.c(b1(), vVar, this.e0);
        a1().mo28trySendJP2dKIU(new u(j, false));
    }

    public final void d1(androidx.compose.ui.input.pointer.v vVar, androidx.compose.ui.input.pointer.v vVar2, long j) {
        if (this.a0 == null) {
            this.a0 = new com.google.firebase.platforminfo.d(15);
        }
        androidx.room.t.c(b1(), vVar, 0L);
        long jD = androidx.compose.ui.geometry.b.d(vVar2.c, j);
        this.e0 = 0L;
        if (((Boolean) this.O.invoke(new androidx.compose.ui.input.pointer.d0(vVar.i))).booleanValue()) {
            if (!this.T) {
                if (this.R == null) {
                    this.R = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                }
                f1();
            }
            this.b0 = androidx.compose.ui.node.l.u(this).E(0L);
            a1().mo28trySendJP2dKIU(new v(jD));
        }
    }

    public abstract boolean e1();

    public final void f1() {
        this.T = true;
        if (this.R == null) {
            this.R = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
        BuildersKt__Builders_commonKt.launch$default(A0(), null, null, new k0(this, null), 3, null);
    }

    public final void g1(kotlin.jvm.functions.l lVar, boolean z, androidx.compose.foundation.interaction.k kVar, o1 o1Var, boolean z2) {
        this.O = lVar;
        boolean z3 = true;
        if (this.P != z) {
            this.P = z;
            if (!z) {
                S0();
                this.d0 = null;
            }
            z2 = true;
        }
        if (!kotlin.jvm.internal.l.a(this.Q, kVar)) {
            S0();
            this.Q = kVar;
        }
        if (this.N != o1Var) {
            this.N = o1Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.U;
            t tVar = t.a;
            if (z4) {
                U0();
                if (this.T) {
                    a1().mo28trySendJP2dKIU(tVar);
                }
                this.a0 = null;
            }
            z0 z0Var = this.d0;
            if (z0Var != null) {
                z0Var.a();
                l0 l0Var = z0Var.a;
                if (l0Var.T) {
                    l0Var.X0(tVar);
                }
                z0Var.g = null;
                a1 a1Var = z0Var.k;
                a1Var.a = 0;
                a1Var.b.clear();
            }
        }
    }
}
