package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.navigation.internal.d;
import androidx.navigation.internal.h;
import androidx.savedstate.g;
import androidx.work.impl.model.f;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final g a;
    public final h b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final f c = new f(18);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public a(g gVar, h hVar) {
        this.a = gVar;
        this.b = hVar;
    }

    public final void a() {
        g gVar = this.a;
        if (((x) gVar.getLifecycle()).d != o.y) {
            kotlinx.coroutines.future.a.u("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                kotlinx.coroutines.future.a.u("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            gVar.getLifecycle().a(new d(this, 1));
            this.e = true;
        }
    }
}
