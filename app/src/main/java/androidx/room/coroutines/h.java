package androidx.room.coroutines;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.sqlite.a, Mutex {
    public Throwable A;
    public final g B;
    public final androidx.sqlite.a e;
    public final Mutex y;
    public kotlin.coroutines.j z;

    public h(androidx.sqlite.a aVar) {
        Mutex mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        aVar.getClass();
        mutexMutex$default.getClass();
        this.e = aVar;
        this.y = mutexMutex$default;
        this.B = new g(this);
    }

    @Override // androidx.sqlite.a
    public final boolean H() {
        return this.e.H();
    }

    @Override // androidx.sqlite.a
    public final androidx.sqlite.c U(String str) {
        str.getClass();
        g gVar = this.B;
        if (gVar == null) {
            return this.e.U(str);
        }
        Object objH = gVar.h(str);
        objH.getClass();
        return new f((androidx.sqlite.c) objH);
    }

    public final void a(StringBuilder sb) {
        int i;
        if (this.z == null && this.A == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            kotlin.coroutines.j jVar = this.z;
            if (jVar != null) {
                sb.append("\t\tCoroutine: " + jVar);
                sb.append('\n');
            }
            Throwable th = this.A;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                Iterator it = kotlin.collections.p.y(1, kotlin.text.k.M(string)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.B != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            g gVar = this.B;
            synchronized (((com.google.android.gms.common.internal.k) gVar.g)) {
                i = gVar.c;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        g gVar = this.B;
        if (gVar != null) {
            gVar.n(-1);
        }
        this.e.close();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final SelectClause2 getOnLock() {
        return this.y.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean holdsLock(Object obj) {
        obj.getClass();
        return this.y.holdsLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return this.y.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object lock(Object obj, kotlin.coroutines.d dVar) {
        return this.y.lock(obj, dVar);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        return this.y.tryLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        this.y.unlock(obj);
    }
}
