package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.activity.w;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g, androidx.savedstate.g {
    public final /* synthetic */ h e;
    public x y;
    public androidx.savedstate.f z;

    public j(h hVar) {
        this.e = hVar;
        Object objC = hVar.c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objC instanceof Bundle ? (Bundle) objC : null;
        if (bundle != null && this.z == null) {
            androidx.savedstate.f fVar = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.navigation.internal.h(this, 6)));
            this.z = fVar;
            fVar.b(bundle);
        }
        hVar.d("androidx.savedstate.SavedStateRegistry", new w(this, 22));
    }

    @Override // androidx.compose.runtime.saveable.g
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.g
    public final Map b() {
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.g
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.g
    public final f d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        x xVar = this.y;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this, false);
        this.y = xVar2;
        return xVar2;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        androidx.savedstate.f fVar = this.z;
        if (fVar == null) {
            androidx.savedstate.f fVar2 = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.navigation.internal.h(this, 6)));
            this.z = fVar2;
            fVar2.b(null);
            fVar = fVar2;
        }
        return fVar.b;
    }
}
