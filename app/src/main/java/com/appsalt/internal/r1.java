package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements d2 {
    public final String a;
    public final g1 b;
    public final n1 c;
    public final k1 d;

    public r1(String str, g1 g1Var, n1 n1Var, k1 k1Var) {
        this.a = str;
        this.b = g1Var;
        this.c = n1Var;
        this.d = k1Var;
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
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (!this.a.equals(r1Var.a) || !this.b.equals(r1Var.b) || !this.c.equals(r1Var.c) || !this.d.equals(r1Var.d)) {
            return false;
        }
        m mVar = m.a;
        return mVar.equals(mVar);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + (((Build.VERSION.RELEASE.hashCode() - 933324943) + ((this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g((((Integer.hashCode(2) + 472381993) * 31) + 485665020) * 31, 31, this.a)) * 31)) * 31)) * 31) + 1146009431;
    }

    public final String toString() {
        return "Platform(version=1.5.0-SNAPSHOT, protocol=2, cid=HASDKANKTLKTLWQ251023PA, uid=" + this.a + ", app=" + this.b + ", os=" + this.c + ", optional=" + this.d + ", features=" + m.a + ')';
    }
}
