package com.app.mlounge.data.remote.debrid;

import android.content.Context;
import androidx.compose.runtime.v1;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.ui.viewmodel.c1;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridManager {
    public static final int $stable = 8;
    public static final String CLIENT_ID = "X245A4XAIBGVM";
    public static final Companion Companion = new Companion();
    public static final String GRANT_TYPE = "http://oauth.net/grant_type/device/1.0";
    private static final String TAG = "RealDebridManager";
    private final RealDebridApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Companion {
    }

    public RealDebridManager(RealDebridApi realDebridApi, y1 y1Var) {
        realDebridApi.getClass();
        y1Var.getClass();
        this.api = realDebridApi;
        this.prefs = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[Catch: Exception -> 0x0047, TRY_ENTER, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[Catch: Exception -> 0x0047, PHI: r14
  0x00d7: PHI (r14v12 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:45:0x00d3, B:27:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00df A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:68:0x0148, B:24:0x0063, B:60:0x0117, B:62:0x011d, B:65:0x0143, B:27:0x0074, B:47:0x00d7, B:49:0x00df, B:52:0x00e6, B:54:0x00ec, B:56:0x00fd, B:44:0x00c2), top: B:73:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        if (r14 == r0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r13, kotlin.coroutines.jvm.internal.c r14) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.a(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        RealDebridManager$getAuthHeader$1 realDebridManager$getAuthHeader$1;
        if (cVar instanceof RealDebridManager$getAuthHeader$1) {
            realDebridManager$getAuthHeader$1 = (RealDebridManager$getAuthHeader$1) cVar;
            int i = realDebridManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$getAuthHeader$1 = new RealDebridManager$getAuthHeader$1(this, cVar);
            }
        } else {
            realDebridManager$getAuthHeader$1 = new RealDebridManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = realDebridManager$getAuthHeader$1.result;
        int i2 = realDebridManager$getAuthHeader$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            realDebridManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(this.prefs.k, realDebridManager$getAuthHeader$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(objFirst);
        }
        String str = (String) objFirst;
        if (str == null) {
            return null;
        }
        return "Bearer ".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(c cVar) {
        RealDebridManager$getDeviceCode$1 realDebridManager$getDeviceCode$1;
        if (cVar instanceof RealDebridManager$getDeviceCode$1) {
            realDebridManager$getDeviceCode$1 = (RealDebridManager$getDeviceCode$1) cVar;
            int i = realDebridManager$getDeviceCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$getDeviceCode$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$getDeviceCode$1 = new RealDebridManager$getDeviceCode$1(this, cVar);
            }
        } else {
            realDebridManager$getDeviceCode$1 = new RealDebridManager$getDeviceCode$1(this, cVar);
        }
        Object objE = realDebridManager$getDeviceCode$1.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = realDebridManager$getDeviceCode$1.label;
        try {
            if (i2 == 0) {
                a.e(objE);
                RealDebridApi realDebridApi = this.api;
                realDebridManager$getDeviceCode$1.label = 1;
                objE = realDebridApi.e(CLIENT_ID, "yes", realDebridManager$getDeviceCode$1);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(objE);
            }
            return (RealDebridDeviceCodeResponse) objE;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "getDeviceCode failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r9 == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.c r9) {
        /*
            r8 = this;
            java.lang.String r0 = "user info raw: "
            boolean r1 = r9 instanceof com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1
            if (r1 == 0) goto L15
            r1 = r9
            com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1 r1 = (com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1 r1 = new com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.result
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.e
            int r3 = r1.label
            java.lang.String r4 = "RealDebridManager"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L3f
            if (r3 == r6) goto L3b
            if (r3 != r5) goto L35
            java.lang.Object r1 = r1.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r9)     // Catch: java.lang.Exception -> L33
            goto L5d
        L33:
            r9 = move-exception
            goto L80
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r9)
            return r7
        L3b:
            kotlin.a.e(r9)
            goto L4b
        L3f:
            kotlin.a.e(r9)
            r1.label = r6
            java.lang.Object r9 = r8.b(r1)
            if (r9 != r2) goto L4b
            goto L5c
        L4b:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L50
            return r7
        L50:
            com.app.mlounge.data.remote.debrid.RealDebridApi r3 = r8.api     // Catch: java.lang.Exception -> L33
            r1.L$0 = r7     // Catch: java.lang.Exception -> L33
            r1.label = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r3.a(r9, r1)     // Catch: java.lang.Exception -> L33
            if (r9 != r2) goto L5d
        L5c:
            return r2
        L5d:
            com.google.gson.j r9 = (com.google.gson.j) r9     // Catch: java.lang.Exception -> L33
            android.content.Context r1 = com.app.mlounge.util.a.a     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r1.<init>(r0)     // Catch: java.lang.Exception -> L33
            r1.append(r9)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "D"
            com.app.mlounge.util.a.a(r1, r4, r0)     // Catch: java.lang.Exception -> L33
            com.google.gson.e r0 = new com.google.gson.e     // Catch: java.lang.Exception -> L33
            r0.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.Class<com.app.mlounge.data.remote.debrid.RealDebridUserInfo> r1 = com.app.mlounge.data.remote.debrid.RealDebridUserInfo.class
            java.lang.Object r9 = r0.b(r9, r1)     // Catch: java.lang.Exception -> L33
            com.app.mlounge.data.remote.debrid.RealDebridUserInfo r9 = (com.app.mlounge.data.remote.debrid.RealDebridUserInfo) r9     // Catch: java.lang.Exception -> L33
            return r9
        L80:
            android.content.Context r0 = com.app.mlounge.util.a.a
            java.lang.String r0 = "getUserInfo failed"
            com.app.mlounge.util.a.d(r4, r0, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.d(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(c cVar) {
        RealDebridManager$isLoggedIn$1 realDebridManager$isLoggedIn$1;
        if (cVar instanceof RealDebridManager$isLoggedIn$1) {
            realDebridManager$isLoggedIn$1 = (RealDebridManager$isLoggedIn$1) cVar;
            int i = realDebridManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$isLoggedIn$1 = new RealDebridManager$isLoggedIn$1(this, cVar);
            }
        } else {
            realDebridManager$isLoggedIn$1 = new RealDebridManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = realDebridManager$isLoggedIn$1.result;
        int i2 = realDebridManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.k;
            realDebridManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, realDebridManager$isLoggedIn$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(objFirst);
        }
        CharSequence charSequence = (CharSequence) objFirst;
        return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
    }

    public final Object f(c1 c1Var) {
        Object objH = _COROUTINE.a.H(z1.a(this.prefs.a), new v1(2, 2, null), c1Var);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objH != aVar) {
            objH = yVar;
        }
        return objH == aVar ? objH : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r11 == r2) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.lang.String r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.g(java.lang.String, kotlin.coroutines.jvm.internal.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[PHI: r1 r2 r12
  0x0077: PHI (r1v10 java.lang.String) = (r1v7 java.lang.String), (r1v13 java.lang.String) binds: [B:44:0x00c8, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:44:0x00c8, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r12v17 java.lang.Object) = (r12v15 java.lang.Object), (r12v1 java.lang.Object) binds: [B:44:0x00c8, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[Catch: Exception -> 0x0040, PHI: r12
  0x00e9: PHI (r12v21 java.lang.Object) = (r12v19 java.lang.Object), (r12v1 java.lang.Object) binds: [B:51:0x00e5, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a A[Catch: Exception -> 0x0040, PHI: r1 r3
  0x012a: PHI (r1v24 long) = (r1v15 long), (r1v27 long) binds: [B:63:0x0127, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r3v3 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse) = 
  (r3v2 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse)
  (r3v6 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse)
 binds: [B:63:0x0127, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0130 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x003b, B:19:0x0056, B:65:0x012a, B:67:0x0130, B:70:0x0157, B:22:0x0067, B:53:0x00e9, B:55:0x00f2, B:58:0x00f9, B:60:0x00ff, B:62:0x0110, B:73:0x015c, B:50:0x00d4), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
    
        if (r12 == r0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.c r12) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.h(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[PHI: r0 r5 r13
  0x00bf: PHI (r0v20 java.lang.Object) = (r0v17 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x00bc, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v9 java.lang.String) binds: [B:45:0x00bc, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r13v1 long) = (r13v0 long), (r13v4 long) binds: [B:45:0x00bc, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[Catch: Exception -> 0x0048, TRY_ENTER, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:23:0x0057, B:55:0x00e7, B:57:0x00f1, B:60:0x00f9, B:62:0x00ff, B:51:0x00ca), top: B:82:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:23:0x0057, B:55:0x00e7, B:57:0x00f1, B:60:0x00f9, B:62:0x00ff, B:51:0x00ca), top: B:82:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:23:0x0057, B:55:0x00e7, B:57:0x00f1, B:60:0x00f9, B:62:0x00ff, B:51:0x00ca), top: B:82:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        if (r0.o(r2, r13, r3) == r4) goto L64;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ca, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.c r18) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.i(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r10 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1
            if (r0 == 0) goto L13
            r0 = r10
            com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1 r0 = (com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1 r0 = new com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            int r2 = r0.label
            java.lang.String r3 = "unrestrictLink failed"
            java.lang.String r4 = "RealDebridManager"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 != r5) goto L3b
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.a.e(r10)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            goto L6b
        L37:
            r9 = move-exception
            goto L8b
        L39:
            r9 = move-exception
            goto L91
        L3b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r9)
            return r7
        L41:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.a.e(r10)
            goto L57
        L49:
            kotlin.a.e(r10)
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r8.b(r0)
            if (r10 != r1) goto L57
            goto L6a
        L57:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L5c
            goto L8a
        L5c:
            com.app.mlounge.data.remote.debrid.RealDebridApi r2 = r8.api     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.L$0 = r7     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.L$1 = r7     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.label = r5     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            java.lang.Object r10 = r2.f(r10, r9, r0)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r10 != r1) goto L6b
        L6a:
            return r1
        L6b:
            com.google.gson.j r10 = (com.google.gson.j) r10     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            java.lang.String r9 = "download"
            com.google.gson.g r9 = r10.l(r9)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 == 0) goto L7d
            java.lang.String r9 = r9.h()     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 != 0) goto L7c
            goto L7d
        L7c:
            return r9
        L7d:
            java.lang.String r9 = "link"
            com.google.gson.g r9 = r10.l(r9)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 == 0) goto L8a
            java.lang.String r9 = r9.h()     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            return r9
        L8a:
            return r7
        L8b:
            android.content.Context r10 = com.app.mlounge.util.a.a
            com.app.mlounge.util.a.d(r4, r3, r9)
            return r7
        L91:
            android.content.Context r10 = com.app.mlounge.util.a.a
            com.app.mlounge.util.a.d(r4, r3, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.j(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029b A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f6 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:115:0x0307 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:117:0x030b  */
    /* JADX WARN: Code duplicated, block: B:118:0x030c  */
    /* JADX WARN: Code duplicated, block: B:120:0x030f A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0314  */
    /* JADX WARN: Code duplicated, block: B:124:0x0319 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0320  */
    /* JADX WARN: Code duplicated, block: B:128:0x0341 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0354  */
    /* JADX WARN: Code duplicated, block: B:133:0x0355  */
    /* JADX WARN: Code duplicated, block: B:135:0x0358 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:136:0x035d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0360 A[Catch: Exception -> 0x006a, q -> 0x006d, TRY_LEAVE, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02ec, B:110:0x02f6, B:113:0x02ff, B:115:0x0307, B:120:0x030f, B:122:0x0315, B:124:0x0319, B:126:0x0321, B:128:0x0341, B:130:0x0349, B:135:0x0358, B:138:0x0360, B:101:0x029b, B:105:0x02c7, B:23:0x00cd, B:26:0x00f2, B:98:0x0294, B:29:0x011b, B:94:0x0272, B:32:0x0138, B:58:0x01d3, B:60:0x01dd, B:65:0x01e5, B:66:0x01f4, B:68:0x01fa, B:70:0x0207, B:72:0x0211, B:77:0x0219, B:80:0x0221, B:83:0x0228, B:87:0x0231, B:89:0x023b, B:91:0x0253, B:90:0x0246, B:95:0x0275, B:35:0x014d, B:49:0x01a5, B:51:0x01ad, B:54:0x01b4, B:45:0x0180), top: B:148:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0388 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x009b A[PHI: r0 r2 r3 r5 r7 r8 r10 r11 r12 r13 r14
  0x009b: PHI (r0v40 java.lang.Object) = (r0v38 java.lang.Object), (r0v1 java.lang.Object) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r2v36 int) = (r2v33 int), (r2v39 int) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r3v5 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1) = 
  (r3v3 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1)
  (r3v2 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1)
 binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r5v37 int) = (r5v34 int), (r5v40 int) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r7v16 int) = (r7v14 int), (r7v19 int) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r8v3 boolean) = (r8v1 boolean), (r8v0 boolean) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r10v3 int) = (r10v1 int), (r10v0 int) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v0 java.lang.String) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r12v22 int) = (r12v17 int), (r12v23 int) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r13v19 java.lang.String) = (r13v17 java.lang.String), (r13v26 java.lang.String) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r14v19 java.lang.String) = (r14v17 java.lang.String), (r14v25 java.lang.String) binds: [B:106:0x02e8, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x021e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0225  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02e8 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.lang.String r20, java.lang.Integer r21, kotlin.coroutines.jvm.internal.c r22) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.k(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
