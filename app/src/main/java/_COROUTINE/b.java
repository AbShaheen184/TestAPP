package _COROUTINE;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.compose.r;
import androidx.activity.compose.t;
import androidx.activity.result.i;
import androidx.compose.runtime.h0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.a0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.g;
import androidx.compose.ui.graphics.vector.m;
import androidx.compose.ui.graphics.vector.o;
import androidx.compose.ui.graphics.vector.u;
import androidx.compose.ui.input.pointer.v;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.android.selection.d;
import androidx.lifecycle.j;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.media3.common.util.h;
import androidx.media3.extractor.text.k;
import com.caverock.androidsvg.j1;
import com.google.common.util.concurrent.d0;
import com.google.common.util.concurrent.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.p;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.e;
import kotlinx.coroutines.Deferred;
import org.mozilla.javascript.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {
    public static f A;
    public static f B;
    public static f C;
    public static f D;
    public static final /* synthetic */ int E = 0;
    public static final /* synthetic */ int F = 0;
    public static f e;
    public static f y;
    public static f z;

    public b() {
        new ConcurrentHashMap();
    }

    public static int A(float f, int i, int i2) {
        return androidx.core.graphics.a.b(androidx.core.graphics.a.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static String B(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("<", str2, " threw ");
                    sbX.append(e2.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void D(androidx.media3.extractor.text.d dVar, int i, h hVar) {
        long jG = dVar.g(i);
        List listK = dVar.k(jG);
        if (listK.isEmpty()) {
            return;
        }
        if (i == dVar.l() - 1) {
            c.a();
            return;
        }
        long jG2 = dVar.g(i + 1) - dVar.g(i);
        if (jG2 > 0) {
            hVar.accept(new androidx.media3.extractor.text.a(jG, jG2, listK));
        }
    }

    public static Executor G(Executor executor, g0 g0Var) {
        executor.getClass();
        return executor == d0.e ? executor : new androidx.media3.exoplayer.util.a(executor, g0Var, 1);
    }

    public static final t H(androidx.activity.result.contract.a aVar, l lVar, s sVar, int i) {
        Object obj;
        androidx.compose.runtime.t.v(aVar, sVar);
        Object objV = androidx.compose.runtime.t.v(lVar, sVar);
        Object[] objArr = new Object[0];
        Object objQ = sVar.Q();
        Object obj2 = n.a;
        if (objQ == obj2) {
            objQ = new androidx.activity.compose.b(0);
            sVar.l0(objQ);
        }
        Object obj3 = (String) androidx.compose.runtime.saveable.l.e(objArr, (kotlin.jvm.functions.a) objQ, sVar);
        i iVar = (i) sVar.j(r.a);
        if (iVar == null) {
            sVar.b0(1213380307);
            Object baseContext = (Context) sVar.j(m0.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof i) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            iVar = (i) baseContext;
        } else {
            sVar.b0(1213379439);
        }
        sVar.p(false);
        if (iVar == null) {
            kotlinx.coroutines.future.a.u("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = iVar.getActivityResultRegistry();
        Object objQ2 = sVar.Q();
        if (objQ2 == obj2) {
            objQ2 = new androidx.activity.compose.a();
            sVar.l0(objQ2);
        }
        androidx.activity.compose.a aVar2 = (androidx.activity.compose.a) objQ2;
        Object objQ3 = sVar.Q();
        if (objQ3 == obj2) {
            objQ3 = new t(aVar2);
            sVar.l0(objQ3);
        }
        t tVar = (t) objQ3;
        boolean zH = sVar.h(aVar2) | sVar.h(activityResultRegistry) | sVar.f(obj3) | sVar.h(aVar) | sVar.f(objV);
        Object objQ4 = sVar.Q();
        if (zH || objQ4 == obj2) {
            obj = aVar;
            objQ4 = new androidx.activity.compose.c(aVar2, activityResultRegistry, obj3, obj, objV, 0);
            sVar.l0(objQ4);
        } else {
            obj = aVar;
        }
        l lVar2 = (l) objQ4;
        boolean zF = sVar.f(activityResultRegistry) | sVar.f(obj3) | sVar.f(obj);
        Object objQ5 = sVar.Q();
        if (zF || objQ5 == obj2) {
            objQ5 = new h0(lVar2);
            sVar.l0(objQ5);
        }
        return tVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void I(androidx.media3.extractor.text.d dVar, k kVar, h hVar) {
        int iF;
        boolean z2;
        long j = kVar.a;
        if (j == -9223372036854775807L) {
            iF = 0;
        } else {
            iF = dVar.f(j);
            if (iF == -1) {
                iF = dVar.l();
            }
            if (iF > 0 && dVar.g(iF - 1) == j) {
                iF--;
            }
        }
        if (j == -9223372036854775807L || iF >= dVar.l()) {
            z2 = false;
        } else {
            List listK = dVar.k(j);
            long jG = dVar.g(iF);
            if (listK.isEmpty()) {
                z2 = false;
            } else {
                long j2 = kVar.a;
                if (j2 < jG) {
                    hVar.accept(new androidx.media3.extractor.text.a(j2, jG - j2, listK));
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        for (int i = iF; i < dVar.l(); i++) {
            D(dVar, i, hVar);
        }
        if (kVar.b) {
            if (z2) {
                iF--;
            }
            for (int i2 = 0; i2 < iF; i2++) {
                D(dVar, i2, hVar);
            }
            if (z2) {
                hVar.accept(new androidx.media3.extractor.text.a(dVar.g(iF), j - dVar.g(iF), dVar.k(j)));
            }
        }
    }

    public static final s0 J(e eVar, y0 y0Var, u0 u0Var, androidx.lifecycle.viewmodel.c cVar, s sVar) {
        w0 w0VarB;
        if (u0Var != null) {
            x0 viewModelStore = y0Var.getViewModelStore();
            viewModelStore.getClass();
            cVar.getClass();
            w0VarB = new w0(viewModelStore, u0Var, cVar);
        } else if (y0Var instanceof j) {
            x0 viewModelStore2 = y0Var.getViewModelStore();
            u0 defaultViewModelProviderFactory = ((j) y0Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            cVar.getClass();
            w0VarB = new w0(viewModelStore2, defaultViewModelProviderFactory, cVar);
        } else {
            w0VarB = com.google.firebase.heartbeatinfo.e.b(y0Var, null, 6);
        }
        return w0VarB.a(eVar);
    }

    public static androidx.compose.ui.unit.d a() {
        return new androidx.compose.ui.unit.d(1.0f, 1.0f);
    }

    public static final void b(int i) {
        if (i > 0) {
            return;
        }
        kotlinx.coroutines.future.a.q("px must be > 0.");
    }

    public static final ExecutorService e(boolean z2) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.c(z2));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static androidx.concurrent.futures.l f(Deferred deferred) {
        deferred.getClass();
        androidx.concurrent.futures.i iVar = new androidx.concurrent.futures.i();
        iVar.c = new androidx.concurrent.futures.n();
        androidx.concurrent.futures.l lVar = new androidx.concurrent.futures.l(iVar);
        iVar.b = lVar;
        iVar.a = androidx.privacysandbox.ads.adservices.java.internal.a.class;
        try {
            deferred.invokeOnCompletion(new androidx.compose.animation.c(13, iVar, deferred));
            iVar.a = "Deferred.asListenableFuture";
            return lVar;
        } catch (Exception e2) {
            lVar.y.m(e2);
            return lVar;
        }
    }

    public static final int h(androidx.sqlite.c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(cVar.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strM = androidx.privacysandbox.ads.adservices.java.internal.a.m('`', "`", str);
        int columnCount2 = cVar.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strM.equals(cVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cVar.getColumnCount();
            String strConcat = ".".concat(str);
            String strM2 = androidx.privacysandbox.ads.adservices.java.internal.a.m('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = cVar.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (kotlin.text.r.n(columnName, strConcat, false) || (columnName.charAt(0) == '`' && kotlin.text.r.n(columnName, strM2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static String o(androidx.datastore.preferences.protobuf.f fVar) {
        StringBuilder sb = new StringBuilder(fVar.size());
        for (int i = 0; i < fVar.size(); i++) {
            byte b = fVar.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static androidx.core.provider.i p(androidx.core.provider.i[] iVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        androidx.core.provider.i iVar = null;
        int i3 = Integer.MAX_VALUE;
        for (androidx.core.provider.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.c - i2) * 2) + (iVar2.d == z2 ? 0 : 1);
            if (iVar == null || i3 > iAbs) {
                iVar = iVar2;
                i3 = iAbs;
            }
        }
        return iVar;
    }

    public static final f q() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Audiotrack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(12.0f, 3.0f);
        gVar.A(9.28f);
        gVar.n(-0.47f, -0.17f, -0.97f, -0.28f, -1.5f, -0.28f);
        gVar.m(8.01f, 12.0f, 6.0f, 14.01f, 6.0f, 16.5f);
        gVar.w(8.01f, 21.0f, 10.5f, 21.0f);
        gVar.n(2.31f, 0.0f, 4.2f, -1.75f, 4.45f, -4.0f);
        gVar.r(15.0f);
        gVar.z(6.0f);
        gVar.s(4.0f);
        gVar.z(3.0f);
        gVar.s(-7.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final long r(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static int s(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueD = androidx.room.t.D(context, i);
        if (typedValueD != null) {
            int i3 = typedValueD.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueD.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int t(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueE = androidx.room.t.E(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueE.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueE.data;
    }

    public static final int u(androidx.sqlite.c cVar, String str) {
        cVar.getClass();
        int iH = h(cVar, str);
        if (iH >= 0) {
            return iH;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(cVar.getColumnName(i));
        }
        androidx.core.graphics.b.b("Column '", str, "' does not exist. Available columns: [", p.I(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final f v() {
        f fVar = A;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(18.0f, 8.0f);
        gVar.s(-1.0f);
        gVar.t(17.0f, 6.0f);
        gVar.n(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        gVar.w(7.0f, 3.24f, 7.0f, 6.0f);
        gVar.A(2.0f);
        gVar.t(6.0f, 8.0f);
        gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.A(10.0f);
        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.s(12.0f);
        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.t(20.0f, 10.0f);
        gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.l();
        gVar.v(12.0f, 17.0f);
        gVar.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        gVar.x(0.9f, -2.0f, 2.0f, -2.0f);
        gVar.x(2.0f, 0.9f, 2.0f, 2.0f);
        gVar.x(-0.9f, 2.0f, -2.0f, 2.0f);
        gVar.l();
        gVar.v(15.1f, 8.0f);
        gVar.t(8.9f, 8.0f);
        gVar.t(8.9f, 6.0f);
        gVar.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        gVar.n(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        gVar.A(2.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        A = fVarB;
        return fVarB;
    }

    public static final f w() {
        f fVar = B;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Remove", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new o(19.0f, 13.0f));
        arrayList.add(new m(5.0f));
        arrayList.add(new a0(-2.0f));
        arrayList.add(new u(14.0f));
        arrayList.add(new a0(2.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        B = fVarB;
        return fVarB;
    }

    public static final f x() {
        f fVar = C;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SubtitlesOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        long j = androidx.compose.ui.graphics.t.b;
        p0 p0Var = new p0(j);
        g gVar = new g(0);
        gVar.v(20.0f, 4.0f);
        gVar.r(6.83f);
        gVar.u(8.0f, 8.0f);
        gVar.r(20.0f);
        gVar.A(2.0f);
        gVar.s(-3.17f);
        gVar.u(4.93f, 4.93f);
        gVar.m(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
        gVar.z(6.0f);
        gVar.m(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        p0 p0Var2 = new p0(j);
        g gVar2 = new g(0);
        gVar2.v(1.04f, 3.87f);
        gVar2.u(1.2f, 1.2f);
        gVar2.m(2.09f, 5.35f, 2.0f, 5.66f, 2.0f, 6.0f);
        gVar2.A(12.0f);
        gVar2.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar2.s(13.17f);
        gVar2.u(2.96f, 2.96f);
        gVar2.u(1.41f, -1.41f);
        gVar2.t(2.45f, 2.45f);
        gVar2.t(1.04f, 3.87f);
        gVar2.l();
        gVar2.v(8.0f, 12.0f);
        gVar2.A(2.0f);
        gVar2.r(4.0f);
        gVar2.A(-2.0f);
        gVar2.r(8.0f);
        gVar2.l();
        gVar2.v(14.0f, 16.83f);
        gVar2.z(18.0f);
        gVar2.r(4.0f);
        gVar2.A(-2.0f);
        gVar2.s(9.17f);
        gVar2.t(14.0f, 16.83f);
        gVar2.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar2.b, 0, p0Var2);
        f fVarB = eVar.b();
        C = fVarB;
        return fVarB;
    }

    public static final int y(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean z(androidx.compose.ui.input.pointer.m mVar) {
        MotionEvent motionEventA;
        ?? r0 = mVar.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            if (((v) r0.get(i)).i != 2) {
                MotionEvent motionEventA2 = mVar.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = mVar.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public abstract int C(int i);

    public abstract int E(int i);

    public abstract void F(String str);

    @Override // androidx.compose.ui.text.android.selection.d
    public int c(int i) {
        int iC = C(i);
        if (iC == -1 || C(iC) == -1) {
            return -1;
        }
        return iC;
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int d(int i) {
        int iE = E(i);
        if (iE == -1 || E(iE) == -1) {
            return -1;
        }
        return iE;
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int g(int i) {
        return E(i);
    }

    @Override // androidx.compose.ui.text.android.selection.d
    public int i(int i) {
        return C(i);
    }

    public abstract Typeface j(Context context, androidx.core.content.res.e eVar, Resources resources, int i);

    public abstract Typeface k(Context context, androidx.core.provider.i[] iVarArr, int i);

    public Typeface l(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface m(Context context, Resources resources, int i, String str, int i2) {
        File fileQ = android.support.v4.media.session.b.q(context);
        if (fileQ == null) {
            return null;
        }
        try {
            if (android.support.v4.media.session.b.h(fileQ, resources, i)) {
                return Typeface.createFromFile(fileQ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileQ.delete();
        }
    }

    public boolean n(j1 j1Var) {
        return true;
    }
}
