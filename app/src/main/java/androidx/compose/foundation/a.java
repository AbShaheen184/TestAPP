package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ j y;

    public /* synthetic */ a(j jVar, int i) {
        this.e = i;
        this.y = jVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.compose.ui.node.j jVar;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.d0 d0Var = b1.a;
                j jVar2 = this.y;
                e1 e1Var = (e1) androidx.compose.ui.node.l.h(jVar2, d0Var);
                if (e1Var == null) {
                    androidx.compose.foundation.internal.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + e1Var);
                }
                e1 e1Var2 = jVar2.V;
                jVar2.V = e1Var;
                if (e1Var2 != null && !kotlin.jvm.internal.l.a(e1Var, e1Var2) && ((jVar = jVar2.X) != null || !jVar2.e0)) {
                    if (jVar != null) {
                        jVar2.N0(jVar);
                    }
                    jVar2.X = null;
                    jVar2.W0();
                }
                return kotlin.y.a;
            default:
                this.y.T.invoke();
                return Boolean.TRUE;
        }
    }
}
