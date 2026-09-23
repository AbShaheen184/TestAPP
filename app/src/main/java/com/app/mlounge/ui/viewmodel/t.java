package com.app.mlounge.ui.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a0 a0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new t(this.z, dVar, 0);
            default:
                return new t(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((t) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[Catch: all -> 0x0022, Exception -> 0x0025, LOOP:0: B:22:0x007b->B:24:0x0081, LOOP_END, Merged into TryCatch #0 {all -> 0x0022, Exception -> 0x0025, blocks: (B:7:0x001d, B:12:0x0028, B:41:0x00c9, B:44:0x00d3, B:47:0x00e2, B:13:0x002d, B:21:0x006a, B:22:0x007b, B:24:0x0081, B:25:0x008f, B:16:0x003d, B:18:0x0053, B:26:0x0094, B:28:0x009c, B:31:0x00a7, B:33:0x00af, B:36:0x00b9, B:38:0x00bf, B:48:0x00fb, B:50:0x0103, B:54:0x0113, B:57:0x011b), top: B:78:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[Catch: all -> 0x0022, Exception -> 0x0025, Merged into TryCatch #0 {all -> 0x0022, Exception -> 0x0025, blocks: (B:7:0x001d, B:12:0x0028, B:41:0x00c9, B:44:0x00d3, B:47:0x00e2, B:13:0x002d, B:21:0x006a, B:22:0x007b, B:24:0x0081, B:25:0x008f, B:16:0x003d, B:18:0x0053, B:26:0x0094, B:28:0x009c, B:31:0x00a7, B:33:0x00af, B:36:0x00b9, B:38:0x00bf, B:48:0x00fb, B:50:0x0103, B:54:0x0113, B:57:0x011b), top: B:78:0x0012 }, TRY_ENTER] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2 A[Catch: all -> 0x0022, Exception -> 0x0025, Merged into TryCatch #0 {all -> 0x0022, Exception -> 0x0025, blocks: (B:7:0x001d, B:12:0x0028, B:41:0x00c9, B:44:0x00d3, B:47:0x00e2, B:13:0x002d, B:21:0x006a, B:22:0x007b, B:24:0x0081, B:25:0x008f, B:16:0x003d, B:18:0x0053, B:26:0x0094, B:28:0x009c, B:31:0x00a7, B:33:0x00af, B:36:0x00b9, B:38:0x00bf, B:48:0x00fb, B:50:0x0103, B:54:0x0113, B:57:0x011b), top: B:78:0x0012 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        boolean zBooleanValue;
        MutableStateFlow mutableStateFlow;
        switch (this.e) {
            case 0:
                int i = this.y;
                a0 a0Var = this.z;
                if (i == 0) {
                    kotlin.a.e(obj);
                    Flow flow = a0Var.j.j0;
                    this.y = 1;
                    obj = FlowKt.first(flow, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                String str = (String) obj;
                if (!kotlin.text.k.J(str) && a0Var.x.contains(str)) {
                    a0Var.v.setValue(str);
                }
                a0Var.n();
                return kotlin.y.a;
            default:
                a0 a0Var2 = this.z;
                MutableStateFlow mutableStateFlow2 = a0Var2.t;
                MutableStateFlow mutableStateFlow3 = a0Var2.r;
                int i2 = this.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                try {
                    switch (i2) {
                        case 0:
                            kotlin.a.e(obj);
                            mutableStateFlow3.setValue(Boolean.TRUE);
                            mutableStateFlow2.setValue(null);
                            String str2 = (String) a0Var2.v.getValue();
                            String str3 = (String) a0Var2.y.getValue();
                            if (!kotlin.text.k.J(str3)) {
                                com.app.mlounge.data.local.dao.i iVar = a0Var2.i;
                                this.y = 1;
                                obj = okhttp3.internal.platform.android.g.u(((com.app.mlounge.data.local.dao.j) iVar).a, true, false, new com.app.mlounge.data.local.dao.e(str2, str3, 2), this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                Iterable iterable = (Iterable) obj;
                                arrayList = new ArrayList(kotlin.collections.r.p(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(a0.o((com.app.mlounge.data.local.entity.d) it.next()));
                                }
                                a0Var2.p(arrayList, true);
                            } else if (kotlin.jvm.internal.l.a(str2, "ntv")) {
                                this.y = 2;
                                if (a0.h(a0Var2, this) == aVar2) {
                                    return aVar2;
                                }
                            } else if (kotlin.jvm.internal.l.a(str2, "sports")) {
                                this.y = 3;
                                if (a0.i(a0Var2, this) == aVar2) {
                                    return aVar2;
                                }
                            } else if (kotlin.jvm.internal.l.a(str2, com.app.mlounge.data.iptv.l.SLUG)) {
                                this.y = 4;
                                obj = a0.e(a0Var2, this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                mutableStateFlow = a0Var2.G;
                                if (zBooleanValue) {
                                    mutableStateFlow.setValue(Boolean.FALSE);
                                    this.y = 5;
                                    if (a0.g(a0Var2, com.app.mlounge.data.iptv.l.SLUG, this) == aVar2) {
                                        return aVar2;
                                    }
                                } else {
                                    mutableStateFlow.setValue(Boolean.TRUE);
                                    MutableStateFlow mutableStateFlow4 = a0Var2.k;
                                    kotlin.collections.w wVar = kotlin.collections.w.e;
                                    mutableStateFlow4.setValue(wVar);
                                    a0Var2.n.setValue(wVar);
                                    a0Var2.E.setValue(kotlin.collections.x.e);
                                }
                            } else if (a0Var2.T.contains(str2)) {
                                this.y = 6;
                                if (a0.g(a0Var2, str2, this) == aVar2) {
                                    return aVar2;
                                }
                            }
                            return kotlin.y.a;
                        case 1:
                            kotlin.a.e(obj);
                            Iterable iterable2 = (Iterable) obj;
                            arrayList = new ArrayList(kotlin.collections.r.p(iterable2, 10));
                            it = iterable2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(a0.o((com.app.mlounge.data.local.entity.d) it.next()));
                            }
                            a0Var2.p(arrayList, true);
                            return kotlin.y.a;
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                            kotlin.a.e(obj);
                            return kotlin.y.a;
                        case 4:
                            kotlin.a.e(obj);
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            mutableStateFlow = a0Var2.G;
                            if (zBooleanValue) {
                                mutableStateFlow.setValue(Boolean.FALSE);
                                this.y = 5;
                                if (a0.g(a0Var2, com.app.mlounge.data.iptv.l.SLUG, this) == aVar2) {
                                    return aVar2;
                                }
                            } else {
                                mutableStateFlow.setValue(Boolean.TRUE);
                                MutableStateFlow mutableStateFlow5 = a0Var2.k;
                                kotlin.collections.w wVar2 = kotlin.collections.w.e;
                                mutableStateFlow5.setValue(wVar2);
                                a0Var2.n.setValue(wVar2);
                                a0Var2.E.setValue(kotlin.collections.x.e);
                            }
                            return kotlin.y.a;
                        default:
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to load channels";
                    }
                    mutableStateFlow2.setValue(message);
                } finally {
                    mutableStateFlow3.setValue(Boolean.FALSE);
                }
                break;
        }
    }
}
