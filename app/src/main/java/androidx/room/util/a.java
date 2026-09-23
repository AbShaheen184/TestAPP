package androidx.room.util;

import androidx.room.coroutines.k;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.z = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                a aVar = new a(0, dVar, this.z);
                aVar.y = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, dVar, this.z);
                aVar2.y = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.z, dVar);
                aVar3.y = obj;
                return aVar3;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((a) create((k) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 1:
                return ((a) create((k) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            default:
                a aVar = (a) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                aVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                k kVar = (k) this.y;
                kVar.getClass();
                return this.z.invoke(kVar.d());
            case 1:
                kotlin.a.e(obj);
                k kVar2 = (k) this.y;
                kVar2.getClass();
                return this.z.invoke(kVar2.d());
            default:
                kotlin.a.e(obj);
                this.z.invoke((androidx.datastore.preferences.core.a) this.y);
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, kotlin.coroutines.d dVar, l lVar) {
        super(2, dVar);
        this.e = i;
        this.z = lVar;
    }
}
