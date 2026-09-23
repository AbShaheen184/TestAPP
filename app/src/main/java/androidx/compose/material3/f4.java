package androidx.compose.material3;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 implements kotlin.jvm.functions.q {
    public final /* synthetic */ androidx.compose.ui.text.input.g0 A;
    public final /* synthetic */ androidx.compose.foundation.interaction.k B;
    public final /* synthetic */ kotlin.jvm.functions.p C;
    public final /* synthetic */ kotlin.jvm.functions.p D;
    public final /* synthetic */ kotlin.jvm.functions.p E;
    public final /* synthetic */ kotlin.jvm.functions.p F;
    public final /* synthetic */ u5 G;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 H;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public f4(String str, boolean z, boolean z2, androidx.compose.ui.text.input.g0 g0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, u5 u5Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = str;
        this.y = z;
        this.z = z2;
        this.A = g0Var;
        this.B = kVar;
        this.C = pVar;
        this.D = pVar2;
        this.E = pVar3;
        this.F = pVar4;
        this.G = u5Var;
        this.H = n0Var;
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
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) obj;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= sVar.h(pVar) ? 4 : 2;
        }
        if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            int i = iIntValue;
            b4 b4Var = b4.a;
            androidx.compose.ui.graphics.n0 n0Var = this.H;
            boolean z = this.y;
            androidx.compose.foundation.interaction.k kVar = this.B;
            u5 u5Var = this.G;
            b4Var.b(this.e, pVar, z, this.z, this.A, kVar, this.C, this.D, this.E, this.F, u5Var, null, androidx.compose.runtime.internal.k.c(-656940872, new e4(z, kVar, u5Var, n0Var), sVar), sVar, (i << 3) & Token.ASSIGN_MOD);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
