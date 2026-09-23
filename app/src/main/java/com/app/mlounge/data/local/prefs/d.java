package com.app.mlounge.data.local.prefs;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ LinkedHashSet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(LinkedHashSet linkedHashSet, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = linkedHashSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                d dVar2 = new d(this.z, dVar, 0);
                dVar2.y = obj;
                return dVar2;
            default:
                d dVar3 = new d(this.z, dVar, 1);
                dVar3.y = obj;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                d dVar2 = (d) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                dVar2.invokeSuspend(yVar);
                return yVar;
            default:
                d dVar3 = (d) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                dVar3.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.a1, this.z);
                break;
            default:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar2.e(y1.C0, this.z);
                break;
        }
        return kotlin.y.a;
    }
}
