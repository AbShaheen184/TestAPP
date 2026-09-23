package androidx.navigation.internal;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.q2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.compose.runtime.f1;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.navigation.r;
import androidx.room.coroutines.q;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.k;
import androidx.work.impl.o;
import coil3.j;
import coil3.p;
import coil3.request.n;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.data.anime.AnikotoScraper;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.viewmodel.b1;
import com.caverock.androidsvg.h2;
import com.caverock.androidsvg.r0;
import com.google.firebase.sessions.k1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.y;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.internal.m0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ h(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0232  */
    /* JADX WARN: Code duplicated, block: B:120:0x024b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0250  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Throwable {
        androidx.sqlite.db.framework.f fVar;
        int largeMemoryClass;
        Throwable th;
        k kVarA;
        float f;
        float f2;
        r0 r0Var;
        r0 r0Var2;
        String str;
        j gVar;
        float fMax;
        int i = this.e;
        int i2 = 0;
        y yVar = y.a;
        Object obj = this.y;
        switch (i) {
            case 0:
                return new r((String) obj);
            case 1:
                androidx.room.r rVar = ((androidx.room.f) obj).a;
                return Boolean.valueOf(!rVar.k() || rVar.n());
            case 2:
                return ((Callable) obj).call();
            case 3:
                ((Runnable) obj).run();
                return yVar;
            case 4:
                return ((androidx.localbroadcastmanager.content.b) obj).h(":memory:");
            case 5:
                q qVar = (q) obj;
                return qVar.e.h(qVar.y);
            case 6:
                androidx.savedstate.g gVar2 = (androidx.savedstate.g) obj;
                gVar2.getLifecycle().a(new androidx.savedstate.b(gVar2, i2));
                return yVar;
            case 7:
                androidx.sqlite.db.framework.g gVar3 = (androidx.sqlite.db.framework.g) obj;
                String str2 = gVar3.y;
                if (str2 == null || !gVar3.A) {
                    fVar = new androidx.sqlite.db.framework.f(gVar3.e, gVar3.y, new t(12), gVar3.z, gVar3.B);
                } else {
                    Context context = gVar3.e;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    fVar = new androidx.sqlite.db.framework.f(gVar3.e, new File(noBackupFilesDir, str2).getAbsolutePath(), new t(12), gVar3.z, gVar3.B);
                }
                fVar.setWriteAheadLoggingEnabled(gVar3.D);
                return fVar;
            case 8:
                androidx.work.impl.utils.b.a((o) obj);
                return yVar;
            case 9:
                androidx.work.impl.t tVar = (androidx.work.impl.t) obj;
                WorkDatabase workDatabase = tVar.c;
                Context context2 = tVar.a;
                String str3 = androidx.work.impl.background.systemjob.c.C;
                if (Build.VERSION.SDK_INT >= 34) {
                    androidx.work.impl.background.systemjob.a.a(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                ArrayList arrayListD = androidx.work.impl.background.systemjob.c.d(context2, jobScheduler);
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    Iterator it = arrayListD.iterator();
                    while (it.hasNext()) {
                        androidx.work.impl.background.systemjob.c.b(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) okhttp3.internal.platform.android.g.t(workDatabase.w().a, false, true, new androidx.navigation.compose.r(19))).intValue();
                androidx.work.impl.i.b(tVar.b, workDatabase, tVar.e);
                return yVar;
            case 10:
                return kotlin.collections.q.j((kotlin.k) obj);
            case 11:
                Context context3 = (Context) ((q2) obj).a;
                double d = 0.2d;
                try {
                    Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    kotlinx.coroutines.future.a.q("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                l lVar = new l(7, (byte) 0);
                try {
                    Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = LibretroCore.SCREEN_WIDTH;
                }
                return new coil3.memory.c(new androidx.compose.ui.input.pointer.util.b((long) (d * ((long) largeMemoryClass) * 1048576), lVar), lVar);
            case 12:
                return coil3.decode.e.b((coil3.decode.e) obj);
            case 13:
                return (coil3.disk.g) ((p) obj).a.e.getValue();
            case 14:
                return new coil3.network.okhttp.internal.b((okhttp3.y) ((h) obj).invoke());
            case 15:
                coil3.svg.f fVar2 = (coil3.svg.f) obj;
                coil3.decode.q qVar2 = fVar2.a;
                boolean z = fVar2.f;
                n nVar = fVar2.b;
                okio.h hVarP = qVar2.P();
                try {
                    kVarA = fVar2.c.a(hVarP);
                    try {
                        hVarP.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        hVarP.close();
                    } catch (Throwable th4) {
                        kotlin.a.a(th3, th4);
                    }
                    th = th3;
                    kVarA = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                c2 c2Var = (c2) kVarA.y;
                r0 r0Var3 = (r0) c2Var.y;
                if (r0Var3 != null) {
                    androidx.compose.ui.geometry.a aVar = r0Var3.o;
                    RectF rectF = aVar == null ? null : new RectF(aVar.b, aVar.c, aVar.c(), aVar.d());
                    coil3.svg.d dVar = rectF != null ? new coil3.svg.d(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (fVar2.e && dVar != null) {
                        f = dVar.c - dVar.a;
                        f2 = dVar.d - dVar.b;
                    } else if (((r0) c2Var.y) != null) {
                        f = c2Var.B().d;
                        if (((r0) c2Var.y) != null) {
                            f2 = c2Var.B().e;
                        } else {
                            kotlinx.coroutines.future.a.q("SVG document is empty");
                        }
                    } else {
                        kotlinx.coroutines.future.a.q("SVG document is empty");
                    }
                    coil3.size.h hVar = nVar.b;
                    coil3.size.g gVar4 = nVar.c;
                    if (kotlin.jvm.internal.l.a(hVar, coil3.size.h.c)) {
                        float fFloatValue = ((Number) fVar2.d.invoke(nVar.a)).floatValue();
                        if (f > 0.0f) {
                            f *= fFloatValue;
                        }
                        if (f2 > 0.0f) {
                            f2 *= fFloatValue;
                        }
                    }
                    int iH = f > 0.0f ? kotlin.math.a.H(f) : 512;
                    int iH2 = f2 > 0.0f ? kotlin.math.a.H(f2) : 512;
                    coil3.size.h hVar2 = nVar.b;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar = coil3.request.h.b;
                    long jH = com.google.firebase.b.h(iH, iH2, hVar2, gVar4, (coil3.size.h) coil3.l.e(nVar, eVar));
                    int i3 = (int) (jH >> 32);
                    int i4 = (int) (jH & 4294967295L);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        r0Var = (r0) c2Var.y;
                        if (r0Var != null) {
                            r0Var.r = h2.s("100%");
                            r0Var2 = (r0) c2Var.y;
                            if (r0Var2 != null) {
                                r0Var2.s = h2.s("100%");
                                str = (String) coil3.l.e(nVar, coil3.svg.b.a);
                                if (str != null) {
                                    k kVar = new k(15);
                                    androidx.media3.common.audio.e eVar2 = new androidx.media3.common.audio.e(2);
                                    com.caverock.androidsvg.c cVar = new com.caverock.androidsvg.c(str);
                                    cVar.R();
                                    kVar.y = eVar2.e(cVar);
                                    kVarA.z = kVar;
                                }
                                gVar = new coil3.svg.g(c2Var, (k) kVarA.z, i3, i4);
                                if (z) {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    gVar.d(new Canvas(bitmapCreateBitmap));
                                    gVar = new coil3.a(bitmapCreateBitmap);
                                }
                                return new coil3.decode.i(gVar, z);
                            }
                            kotlinx.coroutines.future.a.q("SVG document is empty");
                        } else {
                            kotlinx.coroutines.future.a.q("SVG document is empty");
                        }
                    } else {
                        float f3 = i4;
                        coil3.size.h hVar3 = (coil3.size.h) coil3.l.e(nVar, eVar);
                        float f4 = i3 / f;
                        float f5 = f3 / f2;
                        int iOrdinal = gVar4.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f4, f5);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f4, f5);
                        } else {
                            coil3.g.a();
                        }
                        coil3.size.c cVar2 = hVar3.a;
                        if (cVar2 instanceof coil3.size.a) {
                            float f6 = ((coil3.size.a) cVar2).a / f;
                            if (fMax > f6) {
                                fMax = f6;
                            }
                        }
                        coil3.size.c cVar3 = hVar3.b;
                        if (cVar3 instanceof coil3.size.a) {
                            float f7 = ((coil3.size.a) cVar3).a / f2;
                            if (fMax > f7) {
                                fMax = f7;
                            }
                        }
                        int i5 = (int) (fMax * f);
                        i4 = (int) (fMax * f2);
                        if (dVar == null) {
                            float f8 = f - 0.0f;
                            float f9 = f2 - 0.0f;
                            r0 r0Var4 = (r0) c2Var.y;
                            if (r0Var4 != null) {
                                r0Var4.o = new androidx.compose.ui.geometry.a(0.0f, 0.0f, f8, f9);
                            } else {
                                kotlinx.coroutines.future.a.q("SVG document is empty");
                            }
                        }
                        i3 = i5;
                        r0Var = (r0) c2Var.y;
                        if (r0Var != null) {
                            r0Var.r = h2.s("100%");
                            r0Var2 = (r0) c2Var.y;
                            if (r0Var2 != null) {
                                r0Var2.s = h2.s("100%");
                                str = (String) coil3.l.e(nVar, coil3.svg.b.a);
                                if (str != null) {
                                    k kVar2 = new k(15);
                                    androidx.media3.common.audio.e eVar3 = new androidx.media3.common.audio.e(2);
                                    com.caverock.androidsvg.c cVar4 = new com.caverock.androidsvg.c(str);
                                    cVar4.R();
                                    kVar2.y = eVar3.e(cVar4);
                                    kVarA.z = kVar2;
                                }
                                gVar = new coil3.svg.g(c2Var, (k) kVarA.z, i3, i4);
                                if (z) {
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    gVar.d(new Canvas(bitmapCreateBitmap2));
                                    gVar = new coil3.a(bitmapCreateBitmap2);
                                }
                                return new coil3.decode.i(gVar, z);
                            }
                            kotlinx.coroutines.future.a.q("SVG document is empty");
                        } else {
                            kotlinx.coroutines.future.a.q("SVG document is empty");
                        }
                    }
                } else {
                    kotlinx.coroutines.future.a.q("SVG document is empty");
                }
                return null;
            case 16:
                int i6 = CinemaHQApp.D;
                okhttp3.y yVar2 = ((CinemaHQApp) obj).B;
                if (yVar2 != null) {
                    return yVar2;
                }
                kotlin.jvm.internal.l.f("imageHttpClient");
                throw null;
            case 17:
                return AnikotoScraper.watchClient_delegate$lambda$0((AnikotoScraper) obj);
            case 18:
                return ((y1) obj).a.getSharedPreferences("emu_prefs", 0);
            case 19:
                return Float.valueOf(((f1) obj).g());
            case 20:
                ((com.app.mlounge.ui.viewmodel.c) obj).e();
                return yVar;
            case 21:
                return Float.valueOf(((com.app.mlounge.data.local.entity.a) obj).k / 100.0f);
            case 22:
                MutableStateFlow mutableStateFlow = ((com.app.mlounge.ui.viewmodel.r) obj).G;
                mutableStateFlow.setValue(Boolean.valueOf(true ^ ((Boolean) mutableStateFlow.getValue()).booleanValue()));
                return yVar;
            case 23:
                ((b1) obj).m("");
                return yVar;
            case 24:
                return new com.google.accompanist.drawablepainter.a((com.google.accompanist.drawablepainter.b) obj);
            case 25:
                ((k1) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 26:
                return new androidx.collection.b1((Object[]) obj);
            case 27:
                return obj;
            case 28:
                kotlinx.serialization.descriptors.g gVar5 = (kotlinx.serialization.descriptors.g) obj;
                return Integer.valueOf(m0.d(gVar5, gVar5.j));
            default:
                return (List) obj;
        }
    }
}
