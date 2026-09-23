package androidx.room.coroutines;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements androidx.room.a0, b0 {
    public final com.google.android.material.shape.f a;
    public final h b;
    public final boolean c;
    public final kotlin.collections.l d;
    public volatile boolean e;

    public a0(com.google.android.material.shape.f fVar, h hVar, boolean z) {
        fVar.getClass();
        this.a = fVar;
        this.b = hVar;
        this.c = z;
        this.d = new kotlin.collections.l();
    }

    @Override // androidx.room.a0
    public final Object a(androidx.room.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.i iVar) {
        if (this.e) {
            t1.B(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(this.a);
        if (aVar != null && aVar.y == this) {
            return g(zVar, pVar, iVar);
        }
        t1.B(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        h hVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.C = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = zVar.C;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (this.e) {
                t1.B(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) zVar.getContext().get(this.a);
            if (aVar2 == null || aVar2.y != this) {
                t1.B(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            hVar = this.b;
            zVar.e = str;
            zVar.y = lVar;
            zVar.z = hVar;
            zVar.C = 1;
            if (hVar.y.lock(null, zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h hVar2 = zVar.z;
            lVar = zVar.y;
            String str2 = zVar.e;
            kotlin.a.e(obj);
            hVar = hVar2;
            str = str2;
        }
        try {
            u uVar = new u(this, this.b.U(str));
            try {
                Object objInvoke = lVar.invoke(uVar);
                kotlin.collections.q.e(uVar, null);
                hVar.unlock(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.collections.q.e(uVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            hVar.unlock(null);
            throw th3;
        }
    }

    @Override // androidx.room.a0
    public final Boolean c(kotlin.coroutines.d dVar) {
        if (this.e) {
            t1.B(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) dVar.getContext().get(this.a);
        if (aVar != null && aVar.y == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.e.H());
        }
        t1.B(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // androidx.room.coroutines.b0
    public final androidx.sqlite.a d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(androidx.room.z zVar, kotlin.coroutines.jvm.internal.c cVar) {
        w wVar;
        h hVar;
        kotlin.collections.l lVar = this.d;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.B = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.z;
        int i2 = wVar.B;
        h hVar2 = this.b;
        if (i2 == 0) {
            kotlin.a.e(obj);
            wVar.e = zVar;
            wVar.y = hVar2;
            wVar.B = 1;
            Object objLock = hVar2.y.lock(null, wVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h hVar3 = wVar.y;
            androidx.room.z zVar2 = wVar.e;
            kotlin.a.e(obj);
            hVar = hVar3;
            zVar = zVar2;
        }
        try {
            int i3 = lVar.z;
            if (lVar.isEmpty()) {
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    t1.t(hVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    t1.t(hVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new androidx.compose.ui.res.e(11);
                    }
                    t1.t(hVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                t1.t(hVar2, "SAVEPOINT '" + i3 + '\'');
            }
            lVar.addLast(new v(i3));
            kotlin.y yVar = kotlin.y.a;
            hVar.unlock(null);
            return yVar;
        } catch (Throwable th) {
            hVar.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        x xVar;
        h hVar;
        kotlin.collections.l lVar = this.d;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.B = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.z;
        int i2 = xVar.B;
        h hVar2 = this.b;
        if (i2 == 0) {
            kotlin.a.e(obj);
            xVar.y = hVar2;
            xVar.e = z;
            xVar.B = 1;
            Object objLock = hVar2.y.lock(null, xVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = xVar.e;
            hVar = xVar.y;
            kotlin.a.e(obj);
        }
        try {
            if (lVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            v vVar = (v) kotlin.collections.p.S(lVar);
            if (z) {
                vVar.getClass();
                if (lVar.isEmpty()) {
                    t1.t(hVar2, "END TRANSACTION");
                } else {
                    t1.t(hVar2, "RELEASE SAVEPOINT '" + vVar.a + '\'');
                }
            } else if (lVar.isEmpty()) {
                t1.t(hVar2, "ROLLBACK TRANSACTION");
            } else {
                t1.t(hVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + vVar.a + '\'');
            }
            kotlin.y yVar = kotlin.y.a;
            hVar.unlock(null);
            return yVar;
        } catch (Throwable th) {
            hVar.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (f(false, r0) == r7) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.room.coroutines.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.room.z] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.room.z] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(androidx.room.z r9, kotlin.jvm.functions.p r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.room.coroutines.y
            if (r0 == 0) goto L13
            r0 = r11
            androidx.room.coroutines.y r0 = (androidx.room.coroutines.y) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            androidx.room.coroutines.y r0 = new androidx.room.coroutines.y
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.C
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L62
            if (r1 == r6) goto L59
            if (r1 == r5) goto L50
            if (r1 == r4) goto L4a
            r9 = 4
            if (r1 == r9) goto L44
            if (r1 == r3) goto L37
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r9)
            r9 = 0
            return r9
        L37:
            java.lang.Throwable r9 = r0.y
            java.lang.Object r10 = r0.e
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            kotlin.a.e(r11)     // Catch: android.database.SQLException -> L42
            goto Lac
        L42:
            r11 = move-exception
            goto La7
        L44:
            java.lang.Object r9 = r0.e
            kotlin.a.e(r11)
            return r9
        L4a:
            java.lang.Object r9 = r0.e
            kotlin.a.e(r11)
            return r9
        L50:
            int r9 = r0.z
            kotlin.a.e(r11)     // Catch: java.lang.Throwable -> L56
            goto L89
        L56:
            r9 = move-exception
            r10 = r9
            goto L98
        L59:
            java.lang.Object r9 = r0.e
            r10 = r9
            kotlin.jvm.functions.p r10 = (kotlin.jvm.functions.p) r10
            kotlin.a.e(r11)
            goto L74
        L62:
            kotlin.a.e(r11)
            if (r9 != 0) goto L69
            androidx.room.z r9 = androidx.room.z.e
        L69:
            r0.e = r10
            r0.C = r6
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r7) goto L74
            goto La6
        L74:
            androidx.room.coroutines.k r9 = new androidx.room.coroutines.k     // Catch: java.lang.Throwable -> L56
            r11 = 1
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L56
            r11 = 0
            r0.e = r11     // Catch: java.lang.Throwable -> L56
            r0.z = r6     // Catch: java.lang.Throwable -> L56
            r0.C = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r7) goto L88
            goto La6
        L88:
            r9 = r6
        L89:
            if (r9 == 0) goto L8c
            r2 = r6
        L8c:
            r0.e = r11
            r0.C = r4
            java.lang.Object r9 = r8.f(r2, r0)
            if (r9 != r7) goto L97
            goto La6
        L97:
            return r11
        L98:
            throw r10     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0.e = r10     // Catch: android.database.SQLException -> L42
            r0.y = r9     // Catch: android.database.SQLException -> L42
            r0.C = r3     // Catch: android.database.SQLException -> L42
            java.lang.Object r10 = r8.f(r2, r0)     // Catch: android.database.SQLException -> L42
            if (r10 != r7) goto Lac
        La6:
            return r7
        La7:
            if (r10 == 0) goto Lad
            kotlin.a.a(r10, r11)
        Lac:
            throw r9
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.a0.g(androidx.room.z, kotlin.jvm.functions.p, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
