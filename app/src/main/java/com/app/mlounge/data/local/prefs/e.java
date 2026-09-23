package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, String str2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = str;
        this.A = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                e eVar = new e(this.z, this.A, dVar, 0);
                eVar.y = obj;
                return eVar;
            case 1:
                e eVar2 = new e(this.z, this.A, dVar, 1);
                eVar2.y = obj;
                return eVar2;
            case 2:
                e eVar3 = new e(this.z, this.A, dVar, 2);
                eVar3.y = obj;
                return eVar3;
            default:
                e eVar4 = new e(this.z, this.A, dVar, 3);
                eVar4.y = obj;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                e eVar = (e) create(aVar, dVar);
                kotlin.y yVar = kotlin.y.a;
                eVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                e eVar2 = (e) create(aVar, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                eVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                e eVar3 = (e) create(aVar, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                eVar3.invokeSuspend(yVar3);
                return yVar3;
            default:
                e eVar4 = (e) create(aVar, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                eVar4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        String str = this.A;
        String str2 = this.z;
        switch (i) {
            case 0:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 == null) {
                    aVar.d(y1.x0);
                } else {
                    aVar.e(y1.x0, str2);
                }
                if (str != null) {
                    aVar.e(y1.y0, str);
                } else {
                    aVar.d(y1.y0);
                }
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 != null) {
                    aVar2.e(y1.X0, str2);
                    androidx.datastore.preferences.core.d dVar = y1.Y0;
                    if (str == null) {
                        str = str2;
                    }
                    aVar2.e(dVar, str);
                } else {
                    aVar2.d(y1.X0);
                    aVar2.d(y1.Y0);
                }
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                if (str2 != null) {
                    aVar3.e(y1.M0, str2);
                    androidx.datastore.preferences.core.d dVar2 = y1.N0;
                    if (str == null) {
                        str = str2;
                    }
                    aVar3.e(dVar2, str);
                } else {
                    aVar3.d(y1.M0);
                    aVar3.d(y1.N0);
                }
                break;
            default:
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = y1.k0;
                aVar4.e(y1.v0, str2);
                aVar4.e(y1.w0, str);
                break;
        }
        return yVar;
    }
}
