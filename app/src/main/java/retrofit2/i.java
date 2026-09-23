package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {
    public final /* synthetic */ int e;
    public final Type y;

    public /* synthetic */ i(int i, Type type) {
        this.e = i;
        this.y = type;
    }

    @Override // retrofit2.f
    public final Type a() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y;
    }

    @Override // retrofit2.f
    public final Object b(z zVar) {
        switch (this.e) {
            case 0:
                j jVar = new j(zVar);
                zVar.x(new h(jVar, 0));
                return jVar;
            default:
                j jVar2 = new j(zVar);
                zVar.x(new h(jVar2, 1));
                return jVar2;
        }
    }
}
