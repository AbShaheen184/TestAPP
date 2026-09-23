package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.m mVar, boolean z, j jVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = kVar;
        this.B = mVar;
        this.z = z;
        this.C = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g((androidx.compose.foundation.interaction.k) this.A, (androidx.compose.foundation.interaction.m) this.B, this.z, (j) this.C, dVar);
            case 1:
                return new g((androidx.compose.runtime.a1) this.C, this.z, (androidx.compose.foundation.interaction.k) this.A, dVar);
            case 2:
                g gVar = new g((com.app.mlounge.data.repository.r) this.B, this.z, (String) this.C, dVar);
                gVar.A = obj;
                return gVar;
            case 3:
                return new g(this.z, (androidx.compose.runtime.a1) this.A, (androidx.compose.runtime.a1) this.B, (androidx.compose.runtime.a1) this.C, dVar);
            default:
                return new g((com.app.mlounge.ui.viewmodel.p1) this.B, (String) this.C, this.z, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((g) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x024b  */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) this.B;
                int i = this.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    jVar = (j) this.C;
                    if (this.z) {
                        jVar.c0 = mVar;
                    } else {
                        jVar.Y = mVar;
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                long j = f0.a;
                this.y = 1;
                if (DelayKt.delay(j, this) == aVar) {
                    return aVar;
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) this.A;
                this.y = 2;
                if (kVar.b(mVar, this) == aVar) {
                    return aVar;
                }
                jVar = (j) this.C;
                if (this.z) {
                    jVar.c0 = mVar;
                } else {
                    jVar.Y = mVar;
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.C;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.m mVar2 = (androidx.compose.foundation.interaction.m) a1Var.getValue();
                    if (mVar2 != null) {
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) this.A;
                        androidx.compose.foundation.interaction.i nVar = this.z ? new androidx.compose.foundation.interaction.n(mVar2) : new androidx.compose.foundation.interaction.l(mVar2);
                        if (kVar2 != null) {
                            this.B = a1Var;
                            this.y = 1;
                            Object objB = kVar2.b(nVar, this);
                            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                            if (objB == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    return kotlin.y.a;
                }
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a1Var = (androidx.compose.runtime.a1) this.B;
                kotlin.a.e(obj);
                a1Var.setValue(null);
                return kotlin.y.a;
            case 2:
                com.app.mlounge.data.repository.r rVar = (com.app.mlounge.data.repository.r) this.B;
                CoroutineScope coroutineScope = (CoroutineScope) this.A;
                int i3 = this.y;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i3 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    arrayList = new ArrayList();
                    for (Iterable iterable : (Iterable) obj) {
                        if (iterable == null) {
                            iterable = kotlin.collections.w.e;
                        }
                        kotlin.collections.p.t(arrayList, iterable);
                    }
                    return arrayList;
                }
                kotlin.a.e(obj);
                Flow flow = rVar.f.p;
                this.A = coroutineScope;
                this.y = 1;
                obj = FlowKt.first(flow, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                CharSequence charSequence = (CharSequence) obj;
                List listA = com.app.mlounge.data.repository.r.a(rVar, "movie", this.z, !(charSequence == null || kotlin.text.k.J(charSequence)));
                String str = (String) this.C;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(listA, 10));
                Iterator it = listA.iterator();
                while (true) {
                    kotlin.coroutines.d dVar = null;
                    if (!it.hasNext()) {
                        this.A = null;
                        this.y = 2;
                        obj = AwaitKt.awaitAll(arrayList3, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            if (iterable == null) {
                                iterable = kotlin.collections.w.e;
                            }
                            kotlin.collections.p.t(arrayList, iterable);
                        }
                        return arrayList;
                    }
                    arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new androidx.room.coroutines.c0((com.app.mlounge.data.providers.l0) it.next(), str, dVar, 7), 3, null));
                }
                break;
            case 3:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new androidx.activity.compose.n(2, 3, null), this);
                    kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                com.app.mlounge.ui.components.y0 y0Var = (com.app.mlounge.ui.components.y0) obj;
                if (y0Var != null && y0Var.a > 802) {
                    ((androidx.compose.runtime.a1) this.A).setValue(y0Var);
                    ((androidx.compose.runtime.a1) this.B).setValue(Boolean.TRUE);
                } else if (this.z) {
                    ((androidx.compose.runtime.a1) this.C).setValue(Boolean.TRUE);
                }
                return kotlin.y.a;
            default:
                com.app.mlounge.data.local.prefs.y1 y1Var = ((com.app.mlounge.ui.viewmodel.p1) this.B).b;
                int i5 = this.y;
                kotlin.y yVar = kotlin.y.a;
                kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    List list = com.app.mlounge.ui.navigation.w.f;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.r.p(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((com.app.mlounge.ui.navigation.w) it2.next()).a);
                    }
                    Flow flow2 = y1Var.Q;
                    this.A = arrayList4;
                    this.y = 1;
                    obj = FlowKt.first(flow2, this);
                    arrayList2 = arrayList4;
                    if (obj != aVar5) {
                    }
                    return aVar5;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList5 = (ArrayList) this.A;
                kotlin.a.e(obj);
                arrayList2 = arrayList5;
                Collection collection = (Collection) obj;
                Collection collection2 = arrayList2;
                if (!collection.isEmpty()) {
                    collection2 = collection;
                }
                List list2 = (List) collection2;
                int iIndexOf = list2.indexOf((String) this.C);
                if (iIndexOf < 0) {
                    return yVar;
                }
                int i6 = this.z ? iIndexOf - 1 : iIndexOf + 1;
                if (i6 < 0 || i6 >= list2.size()) {
                    return yVar;
                }
                ArrayList arrayList6 = new ArrayList(list2);
                arrayList6.add(i6, (String) arrayList6.remove(iIndexOf));
                this.A = null;
                this.y = 2;
                Object objH = _COROUTINE.a.H(com.app.mlounge.data.local.prefs.z1.a(y1Var.a), new androidx.compose.foundation.text.input.internal.k(arrayList6, null, 6), this);
                if (objH != aVar5) {
                    objH = yVar;
                }
                if (objH != aVar5) {
                    return yVar;
                }
                return aVar5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.compose.runtime.a1 a1Var, boolean z, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = a1Var;
        this.z = z;
        this.A = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.app.mlounge.data.repository.r rVar, boolean z, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = rVar;
        this.z = z;
        this.C = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.app.mlounge.ui.viewmodel.p1 p1Var, String str, boolean z, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = p1Var;
        this.C = str;
        this.z = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z, androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.a1 a1Var2, androidx.compose.runtime.a1 a1Var3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = z;
        this.A = a1Var;
        this.B = a1Var2;
        this.C = a1Var3;
    }
}
