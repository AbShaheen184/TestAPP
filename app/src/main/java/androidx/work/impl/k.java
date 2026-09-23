package androidx.work.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.appcompat.widget.c2;
import androidx.media3.common.util.m0;
import androidx.media3.exoplayer.audio.l0;
import androidx.media3.exoplayer.audio.n0;
import androidx.media3.exoplayer.audio.o0;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.source.r0;
import com.app.mlounge.R;
import com.app.mlounge.ui.screens.player.b1;
import com.appsalt.internal.g4;
import com.appsalt.internal.p0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.h2;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.u3;
import com.google.android.gms.measurement.internal.y3;
import com.google.common.util.concurrent.j0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements coil3.target.a, androidx.media3.extractor.p, com.appsalt.internal.x, com.google.android.gms.tasks.b, com.google.android.gms.tasks.d, j0 {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public k(Context context, int i) {
        this.e = i;
        switch (i) {
            case 9:
                context.getClass();
                this.y = context;
                this.z = new androidx.media3.exoplayer.mediacodec.g(context);
                break;
            case 16:
                this.z = null;
                this.y = context;
                break;
            case 24:
                com.google.android.gms.common.internal.x.g(context);
                Resources resources = context.getResources();
                this.y = resources;
                this.z = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.z = context;
                this.y = null;
                break;
        }
    }

    @Override // com.appsalt.internal.x
    public List a(int i, String str) {
        List listA = ((com.appsalt.internal.w) this.y).a(3, str);
        return !((ArrayList) listA).isEmpty() ? listA : ((com.appsalt.internal.w) this.z).a(3, str);
    }

    @Override // com.google.common.util.concurrent.j0
    public void b(Object obj) {
        s2 s2Var = (s2) this.z;
        s2Var.v();
        p1 p1Var = (p1) s2Var.e;
        d1 d1Var = p1Var.B;
        p1.k(d1Var);
        SparseArray sparseArrayB = d1Var.B();
        y3 y3Var = (y3) this.y;
        sparseArrayB.put(y3Var.z, Long.valueOf(y3Var.y));
        d1 d1Var2 = p1Var.B;
        p1.k(d1Var2);
        int[] iArr = new int[sparseArrayB.size()];
        long[] jArr = new long[sparseArrayB.size()];
        for (int i = 0; i < sparseArrayB.size(); i++) {
            iArr[i] = sparseArrayB.keyAt(i);
            jArr[i] = ((Long) sparseArrayB.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        d1Var2.K.K(bundle);
        s2Var.F = false;
        s2Var.G = 1;
        u0 u0Var = p1Var.C;
        p1.m(u0Var);
        u0Var.J.b(y3Var.e, "Successfully registered trigger URI");
        s2Var.U();
    }

    @Override // com.appsalt.internal.x
    public kotlin.k c(int i, String str) {
        kotlin.k kVarC = ((com.appsalt.internal.w) this.y).c(i, str);
        return kVarC != null ? kVarC : ((com.appsalt.internal.w) this.z).c(i, str);
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        Bundle bundle;
        com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.y;
        Bundle bundle2 = (Bundle) this.z;
        bVar.getClass();
        return (iVar.h() && (bundle = (Bundle) iVar.f()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).i(com.google.android.gms.cloudmessaging.h.z, com.google.android.gms.cloudmessaging.d.A) : iVar;
    }

    @Override // coil3.target.a
    public void e(coil3.j jVar) {
        androidx.compose.ui.graphics.painter.b bVarL;
        coil3.request.g gVar = (coil3.request.g) this.y;
        coil3.compose.i iVar = (coil3.compose.i) this.z;
        androidx.compose.ui.graphics.painter.b bVarD = jVar != null ? coil3.compose.k.d(jVar, gVar.a, iVar.M) : null;
        if (bVarD == null && ((Boolean) coil3.l.d(gVar, coil3.compose.k.b)).booleanValue() && (bVarL = iVar.l()) != null) {
            bVarD = bVarL;
        }
        coil3.compose.i.k(iVar, new coil3.compose.f(bVarD));
    }

    @Override // com.appsalt.internal.x
    public void f(com.appsalt.internal.i iVar) {
        ((com.appsalt.internal.w) this.y).y = iVar;
        ((com.appsalt.internal.w) this.z).y = iVar;
    }

    public void g(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.y).add(androidx.compose.runtime.j.m(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // androidx.media3.extractor.p
    public void h(androidx.media3.extractor.a0 a0Var) {
        androidx.media3.extractor.p pVar = (androidx.media3.extractor.p) this.y;
        a0Var.getClass();
        b1 b1Var = (b1) this.z;
        b1Var.c = a0Var;
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "SeekableMatroskaExtractor: delegate seekMap isSeekable=" + a0Var.c() + ", duration=" + a0Var.g());
        if (!a0Var.c() && a0Var.g() != -9223372036854775807L) {
            long j = b1Var.a;
            if (j > 0) {
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "SeekableMatroskaExtractor: Substituting LinearSeekMap (inputLength=" + j + ")");
                pVar.h(new com.app.mlounge.ui.screens.player.c(a0Var.g(), b1Var.a));
                return;
            }
        }
        pVar.h(a0Var);
    }

    public boolean i(androidx.work.impl.model.j jVar) {
        boolean zContainsKey;
        synchronized (this.z) {
            zContainsKey = ((androidx.work.h) this.y).a.containsKey(jVar);
        }
        return zContainsKey;
    }

    @Override // com.google.common.util.concurrent.j0
    public void j(Throwable th) {
        s2 s2Var = (s2) this.z;
        s2Var.v();
        p1 p1Var = (p1) s2Var.e;
        s2Var.F = false;
        s2Var.T().add((y3) this.y);
        if (s2Var.G > ((Integer) com.google.android.gms.measurement.internal.f0.v0.a(null)).intValue()) {
            s2Var.G = 1;
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.c(u0.D(p1Var.r().B()), u0.D(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        u0 u0Var2 = p1Var.C;
        p1.m(u0Var2);
        u0Var2.F.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", u0.D(p1Var.r().B()), u0.D(String.valueOf(s2Var.G)), u0.D(th.toString()));
        int i = s2Var.G;
        if (s2Var.H == null) {
            s2Var.H = new h2(s2Var, p1Var, 1);
        }
        s2Var.H.b(((long) i) * 1000);
        int i2 = s2Var.G;
        s2Var.G = i2 + i2;
    }

    public androidx.media3.exoplayer.a[] k(Handler handler, androidx.media3.exoplayer.x xVar, androidx.media3.exoplayer.x xVar2, androidx.media3.exoplayer.x xVar3, androidx.media3.exoplayer.x xVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.y;
        androidx.media3.exoplayer.video.i iVar = new androidx.media3.exoplayer.video.i(context);
        androidx.media3.exoplayer.mediacodec.g gVar = (androidx.media3.exoplayer.mediacodec.g) this.z;
        iVar.c = gVar;
        iVar.d = 5000L;
        iVar.e = handler;
        iVar.f = xVar;
        iVar.g = 50;
        _COROUTINE.a.A(!iVar.b);
        Handler handler2 = iVar.e;
        _COROUTINE.a.A((handler2 == null && iVar.f == null) || !(handler2 == null || iVar.f == null));
        iVar.b = true;
        arrayList.add(new androidx.media3.exoplayer.video.k(iVar));
        l0 l0Var = new l0(context);
        _COROUTINE.a.A(!l0Var.d);
        l0Var.d = true;
        if (l0Var.c == null) {
            l0Var.c = new c2(new androidx.media3.common.audio.m[0]);
        }
        androidx.media3.exoplayer.audio.f0 f0Var = l0Var.f;
        androidx.dynamicanimation.animation.b bVar = l0Var.g;
        if (f0Var == null) {
            if (bVar == null) {
                l0Var.g = new androidx.dynamicanimation.animation.b(context);
            }
            if (l0Var.e == null) {
                l0Var.e = o0.a;
            }
            androidx.media3.exoplayer.audio.e0 e0Var = new androidx.media3.exoplayer.audio.e0(context);
            androidx.media3.exoplayer.audio.b bVar2 = context != null ? null : l0Var.b;
            Context context2 = e0Var.a;
            if (context2 == null) {
                e0Var.d = bVar2;
            }
            androidx.dynamicanimation.animation.b bVar3 = l0Var.g;
            e0Var.b = bVar3;
            e0Var.c = l0Var.e;
            if (bVar3 == null) {
                e0Var.b = new androidx.dynamicanimation.animation.b(context2);
            }
            l0Var.f = new androidx.media3.exoplayer.audio.f0(e0Var);
        } else {
            _COROUTINE.a.A(bVar == null);
            _COROUTINE.a.A(l0Var.e == null);
        }
        arrayList.add(new q0((Context) this.y, gVar, handler, xVar2, new n0(l0Var)));
        Looper looper = handler.getLooper();
        context.getClass();
        looper.getClass();
        arrayList.add(new androidx.media3.exoplayer.text.e(xVar3, looper));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof androidx.media3.exoplayer.text.e) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.text.e) it.next()).i0 = true;
        }
        Looper looper2 = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new androidx.media3.exoplayer.metadata.b(xVar4, looper2));
        }
        arrayList.add(new androidx.media3.exoplayer.video.spherical.b());
        arrayList.add(new androidx.media3.exoplayer.image.g(new androidx.emoji2.text.m(context, 1)));
        return (androidx.media3.exoplayer.a[]) arrayList.toArray(new androidx.media3.exoplayer.a[0]);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory l(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.z) == null) {
            Context context = (Context) this.y;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.z = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.z = map;
        }
        String str4 = (String) ((Map) this.z).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    public coil3.memory.b m(coil3.request.g gVar, coil3.memory.a aVar, coil3.size.h hVar, coil3.size.g gVar2) {
        coil3.memory.b bVar;
        boolean z;
        double d;
        int iAbs;
        double d2;
        coil3.memory.b bVar2;
        coil3.util.h hVar2 = coil3.util.h.y;
        coil3.request.b bVar3 = gVar.i;
        coil3.size.d dVar = gVar.q;
        Object obj = gVar.b;
        if (bVar3.e) {
            coil3.memory.c cVarC = ((coil3.p) this.y).c();
            if (cVarC != null) {
                synchronized (cVarC.c) {
                    try {
                        coil3.memory.d dVar2 = (coil3.memory.d) ((LinkedHashMap) ((r0) cVarC.a.c).z).get(aVar);
                        bVar = dVar2 != null ? new coil3.memory.b(dVar2.a, dVar2.b) : null;
                        if (bVar == null) {
                            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = cVarC.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) lVar.z).get(aVar);
                            if (arrayList == null) {
                                bVar = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        bVar2 = null;
                                        break;
                                    }
                                    coil3.memory.e eVar = (coil3.memory.e) arrayList.get(i);
                                    coil3.j jVar = (coil3.j) eVar.a.get();
                                    bVar2 = jVar != null ? new coil3.memory.b(jVar, eVar.b) : null;
                                    if (bVar2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                lVar.c();
                                bVar = bVar2;
                            }
                        }
                        if (bVar != null && !bVar.a.c()) {
                            synchronized (cVarC.c) {
                                r0 r0Var = (r0) cVarC.a.c;
                                Object objRemove = ((LinkedHashMap) r0Var.z).remove(aVar);
                                if (objRemove != null) {
                                    r0Var.y = r0Var.c() - r0Var.d(aVar, objRemove);
                                    r0Var.a(aVar, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) cVarC.b.z).remove(aVar) == null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                bVar = null;
            }
            if (bVar != null) {
                coil3.j jVar2 = bVar.a;
                coil3.a aVar2 = jVar2 instanceof coil3.a ? (coil3.a) jVar2 : null;
                if (aVar2 != null) {
                    Bitmap.Config config = aVar2.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (com.google.android.gms.common.wrappers.a.d(config) && !((Boolean) coil3.l.d(gVar, coil3.request.i.f)).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                androidx.media3.exoplayer.hls.c cVar = (androidx.media3.exoplayer.hls.c) this.z;
                if (z) {
                    String str = (String) aVar.b.get("coil#size");
                    if (str != null) {
                        if (!str.equals(hVar.toString())) {
                            if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar2) <= 0) {
                                androidx.media3.exoplayer.hls.c.E("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + hVar + ").", null);
                                return null;
                            }
                        }
                        return bVar;
                    }
                    Object obj2 = bVar.b.get("coil#is_sampled");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if ((bool != null ? bool.booleanValue() : false) || (!kotlin.jvm.internal.l.a(hVar, coil3.size.h.c) && dVar != coil3.size.d.y)) {
                        int iB = jVar2.b();
                        int iA = jVar2.a();
                        coil3.size.h hVar3 = jVar2 instanceof coil3.a ? (coil3.size.h) coil3.l.d(gVar, coil3.request.h.b) : coil3.size.h.c;
                        coil3.size.c cVar2 = hVar.a;
                        int i2 = cVar2 instanceof coil3.size.a ? ((coil3.size.a) cVar2).a : Integer.MAX_VALUE;
                        coil3.size.c cVar3 = hVar3.a;
                        int iMin = Math.min(i2, cVar3 instanceof coil3.size.a ? ((coil3.size.a) cVar3).a : Integer.MAX_VALUE);
                        coil3.size.c cVar4 = hVar.b;
                        int i3 = cVar4 instanceof coil3.size.a ? ((coil3.size.a) cVar4).a : Integer.MAX_VALUE;
                        coil3.size.c cVar5 = hVar3.b;
                        int iMin2 = Math.min(i3, cVar5 instanceof coil3.size.a ? ((coil3.size.a) cVar5).a : Integer.MAX_VALUE);
                        double d3 = ((double) iMin) / ((double) iB);
                        double d4 = ((double) iMin2) / ((double) iA);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? coil3.size.g.y : gVar2).ordinal();
                        if (iOrdinal != 0) {
                            d = d4;
                            if (iOrdinal != 1) {
                                coil3.g.a();
                                return null;
                            }
                            if (d3 < d) {
                                iAbs = Math.abs(iMin - iB);
                                d2 = d3;
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d2 = d;
                            }
                        } else {
                            d = d4;
                            if (d3 > d) {
                                iAbs = Math.abs(iMin - iB);
                                d2 = d3;
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d2 = d;
                            }
                        }
                        if (iAbs > 1) {
                            int iOrdinal2 = dVar.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    coil3.g.a();
                                    return null;
                                }
                                if (d2 > 1.0d) {
                                    if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar2) <= 0) {
                                        androidx.media3.exoplayer.hls.c.E("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + iB + ", " + iA + ") is smaller than the target size (" + iMin + ", " + iMin2 + ").", null);
                                        return null;
                                    }
                                }
                            } else if (d2 != 1.0d) {
                                if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar2) <= 0) {
                                    androidx.media3.exoplayer.hls.c.E("MemoryCacheService", hVar2, obj + ": Memory cached image's size (" + iB + ", " + iA + ") does not exactly match the target size (" + iMin + ", " + iMin2 + ").", null);
                                    return null;
                                }
                            }
                        }
                    }
                    return bVar;
                }
                if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar2) <= 0) {
                    androidx.media3.exoplayer.hls.c.E("MemoryCacheService", hVar2, obj + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                    return null;
                }
            }
        }
        return null;
    }

    public String n(String str) {
        String str2 = (String) this.z;
        Resources resources = (Resources) this.y;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    public coil3.memory.a o(coil3.request.g gVar, Object obj, coil3.request.n nVar, coil3.f fVar) {
        String str;
        String strF;
        coil3.request.b bVar = gVar.i;
        Map map = gVar.d;
        if (bVar != coil3.request.b.DISABLED) {
            coil3.d dVar = ((coil3.p) this.y).d;
            androidx.media3.exoplayer.hls.c cVar = (androidx.media3.exoplayer.hls.c) this.z;
            List list = dVar.c;
            int size = list.size();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < size) {
                    kotlin.k kVar = (kotlin.k) list.get(i);
                    coil3.key.a aVar = (coil3.key.a) kVar.e;
                    if (((kotlin.jvm.internal.e) ((kotlin.reflect.c) kVar.y)).d(obj)) {
                        aVar.getClass();
                        switch (aVar.a) {
                            case 0:
                                coil3.v vVar = (coil3.v) obj;
                                if (!kotlin.jvm.internal.l.a(vVar.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = nVar.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = coil3.util.m.a;
                                    str = vVar + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                coil3.v vVar2 = (coil3.v) obj;
                                String str2 = vVar2.c;
                                if (!(str2 == null || str2.equals("file")) || vVar2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = coil3.util.m.a;
                                    if ((kotlin.jvm.internal.l.a(vVar2.c, "file") && kotlin.jvm.internal.l.a(kotlin.collections.p.D(coil3.l.g(vVar2)), "android_asset")) || !((Boolean) coil3.l.e(nVar, coil3.request.h.c)).booleanValue() || (strF = coil3.l.f(vVar2)) == null) {
                                        str = null;
                                    } else {
                                        okio.k kVar2 = nVar.f;
                                        String str3 = okio.x.y;
                                        str = vVar2 + "-" + ((Long) kVar2.Y(com.google.android.gms.measurement.internal.b0.d(strF)).g);
                                    }
                                }
                                break;
                            default:
                                str = ((coil3.v) obj).a;
                                break;
                        }
                        if (str == null) {
                            z = true;
                        }
                    }
                    i++;
                } else {
                    if (!z && cVar != null) {
                        coil3.util.h hVar = (coil3.util.h) cVar.y;
                        coil3.util.h hVar2 = coil3.util.h.A;
                        if (hVar.compareTo(hVar2) <= 0) {
                            androidx.media3.exoplayer.hls.c.E("MemoryCacheService", hVar2, androidx.compose.runtime.j.k("No keyer is registered for data with type '", kotlin.jvm.internal.a0.a(obj.getClass()).c(), "'. Register Keyer<", kotlin.jvm.internal.a0.a(obj.getClass()).c(), "> in the component registry to cache the output image in the memory cache."), null);
                        }
                    }
                    str = null;
                }
            }
            if (str != null) {
                if (((List) coil3.l.d(gVar, coil3.request.h.a)).isEmpty()) {
                    return new coil3.memory.a(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", nVar.b.toString());
                return new coil3.memory.a(str, linkedHashMap);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        ((Map) ((k) this.z).z).remove((com.google.android.gms.tasks.j) this.y);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 coil3.request.n, still in use, count: 3, list:
          (r1v0 coil3.request.n) from 0x0096: MOVE (r18v0 coil3.request.n) = (r1v0 coil3.request.n) (LINE:151)
          (r1v0 coil3.request.n) from 0x007b: MOVE (r18v3 coil3.request.n) = (r1v0 coil3.request.n) (LINE:124)
          (r1v0 coil3.request.n) from 0x0084: MOVE (r18v5 coil3.request.n) = (r1v0 coil3.request.n) (LINE:133)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public coil3.request.n p(coil3.request.g r20, coil3.size.h r21) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.k.p(coil3.request.g, coil3.size.h):coil3.request.n");
    }

    public j q(androidx.work.impl.model.j jVar) {
        j jVarB;
        jVar.getClass();
        synchronized (this.z) {
            jVarB = ((androidx.work.h) this.y).b(jVar);
        }
        return jVarB;
    }

    @Override // androidx.media3.extractor.p
    public void r() {
        ((androidx.media3.extractor.p) this.y).r();
    }

    public void s(j jVar, c2 c2Var) {
        jVar.getClass();
        androidx.work.impl.utils.taskexecutor.a aVar = (androidx.work.impl.utils.taskexecutor.a) this.z;
        androidx.compose.foundation.text.contextmenu.internal.g gVar = new androidx.compose.foundation.text.contextmenu.internal.g(6, this, jVar, c2Var);
        aVar.getClass();
        ((androidx.work.impl.utils.taskexecutor.c) aVar).a.execute(gVar);
    }

    public void t(j jVar, int i) {
        jVar.getClass();
        androidx.work.impl.utils.taskexecutor.a aVar = (androidx.work.impl.utils.taskexecutor.a) this.z;
        androidx.work.impl.utils.j jVar2 = new androidx.work.impl.utils.j((d) this.y, jVar, false, i);
        aVar.getClass();
        ((androidx.work.impl.utils.taskexecutor.c) aVar).a.execute(jVar2);
    }

    public String toString() {
        switch (this.e) {
            case 23:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.z.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        androidx.media3.extractor.h0 h0VarU = ((androidx.media3.extractor.p) this.y).u(i, i2);
        h0VarU.getClass();
        return h0VarU;
    }

    public j v(androidx.work.impl.model.j jVar) {
        j jVarE;
        synchronized (this.z) {
            jVarE = ((androidx.work.h) this.y).e(jVar);
        }
        return jVarE;
    }

    public coil3.request.n w(coil3.request.n nVar) {
        coil3.i iVar;
        boolean z;
        coil3.i iVar2 = nVar.j;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar = coil3.request.i.b;
        if (!com.google.android.gms.common.wrappers.a.d((Bitmap.Config) coil3.l.e(nVar, eVar)) || ((coil3.util.d) this.z).v()) {
            iVar = iVar2;
            z = false;
        } else {
            iVar2.getClass();
            LinkedHashMap linkedHashMapP = kotlin.collections.c0.p(iVar2.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapP.put(eVar, config);
            } else {
                linkedHashMapP.remove(eVar);
            }
            coil3.i iVar3 = new coil3.i(android.support.v4.media.session.b.J(linkedHashMapP));
            z = true;
            iVar = iVar3;
        }
        return z ? new coil3.request.n(nVar.a, nVar.b, nVar.c, nVar.d, nVar.e, nVar.f, nVar.g, nVar.h, nVar.i, iVar) : nVar;
    }

    public void x(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.y)) {
            map = new HashMap((Map) this.y);
        }
        synchronized (((Map) this.z)) {
            map2 = new HashMap((Map) this.z);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                androidx.transition.k.h();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.j) entry2.getKey()).c(new com.google.android.gms.common.api.d(status));
            }
        }
    }

    public /* synthetic */ k(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }

    public k(IBinder iBinder) throws RemoteException {
        this.e = 17;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.y = new Messenger(iBinder);
            this.z = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.z = new com.google.android.gms.cloudmessaging.g(iBinder);
            this.y = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public k(com.appsalt.internal.x xVar) {
        this.e = 11;
        p0 p0Var = new p0();
        this.y = xVar;
        this.z = p0Var;
    }

    public k(g4 g4Var) {
        this.e = 13;
        this.y = g4Var;
        Math.pow(16.0d, 4);
        this.z = new p0(g4Var, 1);
    }

    public k(u3 u3Var) {
        this.e = 28;
        this.z = u3Var;
    }

    public /* synthetic */ k(Object obj) {
        this.e = 23;
        this.z = obj;
        this.y = new ArrayList();
    }

    public k(String str, v vVar, com.google.firebase.heartbeatinfo.e eVar) {
        this.e = 19;
        this.z = str;
        this.y = vVar;
    }

    public k(int i) {
        this.e = i;
        switch (i) {
            case 15:
                this.y = null;
                this.z = null;
                break;
            case 21:
                this.y = Collections.synchronizedMap(new WeakHashMap());
                this.z = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 25:
                com.google.android.gms.common.e eVar = com.google.android.gms.common.e.d;
                this.y = new SparseIntArray();
                this.z = eVar;
                break;
        }
    }

    public k(c2 c2Var) {
        this.e = 6;
        this.y = c2Var;
    }

    public k(coil3.p pVar, k kVar, androidx.media3.exoplayer.hls.c cVar) {
        this.e = 3;
        this.y = pVar;
        this.z = cVar;
    }

    public k(coil3.p pVar, androidx.media3.exoplayer.hls.c cVar) {
        Object m0Var;
        this.e = 5;
        this.y = pVar;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = coil3.util.e.a;
        } else {
            if (!coil3.util.e.a) {
                if (i != 26 && i != 27) {
                    m0Var = new m0(true);
                } else {
                    m0Var = new androidx.media3.exoplayer.dash.manifest.t(cVar);
                }
            }
            this.z = m0Var;
        }
        m0Var = new m0(false);
        this.z = m0Var;
    }

    public k(d dVar, androidx.work.impl.utils.taskexecutor.a aVar) {
        this.e = 1;
        dVar.getClass();
        aVar.getClass();
        this.y = dVar;
        this.z = aVar;
    }

    public k(androidx.work.h hVar) {
        this.e = 0;
        this.y = hVar;
        this.z = new Object();
    }

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
