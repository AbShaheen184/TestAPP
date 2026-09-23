package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static com.app.mlounge.data.music.e a;
    public static org.schabi.newpipe.extractor.localization.c b;
    public static org.schabi.newpipe.extractor.localization.a c;

    public static final String a(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static kotlin.collections.builders.h b(kotlin.collections.builders.h hVar) {
        hVar.e.b();
        return hVar.size() > 0 ? hVar : kotlin.collections.builders.h.y;
    }

    public static kotlinx.serialization.descriptors.g c(String str, i0 i0Var, kotlinx.serialization.descriptors.e[] eVarArr) {
        if (kotlin.text.k.J(str)) {
            kotlinx.coroutines.future.a.q("Blank serial names are prohibited");
            return null;
        }
        if (i0Var.equals(kotlinx.serialization.descriptors.i.b)) {
            kotlinx.coroutines.future.a.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a(str);
        return new kotlinx.serialization.descriptors.g(str, i0Var, aVar.b.size(), o.C(eVarArr), aVar);
    }

    public static void e(com.app.mlounge.data.music.e eVar) {
        org.schabi.newpipe.extractor.utils.a aVar = org.schabi.newpipe.extractor.utils.b.b;
        org.schabi.newpipe.extractor.utils.a aVar2 = org.schabi.newpipe.extractor.utils.b.a;
        if (aVar != aVar2) {
            androidx.constraintlayout.core.g.e(1);
        }
        org.schabi.newpipe.extractor.localization.c cVar = org.schabi.newpipe.extractor.localization.c.z;
        if (aVar != aVar2) {
            androidx.constraintlayout.core.g.e(1);
        }
        org.schabi.newpipe.extractor.localization.a aVar3 = cVar.a().isEmpty() ? org.schabi.newpipe.extractor.localization.a.y : new org.schabi.newpipe.extractor.localization.a(cVar.a());
        org.schabi.newpipe.extractor.utils.b.b("Initializing with downloader={}, localization={}, country={}", eVar, cVar, aVar3);
        a = eVar;
        b = cVar;
        c = aVar3;
    }

    public static LinkedHashSet f(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.j(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.l.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set g(Set set, Iterable iterable) {
        iterable.getClass();
        Collection<?> collectionB0 = iterable instanceof Collection ? (Collection) iterable : p.b0(iterable);
        if (collectionB0.isEmpty()) {
            return p.f0(set);
        }
        if (!(collectionB0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionB0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionB0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet h(Set set, Iterable iterable) {
        int size;
        set.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.j(size));
        linkedHashSet.addAll(set);
        p.t(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet i(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set k(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public abstract Object d(kotlin.jvm.internal.e eVar);

    public abstract g0 j(kotlin.jvm.internal.e eVar, Object obj);
}
