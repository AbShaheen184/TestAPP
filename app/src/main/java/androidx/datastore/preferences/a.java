package androidx.datastore.preferences;

import android.content.Context;
import androidx.activity.compose.p;
import androidx.activity.w;
import androidx.compose.ui.text.y;
import androidx.datastore.core.d0;
import androidx.datastore.core.z;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final androidx.compose.ui.draw.i b;
    public final l c;
    public final CoroutineScope d;
    public final Object e = new Object();
    public volatile androidx.datastore.preferences.core.c f;

    public a(String str, androidx.compose.ui.draw.i iVar, l lVar, CoroutineScope coroutineScope) {
        this.a = str;
        this.b = iVar;
        this.c = lVar;
        this.d = coroutineScope;
    }

    public final androidx.datastore.preferences.core.c a(Context context, kotlin.reflect.j jVar) {
        androidx.datastore.preferences.core.c cVar;
        context.getClass();
        jVar.getClass();
        androidx.datastore.preferences.core.c cVar2 = this.f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    androidx.compose.ui.draw.i iVar = this.b;
                    l lVar = this.c;
                    applicationContext.getClass();
                    List list = (List) lVar.invoke(applicationContext);
                    CoroutineScope coroutineScope = this.d;
                    androidx.activity.compose.f fVar = new androidx.activity.compose.f(19, applicationContext, this);
                    list.getClass();
                    this.f = new androidx.datastore.preferences.core.c(new androidx.datastore.preferences.core.c(new z(new d0(androidx.datastore.preferences.core.g.a, new y(18), new w(fVar, 27)), q.j(new p(list, (kotlin.coroutines.d) null, 24)), iVar, coroutineScope)));
                }
                cVar = this.f;
                cVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
