package androidx.compose.material3;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(Object obj, float f, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.z = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d3((j5) this.A, this.z, dVar, 0);
            case 1:
                d3 d3Var = new d3((androidx.compose.ui.scrollcapture.c) this.A, dVar);
                d3Var.z = ((Number) obj).floatValue();
                return d3Var;
            default:
                return new d3((com.app.mlounge.ui.viewmodel.p1) this.A, this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((d3) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((d3) create(Float.valueOf(((Number) obj).floatValue()), (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((d3) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object f;
        switch (this.e) {
            case 0:
                int i = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                j5 j5Var = (j5) this.A;
                float f2 = this.z;
                this.y = 1;
                androidx.compose.material3.internal.p pVar = j5Var.c;
                Object value = pVar.g.getValue();
                Object objC = pVar.c(pVar.f(), f2, value);
                boolean zBooleanValue = ((Boolean) pVar.d.invoke(objC)).booleanValue();
                androidx.compose.foundation.j1 j1Var = androidx.compose.foundation.j1.e;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (zBooleanValue) {
                    objB = pVar.b(objC, j1Var, new androidx.compose.material3.internal.f(pVar, f2, null), this);
                    if (objB != aVar) {
                        objB = yVar;
                    }
                    if (objB != aVar) {
                        objB = yVar;
                    }
                } else {
                    objB = pVar.b(value, j1Var, new androidx.compose.material3.internal.f(pVar, f2, null), this);
                    if (objB != aVar) {
                        objB = yVar;
                    }
                    if (objB != aVar) {
                        objB = yVar;
                    }
                }
                if (objB != aVar) {
                    objB = yVar;
                }
                return objB == aVar ? aVar : yVar;
            case 1:
                androidx.compose.ui.scrollcapture.c cVar = (androidx.compose.ui.scrollcapture.c) this.A;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    float f3 = this.z;
                    Object objG = cVar.a.d.e.g(androidx.compose.ui.semantics.m.e);
                    if (objG == null) {
                        objG = null;
                    }
                    kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) objG;
                    if (pVar2 == null) {
                        throw androidx.compose.runtime.j.a("Required value was null.");
                    }
                    androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.y = 1;
                    obj = pVar2.invoke(bVar, this);
                    f = kotlin.coroutines.intrinsics.a.e;
                    if (obj != f) {
                    }
                    return f;
                }
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                f = new Float(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) obj).a & 4294967295L)));
                return f;
            default:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.local.prefs.y1 y1Var = ((com.app.mlounge.ui.viewmodel.p1) this.A).b;
                    float f4 = this.z;
                    this.y = 1;
                    Object objL = y1Var.l(f4, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objL == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(androidx.compose.ui.scrollcapture.c cVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.A = cVar;
    }
}
