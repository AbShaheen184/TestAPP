package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                b bVar = new b(this.z, dVar, 0);
                bVar.y = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.z, dVar, 1);
                bVar2.y = obj;
                return bVar2;
            case 2:
                b bVar3 = new b(this.z, dVar, 2);
                bVar3.y = obj;
                return bVar3;
            case 3:
                b bVar4 = new b(this.z, dVar, 3);
                bVar4.y = obj;
                return bVar4;
            case 4:
                b bVar5 = new b(this.z, dVar, 4);
                bVar5.y = obj;
                return bVar5;
            case 5:
                b bVar6 = new b(this.z, dVar, 5);
                bVar6.y = obj;
                return bVar6;
            case 6:
                b bVar7 = new b(this.z, dVar, 6);
                bVar7.y = obj;
                return bVar7;
            case 7:
                b bVar8 = new b(this.z, dVar, 7);
                bVar8.y = obj;
                return bVar8;
            case 8:
                b bVar9 = new b(this.z, dVar, 8);
                bVar9.y = obj;
                return bVar9;
            case 9:
                b bVar10 = new b(this.z, dVar, 9);
                bVar10.y = obj;
                return bVar10;
            case 10:
                b bVar11 = new b(this.z, dVar, 10);
                bVar11.y = obj;
                return bVar11;
            case 11:
                b bVar12 = new b(this.z, dVar, 11);
                bVar12.y = obj;
                return bVar12;
            default:
                b bVar13 = new b(this.z, dVar, 12);
                bVar13.y = obj;
                return bVar13;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                b bVar = (b) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                bVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                b bVar2 = (b) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                bVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                b bVar3 = (b) create(aVar, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                bVar3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                b bVar4 = (b) create(aVar, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                bVar4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                b bVar5 = (b) create(aVar, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                bVar5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                b bVar6 = (b) create(aVar, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                bVar6.invokeSuspend(yVar6);
                return yVar6;
            case 6:
                b bVar7 = (b) create(aVar, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                bVar7.invokeSuspend(yVar7);
                return yVar7;
            case 7:
                b bVar8 = (b) create(aVar, dVar);
                kotlin.y yVar8 = kotlin.y.a;
                bVar8.invokeSuspend(yVar8);
                return yVar8;
            case 8:
                b bVar9 = (b) create(aVar, dVar);
                kotlin.y yVar9 = kotlin.y.a;
                bVar9.invokeSuspend(yVar9);
                return yVar9;
            case 9:
                b bVar10 = (b) create(aVar, dVar);
                kotlin.y yVar10 = kotlin.y.a;
                bVar10.invokeSuspend(yVar10);
                return yVar10;
            case 10:
                b bVar11 = (b) create(aVar, dVar);
                kotlin.y yVar11 = kotlin.y.a;
                bVar11.invokeSuspend(yVar11);
                return yVar11;
            case 11:
                b bVar12 = (b) create(aVar, dVar);
                kotlin.y yVar12 = kotlin.y.a;
                bVar12.invokeSuspend(yVar12);
                return yVar12;
            default:
                b bVar13 = (b) create(aVar, dVar);
                kotlin.y yVar13 = kotlin.y.a;
                bVar13.invokeSuspend(yVar13);
                return yVar13;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        boolean z = this.z;
        switch (i) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.k0, Boolean.valueOf(z));
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar = y1.k0;
                aVar2.e(y1.c1, Boolean.valueOf(z));
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar2 = y1.k0;
                aVar3.e(y1.E0, Boolean.valueOf(z));
                break;
            case 3:
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = y1.k0;
                aVar4.e(y1.o1, Boolean.valueOf(z));
                break;
            case 4:
                androidx.datastore.preferences.core.a aVar5 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar4 = y1.k0;
                aVar5.e(y1.p1, Boolean.valueOf(z));
                break;
            case 5:
                androidx.datastore.preferences.core.a aVar6 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar5 = y1.k0;
                aVar6.e(y1.T0, Boolean.valueOf(z));
                break;
            case 6:
                androidx.datastore.preferences.core.a aVar7 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar6 = y1.k0;
                aVar7.e(y1.R0, Boolean.valueOf(z));
                break;
            case 7:
                androidx.datastore.preferences.core.a aVar8 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar7 = y1.k0;
                aVar8.e(y1.P0, Boolean.valueOf(z));
                break;
            case 8:
                androidx.datastore.preferences.core.a aVar9 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar8 = y1.k0;
                aVar9.e(y1.m0, Boolean.valueOf(z));
                break;
            case 9:
                androidx.datastore.preferences.core.a aVar10 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar9 = y1.k0;
                aVar10.e(y1.o0, Boolean.valueOf(z));
                break;
            case 10:
                androidx.datastore.preferences.core.a aVar11 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar10 = y1.k0;
                aVar11.e(y1.n0, Boolean.valueOf(z));
                break;
            case 11:
                androidx.datastore.preferences.core.a aVar12 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar11 = y1.k0;
                aVar12.e(y1.F0, Boolean.valueOf(z));
                break;
            default:
                androidx.datastore.preferences.core.a aVar13 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar12 = y1.k0;
                aVar13.e(y1.Z0, Boolean.valueOf(z));
                break;
        }
        return yVar;
    }
}
