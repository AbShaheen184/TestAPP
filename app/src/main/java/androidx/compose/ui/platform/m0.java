package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final androidx.compose.runtime.d0 a = new androidx.compose.runtime.d0(j0.z);
    public static final androidx.compose.runtime.x2 b = new androidx.compose.runtime.x2(j0.A);
    public static final androidx.compose.runtime.d0 c = new androidx.compose.runtime.d0(o.B);
    public static final androidx.compose.runtime.x2 d = new androidx.compose.runtime.x2(j0.B);
    public static final androidx.compose.runtime.x2 e = new androidx.compose.runtime.x2(j0.C);
    public static final androidx.compose.runtime.x2 f = new androidx.compose.runtime.x2(j0.D);

    public static final void a(u uVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        sVar.c0(-520299287);
        int i2 = (sVar.h(uVar) ? 4 : 2) | i | (sVar.h(pVar) ? 32 : 16);
        int i3 = 1;
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = uVar.getContext();
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = new u0();
                sVar.l0(objQ);
            }
            u0 u0Var = (u0) objQ;
            l viewTreeOwners = uVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                kotlinx.coroutines.future.a.u("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            androidx.savedstate.g gVar = viewTreeOwners.b;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                Object parent = uVar.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = androidx.compose.runtime.saveable.g.class.getSimpleName() + ':' + strValueOf;
                androidx.savedstate.e savedStateRegistry = gVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                o oVar = o.C;
                androidx.compose.runtime.x2 x2Var = androidx.compose.runtime.saveable.i.a;
                androidx.compose.runtime.saveable.h hVar = new androidx.compose.runtime.saveable.h(linkedHashMap, oVar);
                try {
                    savedStateRegistry.c(str, new androidx.activity.g(hVar, i3));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object o1Var = new o1(hVar, new p1(z, savedStateRegistry, str));
                sVar.l0(o1Var);
                objQ2 = o1Var;
            }
            Object obj2 = (o1) objQ2;
            boolean zH = sVar.h(obj2);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new androidx.compose.animation.e(obj2, 16);
                sVar.l0(objQ3);
            }
            androidx.compose.runtime.l0.b(kotlin.y.a, (kotlin.jvm.functions.l) objQ3, sVar);
            Object objQ4 = sVar.Q();
            if (objQ4 == obj) {
                objQ4 = s1.a(context) ? new androidx.compose.ui.hapticfeedback.b(uVar.getView(), 1) : new e2();
                sVar.l0(objQ4);
            }
            androidx.compose.ui.hapticfeedback.a aVar = (androidx.compose.ui.hapticfeedback.a) objQ4;
            Configuration configuration = uVar.getConfiguration();
            Object objQ5 = sVar.Q();
            if (objQ5 == obj) {
                objQ5 = new androidx.compose.ui.res.c();
                sVar.l0(objQ5);
            }
            androidx.compose.ui.res.c cVar = (androidx.compose.ui.res.c) objQ5;
            Object objQ6 = sVar.Q();
            Object obj3 = objQ6;
            if (objQ6 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.l0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objQ7 = sVar.Q();
            if (objQ7 == obj) {
                objQ7 = new k0(configuration3, cVar);
                sVar.l0(objQ7);
            }
            k0 k0Var = (k0) objQ7;
            boolean zH2 = sVar.h(context);
            Object objQ8 = sVar.Q();
            if (zH2 || objQ8 == obj) {
                objQ8 = new androidx.compose.animation.c(4, context, k0Var);
                sVar.l0(objQ8);
            }
            androidx.compose.runtime.l0.b(cVar, (kotlin.jvm.functions.l) objQ8, sVar);
            Object objQ9 = sVar.Q();
            if (objQ9 == obj) {
                objQ9 = new androidx.compose.ui.res.d();
                sVar.l0(objQ9);
            }
            androidx.compose.ui.res.d dVar = (androidx.compose.ui.res.d) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == obj) {
                objQ10 = new l0(dVar);
                sVar.l0(objQ10);
            }
            l0 l0Var = (l0) objQ10;
            boolean zH3 = sVar.h(context);
            Object objQ11 = sVar.Q();
            if (zH3 || objQ11 == obj) {
                objQ11 = new androidx.compose.animation.c(5, context, l0Var);
                sVar.l0(objQ11);
            }
            androidx.compose.runtime.l0.b(dVar, (kotlin.jvm.functions.l) objQ11, sVar);
            androidx.compose.runtime.r1 r1Var = l1.v;
            androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{a.a(uVar.getConfiguration()), b.a(context), androidx.lifecycle.compose.c.a.a(viewTreeOwners.a), androidx.savedstate.compose.a.a.a(gVar), androidx.compose.runtime.saveable.i.a.a(obj2), f.a(uVar.getView()), d.a(cVar), e.a(dVar), r1Var.a(Boolean.valueOf(((Boolean) sVar.j(r1Var)).booleanValue() | uVar.getScrollCaptureInProgress$ui())), l1.l.a(aVar)}, androidx.compose.runtime.internal.k.c(1059770793, new androidx.compose.ui.layout.i1(uVar, u0Var, pVar), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.ui.contentcapture.e(uVar, pVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
