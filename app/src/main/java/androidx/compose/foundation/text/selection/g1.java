package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ g1(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        kotlin.jvm.functions.a aVar = this.y;
        switch (i) {
            case 0:
                return (androidx.compose.ui.geometry.b) aVar.invoke();
            case 1:
                aVar.invoke();
                return yVar;
            case 2:
                aVar.invoke();
                return yVar;
            case 3:
                androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj;
                Object objInvoke = aVar.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                androidx.compose.ui.semantics.i iVar = new androidx.compose.ui.semantics.i(f != null ? f.floatValue() : 0.0f, new kotlin.ranges.a(1.0f));
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.c;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[1];
                a0Var.b(zVar, iVar);
                return yVar;
            case 4:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) aVar.invoke()).floatValue());
            default:
                ((androidx.sqlite.a) obj).getClass();
                return aVar.invoke();
        }
    }
}
