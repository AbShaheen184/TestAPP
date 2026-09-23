package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements kotlin.jvm.functions.q {
    public final /* synthetic */ v A;
    public final /* synthetic */ androidx.compose.runtime.internal.f B;
    public final /* synthetic */ androidx.compose.runtime.snapshots.q y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.compose.runtime.snapshots.q qVar, Object obj, v vVar, androidx.compose.runtime.internal.f fVar) {
        super(3);
        this.y = qVar;
        this.z = obj;
        this.A = vVar;
        this.B = fVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h0 h0Var = (h0) obj;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? sVar.f(h0Var) : sVar.h(h0Var) ? 4 : 2;
        }
        if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            androidx.compose.runtime.snapshots.q qVar = this.y;
            boolean zF = sVar.f(qVar);
            Object obj4 = this.z;
            boolean zH = zF | sVar.h(obj4);
            v vVar = this.A;
            boolean zH2 = zH | sVar.h(vVar);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zH2 || objQ == fVar) {
                objQ = new h(0, qVar, obj4, vVar);
                sVar.l0(objQ);
            }
            androidx.compose.runtime.l0.b(h0Var, (kotlin.jvm.functions.l) objQ, sVar);
            androidx.collection.o0 o0Var = vVar.d;
            h0Var.getClass();
            o0Var.m(obj4, ((i0) h0Var).a);
            Object objQ2 = sVar.Q();
            if (objQ2 == fVar) {
                objQ2 = new p();
                sVar.l0(objQ2);
            }
            this.B.invoke((p) objQ2, obj4, sVar, 0);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
