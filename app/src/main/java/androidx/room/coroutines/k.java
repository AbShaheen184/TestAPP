package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements b0, androidx.room.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        switch (this.a) {
            case 0:
                return ((o) this.b).b(str, lVar, cVar);
            default:
                return ((a0) this.b).b(str, lVar, cVar);
        }
    }

    @Override // androidx.room.coroutines.b0
    public final androidx.sqlite.a d() {
        switch (this.a) {
            case 0:
                return ((o) this.b).b;
            default:
                return ((a0) this.b).b;
        }
    }
}
