package coil3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final p a(Context context) {
        p pVar;
        p pVar2;
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        p pVar3 = obj instanceof p ? (p) obj : null;
        if (pVar3 != null) {
            return pVar3;
        }
        p pVarB = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof p) {
                pVar = (p) obj2;
                pVar2 = pVarB;
            } else {
                if (pVarB == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof r) {
                        rVar4 = (r) obj2;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null) {
                        rVar = rVar4;
                        pVarB = rVar.b(applicationContext);
                    } else {
                        if (applicationContext instanceof r) {
                            rVar3 = (r) applicationContext;
                        } else {
                            rVar2 = null;
                        }
                        if (rVar2 != null) {
                            rVar = rVar4;
                            rVar = rVar4;
                            rVar2 = rVar3;
                            pVarB = rVar2.b(applicationContext);
                        } else {
                            rVar = rVar4;
                            rVar = rVar4;
                            rVar2 = rVar3;
                            pVarB = u.a.b(applicationContext);
                        }
                    }
                }
                pVar = pVarB;
                pVar2 = pVar;
            }
            while (!atomicReference.compareAndSet(obj2, pVar)) {
                if (atomicReference.get() != obj2) {
                    pVarB = pVar2;
                }
            }
            return pVar;
        }
    }
}
