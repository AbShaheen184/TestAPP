package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import jdk.dynalink.linker.support.Guards;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class BooleanLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static boolean eq(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static boolean testEq(Object obj, Object obj2) {
        return (obj instanceof Boolean) && (obj2 instanceof Boolean);
    }

    private static boolean toBoolean(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public boolean canLinkType(Class<?> cls) {
        return Boolean.class.equals(cls);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) throws IllegalAccessException, NoSuchMethodException {
        MethodHandle methodHandleFindStatic;
        MethodHandle instanceOfGuard;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        if (parsedOperation.isNamespace(RhinoNamespace.MATH)) {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodType methodType = linkRequest.getCallSiteDescriptor().getMethodType();
            if (parsedOperation.isOperation(RhinoOperation.EQ, RhinoOperation.SHALLOWEQ) && (linkRequest.getArguments()[1] instanceof Boolean)) {
                methodHandleFindStatic = lookup.findStatic(BooleanLinker.class, "eq", methodType);
                instanceOfGuard = lookup.findStatic(BooleanLinker.class, "testEq", methodType);
            } else if (parsedOperation.isOperation(RhinoOperation.TOBOOLEAN)) {
                methodHandleFindStatic = lookup.findStatic(BooleanLinker.class, "toBoolean", methodType);
                instanceOfGuard = Guards.getInstanceOfGuard(Boolean.class);
            } else {
                methodHandleFindStatic = null;
                instanceOfGuard = null;
            }
        } else {
            methodHandleFindStatic = null;
            instanceOfGuard = null;
        }
        if (methodHandleFindStatic == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" boolean operation"));
        }
        return new GuardedInvocation(methodHandleFindStatic, instanceOfGuard);
    }
}
