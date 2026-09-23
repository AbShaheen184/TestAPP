package androidx.room;

import android.os.Looper;
import androidx.compose.animation.core.c1;
import androidx.compose.foundation.s0;
import androidx.compose.foundation.text.selection.g1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public CoroutineScope a;
    public kotlin.coroutines.j b;
    public Executor c;
    public y d;
    public androidx.constraintlayout.core.widgets.analyzer.e e;
    public f f;
    public boolean h;
    public final androidx.localbroadcastmanager.content.b g = new androidx.localbroadcastmanager.content.b(new s0(0, this, r.class, "onClosed", "onClosed()V", 0, 4));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kotlinx.coroutines.future.a.u("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        androidx.sqlite.db.framework.b bVarZ = h().z();
        if (!bVarZ.H()) {
            kotlin.math.a.J(new c1(g(), null, 17));
        }
        if (bVarZ.e.isWriteAheadLoggingEnabled()) {
            bVarZ.g();
        } else {
            bVarZ.a();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.c0.j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(kotlin.collections.c0.d((kotlin.reflect.c) entry.getKey()), entry.getValue());
        }
        return kotlin.collections.w.e;
    }

    public abstract f d();

    public androidx.emoji2.text.g e() {
        throw new kotlin.j(0);
    }

    public final void f() {
        h().z().x();
        if (l()) {
            return;
        }
        f fVarG = g();
        fVarG.b.e(fVarG.e, fVarG.f);
    }

    public final f g() {
        f fVar = this.f;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.l.f("internalTracker");
        throw null;
    }

    public final androidx.sqlite.db.b h() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar == null) {
            kotlin.jvm.internal.l.f("connectionManager");
            throw null;
        }
        androidx.sqlite.db.b bVar = (androidx.sqlite.db.b) eVar.h;
        if (bVar != null) {
            return bVar;
        }
        kotlinx.coroutines.future.a.u("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set i() {
        return kotlin.collections.p.f0(new ArrayList(kotlin.collections.r.p(kotlin.collections.y.e, 10)));
    }

    public LinkedHashMap j() {
        int iJ = kotlin.collections.c0.j(kotlin.collections.r.p(kotlin.collections.y.e, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        return new LinkedHashMap(iJ);
    }

    public final boolean k() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar != null) {
            return ((androidx.sqlite.db.b) eVar.h) != null;
        }
        kotlin.jvm.internal.l.f("connectionManager");
        throw null;
    }

    public final boolean l() {
        return n() && h().z().H();
    }

    public final void m(androidx.sqlite.a aVar) {
        aVar.getClass();
        f fVarG = g();
        k0 k0Var = fVarG.b;
        k0Var.getClass();
        androidx.sqlite.c cVarU = aVar.U("PRAGMA query_only");
        try {
            cVarU.Q();
            boolean zU = cVarU.u();
            kotlin.collections.q.e(cVarU, null);
            if (!zU) {
                t1.t(aVar, "PRAGMA temp_store = MEMORY");
                t1.t(aVar, "PRAGMA recursive_triggers = 1");
                t1.t(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (k0Var.d) {
                    t1.t(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    t1.t(aVar, kotlin.text.r.s("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                j jVar = k0Var.h;
                ReentrantLock reentrantLock = jVar.a;
                reentrantLock.lock();
                try {
                    jVar.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (fVarG.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.collections.q.e(cVarU, th2);
                throw th3;
            }
        }
    }

    public final boolean n() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar == null) {
            kotlin.jvm.internal.l.f("connectionManager");
            throw null;
        }
        androidx.sqlite.db.framework.b bVar = (androidx.sqlite.db.framework.b) eVar.i;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final Object o(kotlin.jvm.functions.a aVar) {
        if (!k()) {
            return okhttp3.internal.platform.android.g.t(this, false, true, new g1(5, aVar));
        }
        b();
        try {
            Object objInvoke = aVar.invoke();
            p();
            return objInvoke;
        } finally {
            f();
        }
    }

    public final void p() {
        h().z().X();
    }

    public final Object q(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.e;
        if (eVar != null) {
            return ((androidx.room.coroutines.b) eVar.g).D(z, pVar, cVar);
        }
        kotlin.jvm.internal.l.f("connectionManager");
        throw null;
    }
}
