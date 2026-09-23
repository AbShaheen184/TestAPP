package com.app.mlounge.ui.theme;

import android.os.Handler;
import android.os.Looper;
import com.appsalt.internal.j0;
import java.util.ArrayList;
import kotlin.collections.o;
import kotlin.text.k;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.json.n;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.u;
import kotlinx.serialization.json.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return a.MEDIUM;
            case 1:
                com.google.firebase.crashlytics.b bVar = (com.google.firebase.crashlytics.b) com.google.firebase.g.c().b(com.google.firebase.crashlytics.b.class);
                if (bVar != null) {
                    return bVar;
                }
                com.google.firebase.platforminfo.b.h("FirebaseCrashlytics component is not present.");
                return null;
            case 2:
                j0 j0Var = new j0(7);
                new ArrayList();
                return j0Var;
            case 3:
                return new Handler(Looper.getMainLooper());
            case 4:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 5:
                i iVar = i.e;
                kotlinx.serialization.descriptors.e[] eVarArr = new kotlinx.serialization.descriptors.e[0];
                if (k.J("kotlin.Unit")) {
                    kotlinx.coroutines.future.a.q("Blank serial names are prohibited");
                } else {
                    if (!iVar.equals(i.b)) {
                        kotlinx.serialization.descriptors.a aVar = new kotlinx.serialization.descriptors.a("kotlin.Unit");
                        return new kotlinx.serialization.descriptors.g("kotlin.Unit", iVar, aVar.b.size(), o.C(eVarArr), aVar);
                    }
                    kotlinx.coroutines.future.a.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 6:
                return x.b;
            case 7:
                return q.b;
            case 8:
                return n.b;
            case 9:
                return u.b;
            default:
                return kotlinx.serialization.json.f.b;
        }
    }

    public /* synthetic */ f(int i) {
        this.e = i;
    }
}
