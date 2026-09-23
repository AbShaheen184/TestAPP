package androidx.work;

import androidx.core.view.w0;
import androidx.media3.exoplayer.source.t0;
import j$.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public Object c;
    public Object d;
    public final Object e;

    public j0(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.c = uuidRandomUUID;
        String string = ((UUID) this.c).toString();
        string.getClass();
        this.d = new androidx.work.impl.model.p(string, (i0) null, cls.getName(), (String) null, (i) null, (i) null, 0L, 0L, 0L, (e) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (f0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.c0.j(1));
        linkedHashSet.add(strArr[0]);
        this.e = linkedHashSet;
    }

    public void a() {
        if (this.b) {
            return;
        }
        kotlinx.coroutines.future.a.u("Page is not fetched. Make sure you call fetchPage()");
    }

    public k0 b() {
        k0 k0VarC = c();
        e eVar = ((androidx.work.impl.model.p) this.d).j;
        boolean z = !eVar.i.isEmpty() || eVar.e || eVar.c || eVar.d;
        androidx.work.impl.model.p pVar = (androidx.work.impl.model.p) this.d;
        if (pVar.q) {
            if (z) {
                kotlinx.coroutines.future.a.q("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (pVar.g > 0) {
                kotlinx.coroutines.future.a.q("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = pVar.x;
        if (str == null) {
            List listU = kotlin.text.k.U(pVar.c, new String[]{"."}, 6);
            String strE0 = listU.size() == 1 ? (String) listU.get(0) : (String) kotlin.collections.p.J(listU);
            if (strE0.length() > 127) {
                strE0 = kotlin.text.k.e0(127, strE0);
            }
            pVar.x = strE0;
        } else if (str.length() > 127) {
            ((androidx.work.impl.model.p) this.d).x = kotlin.text.k.e0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.c = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        androidx.work.impl.model.p pVar2 = (androidx.work.impl.model.p) this.d;
        pVar2.getClass();
        this.d = new androidx.work.impl.model.p(string, pVar2.b, pVar2.c, pVar2.d, new i(pVar2.e), new i(pVar2.f), pVar2.g, pVar2.h, pVar2.i, new e(pVar2.j), pVar2.k, pVar2.l, pVar2.m, pVar2.n, pVar2.o, pVar2.p, pVar2.q, pVar2.r, pVar2.s, pVar2.u, pVar2.v, pVar2.w, pVar2.x, pVar2.y, 524288);
        return k0VarC;
    }

    public abstract k0 c();

    public void d() {
        org.schabi.newpipe.extractor.utils.a aVar = org.schabi.newpipe.extractor.utils.b.b;
        org.schabi.newpipe.extractor.utils.a aVar2 = org.schabi.newpipe.extractor.utils.b.a;
        if (aVar != aVar2) {
            androidx.constraintlayout.core.g.e(1);
        }
        if (!this.b) {
            m((com.app.mlounge.data.music.e) this.e);
            this.b = true;
        } else {
            if (aVar == aVar2) {
                return;
            }
            androidx.constraintlayout.core.g.e(1);
        }
    }

    public String e() {
        return org.schabi.newpipe.extractor.utils.g.c(((org.schabi.newpipe.extractor.linkhandler.a) this.d).y);
    }

    public org.schabi.newpipe.extractor.localization.a f() {
        w0 w0Var = (w0) this.c;
        w0Var.getClass();
        org.schabi.newpipe.extractor.localization.a aVar = kotlin.collections.g0.c;
        org.schabi.newpipe.extractor.localization.a aVar2 = org.schabi.newpipe.extractor.localization.a.y;
        if (aVar == null) {
            aVar = aVar2;
        }
        return w0Var.h().contains(aVar) ? aVar : aVar2;
    }

    public String g() {
        return ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z;
    }

    public abstract String h();

    public String i() {
        return ((org.schabi.newpipe.extractor.linkhandler.a) this.d).e;
    }

    public abstract j0 j();

    public com.google.android.material.internal.k k() {
        org.schabi.newpipe.extractor.localization.c cVarC = ((w0) this.c).c();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        String str = cVarC.e;
        String strA = cVarC.a();
        String strC = androidx.constraintlayout.core.g.c(str, (strA == null || strA.isEmpty()) ? "" : "_".concat(strA));
        HashMap map = org.schabi.newpipe.extractor.timeago.a.a;
        org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) map.get(strC);
        com.google.android.material.internal.k kVar = bVar == null ? null : new com.google.android.material.internal.k(25, bVar, localDateTimeNow);
        if (kVar != null) {
            return kVar;
        }
        if (!cVarC.a().isEmpty()) {
            LocalDateTime localDateTimeNow2 = LocalDateTime.now();
            org.schabi.newpipe.extractor.timeago.b bVar2 = (org.schabi.newpipe.extractor.timeago.b) map.get(str + "");
            com.google.android.material.internal.k kVar2 = bVar2 != null ? new com.google.android.material.internal.k(25, bVar2, localDateTimeNow2) : null;
            if (kVar2 != null) {
                return kVar2;
            }
        }
        t0.m(cVarC, "\")", "Localization is not supported (\"");
        return null;
    }

    public String l() {
        return ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y;
    }

    public abstract void m(com.app.mlounge.data.music.e eVar);

    public j0 n(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        this.b = true;
        androidx.work.impl.model.p pVar = (androidx.work.impl.model.p) this.d;
        pVar.l = a.e;
        long millis = timeUnit.toMillis(j);
        String str = androidx.work.impl.model.p.z;
        if (millis > 18000000) {
            y.e().h(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            y.e().h(str, "Backoff delay duration less than minimum value");
        }
        pVar.m = kotlin.collections.i0.e(millis, 10000L, 18000000L);
        return j();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    public j0(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar) {
        String simpleName = getClass().getSimpleName();
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("@");
        sb.append(iHashCode);
        this.b = false;
        Objects.requireNonNull(w0Var, "service is null");
        this.c = w0Var;
        Objects.requireNonNull(aVar, "LinkHandler is null");
        this.d = aVar;
        com.app.mlounge.data.music.e eVar = kotlin.collections.g0.a;
        Objects.requireNonNull(eVar, "downloader is null");
        this.e = eVar;
    }
}
