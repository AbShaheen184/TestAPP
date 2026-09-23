package com.app.mlounge.data.remote.debrid;

import android.content.Context;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.ui.viewmodel.c1;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AllDebridManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final long POLL_DELAY_MS = 5000;
    private static final int POLL_MAX_ATTEMPTS = 60;
    private static final int STATUS_READY = 4;
    private static final String TAG = "AllDebridManager";
    private final AllDebridApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Companion {
    }

    public AllDebridManager(AllDebridApi allDebridApi, y1 y1Var) {
        allDebridApi.getClass();
        y1Var.getClass();
        this.api = allDebridApi;
        this.prefs = y1Var;
    }

    public static void a(f fVar, ArrayList arrayList) {
        Iterator it = fVar.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            j jVarE = ((g) it.next()).e();
            g gVarL = jVarE.l("l");
            String strH = gVarL != null ? gVarL.h() : null;
            if (strH != null) {
                g gVarL2 = jVarE.l("s");
                arrayList.add(new k(Long.valueOf(gVarL2 != null ? gVarL2.f() : 0L), strH));
            } else {
                f fVarM = jVarE.m("e");
                if (fVarM != null) {
                    a(fVarM, arrayList);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        AllDebridManager$getAuthHeader$1 allDebridManager$getAuthHeader$1;
        if (cVar instanceof AllDebridManager$getAuthHeader$1) {
            allDebridManager$getAuthHeader$1 = (AllDebridManager$getAuthHeader$1) cVar;
            int i = allDebridManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$getAuthHeader$1 = new AllDebridManager$getAuthHeader$1(this, cVar);
            }
        } else {
            allDebridManager$getAuthHeader$1 = new AllDebridManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = allDebridManager$getAuthHeader$1.result;
        int i2 = allDebridManager$getAuthHeader$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            allDebridManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(this.prefs.j, allDebridManager$getAuthHeader$1);
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
        AllDebridManager$getPinForAuth$1 allDebridManager$getPinForAuth$1;
        j jVarO;
        g gVarL;
        String strH;
        g gVarL2;
        String strH2;
        String strH3;
        if (cVar instanceof AllDebridManager$getPinForAuth$1) {
            allDebridManager$getPinForAuth$1 = (AllDebridManager$getPinForAuth$1) cVar;
            int i = allDebridManager$getPinForAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$getPinForAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$getPinForAuth$1 = new AllDebridManager$getPinForAuth$1(this, cVar);
            }
        } else {
            allDebridManager$getPinForAuth$1 = new AllDebridManager$getPinForAuth$1(this, cVar);
        }
        Object objB = allDebridManager$getPinForAuth$1.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = allDebridManager$getPinForAuth$1.label;
        try {
            if (i2 == 0) {
                a.e(objB);
                AllDebridApi allDebridApi = this.api;
                allDebridManager$getPinForAuth$1.label = 1;
                objB = allDebridApi.b(allDebridManager$getPinForAuth$1);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(objB);
            }
            j jVar = (j) objB;
            g gVarL3 = jVar.l("status");
            if (l.a(gVarL3 != null ? gVarL3.h() : null, "success") && (jVarO = jVar.o("data")) != null && (gVarL = jVarO.l("pin")) != null && (strH = gVarL.h()) != null && (gVarL2 = jVarO.l("check")) != null && (strH2 = gVarL2.h()) != null) {
                g gVarL4 = jVarO.l("expires_in");
                int iC = gVarL4 != null ? gVarL4.c() : 600;
                g gVarL5 = jVarO.l("user_url");
                if (gVarL5 != null && (strH3 = gVarL5.h()) != null) {
                    return new AllDebridPinData(strH, iC, strH2, strH3);
                }
            }
            return null;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "getPinForAuth failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1 r0 = (com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1 r0 = new com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r7)     // Catch: java.lang.Exception -> L2f
            goto L59
        L2f:
            r7 = move-exception
            goto L92
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r7)
            return r5
        L37:
            kotlin.a.e(r7)
            goto L47
        L3b:
            kotlin.a.e(r7)
            r0.label = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L47
            goto L58
        L47:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4c
            goto L83
        L4c:
            com.app.mlounge.data.remote.debrid.AllDebridApi r2 = r6.api     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r5     // Catch: java.lang.Exception -> L2f
            r0.label = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r2.a(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            com.google.gson.j r7 = (com.google.gson.j) r7     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "status"
            com.google.gson.g r0 = r7.l(r0)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.h()     // Catch: java.lang.Exception -> L2f
            goto L69
        L68:
            r0 = r5
        L69:
            java.lang.String r1 = "success"
            boolean r0 = kotlin.jvm.internal.l.a(r0, r1)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L72
            goto L83
        L72:
            java.lang.String r0 = "data"
            com.google.gson.j r7 = r7.o(r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != 0) goto L7b
            goto L83
        L7b:
            java.lang.String r0 = "user"
            com.google.gson.j r7 = r7.o(r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != 0) goto L84
        L83:
            return r5
        L84:
            com.google.gson.e r0 = new com.google.gson.e     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.Class<com.app.mlounge.data.remote.debrid.AllDebridUserInfo> r1 = com.app.mlounge.data.remote.debrid.AllDebridUserInfo.class
            java.lang.Object r7 = r0.b(r7, r1)     // Catch: java.lang.Exception -> L2f
            com.app.mlounge.data.remote.debrid.AllDebridUserInfo r7 = (com.app.mlounge.data.remote.debrid.AllDebridUserInfo) r7     // Catch: java.lang.Exception -> L2f
            return r7
        L92:
            android.content.Context r0 = com.app.mlounge.util.a.a
            java.lang.String r0 = "AllDebridManager"
            java.lang.String r1 = "getUserInfo failed"
            com.app.mlounge.util.a.d(r0, r1, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.d(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(c cVar) {
        AllDebridManager$isLoggedIn$1 allDebridManager$isLoggedIn$1;
        if (cVar instanceof AllDebridManager$isLoggedIn$1) {
            allDebridManager$isLoggedIn$1 = (AllDebridManager$isLoggedIn$1) cVar;
            int i = allDebridManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$isLoggedIn$1 = new AllDebridManager$isLoggedIn$1(this, cVar);
            }
        } else {
            allDebridManager$isLoggedIn$1 = new AllDebridManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = allDebridManager$isLoggedIn$1.result;
        int i2 = allDebridManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.j;
            allDebridManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, allDebridManager$isLoggedIn$1);
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
        Object objH = _COROUTINE.a.H(z1.a(this.prefs.a), new com.app.mlounge.data.local.prefs.c(1, null, null), c1Var);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objH != aVar) {
            objH = yVar;
        }
        return objH == aVar ? objH : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:62:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:62:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:62:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:62:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0093 -> B:28:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(int r13, java.lang.String r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.g(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, c cVar) {
        AllDebridManager$pollPinAuth$1 allDebridManager$pollPinAuth$1;
        j jVarO;
        g gVarL;
        g gVarL2;
        String strH;
        if (cVar instanceof AllDebridManager$pollPinAuth$1) {
            allDebridManager$pollPinAuth$1 = (AllDebridManager$pollPinAuth$1) cVar;
            int i = allDebridManager$pollPinAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$pollPinAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$pollPinAuth$1 = new AllDebridManager$pollPinAuth$1(this, cVar);
            }
        } else {
            allDebridManager$pollPinAuth$1 = new AllDebridManager$pollPinAuth$1(this, cVar);
        }
        Object objE = allDebridManager$pollPinAuth$1.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = allDebridManager$pollPinAuth$1.label;
        try {
            if (i2 == 0) {
                a.e(objE);
                AllDebridApi allDebridApi = this.api;
                allDebridManager$pollPinAuth$1.L$0 = null;
                allDebridManager$pollPinAuth$1.L$1 = null;
                allDebridManager$pollPinAuth$1.label = 1;
                objE = allDebridApi.e(str2, str, allDebridManager$pollPinAuth$1);
                if (objE == aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = (String) allDebridManager$pollPinAuth$1.L$4;
                a.e(objE);
                return str3;
            }
            a.e(objE);
            j jVar = (j) objE;
            g gVarL3 = jVar.l("status");
            if (l.a(gVarL3 != null ? gVarL3.h() : null, "success") && (jVarO = jVar.o("data")) != null && (gVarL = jVarO.l("activated")) != null && gVarL.b() && (gVarL2 = jVarO.l("apikey")) != null && (strH = gVarL2.h()) != null) {
                y1 y1Var = this.prefs;
                allDebridManager$pollPinAuth$1.L$0 = null;
                allDebridManager$pollPinAuth$1.L$1 = null;
                allDebridManager$pollPinAuth$1.L$2 = null;
                allDebridManager$pollPinAuth$1.L$3 = null;
                allDebridManager$pollPinAuth$1.L$4 = strH;
                allDebridManager$pollPinAuth$1.label = 2;
                Object objH = _COROUTINE.a.H(z1.a(y1Var.a), new com.app.mlounge.data.local.prefs.c(1, strH, null), allDebridManager$pollPinAuth$1);
                if (objH != aVar) {
                    objH = y.a;
                }
                return objH == aVar ? aVar : strH;
            }
            return null;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "pollPinAuth failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0280 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0296  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b1 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bd A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c8 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0166 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0186 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de A[Catch: Exception -> 0x008b, PHI: r0 r2 r5 r8 r14 r21
  0x01de: PHI (r0v23 java.lang.Object) = (r0v18 java.lang.Object), (r0v69 java.lang.Object) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r2v20 ??) = (r2v57 ??), (r2v58 ??) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r5v3 int) = (r5v1 int), (r5v5 int) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v22 java.lang.String) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r14v5 java.lang.Integer) = (r14v3 java.lang.Integer), (r14v10 java.lang.Integer) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE]
  0x01de: PHI (r21v6 java.lang.String) = (r3v0 java.lang.String), (r21v12 java.lang.String) binds: [B:73:0x01da, B:31:0x00e8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff A[Catch: Exception -> 0x008b, PHI: r2 r5 r8 r14 r21
  0x01ff: PHI (r2v18 ??) = (r2v59 ??), (r2v60 ??) binds: [B:71:0x01bc, B:76:0x01e4] A[DONT_GENERATE, DONT_INLINE]
  0x01ff: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:71:0x01bc, B:76:0x01e4] A[DONT_GENERATE, DONT_INLINE]
  0x01ff: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v6 java.lang.String) binds: [B:71:0x01bc, B:76:0x01e4] A[DONT_GENERATE, DONT_INLINE]
  0x01ff: PHI (r14v4 java.lang.Integer) = (r14v3 java.lang.Integer), (r14v5 java.lang.Integer) binds: [B:71:0x01bc, B:76:0x01e4] A[DONT_GENERATE, DONT_INLINE]
  0x01ff: PHI (r21v5 java.lang.String) = (r3v0 java.lang.String), (r21v6 java.lang.String) binds: [B:71:0x01bc, B:76:0x01e4] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0220  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222 A[Catch: Exception -> 0x008b, PHI: r0 r4 r5 r8 r14 r21
  0x0222: PHI (r0v29 java.lang.Object) = (r0v22 java.lang.Object), (r0v1 java.lang.Object) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r4v2 ??) = (r4v4 ??), (r4v5 ??) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r5v4 int) = (r5v2 int), (r5v7 int) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r8v7 java.lang.String) = (r8v5 java.lang.String), (r8v34 java.lang.String) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r14v6 java.lang.Integer) = (r14v4 java.lang.Integer), (r14v12 java.lang.Integer) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r21v7 java.lang.String) = (r21v5 java.lang.String), (r21v13 java.lang.String) binds: [B:80:0x021e, B:28:0x00bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x022a A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:85:0x022f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x024c A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0254 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:20:0x0086, B:125:0x0327, B:127:0x032f, B:129:0x0335, B:131:0x033b, B:133:0x0354, B:136:0x035c, B:138:0x0364, B:27:0x00b8, B:82:0x0222, B:84:0x022a, B:86:0x0230, B:88:0x0236, B:90:0x024c, B:93:0x0254, B:96:0x025c, B:98:0x0264, B:101:0x0272, B:103:0x0280, B:106:0x0298, B:108:0x02a2, B:122:0x02f8, B:109:0x02b1, B:121:0x02ef, B:112:0x02bd, B:115:0x02c8, B:116:0x02d3, B:119:0x02e9, B:30:0x00e5, B:75:0x01de, B:77:0x01e6, B:79:0x01ff, B:33:0x0100, B:48:0x015e, B:50:0x0166, B:52:0x016c, B:54:0x0172, B:56:0x0186, B:59:0x018d, B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:68:0x01b4, B:72:0x01be, B:45:0x0146), top: B:143:0x003a }] */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0324, code lost:
    
        if (r0 == r7) goto L124;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0280, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0172, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01e6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0236, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.app.mlounge.data.remote.debrid.AllDebridManager] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r24, java.lang.Integer r25, kotlin.coroutines.jvm.internal.c r26) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.i(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
