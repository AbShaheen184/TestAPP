package com.google.android.material.behavior;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.x;
import androidx.compose.ui.platform.u1;
import androidx.core.view.accessibility.n;
import androidx.core.view.r;
import androidx.core.view.s0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.s;
import com.google.common.base.p;
import com.google.firebase.encoders.json.e;
import com.grack.nanojson.f;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.l;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.j0;
import org.json.JSONArray;
import org.json.JSONException;
import org.jsoup.internal.k;
import org.jsoup.nodes.j;
import org.jsoup.nodes.o;
import org.jsoup.nodes.v;
import org.jsoup.parser.f0;
import org.jsoup.select.u;
import retrofit2.g;
import retrofit2.m;
import retrofit2.q;
import retrofit2.r0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n, p, com.google.firebase.crashlytics.internal.analytics.a, h, u, g, m {
    public final Object e;

    public d(int i, boolean z) {
        switch (i) {
            case 14:
                this.e = new LinkedHashSet();
                break;
            case 15:
            default:
                this.e = new ConcurrentHashMap(16);
                break;
            case 16:
                this.e = new r[3];
                break;
        }
    }

    public static String B(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean x(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void A(r rVar) {
        int i = 0;
        while (i < 3) {
            r[] rVarArr = (r[]) this.e;
            r rVar2 = rVarArr[i];
            rVarArr[i] = rVar;
            i++;
            rVar = rVar2;
        }
    }

    @Override // androidx.core.view.accessibility.n
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.e;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        Field field = s0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.google.common.base.p
    public Iterator b(u1 u1Var, CharSequence charSequence) {
        return new com.google.common.base.n(this, u1Var, charSequence, 0);
    }

    @Override // retrofit2.m
    public Object c(Object obj) {
        return Optional.ofNullable(((m) this.e).c((j0) obj));
    }

    public String d(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            com.google.firebase.encoders.json.d dVar = (com.google.firebase.encoders.json.d) this.e;
            e eVar = new e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // retrofit2.g
    public void e(retrofit2.d dVar, Throwable th) {
        ((CancellableContinuationImpl) this.e).resumeWith(new l(th));
    }

    @Override // org.jsoup.select.u
    public void f(o oVar, int i) {
        char c;
        StringBuilder sb = (StringBuilder) this.e;
        if (oVar instanceof v) {
            j.M(sb, (v) oVar);
            return;
        }
        if (oVar instanceof j) {
            j jVar = (j) oVar;
            if (sb.length() > 0) {
                if (!jVar.Y() && !jVar.s("br")) {
                    if (!jVar.A.b(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) || jVar.B.size() <= 0) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    o oVarI = jVar;
                    int i2 = 0;
                    while (oVarI != null) {
                        char c2 = 1;
                        if (!(oVarI instanceof v) || k.f(((v) oVarI).J())) {
                            c = 1;
                        } else {
                            atomicBoolean.set(true);
                            c = 5;
                        }
                        if (c == 5) {
                            break;
                        }
                        if (c != 1 || oVarI.j() <= 0) {
                            while (oVarI.u() == null && i2 > 0) {
                                if (c == 1 || c == 2) {
                                    c = 1;
                                }
                                j jVar2 = oVarI.e;
                                i2--;
                                if (c == 4) {
                                    oVarI.F();
                                }
                                c = 1;
                                oVarI = jVar2;
                            }
                            if (c != 1 && c != 2) {
                                c2 = c;
                            }
                            if (oVarI == jVar) {
                                break;
                            }
                            o oVarU = oVarI.u();
                            if (c2 == 4) {
                                oVarI.F();
                            }
                            oVarI = oVarU;
                        } else {
                            oVarI = oVarI.i(0);
                            i2++;
                        }
                    }
                    if (!atomicBoolean.get()) {
                        return;
                    }
                }
                if (v.O(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    @Override // com.google.android.gms.tasks.h
    public s g(Object obj) {
        com.google.firebase.crashlytics.internal.settings.a aVar = (com.google.firebase.crashlytics.internal.settings.a) obj;
        com.google.firebase.crashlytics.internal.common.m mVar = ((com.google.firebase.crashlytics.internal.common.k) this.e).e;
        if (aVar != null) {
            return org.jsoup.helper.n.Q(Arrays.asList(com.google.firebase.crashlytics.internal.common.m.a(mVar), mVar.m.l(null, mVar.e.a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return org.jsoup.helper.n.o(null);
    }

    @Override // org.jsoup.select.u
    public void h(o oVar, int i) {
        StringBuilder sb = (StringBuilder) this.e;
        if (oVar instanceof j) {
            j jVar = (j) oVar;
            f0 f0Var = jVar.A;
            o oVarU = oVar.u();
            if (!f0Var.b(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) && (f0Var.A & 4) == 0) {
                for (int i2 = 0; i2 < jVar.B.size(); i2++) {
                    o oVarI = jVar.i(i2);
                    if (!(oVarI instanceof j) || !((j) oVarI).Y()) {
                    }
                }
                return;
            }
            if (((oVarU instanceof v) || ((oVarU instanceof j) && (((j) oVarU).A.A & 4) == 0)) && !v.O(sb)) {
                sb.append(' ');
            }
        }
    }

    @Override // retrofit2.g
    public void i(retrofit2.d dVar, r0 r0Var) {
        boolean z = r0Var.a.N;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.e;
        if (z) {
            cancellableContinuationImpl.resumeWith(r0Var.b);
        } else {
            cancellableContinuationImpl.resumeWith(new l(new q(r0Var)));
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void k(Bundle bundle) {
        ((com.google.firebase.analytics.connector.b) ((com.google.firebase.analytics.connector.a) this.e)).a("clx", "_ae", bundle);
    }

    public void l() {
        Socket socket;
        androidx.compose.ui.graphics.vector.a aVar = (androidx.compose.ui.graphics.vector.a) this.e;
        Iterator it = ((ConcurrentLinkedQueue) aVar.e).iterator();
        it.getClass();
        while (it.hasNext()) {
            okhttp3.internal.connection.n nVar = (okhttp3.internal.connection.n) it.next();
            nVar.getClass();
            synchronized (nVar) {
                if (nVar.q.isEmpty()) {
                    it.remove();
                    nVar.k = true;
                    socket = nVar.e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                okhttp3.internal.g.c(socket);
            }
        }
        if (((ConcurrentLinkedQueue) aVar.e).isEmpty()) {
            ((okhttp3.internal.concurrent.c) aVar.c).a();
        }
    }

    public Object m(String str) throws com.grack.nanojson.d {
        f fVar = new f(new StringReader(str));
        x xVar = new x(13, (byte) 0);
        xVar.A = fVar;
        Class cls = (Class) this.e;
        xVar.c(false, false);
        Object objH = xVar.h();
        if (xVar.c(false, false) != 0) {
            throw fVar.e(null, "Expected end of input, got " + xVar.y, true);
        }
        if (cls == Object.class || (objH != null && cls.isAssignableFrom(objH.getClass()))) {
            return cls.cast(objH);
        }
        throw fVar.e(null, "JSON did not contain the correct type, expected " + cls.getSimpleName() + ".", true);
    }

    public boolean n(String str) {
        String strV = v(str);
        return "1".equals(strV) || Boolean.parseBoolean(strV);
    }

    public Integer o(String str) {
        String strV = v(str);
        if (TextUtils.isEmpty(strV)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strV));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + B(str) + "(" + strV + ") into an int");
            return null;
        }
    }

    public JSONArray p(String str) {
        String strV = v(str);
        if (TextUtils.isEmpty(strV)) {
            return null;
        }
        try {
            return new JSONArray(strV);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + B(str) + ": " + strV + ", falling back to default");
            return null;
        }
    }

    public int[] q() {
        JSONArray jSONArrayP = p("gcm.n.light_settings");
        if (jSONArrayP == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayP.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayP.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayP.optInt(1);
            iArr[2] = jSONArrayP.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayP + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayP + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] r(String str) {
        JSONArray jSONArrayP = p(str.concat("_loc_args"));
        if (jSONArrayP == null) {
            return null;
        }
        int length = jSONArrayP.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayP.optString(i);
        }
        return strArr;
    }

    public String s(String str) {
        return v(str.concat("_loc_key"));
    }

    public Long t() {
        String strV = v("gcm.n.event_time");
        if (TextUtils.isEmpty(strV)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strV));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + B("gcm.n.event_time") + "(" + strV + ") into a long");
            return null;
        }
    }

    public String u(Resources resources, String str, String str2) {
        String strV = v(str2);
        if (!TextUtils.isEmpty(strV)) {
            return strV;
        }
        String strS = s(str2);
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        int identifier = resources.getIdentifier(strS, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", B(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrR = r(str2);
        if (objArrR == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrR);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + B(str2) + ": " + Arrays.toString(objArrR) + " Default value will be used.", e);
            return null;
        }
    }

    public String v(String str) {
        Bundle bundle = (Bundle) this.e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] w() {
        JSONArray jSONArrayP = p("gcm.n.vibrate_timings");
        if (jSONArrayP == null) {
            return null;
        }
        try {
            if (jSONArrayP.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayP.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayP.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayP + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle y() {
        Bundle bundle = (Bundle) this.e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005f, please report this as an issue */
    public void z(ByteBuffer byteBuffer, net.luminis.quic.packet.f fVar) {
        int iPosition;
        net.luminis.quic.packet.a aVar = (net.luminis.quic.packet.a) this.e;
        net.luminis.quic.log.a aVar2 = aVar.e;
        while (byteBuffer.remaining() > 0) {
            try {
                net.luminis.quic.packet.g gVarA = aVar.a(byteBuffer);
                aVar2.getClass();
                byteBuffer.position();
                byteBuffer.remaining();
                aVar.d.g(gVarA, new net.luminis.quic.packet.f(fVar, byteBuffer.hasRemaining()));
            } catch (net.luminis.quic.crypto.g e) {
                e = e;
                iPosition = byteBuffer.position();
                if (iPosition == 0) {
                    iPosition = byteBuffer.remaining();
                }
                if (!((Boolean) aVar.g.apply(byteBuffer, e)).booleanValue()) {
                    if ((e instanceof net.luminis.quic.crypto.g) || !androidx.constraintlayout.core.g.b(((net.luminis.quic.crypto.g) e).e, 2)) {
                        aVar2.b("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    } else {
                        e.getMessage();
                        aVar2.getClass();
                    }
                }
            } catch (net.luminis.quic.impl.b e2) {
                e = e2;
                iPosition = byteBuffer.position();
                if (iPosition == 0) {
                    iPosition = byteBuffer.remaining();
                }
                if (!((Boolean) aVar.g.apply(byteBuffer, e)).booleanValue()) {
                    if (e instanceof net.luminis.quic.crypto.g) {
                        aVar2.b("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    } else {
                        aVar2.b("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    }
                }
            } catch (net.luminis.quic.impl.e unused) {
                aVar2.getClass();
                return;
            }
            if (byteBuffer.position() == 0) {
                return;
            } else {
                byteBuffer = byteBuffer.slice();
            }
        }
    }

    public d(AppMeasurementSdk appMeasurementSdk, com.google.android.material.internal.k kVar) {
        this.e = kVar;
        appMeasurementSdk.a(new com.google.firebase.analytics.connector.internal.b(this, 1));
    }

    public /* synthetic */ d(Object obj) {
        this.e = obj;
    }

    public d(Bundle bundle) {
        if (bundle != null) {
            this.e = new Bundle(bundle);
        } else {
            com.google.firebase.platforminfo.b.h("data");
            throw null;
        }
    }

    public d(int i) {
        TimeUnit.MINUTES.getClass();
        okhttp3.internal.concurrent.d dVar = okhttp3.internal.concurrent.d.l;
        dVar.getClass();
        this.e = new androidx.compose.ui.graphics.vector.a(dVar, i);
    }

    public d(com.google.firebase.crashlytics.internal.common.k kVar, String str) {
        this.e = kVar;
    }
}
