package coil3.network;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.a0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.foundation.lazy.layout.f0;
import androidx.compose.foundation.lazy.layout.g1;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.foundation.text.selection.y0;
import androidx.compose.foundation.text.x0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.y;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.n2;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.j0;
import androidx.lifecycle.u;
import androidx.media3.common.util.i0;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static String B(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Exception exc;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        i(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    i(cursorQuery);
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                exc = e2;
                Log.w("DocumentFile", "Failed query: " + exc);
                i(cursorQuery);
                return null;
            }
        } catch (Exception e3) {
            exc = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
        }
        th = th2;
        i(cursorQuery);
        throw th;
    }

    public static final void C(androidx.compose.ui.semantics.s sVar, androidx.core.view.accessibility.d dVar) {
        Object objG = sVar.k().e.g(w.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            androidx.transition.k.h();
            return;
        }
        androidx.compose.ui.semantics.s sVarL = sVar.l();
        if (sVarL == null) {
            return;
        }
        Object objG2 = sVarL.k().e.g(w.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = sVarL.k().e.g(w.f);
            androidx.compose.ui.semantics.d dVar2 = (androidx.compose.ui.semantics.d) (objG3 != null ? objG3 : null);
            if (dVar2 == null || (dVar2.a >= 0 && dVar2.b >= 0)) {
                if (sVar.k().e.c(w.I)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = androidx.compose.ui.semantics.s.j(4, sVarL);
                    int size = listJ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        androidx.compose.ui.semantics.s sVar2 = (androidx.compose.ui.semantics.s) listJ.get(i3);
                        if (sVar2.k().e.c(w.I)) {
                            arrayList.add(sVar2);
                            if (sVar2.c.w() < sVar.c.w()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zG = g(arrayList);
                    int i4 = zG ? 0 : i2;
                    int i5 = zG ? i2 : 0;
                    Object objG4 = sVar.k().e.g(w.I);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    dVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static void D(Status status, Object obj, com.google.android.gms.tasks.j jVar) {
        if (status.e <= 0) {
            jVar.b(obj);
        } else {
            jVar.a(status.z != null ? new com.google.android.gms.common.api.j(status) : new com.google.android.gms.common.api.d(status));
        }
    }

    public static String E(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(((double) Color.alpha(i2)) / 255.0d)};
        String str = i0.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final long F(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final boolean G(Throwable th, kotlin.jvm.functions.a aVar) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = kotlin.internal.jdk7.a.a;
        androidx.compose.runtime.tooling.f fVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = kotlin.internal.a.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = kotlin.collections.w.e;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof androidx.compose.runtime.tooling.f) {
                return false;
            }
        }
        try {
            androidx.compose.runtime.tooling.a aVar2 = (androidx.compose.runtime.tooling.a) aVar.invoke();
            if (aVar2 != null && !aVar2.a.isEmpty()) {
                z = true;
            }
            if (z) {
                aVar2.getClass();
                fVar = new androidx.compose.runtime.tooling.f(aVar2);
            }
        } catch (Throwable th2) {
            fVar = th2;
        }
        if (fVar != null) {
            kotlin.a.a(th, fVar);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x026d  */
    public static final void a(androidx.compose.ui.r rVar, x xVar, androidx.compose.foundation.lazy.grid.c cVar, z0 z0Var, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        int i5;
        x xVar2;
        boolean z2;
        Object mVar;
        x xVar3;
        boolean z3;
        boolean z4;
        kotlin.reflect.h hVar;
        androidx.compose.ui.r rVarM;
        sVar.c0(708740370);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? sVar.f(cVar) : sVar.h(cVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(z0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i4 |= sVar.g(false) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= sVar.g(true) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= sVar.f(lVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= sVar.g(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= sVar.f(nVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= sVar.f(gVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (sVar.f(eVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar.h(lVar2) ? 32 : 16;
        }
        if (sVar.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            sVar.Y();
            if ((i2 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            int i6 = i4 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i5 & Token.ASSIGN_MOD);
            a1 a1VarV = t.v(lVar2, sVar);
            int i9 = i4;
            boolean z5 = (((i8 & 14) ^ 6) > 4 && sVar.f(xVar)) || (i8 & 6) == 4;
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (z5 || objQ == obj) {
                androidx.compose.runtime.f fVar = androidx.compose.runtime.f.B;
                objQ = new androidx.compose.foundation.lazy.n(0, 1, w2.class, t.j(fVar, new androidx.activity.compose.f(5, t.j(fVar, new androidx.compose.foundation.lazy.m(a1VarV, 1)), xVar)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                sVar.l0(objQ);
            }
            kotlin.reflect.h hVar2 = (kotlin.reflect.h) objQ;
            int i10 = i7 | ((i9 >> 9) & Token.ASSIGN_MOD);
            boolean z6 = ((((i10 & 14) ^ 6) > 4 && sVar.f(xVar)) || (i10 & 6) == 4) | ((((i10 & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.g(false)) || (i10 & 48) == 32);
            Object objQ2 = sVar.Q();
            if (z6 || objQ2 == obj) {
                objQ2 = new a0(xVar);
                sVar.l0(objQ2);
            }
            a0 a0Var = (a0) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = l0.f(sVar);
                sVar.l0(objQ3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ3;
            y yVar = (y) sVar.j(l1.g);
            f0 f0Var = !((Boolean) sVar.j(l1.v)).booleanValue() ? g1.a : null;
            int i11 = (i9 & 524272) | ((i5 << 18) & 3670016) | ((i9 >> 6) & 29360128);
            boolean z7 = ((((i11 & 896) ^ 384) > 256 && sVar.f(cVar)) || (i11 & 384) == 256) | ((((i11 & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.f(xVar)) || (i11 & 48) == 32) | ((((i11 & 7168) ^ 3072) > 2048 && sVar.f(z0Var)) || (i11 & 3072) == 2048);
            if (((57344 & i11) ^ 24576) > 16384 && sVar.g(false)) {
                z2 = true;
            } else if ((i11 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zF = ((((i11 & 29360128) ^ 12582912) > 8388608 && sVar.f(gVar)) || (i11 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i11) ^ 196608) > 131072 && sVar.g(true)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && sVar.f(eVar)) || (i11 & 1572864) == 1048576) | sVar.f(yVar);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == obj) {
                xVar3 = xVar;
                z3 = false;
                z4 = true;
                mVar = new androidx.compose.foundation.lazy.grid.m(xVar3, z0Var, hVar2, cVar, gVar, eVar, coroutineScope, yVar, f0Var);
                hVar = hVar2;
                sVar.l0(mVar);
            } else {
                mVar = objQ4;
                hVar = hVar2;
                z3 = false;
                z4 = true;
                xVar3 = xVar;
            }
            c0 c0Var = (c0) mVar;
            o1 o1Var = o1.e;
            if (z) {
                sVar.b0(27281635);
                boolean z8 = (((i7 ^ 6) <= 4 || !sVar.f(xVar3)) && (i6 & 6) != 4) ? z3 : z4;
                Object objQ5 = sVar.Q();
                if (z8 || objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.lazy.grid.d(xVar3);
                    sVar.l0(objQ5);
                }
                rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.grid.d) objQ5, xVar3.n, o1Var);
                sVar.p(z3);
            } else {
                sVar.b0(27577840);
                sVar.p(z3);
                rVarM = androidx.compose.ui.o.b;
            }
            xVar2 = xVar3;
            androidx.compose.foundation.lazy.layout.m.a(hVar, androidx.compose.foundation.s.r(androidx.compose.foundation.lazy.layout.m.n(rVar.d(xVar3.k).d(xVar3.l), hVar, a0Var, o1Var, z).d(rVarM).d(xVar3.m.i), xVar3, o1Var, nVar, z, lVar, xVar3.f), xVar2.o, c0Var, sVar, 0);
        } else {
            xVar2 = xVar;
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.grid.e(rVar, xVar2, cVar, z0Var, lVar, z, nVar, gVar, eVar, lVar2, i2, i3);
        }
    }

    public static final void b(boolean z, androidx.compose.ui.text.style.j jVar, b1 b1Var, androidx.compose.runtime.s sVar, int i2) {
        int i3;
        k1 k1VarD;
        sVar.c0(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (sVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.h(b1Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            int i4 = i3 & 14;
            boolean zF = (i4 == 4) | sVar.f(b1Var);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (zF || objQ == fVar) {
                objQ = new y0(b1Var, z);
                sVar.l0(objQ);
            }
            x0 x0Var = (x0) objQ;
            boolean zH = (i4 == 4) | sVar.h(b1Var);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new c1(b1Var, z);
                sVar.l0(objQ2);
            }
            androidx.compose.foundation.text.selection.m mVar = (androidx.compose.foundation.text.selection.m) objQ2;
            boolean zG = androidx.compose.ui.text.l0.g(b1Var.n().b);
            int i5 = (int) (z ? b1Var.n().b >> 32 : b1Var.n().b & 4294967295L);
            r0 r0Var = b1Var.d;
            float fE = 0.0f;
            if (r0Var != null && (k1VarD = r0Var.d()) != null) {
                j0 j0Var = k1VarD.a;
                if (i5 >= 0) {
                    androidx.compose.ui.text.i0 i0Var = j0Var.a;
                    androidx.compose.ui.text.n nVar = j0Var.b;
                    if (i0Var.a.y.length() != 0) {
                        int iMin = Math.min(nVar.d(i5), Math.min(nVar.b - 1, nVar.f - 1));
                        if (i5 <= nVar.c(iMin, false)) {
                            nVar.l(iMin);
                            ArrayList arrayList = nVar.h;
                            androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) arrayList.get(d0.e(iMin, arrayList));
                            androidx.compose.ui.text.a aVar = pVar.a;
                            int i6 = iMin - pVar.d;
                            androidx.compose.ui.text.android.l lVar = aVar.d;
                            fE = lVar.e(i6) - lVar.g(i6);
                        }
                    }
                }
            }
            float f2 = fE;
            boolean zH2 = sVar.h(x0Var);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == fVar) {
                objQ3 = new androidx.compose.foundation.m(x0Var, 6);
                sVar.l0(objQ3);
            }
            kotlin.math.a.d(mVar, z, jVar, zG, 0L, f2, h0.a(androidx.compose.ui.o.b, x0Var, (PointerInputEventHandler) objQ3), sVar, (i3 << 3) & 1008);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.selection.g(z, jVar, b1Var, i2);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(androidx.lifecycle.p pVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        coil3.util.f fVar;
        androidx.lifecycle.p pVar2;
        z zVar;
        Throwable th;
        u uVar;
        u uVar2;
        if (cVar instanceof coil3.util.f) {
            fVar = (coil3.util.f) cVar;
            int i2 = fVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.A = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new coil3.util.f(cVar);
            }
        } else {
            fVar = new coil3.util.f(cVar);
        }
        Object obj = fVar.z;
        int i3 = fVar.A;
        kotlin.y yVar = kotlin.y.a;
        if (i3 != 0) {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = fVar.y;
            pVar2 = fVar.e;
            try {
                kotlin.a.e(obj);
                uVar2 = (u) zVar.e;
                if (uVar2 != null) {
                    pVar2.b(uVar2);
                }
                return yVar;
            } catch (Throwable th2) {
                th = th2;
                uVar = (u) zVar.e;
                if (uVar != null) {
                    pVar2.b(uVar);
                }
                throw th;
            }
        }
        kotlin.a.e(obj);
        if (((androidx.lifecycle.x) pVar).d.compareTo(androidx.lifecycle.o.A) >= 0) {
            return yVar;
        }
        z zVar2 = new z();
        try {
            fVar.e = pVar;
            fVar.y = zVar2;
            fVar.A = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(fVar), 1);
            cancellableContinuationImpl.initCancellability();
            coil3.util.g gVar = new coil3.util.g(cancellableContinuationImpl);
            zVar2.e = gVar;
            pVar.a(gVar);
            Object result = cancellableContinuationImpl.getResult();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (result == aVar) {
                return aVar;
            }
            pVar2 = pVar;
            zVar = zVar2;
            uVar2 = (u) zVar.e;
            if (uVar2 != null) {
                pVar2.b(uVar2);
            }
            return yVar;
        } catch (Throwable th3) {
            pVar2 = pVar;
            zVar = zVar2;
            th = th3;
            uVar = (u) zVar.e;
            if (uVar != null) {
                pVar2.b(uVar);
            }
            throw th;
        }
    }

    public static final Bundle f(kotlin.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (kotlin.k kVar : kVarArr) {
            String str = (String) kVar.e;
            Object obj = kVar.y;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        androidx.core.graphics.b.b("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    androidx.core.graphics.b.b("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final boolean g(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = kotlin.collections.w.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    androidx.compose.ui.semantics.s sVar = (androidx.compose.ui.semantics.s) obj2;
                    androidx.compose.ui.semantics.s sVar2 = (androidx.compose.ui.semantics.s) obj;
                    arrayList2.add(new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (sVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (sVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((androidx.compose.ui.geometry.b) kotlin.collections.p.B(list)).a;
            } else {
                if (list.isEmpty()) {
                    androidx.compose.ui.util.a.c("Empty collection can't be reduced.");
                }
                Object objB = kotlin.collections.p.B(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objB = new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(((androidx.compose.ui.geometry.b) objB).a, ((androidx.compose.ui.geometry.b) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j = ((androidx.compose.ui.geometry.b) objB).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void h(View view) {
        view.getClass();
        kotlin.sequences.i iVarI = kotlin.collections.builders.c.I(new androidx.compose.foundation.l(view, null, 2));
        while (iVarI.hasNext()) {
            ArrayList arrayList = s((View) iVarI.next()).a;
            for (int iH = kotlin.collections.q.h(arrayList); -1 < iH; iH--) {
                ((n2) arrayList.get(iH)).a.d();
            }
        }
    }

    public static void i(Cursor cursor) {
        if (cursor != null) {
            try {
                androidx.compose.runtime.j.v(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static com.google.firebase.components.b j(String str, String str2) {
        com.google.firebase.platforminfo.a aVar = new com.google.firebase.platforminfo.a(str, str2);
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.a.class);
        aVarB.e = 1;
        aVarB.f = new androidx.media3.exoplayer.analytics.e(aVar);
        return aVarB.b();
    }

    public static final androidx.compose.ui.text.font.e k(Context context) {
        com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e(2);
        context.getApplicationContext();
        return new androidx.compose.ui.text.font.e(eVar, new androidx.compose.ui.text.font.a(Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.text.font.l.a.a(context) : 0));
    }

    public static void l(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        kotlinx.coroutines.future.a.x(file, "Unable to create parent directories of ");
    }

    public static boolean n(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e2) {
            Log.w("DocumentFile", "Failed query: " + e2);
            return false;
        } finally {
            i(cursorQuery);
        }
    }

    public static final ArrayList o(androidx.compose.runtime.tooling.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, Token.IF, -127, 126665345, org.mozilla.javascript.Context.VERSION_ES6};
        List list = aVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            androidx.compose.runtime.tooling.b bVar = (androidx.compose.runtime.tooling.b) list.get(i2);
            if (!kotlin.collections.o.b(bVar.a, iArr)) {
                if (bVar.a == 100) {
                    int i4 = i2 + 2;
                    if (i4 < size && ((androidx.compose.runtime.tooling.b) list.get(i4)).a == 1000) {
                        break;
                    }
                    kotlin.collections.p.T(arrayList);
                } else {
                    arrayList.add(bVar);
                }
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static com.google.firebase.components.b p(String str, com.google.firebase.i iVar) {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.a.class);
        aVarB.e = 1;
        aVarB.a(com.google.firebase.components.j.b(Context.class));
        aVarB.f = new androidx.media3.exoplayer.analytics.c(12, str, iVar);
        return aVarB.b();
    }

    public static final androidx.compose.ui.graphics.vector.f q() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 2.0f);
        gVarJ.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        gVarJ.x(4.48f, 10.0f, 10.0f, 10.0f);
        gVarJ.x(10.0f, -4.48f, 10.0f, -10.0f);
        gVarJ.w(17.52f, 2.0f, 12.0f, 2.0f);
        gVarJ.l();
        gVarJ.v(10.0f, 17.0f);
        gVarJ.u(-5.0f, -5.0f);
        gVarJ.u(1.41f, -1.41f);
        gVarJ.t(10.0f, 14.17f);
        gVarJ.u(7.59f, -7.59f);
        gVarJ.t(19.0f, 8.0f);
        gVarJ.u(-9.0f, 9.0f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final int r(String str, Bundle bundle) {
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        coil3.svg.internal.a.D(str);
        throw null;
    }

    public static final androidx.customview.poolingcontainer.a s(View view) {
        androidx.customview.poolingcontainer.a aVar = (androidx.customview.poolingcontainer.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        androidx.customview.poolingcontainer.a aVar2 = new androidx.customview.poolingcontainer.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final ArrayList t(String str, Bundle bundle) {
        Class clsA = kotlin.jvm.internal.a0.a(Bundle.class).a();
        clsA.getClass();
        ArrayList arrayListE = Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.text.android.d.e(bundle, str, clsA) : bundle.getParcelableArrayList(str);
        if (arrayListE != null) {
            return arrayListE;
        }
        coil3.svg.internal.a.D(str);
        throw null;
    }

    public static final boolean w(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final void x(Context context) {
        Map mapSingletonMap;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            androidx.work.y.e().a(androidx.work.impl.p.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = androidx.work.impl.p.b;
            int iJ = kotlin.collections.c0.j(strArr.length);
            if (iJ < 16) {
                iJ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath2, noBackupFilesDir);
                mapSingletonMap.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        androidx.work.y.e().h(androidx.work.impl.p.a, "Over-writing contents of " + file2);
                    }
                    androidx.work.y.e().a(androidx.work.impl.p.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static void y(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract void A(Typeface typeface, boolean z);

    public abstract void e(androidx.sqlite.c cVar, Object obj);

    public abstract String m();

    public void u(androidx.sqlite.a aVar, Iterable iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        androidx.sqlite.c cVarU = aVar.U(m());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    e(cVarU, obj);
                    cVarU.Q();
                    cVarU.reset();
                }
            }
            kotlin.collections.q.e(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public void v(androidx.sqlite.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return;
        }
        androidx.sqlite.c cVarU = aVar.U(m());
        try {
            e(cVarU, obj);
            cVarU.Q();
            kotlin.collections.q.e(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public abstract void z(int i2);
}
