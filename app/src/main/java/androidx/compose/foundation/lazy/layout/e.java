package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.q {
    public androidx.compose.ui.spatial.d L;
    public final /* synthetic */ f M;

    public e(f fVar) {
        this.M = fVar;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        f fVar = this.M;
        fVar.b = this;
        if (fVar.c != null) {
            M0();
        }
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        f fVar = this.M;
        if (fVar.b == this) {
            fVar.b = null;
        }
        androidx.compose.ui.spatial.d dVar = this.L;
        if (dVar != null) {
            dVar.b();
        }
        this.L = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void M0() {
        androidx.activity.compose.h hVar = new androidx.activity.compose.h(19, this, this.M);
        androidx.compose.ui.node.f0 f0VarV = androidx.compose.ui.node.l.v(this);
        int i = f0VarV.y;
        androidx.compose.ui.spatial.b rectManager = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(f0VarV)).getRectManager();
        androidx.compose.ui.spatial.e eVar = rectManager.b;
        eVar.getClass();
        androidx.collection.z zVar = eVar.a;
        androidx.compose.ui.spatial.d dVar = new androidx.compose.ui.spatial.d(eVar, i, this, hVar);
        Object objB = zVar.b(i);
        if (objB == null) {
            zVar.h(i, dVar);
            objB = dVar;
        }
        androidx.compose.ui.spatial.d dVar2 = (androidx.compose.ui.spatial.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                androidx.compose.ui.spatial.d dVar3 = dVar2.d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.d = dVar;
        }
        if (androidx.compose.ui.node.l.v(this.e).E) {
            rectManager.a.s(i, true);
        }
        rectManager.d = true;
        rectManager.j();
        this.L = dVar;
    }
}
