package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object e;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(float f, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        j jVar = new j(this.y, dVar);
        jVar.e = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        jVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.e;
        kotlin.a.e(obj);
        androidx.datastore.preferences.core.d dVar = y1.k0;
        aVar.e(y1.Q0, new Float(this.y));
        return kotlin.y.a;
    }
}
