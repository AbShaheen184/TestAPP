package androidx.compose.foundation.text.input.internal;

import android.content.Context;
import androidx.compose.animation.core.c1;
import androidx.datastore.core.f1;
import androidx.lifecycle.m0;
import androidx.room.coroutines.c0;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.ui.screens.player.a1;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.w1;
import com.appsalt.internal.c3;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 5;
        this.z = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                k kVar = new k((l) this.z, dVar, 0);
                kVar.y = obj;
                return kVar;
            case 1:
                k kVar2 = new k((f1) this.z, dVar, 1);
                kVar2.y = obj;
                return kVar2;
            case 2:
                k kVar3 = new k((Set) this.z, dVar, 2);
                kVar3.y = obj;
                return kVar3;
            case 3:
                k kVar4 = new k((androidx.lifecycle.q) this.z, dVar, 3);
                kVar4.y = obj;
                return kVar4;
            case 4:
                k kVar5 = new k((androidx.privacysandbox.ads.adservices.measurement.c) this.z, dVar, 4);
                kVar5.y = obj;
                return kVar5;
            case 5:
                k kVar6 = new k((kotlin.coroutines.jvm.internal.i) this.z, dVar);
                kVar6.y = obj;
                return kVar6;
            case 6:
                k kVar7 = new k((ArrayList) this.z, dVar, 6);
                kVar7.y = obj;
                return kVar7;
            case 7:
                return new k((com.app.mlounge.data.remote.ntv.q) this.y, (String) this.z, dVar, 7);
            case 8:
                return new k((com.app.mlounge.ui.viewmodel.c) this.y, (String) this.z, dVar, 8);
            case 9:
                return new k((com.app.mlounge.ui.viewmodel.g) this.y, (String) this.z, dVar, 9);
            case 10:
                return new k((File) this.y, (String) this.z, dVar, 10);
            case 11:
                return new k((a1) this.y, (androidx.media3.exoplayer.source.a) this.z, dVar, 11);
            case 12:
                return new k((z) this.y, (z) this.z, dVar, 12);
            case 13:
                return new k((androidx.compose.runtime.a1) this.y, (androidx.compose.runtime.a1) this.z, dVar, 13);
            case 14:
                return new k((Context) this.y, (androidx.compose.runtime.a1) this.z, dVar, 14);
            case 15:
                return new k((a0) this.y, (Set) this.z, dVar, 15);
            case 16:
                return new k((ChqStream) this.y, (w1) this.z, dVar, 16);
            case 17:
                return new k((ArrayList) this.y, (List) this.z, dVar, 17);
            case 18:
                return new k((c3) this.y, (z) this.z, dVar, 18);
            default:
                return new k((com.i4studio.subslib.subdl.a) this.y, (com.i4studio.subslib.model.a) this.z, dVar, 19);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.e) {
            case 0:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 1:
                return ((k) create((f1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 2:
                return ((k) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 3:
                k kVar = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                kVar.invokeSuspend(yVar);
                return yVar;
            case 4:
                ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
                throw null;
            case 5:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 6:
                k kVar2 = (k) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                y yVar2 = y.a;
                kVar2.invokeSuspend(yVar2);
                return yVar2;
            case 7:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 8:
                k kVar3 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar3 = y.a;
                kVar3.invokeSuspend(yVar3);
                return yVar3;
            case 9:
                k kVar4 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar4 = y.a;
                kVar4.invokeSuspend(yVar4);
                return yVar4;
            case 10:
                k kVar5 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar5 = y.a;
                kVar5.invokeSuspend(yVar5);
                return yVar5;
            case 11:
                k kVar6 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar6 = y.a;
                kVar6.invokeSuspend(yVar6);
                return yVar6;
            case 12:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 13:
                k kVar7 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar7 = y.a;
                kVar7.invokeSuspend(yVar7);
                return yVar7;
            case 14:
                k kVar8 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar8 = y.a;
                kVar8.invokeSuspend(yVar8);
                return yVar8;
            case 15:
                k kVar9 = (k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                y yVar9 = y.a;
                kVar9.invokeSuspend(yVar9);
                return yVar9;
            case 16:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 17:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 18:
                k kVar10 = new k((c3) this.y, (z) this.z, (kotlin.coroutines.d) obj2, 18);
                y yVar10 = y.a;
                kVar10.invokeSuspend(yVar10);
                return yVar10;
            default:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0158  */
    /* JADX WARN: Code duplicated, block: B:56:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String lowerCase;
        b0 b0Var;
        String strD;
        org.jsoup.nodes.g gVarA;
        org.jsoup.nodes.g gVarA2;
        Integer numW;
        String strD2 = null;
        byte b = 0;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                l lVar = (l) this.z;
                Job job = (Job) lVar.b.getAndSet(null);
                AtomicReference atomicReference = lVar.b;
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(job, lVar, null, 11), 3, null);
                while (!atomicReference.compareAndSet(null, jobLaunch$default)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 1:
                kotlin.a.e(obj);
                f1 f1Var = (f1) this.y;
                return Boolean.valueOf((f1Var instanceof androidx.datastore.core.c) && ((androidx.datastore.core.c) f1Var).a <= ((androidx.datastore.core.c) ((f1) this.z)).a);
            case 2:
                kotlin.a.e(obj);
                Set setKeySet = ((androidx.datastore.preferences.core.a) this.y).a().keySet();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.p(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.datastore.preferences.core.d) it.next()).a);
                }
                Set set = (Set) this.z;
                if (set == androidx.datastore.preferences.j.a) {
                    z2 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!arrayList.contains((String) it2.next())) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 3:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.y;
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) this.z;
                androidx.lifecycle.p pVar = qVar.e;
                if (((androidx.lifecycle.x) pVar).d.compareTo(androidx.lifecycle.o.y) >= 0) {
                    pVar.a(qVar);
                } else {
                    JobKt__JobKt.cancel$default(coroutineScope2.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return y.a;
            case 4:
                kotlin.a.e(obj);
                throw null;
            case 5:
                kotlin.a.e(obj);
                kotlin.coroutines.h hVar = ((CoroutineScope) this.y).getCoroutineContext().get(kotlin.coroutines.e.e);
                hVar.getClass();
                kotlin.coroutines.f fVar = (kotlin.coroutines.f) hVar;
                kotlin.coroutines.d dVar = null;
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                BuildersKt.launch(GlobalScope.INSTANCE, fVar, CoroutineStart.UNDISPATCHED, new c0(completableDeferredCompletableDeferred$default, (kotlin.jvm.functions.p) this.z, (kotlin.coroutines.d) null));
                while (!completableDeferredCompletableDeferred$default.isCompleted()) {
                    try {
                        return BuildersKt.runBlocking(fVar, new c1(completableDeferredCompletableDeferred$default, dVar, 19));
                    } catch (InterruptedException unused) {
                        dVar = null;
                    }
                }
                return completableDeferredCompletableDeferred$default.getCompleted();
            case 6:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                aVar.e(y1.b1, kotlin.collections.p.I((ArrayList) this.z, ",", null, null, null, 62));
                return y.a;
            case 7:
                String str3 = (String) this.z;
                com.app.mlounge.data.remote.ntv.q qVar2 = (com.app.mlounge.data.remote.ntv.q) this.y;
                kotlin.a.e(obj);
                try {
                    okhttp3.y yVar = qVar2.a;
                    okhttp3.a0 a0Var = new okhttp3.a0();
                    a0Var.d("https://dlive.sx/stream/stream-" + str3 + ".php");
                    a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36");
                    a0Var.b("Referer", "https://ntv.cx/");
                    a0Var.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                    b0 b0Var2 = new b0(a0Var);
                    yVar.getClass();
                    g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var2, false).e();
                    try {
                        j0 j0Var = g0VarE.D;
                        String strA = j0Var != null ? j0Var.A() : null;
                        g0VarE.close();
                        if (strA == null) {
                            Context context = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.a("E", "NtvStreamExtractor", "DLHD failed to load stream page for " + str3);
                        } else {
                            Pattern patternCompile = Pattern.compile("<iframe[^>]*id=[\"']thatframe[\"'][^>]*src=[\"']([^\"']+)[\"']", 66);
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(strA);
                            matcher.getClass();
                            kotlin.text.g gVarA3 = kotlin.coroutines.g.a(matcher, 0, strA);
                            if (gVarA3 == null || (str2 = (String) kotlin.collections.p.E(1, gVarA3.a())) == null) {
                                Pattern patternCompile2 = Pattern.compile("<iframe[^>]*src=[\"']([^\"']+)[\"']", 66);
                                patternCompile2.getClass();
                                Matcher matcher2 = patternCompile2.matcher(strA);
                                matcher2.getClass();
                                kotlin.text.g gVarA4 = kotlin.coroutines.g.a(matcher2, 0, strA);
                                str = gVarA4 != null ? (String) kotlin.collections.p.E(1, gVarA4.a()) : null;
                            } else {
                                str = str2;
                            }
                            if (str == null) {
                                Context context2 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.a("W", "NtvStreamExtractor", "DLHD no embed iframe found in stream page for " + str3);
                            } else {
                                Context context3 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "DLHD embed iframe: ".concat(str));
                                URL url = new URL(str);
                                String str4 = url.getProtocol() + "://" + url.getHost();
                                String str5 = "https://dlive.sx/stream/stream-" + str3 + ".php";
                                okhttp3.y yVar2 = qVar2.a;
                                okhttp3.a0 a0Var2 = new okhttp3.a0();
                                a0Var2.d(str);
                                a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36");
                                a0Var2.b("Referer", str5);
                                a0Var2.b("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                                b0 b0Var3 = new b0(a0Var2);
                                yVar2.getClass();
                                g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var3, false).e();
                                try {
                                    j0 j0Var2 = g0VarE2.D;
                                    String strA2 = j0Var2 != null ? j0Var2.A() : null;
                                    g0VarE2.close();
                                    if (strA2 == null) {
                                        com.app.mlounge.util.a.a("E", "NtvStreamExtractor", "DLHD failed to load embed iframe");
                                    } else {
                                        String strA3 = com.app.mlounge.data.remote.ntv.q.a(qVar2, strA2);
                                        if (strA3 == null) {
                                            strA3 = com.app.mlounge.data.remote.ntv.q.b(qVar2, strA2);
                                        }
                                        if (strA3 != null) {
                                            com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "DLHD resolved: ".concat(strA3));
                                            return new com.app.mlounge.data.remote.ntv.r(strA3, kotlin.collections.c0.k(new kotlin.k("Origin", str4), new kotlin.k("Referer", str4.concat("/")), new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36")));
                                        }
                                        com.app.mlounge.util.a.a("W", "NtvStreamExtractor", "DLHD could not extract stream from embed");
                                    }
                                    break;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        dagger.internal.d.b(g0VarE2, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            dagger.internal.d.b(g0VarE, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e) {
                    Context context4 = com.app.mlounge.util.a.a;
                    androidx.room.b0.h("DLHD resolution error: ", e.getMessage(), "E", "NtvStreamExtractor");
                }
                return null;
            case 8:
                kotlin.a.e(obj);
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                String str6 = (String) this.z;
                BuildersKt__Builders_commonKt.launch$default(m0.g(cVar), null, null, new androidx.compose.animation.core.f(cVar, com.google.android.gms.dynamite.g.f(str6), str6, (kotlin.coroutines.d) null, 19), 3, null);
                return y.a;
            case 9:
                kotlin.a.e(obj);
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) this.y;
                String str7 = (String) this.z;
                str7.getClass();
                BuildersKt__Builders_commonKt.launch$default(m0.g(gVar), null, null, new androidx.room.s(gVar, str7, b == true ? 1 : 0, 25), 3, null);
                return y.a;
            case 10:
                kotlin.a.e(obj);
                kotlin.io.j.j((File) this.y, (String) this.z);
                return y.a;
            case 11:
                kotlin.a.e(obj);
                a1 a1Var = (a1) this.y;
                androidx.media3.exoplayer.c0 c0Var = a1Var.i;
                if (c0Var != null) {
                    c0Var.K((androidx.media3.exoplayer.source.a) this.z);
                }
                androidx.media3.exoplayer.c0 c0Var2 = a1Var.i;
                if (c0Var2 != null) {
                    c0Var2.C();
                }
                androidx.media3.exoplayer.c0 c0Var3 = a1Var.i;
                if (c0Var3 != null) {
                    c0Var3.M(true);
                }
                return y.a;
            case 12:
                kotlin.a.e(obj);
                String str8 = (String) ((z) this.y).e;
                Map map = (Map) ((z) this.z).e;
                str8.getClass();
                byte b2 = kotlin.text.k.z(str8, "googleusercontent.com", false) || kotlin.text.k.z(str8, ".workers.dev", false) || kotlin.text.k.z(str8, "comet.elfhosted.com", false) || kotlin.text.k.z(str8, "pluto.tv", false) || kotlin.text.k.z(str8, "freehandyflix.online", false) || kotlin.text.k.z(str8, "fsharetv.cc", false) || kotlin.text.k.z(str8, "r2.cloudflarestorage.com", false) || kotlin.text.k.z(str8, ".amazonaws.com", false) || kotlin.text.k.z(str8, "X-Amz-Signature=", false) || kotlin.text.k.z(str8, ".m3u8", false);
                String str9 = "ok";
                if (kotlin.text.r.u(str8, "http", false) && b2 == false) {
                    try {
                        okhttp3.x xVar = new okhttp3.x();
                        xVar.b(kotlin.collections.q.j(okhttp3.z.HTTP_1_1));
                        xVar.a(15L);
                        xVar.c(15L);
                        xVar.i = true;
                        okhttp3.y yVar3 = new okhttp3.y(xVar);
                        okhttp3.a0 a0Var3 = new okhttp3.a0();
                        a0Var3.d(str8);
                        a0Var3.c("HEAD", null);
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                a0Var3.a((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, new b0(a0Var3), false).e();
                        try {
                            int i = g0VarE3.A;
                            String strG = g0.g("Content-Type", g0VarE3);
                            String lowerCase2 = "";
                            if (strG != null) {
                                lowerCase = strG.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = "";
                            }
                            String strG2 = g0.g("Content-Disposition", g0VarE3);
                            if (strG2 != null) {
                                lowerCase2 = strG2.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            }
                            if (200 <= i && i < 400) {
                                List listK = kotlin.collections.q.k("application/zip", "application/x-rar", "application/x-7z", "text/html");
                                if (!listK.isEmpty()) {
                                    Iterator it3 = listK.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (kotlin.text.k.z(lowerCase, (String) it3.next(), false)) {
                                            }
                                        }
                                        str9 = "unsupported";
                                    }
                                }
                                if (kotlin.text.k.z(lowerCase2, ".zip", false) || kotlin.text.k.z(lowerCase2, ".rar", false)) {
                                    str9 = "unsupported";
                                }
                            } else if (i != 405 || !kotlin.text.k.z(str8, "comet.elfhosted.com", false)) {
                                str9 = "offline";
                            }
                            g0VarE3.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                dagger.internal.d.b(g0VarE3, th5);
                                throw th6;
                            }
                        }
                    } catch (Exception unused2) {
                        return "offline";
                    }
                }
                return str9;
            case 13:
                Object objW = kotlin.collections.w.e;
                kotlin.a.e(obj);
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) this.z;
                try {
                    androidx.compose.runtime.a1 a1Var3 = (androidx.compose.runtime.a1) this.y;
                    List list = e0.a;
                    File[] fileArrListFiles = ((File) a1Var3.getValue()).listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (file.isDirectory() && !file.isHidden()) {
                                arrayList2.add(file);
                            }
                        }
                        objW = kotlin.collections.p.W(arrayList2, new androidx.constraintlayout.core.e(16));
                    }
                    break;
                } catch (Exception unused3) {
                }
                List list2 = e0.a;
                a1Var2.setValue(objW);
                return y.a;
            case 14:
                kotlin.a.e(obj);
                ((androidx.compose.runtime.a1) this.z).setValue(e0.u((Context) this.y));
                return y.a;
            case 15:
                kotlin.a.e(obj);
                a0 a0Var4 = (a0) this.y;
                a0Var4.E.setValue(a0Var4.h.m((Set) this.z));
                return y.a;
            case 16:
                kotlin.a.e(obj);
                ChqStream chqStream = (ChqStream) this.y;
                if (kotlin.text.k.z(chqStream.m(), "r2.cloudflarestorage.com", false) || kotlin.text.k.z(chqStream.m(), ".amazonaws.com", false) || kotlin.text.k.z(chqStream.m(), "X-Amz-Signature=", false)) {
                    okhttp3.a0 a0Var5 = new okhttp3.a0();
                    a0Var5.d(chqStream.m());
                    a0Var5.b("Range", "bytes=0-0");
                    Map mapE = chqStream.e();
                    if (mapE != null) {
                        for (Map.Entry entry2 : mapE.entrySet()) {
                            a0Var5.a((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    b0Var = new b0(a0Var5);
                } else {
                    okhttp3.a0 a0Var6 = new okhttp3.a0();
                    a0Var6.d(chqStream.m());
                    a0Var6.c("HEAD", null);
                    Map mapE2 = chqStream.e();
                    if (mapE2 != null) {
                        for (Map.Entry entry3 : mapE2.entrySet()) {
                            a0Var6.a((String) entry3.getKey(), (String) entry3.getValue());
                        }
                    }
                    b0Var = new b0(a0Var6);
                }
                okhttp3.y yVar4 = (okhttp3.y) ((w1) this.z).C.getValue();
                yVar4.getClass();
                g0 g0VarE4 = new okhttp3.internal.connection.m(yVar4, b0Var, false).e();
                int i2 = g0VarE4.A;
                boolean z3 = (200 <= i2 && i2 < 400) || i2 == 405;
                try {
                    Context context5 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "SourcesViewModel", "Source check [" + chqStream.g() + "] HTTP " + i2 + " " + kotlin.text.k.f0(60, chqStream.m()) + " alive=" + z3);
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    g0VarE4.close();
                    return boolValueOf;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        dagger.internal.d.b(g0VarE4, th7);
                        throw th8;
                    }
                }
            case 17:
                kotlin.a.e(obj);
                ArrayList arrayList3 = (ArrayList) this.y;
                arrayList3.addAll((List) this.z);
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    ChqStream chqStream2 = (ChqStream) obj2;
                    if (hashSet.add(chqStream2.m() + "|" + chqStream2.g() + "|" + chqStream2.h())) {
                        arrayList4.add(obj2);
                    }
                }
                return kotlin.collections.p.W(arrayList4, new androidx.constraintlayout.core.e(20));
            case 18:
                kotlin.a.e(obj);
                ((net.luminis.quic.stream.e) ((c3) this.y).a.y).f.write((byte[]) ((z) this.z).e);
                return y.a;
            default:
                kotlin.a.e(obj);
                ArrayList arrayList5 = new ArrayList();
                com.i4studio.subslib.subdl.a aVar2 = (com.i4studio.subslib.subdl.a) this.y;
                com.i4studio.subslib.model.a aVar3 = (com.i4studio.subslib.model.a) this.z;
                StringBuilder sb = new StringBuilder();
                sb.append(aVar3.c);
                Integer num = aVar3.d;
                if (num != null) {
                    sb.append("%20" + num.intValue());
                }
                org.jsoup.nodes.g gVarA5 = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com/search/".concat(sb.toString()));
                if (gVarA5 != null) {
                    org.jsoup.select.e eVarB0 = gVarA5.b0("a[href^=/subtitle/]");
                    eVarB0.getClass();
                    Iterator<E> it4 = eVarB0.iterator();
                    it4.getClass();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) next;
                            String strD3 = jVar.b0("h3").d();
                            strD3.getClass();
                            String string = kotlin.text.k.g0(strD3).toString();
                            String string2 = kotlin.text.k.g0(kotlin.text.k.b0(string, "(")).toString();
                            String string3 = kotlin.text.k.g0(kotlin.text.k.b0(kotlin.text.k.W(string, "(", string), ")")).toString();
                            boolean zO = kotlin.text.r.o(string2, aVar3.c, true);
                            byte b3 = num == null || kotlin.jvm.internal.l.a(string3, String.valueOf(num.intValue()));
                            if (zO && b3 != false) {
                                strD = jVar.d("href");
                            }
                        } else {
                            strD = null;
                        }
                    }
                    if (strD != null && (gVarA = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com".concat(strD))) != null) {
                        int iOrdinal = aVar3.a.ordinal();
                        if (iOrdinal == 0) {
                            arrayList5.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA));
                        } else {
                            if (iOrdinal != 1) {
                                coil3.g.a();
                                return null;
                            }
                            Integer num2 = aVar3.f;
                            org.jsoup.select.e eVarB1 = gVarA.b0("a[href^=/subtitle/]");
                            eVarB1.getClass();
                            Iterator<E> it5 = eVarB1.iterator();
                            it5.getClass();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                next2.getClass();
                                org.jsoup.nodes.j jVar2 = (org.jsoup.nodes.j) next2;
                                org.jsoup.nodes.j jVarC0 = jVar2.c0("h3.text-xl.font-bold");
                                if (jVarC0 != null) {
                                    String strD0 = jVarC0.d0();
                                    strD0.getClass();
                                    String string4 = kotlin.text.k.g0(strD0).toString();
                                    if (kotlin.text.r.u(string4, "Season", true) && (numW = kotlin.text.r.w(kotlin.text.k.g0(kotlin.text.k.P(string4, "Season")).toString())) != null) {
                                        int iIntValue = numW.intValue();
                                        if (num2 != null && iIntValue == num2.intValue()) {
                                            strD2 = jVar2.d("href");
                                        } else if (string4.equalsIgnoreCase("Specials")) {
                                            continue;
                                        }
                                        if (strD2 != null) {
                                            arrayList5.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                                        }
                                    } else if (string4.equalsIgnoreCase("Specials") && num2 != null && num2.intValue() == 0) {
                                        strD2 = jVar2.d("href");
                                        if (strD2 != null && (gVarA2 = com.i4studio.subslib.subdl.a.a(aVar2, "https://subdl.com".concat(strD2))) != null) {
                                            arrayList5.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                                        }
                                    }
                                }
                            }
                            if (strD2 != null) {
                                arrayList5.addAll(com.i4studio.subslib.subdl.a.b(aVar2, gVarA2));
                            }
                        }
                    }
                }
                return arrayList5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
