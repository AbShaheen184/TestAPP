package com.app.mlounge.data.download;

import android.content.Context;
import androidx.compose.runtime.a1;
import androidx.navigation.compose.r;
import androidx.navigation.y;
import androidx.room.s;
import com.app.mlounge.ui.f0;
import com.app.mlounge.ui.g0;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.text.k;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Map D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ int e = 1;
    public int y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Context context, String str2, String str3, String str4, Map map, y yVar, String str5, String str6, int i, int i2, int i3, a1 a1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = str;
        this.J = context;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = map;
        this.K = yVar;
        this.E = str5;
        this.F = str6;
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.L = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d(this.D, (h) this.J, this.z, this.A, this.B, this.C, this.E, this.F, (String) this.K, (String) this.L, this.G, this.H, this.I, dVar);
            default:
                return new d(this.z, (Context) this.J, this.A, this.B, this.C, this.D, (y) this.K, this.E, this.F, this.G, this.H, this.I, (a1) this.L, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((d) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        Set setEntrySet;
        Object objWithContext;
        int i = 0;
        ?? I = 0;
        I = 0;
        switch (this.e) {
            case 0:
                h hVar = (h) this.J;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    Map map = this.D;
                    if (map != null && (setEntrySet = map.entrySet()) != null) {
                        I = kotlin.collections.p.I(setEntrySet, "\n", null, null, new r(25), 30);
                    }
                    ?? r25 = I;
                    String str = this.z;
                    hVar.getClass();
                    Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                    patternCompile.getClass();
                    String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
                    strReplaceAll.getClass();
                    Pattern patternCompile2 = Pattern.compile("\\s+");
                    patternCompile2.getClass();
                    String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
                    strReplaceAll2.getClass();
                    com.app.mlounge.data.local.entity.a aVar2 = new com.app.mlounge.data.local.entity.a(0L, this.A, k.e0(org.mozilla.javascript.Context.VERSION_ES6, k.g0(strReplaceAll2).toString()), this.B, this.C, this.E, this.F, (String) this.K, (String) this.L, "pending", 0, 0L, 0L, null, r25, System.currentTimeMillis(), null, this.G, this.H, this.I, null);
                    com.app.mlounge.data.local.dao.d dVar = hVar.b;
                    this.y = 1;
                    objU = okhttp3.internal.platform.android.g.u(dVar.a, false, true, new com.app.mlounge.data.local.dao.a(dVar, aVar2, i), this);
                    if (objU == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objU = obj;
                }
                long jLongValue = ((Number) objU).longValue();
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "DownloadManager", "Enqueued download: " + this.B + " (id=" + jLongValue + ")");
                hVar.k(jLongValue);
                return kotlin.y.a;
            default:
                a1 a1Var = (a1) this.L;
                String str2 = this.A;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                int i3 = this.y;
                long j = 0;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        String str3 = this.z;
                        if (str3 == null || k.J(str3)) {
                            f0.g((y) this.K, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.A, null, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                        } else {
                            Context applicationContext = ((Context) this.J).getApplicationContext();
                            applicationContext.getClass();
                            com.app.mlounge.data.local.dao.k kVarB = ((com.app.mlounge.h) ((g0) n.r(dagger.hilt.android.internal.a.c(applicationContext.getApplicationContext()), g0.class))).b();
                            if (!k.J(str2)) {
                                CoroutineDispatcher io2 = Dispatchers.getIO();
                                s sVar = new s(kVarB, str2, I, 9);
                                this.y = 1;
                                objWithContext = BuildersKt.withContext(io2, sVar, this);
                                if (objWithContext == aVar3) {
                                    return aVar3;
                                }
                            }
                            f0.e((Context) this.J, this.B, this.C, this.D, this.z, j);
                            f0.c(a1Var, false);
                        }
                        return kotlin.y.a;
                    }
                    if (i3 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objWithContext = obj;
                    com.app.mlounge.data.local.entity.e eVar = (com.app.mlounge.data.local.entity.e) objWithContext;
                    if (eVar != null && eVar.b()) {
                        j = eVar.b;
                    }
                    f0.e((Context) this.J, this.B, this.C, this.D, this.z, j);
                    f0.c(a1Var, false);
                } catch (Exception e) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("CinemaHQ", "Playback launch failed", e);
                    f0.c(a1Var, false);
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Map map, h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = map;
        this.J = hVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.E = str5;
        this.F = str6;
        this.K = str7;
        this.L = str8;
        this.G = i;
        this.H = i2;
        this.I = i3;
    }
}
