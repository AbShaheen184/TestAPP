package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.media3.exoplayer.source.t0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i {
    public final Context a;
    public final androidx.core.provider.d b;
    public final androidx.work.impl.model.f c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public com.google.firebase.b h;

    public t(Context context, androidx.core.provider.d dVar) {
        t1.n(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = u.d;
    }

    @Override // androidx.emoji2.text.i
    public final void a(com.google.firebase.b bVar) {
        synchronized (this.d) {
            this.h = bVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new androidx.activity.l(this, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.core.provider.i c() {
        try {
            androidx.work.impl.model.f fVar = this.c;
            Context context = this.a;
            androidx.core.provider.d dVar = this.b;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            androidx.compose.foundation.lazy.grid.t tVarA = androidx.core.provider.c.a(context, Collections.unmodifiableList(arrayList));
            int i = tVarA.a;
            if (i != 0) {
                org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("fetchFonts failed (", i, ")"));
                return null;
            }
            androidx.core.provider.i[] iVarArr = (androidx.core.provider.i[]) tVarA.b.get(0);
            if (iVarArr != null && iVarArr.length != 0) {
                return iVarArr[0];
            }
            org.mozilla.javascript.c.b("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            t0.j("provider not found", e);
            return null;
        }
    }
}
