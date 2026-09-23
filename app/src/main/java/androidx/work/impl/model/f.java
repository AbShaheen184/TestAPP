package androidx.work.impl.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.runtime.s2;
import androidx.compose.ui.graphics.e0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.recyclerview.widget.RecyclerView;
import com.app.mlounge.data.local.AppDatabase;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.appcompat.view.menu.o, androidx.lifecycle.viewmodel.b, androidx.media3.exoplayer.hls.playlist.t, androidx.media3.exoplayer.source.chunk.l, androidx.media3.extractor.p, androidx.media3.extractor.text.j, androidx.profileinstaller.b, com.google.android.gms.dynamite.c, w {
    public final /* synthetic */ int e;
    public static final /* synthetic */ f y = new f(23);
    public static final /* synthetic */ f z = new f(24);
    public static final /* synthetic */ f A = new f(25);
    public static final /* synthetic */ f B = new f(26);
    public static final /* synthetic */ f C = new f(27);
    public static final /* synthetic */ f D = new f(28);

    public f() {
        this.e = 3;
        new androidx.collection.u(16);
        long[] jArr = w0.a;
        new o0();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0116 A[LOOP:4: B:31:0x0110->B:33:0x0116, LOOP_END] */
    public static final void p(androidx.sqlite.db.framework.b bVar) throws IOException {
        com.app.mlounge.data.local.b bVar2 = AppDatabase.l;
        for (com.app.mlounge.data.local.c cVar : AppDatabase.o) {
            com.app.mlounge.data.local.b bVar3 = AppDatabase.l;
            String str = cVar.a;
            List list = cVar.b;
            bVar.A(s(str, list));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            bVar.getClass();
            Cursor cursorN = bVar.N(new androidx.media3.container.a("PRAGMA table_info(`" + str + "`)"));
            try {
                int columnIndexOrThrow = cursorN.getColumnIndexOrThrow("name");
                while (cursorN.moveToNext()) {
                    String string = cursorN.getString(columnIndexOrThrow);
                    string.getClass();
                    linkedHashSet.add(string);
                }
                cursorN.close();
                ArrayList<com.app.mlounge.data.local.a> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!linkedHashSet.contains(((com.app.mlounge.data.local.a) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.isEmpty()) {
                        for (com.app.mlounge.data.local.a aVar : arrayList) {
                            String str2 = aVar.a;
                            String str3 = aVar.b;
                            StringBuilder sbQ = androidx.compose.runtime.j.q("ALTER TABLE `", str, "` ADD COLUMN `", str2, "` ");
                            sbQ.append(str3);
                            bVar.A(sbQ.toString());
                        }
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                while (r3.hasNext()) {
                                    String str4 = aVar.a;
                                    String str5 = aVar.b;
                                    StringBuilder sbQ2 = androidx.compose.runtime.j.q("ALTER TABLE `", str, "` ADD COLUMN `", str4, "` ");
                                    sbQ2.append(str5);
                                    bVar.A(sbQ2.toString());
                                }
                            } else if (((com.app.mlounge.data.local.a) it.next()).c) {
                                String strC = androidx.constraintlayout.core.g.c(str, "_migrate_new");
                                com.app.mlounge.data.local.b bVar4 = AppDatabase.l;
                                bVar.A(s(strC, list));
                                bVar.A(androidx.compose.runtime.j.n(androidx.compose.runtime.j.q("INSERT INTO `", strC, "` (", kotlin.collections.p.I(cVar.b, ", ", null, null, new androidx.navigation.compose.r(26), 30), ") SELECT "), kotlin.collections.p.I(cVar.b, ", ", null, null, new s2(linkedHashSet, 12), 30), " FROM `", str, "`"));
                                bVar.A("DROP TABLE `" + str + "`");
                                bVar.A(androidx.compose.runtime.j.k("ALTER TABLE `", strC, "` RENAME TO `", str, "`"));
                            }
                        }
                    }
                }
                Iterator it2 = cVar.c.iterator();
                while (it2.hasNext()) {
                    bVar.A((String) it2.next());
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(cursorN, th);
                    throw th2;
                }
            }
        }
    }

    public static final float q(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static String s(String str, List list) {
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.app.mlounge.data.local.a aVar = (com.app.mlounge.data.local.a) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append("`" + aVar.a + "` " + aVar.b);
            if (aVar.d && aVar.e) {
                sb.append(" PRIMARY KEY AUTOINCREMENT");
            }
            if (aVar.c) {
                sb.append(" NOT NULL");
            }
            arrayList.add(sb.toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            com.app.mlounge.data.local.a aVar2 = (com.app.mlounge.data.local.a) obj;
            if (aVar2.d && !aVar2.e) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add("PRIMARY KEY(" + kotlin.collections.p.I(arrayList3, ", ", null, null, new androidx.navigation.compose.r(27), 30) + ")");
        }
        return androidx.compose.runtime.j.k("CREATE TABLE IF NOT EXISTS `", str, "` (", kotlin.collections.p.I(arrayList2, ", ", null, null, null, 62), ")");
    }

    public static e0 t(List list, float f, float f2, int i) {
        return new e0(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L));
    }

    public static final boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 23:
                return new Boolean(((Boolean) m3.a.get()).booleanValue());
            case 24:
                List list = f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
            case 25:
                List list2 = f0.a;
                return (String) o3.c.get();
            case 26:
                List list3 = f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 27:
                List list4 = f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.sgtm.service_upload_apps_list", 44, "").get();
            default:
                List list5 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
        }
    }

    @Override // com.google.android.gms.dynamite.c
    public int c(Context context, String str, boolean z2) {
        return com.google.android.gms.dynamite.e.d(context, str, z2);
    }

    @Override // com.google.android.gms.dynamite.c
    public int d(Context context, String str) {
        return com.google.android.gms.dynamite.e.a(context, str);
    }

    @Override // androidx.media3.extractor.text.j
    public int e(androidx.media3.common.r rVar) {
        String str = rVar.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.i("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.t
    public androidx.media3.exoplayer.upstream.p f(androidx.media3.exoplayer.hls.playlist.p pVar, androidx.media3.exoplayer.hls.playlist.m mVar) {
        return new androidx.media3.exoplayer.hls.playlist.s(pVar, mVar);
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // androidx.media3.extractor.p
    public void h(a0 a0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.t
    public androidx.media3.exoplayer.upstream.p l() {
        return new androidx.media3.exoplayer.hls.playlist.s(androidx.media3.exoplayer.hls.playlist.p.l, null);
    }

    @Override // androidx.media3.extractor.text.j
    public androidx.media3.extractor.text.l m(androidx.media3.common.r rVar) {
        String str = rVar.o;
        List list = rVar.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new androidx.media3.extractor.text.dvb.h(list);
                case "application/pgs":
                    return new com.google.firebase.messaging.n(14);
                case "application/x-mp4-vtt":
                    return new androidx.media3.exoplayer.dash.manifest.t(9);
                case "text/vtt":
                    return new androidx.media3.extractor.text.webvtt.i();
                case "application/x-quicktime-tx3g":
                    return new androidx.media3.extractor.text.tx3g.a(list);
                case "text/x-ssa":
                    return new androidx.media3.extractor.text.ssa.a(list);
                case "application/vobsub":
                    return new androidx.media3.extractor.text.vobsub.b(list);
                case "application/x-subrip":
                    return new androidx.media3.extractor.text.subrip.a();
                case "application/ttml+xml":
                    return new androidx.media3.extractor.text.ttml.e();
            }
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.i("Unsupported MIME type: ", str));
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean n(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public boolean next() {
        return false;
    }

    @Override // androidx.media3.extractor.text.j
    public boolean o(androidx.media3.common.r rVar) {
        String str = rVar.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // androidx.media3.extractor.p
    public void r() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.extractor.p
    public h0 u(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    @Override // androidx.profileinstaller.b
    public void i() {
    }

    public f(RecyclerView recyclerView) {
        this.e = 17;
    }

    @Override // androidx.appcompat.view.menu.o
    public void b(androidx.appcompat.view.menu.j jVar, boolean z2) {
    }

    @Override // androidx.profileinstaller.b
    public void j(int i, Object obj) {
    }
}
