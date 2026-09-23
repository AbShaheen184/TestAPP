package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.text.n0;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w0 {
    public final androidx.compose.ui.node.m b;

    public e0(androidx.compose.ui.node.m mVar) {
        this.b = mVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new f0(n0.b, this.b);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        a aVar = n0.b;
        return aVar.equals(aVar) && kotlin.jvm.internal.l.a(this.b, e0Var.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        f0 f0Var = (f0) qVar;
        a aVar = n0.b;
        if (!kotlin.jvm.internal.l.a(f0Var.M, aVar)) {
            f0Var.M = aVar;
            if (f0Var.N) {
                f0Var.O0();
            }
        }
        f0Var.L = this.b;
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(1022 * 31, 31, false);
        androidx.compose.ui.node.m mVar = this.b;
        return iH + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + n0.b + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ')';
    }
}
