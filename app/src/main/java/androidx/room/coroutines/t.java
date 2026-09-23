package androidx.room.coroutines;

import com.google.firebase.crashlytics.internal.model.t1;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final kotlin.jvm.functions.a b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final h[] f;
    public final Semaphore g;
    public final kotlin.collections.l h;

    public t(int i, kotlin.jvm.functions.a aVar) {
        this.a = i;
        this.b = aVar;
        this.f = new h[i];
        this.g = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        this.h = new kotlin.collections.l(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        kotlin.collections.l lVar = this.h;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.z = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.e;
        int i2 = rVar.z;
        Semaphore semaphore = this.g;
        if (i2 == 0) {
            kotlin.a.e(obj);
            rVar.z = 1;
            Object objAcquire = semaphore.acquire(rVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAcquire == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    t1.B(21, "Connection pool is closed");
                    throw null;
                }
                if (lVar.isEmpty() && this.d < this.a) {
                    h hVar = new h((androidx.sqlite.a) this.b.invoke());
                    h[] hVarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    hVarArr[i3] = hVar;
                    lVar.addLast(hVar);
                }
                h hVar2 = (h) lVar.removeLast();
                reentrantLock.unlock();
                return hVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            semaphore.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:25:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r7, androidx.compose.foundation.text.r r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.room.coroutines.s
            if (r0 == 0) goto L13
            r0 = r10
            androidx.room.coroutines.s r0 = (androidx.room.coroutines.s) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            androidx.room.coroutines.s r0 = new androidx.room.coroutines.s
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.A
            int r1 = r0.C
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r7 = r0.e
            kotlin.jvm.internal.z r9 = r0.z
            kotlin.jvm.functions.a r1 = r0.y
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r10 = move-exception
            goto L61
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r7)
            r7 = 0
            return r7
        L35:
            kotlin.a.e(r10)
        L38:
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            androidx.compose.animation.b0 r1 = new androidx.compose.animation.b0     // Catch: java.lang.Throwable -> L5c
            r4 = 29
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5c
            r0.y = r9     // Catch: java.lang.Throwable -> L5c
            r0.z = r10     // Catch: java.lang.Throwable -> L5c
            r0.e = r7     // Catch: java.lang.Throwable -> L5c
            r0.C = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = kotlinx.coroutines.TimeoutKt.m26withTimeoutKLykuaI(r7, r1, r0)     // Catch: java.lang.Throwable -> L5c
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 != r4) goto L55
            return r4
        L55:
            r1 = r9
            r9 = r10
        L57:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L66
        L5c:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L61:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L66:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L70
            r9.invoke()     // Catch: java.lang.Throwable -> L6e
            goto L77
        L6e:
            r7 = move-exception
            goto L7a
        L70:
            if (r0 != 0) goto L79
            java.lang.Object r10 = r10.e     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L77
            return r10
        L77:
            r0 = r1
            goto L38
        L79:
            throw r0     // Catch: java.lang.Throwable -> L6e
        L7a:
            java.lang.Object r8 = r10.e
            androidx.room.coroutines.h r8 = (androidx.room.coroutines.h) r8
            if (r8 == 0) goto L83
            r6.e(r8)
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.t.b(long, androidx.compose.foundation.text.r, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (h hVar : this.f) {
                if (hVar != null) {
                    hVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        kotlin.collections.l lVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            kotlin.collections.builders.b bVarG = kotlin.collections.q.g();
            int i = lVar.z;
            for (int i2 = 0; i2 < i; i2++) {
                bVarG.add(lVar.get(i2));
            }
            kotlin.collections.builders.b bVarC = kotlin.collections.q.c(bVarG);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + this.g.getAvailablePermits() + ", ");
            sb.append("queue=(size=" + bVarC.b() + ")[" + kotlin.collections.p.I(bVarC, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            h[] hVarArr = this.f;
            int length = hVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                h hVar = hVarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(hVar != null ? hVar.e.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (hVar != null) {
                    hVar.a(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(h hVar) {
        hVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(hVar);
            reentrantLock.unlock();
            this.g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
