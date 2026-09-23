package androidx.room.util;

import androidx.room.a0;
import androidx.room.coroutines.b0;
import androidx.room.r;
import androidx.room.z;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements p {
    public /* synthetic */ Object A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ r D;
    public final /* synthetic */ l E;
    public final /* synthetic */ int e;
    public z y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z, boolean z2, r rVar, kotlin.coroutines.d dVar, l lVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = z;
        this.C = z2;
        this.D = rVar;
        this.E = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                b bVar = new b(this.B, this.C, this.D, dVar, this.E, 0);
                bVar.A = obj;
                return bVar;
            default:
                b bVar2 = new b(this.B, this.C, this.D, dVar, this.E, 1);
                bVar2.A = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((b) create(a0Var, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        a0 a0Var;
        z zVar2;
        a0 a0Var2;
        a0 a0Var3;
        Boolean boolC;
        Object obj2;
        z zVar3;
        a0 a0Var4;
        z zVar4;
        a0 a0Var5;
        a0 a0Var6;
        Boolean boolC2;
        Object obj3;
        switch (this.e) {
            case 0:
                int i = this.z;
                l lVar = this.E;
                r rVar = this.D;
                boolean z = this.C;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i == 0) {
                    kotlin.a.e(obj);
                    a0 a0Var7 = (a0) this.A;
                    if (!this.B) {
                        a0Var7.getClass();
                        return lVar.invoke(((b0) a0Var7).d());
                    }
                    zVar = z ? z.e : z.y;
                    if (z) {
                        z zVar5 = zVar;
                        a0Var = a0Var7;
                        zVar2 = zVar5;
                    } else {
                        this.A = a0Var7;
                        this.y = zVar;
                        this.z = 1;
                        Boolean boolC3 = a0Var7.c(this);
                        if (boolC3 == aVar) {
                            return aVar;
                        }
                        a0Var2 = a0Var7;
                        obj = boolC3;
                    }
                    a aVar2 = new a(0, null, lVar);
                    this.A = a0Var;
                    this.y = null;
                    this.z = 3;
                    obj = a0Var.a(zVar2, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC = a0Var.c(this);
                    if (boolC == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = boolC;
                    if (((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    androidx.room.f fVarG = rVar.g();
                    fVarG.b.e(fVarG.e, fVarG.f);
                    return obj2;
                }
                if (i == 1) {
                    zVar = this.y;
                    a0Var2 = (a0) this.A;
                    kotlin.a.e(obj);
                } else if (i == 2) {
                    zVar = this.y;
                    a0Var3 = (a0) this.A;
                    kotlin.a.e(obj);
                    zVar2 = zVar;
                    a0Var = a0Var3;
                    a aVar3 = new a(0, null, lVar);
                    this.A = a0Var;
                    this.y = null;
                    this.z = 3;
                    obj = a0Var.a(zVar2, aVar3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC = a0Var.c(this);
                    if (boolC == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = boolC;
                } else if (i == 3) {
                    a0Var = (a0) this.A;
                    kotlin.a.e(obj);
                    if (!z) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC = a0Var.c(this);
                    if (boolC == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = boolC;
                } else {
                    if (i != 4) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj4 = this.A;
                    kotlin.a.e(obj);
                    obj2 = obj4;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                androidx.room.f fVarG2 = rVar.g();
                fVarG2.b.e(fVarG2.e, fVarG2.f);
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    zVar2 = zVar;
                    a0Var = a0Var2;
                } else {
                    androidx.room.f fVarG3 = rVar.g();
                    this.A = a0Var2;
                    this.y = zVar;
                    this.z = 2;
                    Object objF = fVarG3.b.f(this);
                    if (objF != aVar) {
                        objF = y.a;
                    }
                    if (objF == aVar) {
                        return aVar;
                    }
                    a0Var3 = a0Var2;
                    zVar2 = zVar;
                    a0Var = a0Var3;
                }
                a aVar4 = new a(0, null, lVar);
                this.A = a0Var;
                this.y = null;
                this.z = 3;
                obj = a0Var.a(zVar2, aVar4, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (!z) {
                    return obj;
                }
                this.A = obj;
                this.z = 4;
                boolC = a0Var.c(this);
                if (boolC == aVar) {
                    return aVar;
                }
                obj2 = obj;
                obj = boolC;
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                androidx.room.f fVarG4 = rVar.g();
                fVarG4.b.e(fVarG4.e, fVarG4.f);
                return obj2;
            default:
                int i2 = this.z;
                l lVar2 = this.E;
                r rVar2 = this.D;
                boolean z2 = this.C;
                kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    a0 a0Var8 = (a0) this.A;
                    if (!this.B) {
                        a0Var8.getClass();
                        return lVar2.invoke(((b0) a0Var8).d());
                    }
                    zVar3 = z2 ? z.e : z.y;
                    if (z2) {
                        z zVar6 = zVar3;
                        a0Var4 = a0Var8;
                        zVar4 = zVar6;
                    } else {
                        this.A = a0Var8;
                        this.y = zVar3;
                        this.z = 1;
                        Boolean boolC4 = a0Var8.c(this);
                        if (boolC4 == aVar5) {
                            return aVar5;
                        }
                        a0Var5 = a0Var8;
                        obj = boolC4;
                    }
                    a aVar6 = new a(1, null, lVar2);
                    this.A = a0Var4;
                    this.y = null;
                    this.z = 3;
                    obj = a0Var4.a(zVar4, aVar6, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z2) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC2 = a0Var4.c(this);
                    if (boolC2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = boolC2;
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    androidx.room.f fVarG5 = rVar2.g();
                    fVarG5.b.e(fVarG5.e, fVarG5.f);
                    return obj3;
                }
                if (i2 == 1) {
                    zVar3 = this.y;
                    a0Var5 = (a0) this.A;
                    kotlin.a.e(obj);
                } else if (i2 == 2) {
                    zVar3 = this.y;
                    a0Var6 = (a0) this.A;
                    kotlin.a.e(obj);
                    zVar4 = zVar3;
                    a0Var4 = a0Var6;
                    a aVar7 = new a(1, null, lVar2);
                    this.A = a0Var4;
                    this.y = null;
                    this.z = 3;
                    obj = a0Var4.a(zVar4, aVar7, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z2) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC2 = a0Var4.c(this);
                    if (boolC2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = boolC2;
                } else if (i2 == 3) {
                    a0Var4 = (a0) this.A;
                    kotlin.a.e(obj);
                    if (!z2) {
                        return obj;
                    }
                    this.A = obj;
                    this.z = 4;
                    boolC2 = a0Var4.c(this);
                    if (boolC2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = boolC2;
                } else {
                    if (i2 != 4) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = this.A;
                    kotlin.a.e(obj);
                    obj3 = obj5;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                androidx.room.f fVarG6 = rVar2.g();
                fVarG6.b.e(fVarG6.e, fVarG6.f);
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    zVar4 = zVar3;
                    a0Var4 = a0Var5;
                } else {
                    androidx.room.f fVarG7 = rVar2.g();
                    this.A = a0Var5;
                    this.y = zVar3;
                    this.z = 2;
                    Object objF2 = fVarG7.b.f(this);
                    if (objF2 != aVar5) {
                        objF2 = y.a;
                    }
                    if (objF2 == aVar5) {
                        return aVar5;
                    }
                    a0Var6 = a0Var5;
                    zVar4 = zVar3;
                    a0Var4 = a0Var6;
                }
                a aVar8 = new a(1, null, lVar2);
                this.A = a0Var4;
                this.y = null;
                this.z = 3;
                obj = a0Var4.a(zVar4, aVar8, this);
                if (obj == aVar5) {
                    return aVar5;
                }
                if (!z2) {
                    return obj;
                }
                this.A = obj;
                this.z = 4;
                boolC2 = a0Var4.c(this);
                if (boolC2 == aVar5) {
                    return aVar5;
                }
                obj3 = obj;
                obj = boolC2;
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                androidx.room.f fVarG8 = rVar2.g();
                fVarG8.b.e(fVarG8.e, fVarG8.f);
                return obj3;
        }
    }
}
