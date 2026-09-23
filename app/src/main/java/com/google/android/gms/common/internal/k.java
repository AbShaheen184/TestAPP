package com.google.android.gms.common.internal;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.caverock.androidsvg.x1;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.q3;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class k implements androidx.compose.ui.text.font.o, androidx.lifecycle.viewmodel.b, androidx.media3.exoplayer.mediacodec.k, androidx.media3.extractor.p, androidx.media3.extractor.ogg.g, androidx.media3.extractor.text.j, androidx.profileinstaller.b, com.google.android.datatransport.runtime.time.a, com.google.android.gms.dynamite.d, com.google.android.gms.measurement.internal.f, com.google.android.gms.measurement.internal.w {
    public static k y;
    public final /* synthetic */ int e;
    public static final /* synthetic */ k z = new k(22);
    public static final /* synthetic */ k A = new k(23);
    public static final /* synthetic */ k B = new k(24);
    public static final /* synthetic */ k C = new k(25);
    public static final /* synthetic */ k D = new k(26);
    public static final /* synthetic */ k E = new k(27);
    public static final /* synthetic */ k F = new k(28);

    public k() {
        this.e = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static MediaCodec n(x1 x1Var) throws IOException {
        String str = ((androidx.media3.exoplayer.mediacodec.o) x1Var.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static synchronized k p() {
        try {
            if (y == null) {
                y = new k(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return y;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 23:
                return new Boolean(((Boolean) q3.a.get()).booleanValue());
            case 24:
                List list = com.google.android.gms.measurement.internal.f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
            case 25:
                List list2 = com.google.android.gms.measurement.internal.f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
            case 26:
                List list3 = com.google.android.gms.measurement.internal.f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 27:
                List list4 = com.google.android.gms.measurement.internal.f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.sgtm.upload.backoff_http_codes", 45, "404,429,503,504").get();
            default:
                List list5 = com.google.android.gms.measurement.internal.f0.a;
                e3.y.get();
                return (Long) f3.a.g(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
        }
    }

    @Override // androidx.media3.extractor.ogg.g
    public long b(androidx.media3.extractor.o oVar) {
        return -1L;
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.measurement.internal.f
    public /* synthetic */ String d(String str, String str2) {
        return null;
    }

    @Override // androidx.media3.extractor.text.j
    public int e(androidx.media3.common.r rVar) {
        return 1;
    }

    @Override // androidx.media3.extractor.ogg.g
    public androidx.media3.extractor.a0 f() {
        return new androidx.media3.extractor.s(-9223372036854775807L);
    }

    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j g(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        int iD = cVar.d(context, str);
        jVar.a = iD;
        if (iD != 0) {
            jVar.c = -1;
            return jVar;
        }
        int iC = cVar.c(context, str, true);
        jVar.b = iC;
        if (iC != 0) {
            jVar.c = 1;
        }
        return jVar;
    }

    @Override // androidx.profileinstaller.b
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.b
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // androidx.media3.exoplayer.mediacodec.k
    public androidx.media3.exoplayer.mediacodec.l k(x1 x1Var) throws Throwable {
        MediaCodec mediaCodecN = null;
        try {
            mediaCodecN = n(x1Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) x1Var.d;
            mediaCodecN.configure((MediaFormat) x1Var.b, surface, (MediaCrypto) x1Var.e, (surface == null && ((androidx.media3.exoplayer.mediacodec.o) x1Var.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecN.start();
            Trace.endSection();
            return new androidx.media3.exoplayer.mediacodec.w(mediaCodecN, (androidx.media3.exoplayer.mediacodec.j) x1Var.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecN != null) {
                mediaCodecN.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecN != null) {
                mediaCodecN.release();
            }
            throw e;
        }
    }

    @Override // androidx.media3.extractor.text.j
    public androidx.media3.extractor.text.l m(androidx.media3.common.r rVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // androidx.media3.extractor.text.j
    public boolean o(androidx.media3.common.r rVar) {
        return false;
    }

    public boolean q(CharSequence charSequence) {
        return false;
    }

    @Override // androidx.media3.extractor.p
    public androidx.media3.extractor.h0 u(int i, int i2) {
        return new androidx.media3.extractor.m();
    }

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    public k(androidx.fragment.app.h hVar) {
        this.e = 7;
        new CopyOnWriteArrayList();
    }

    @Override // androidx.media3.extractor.p
    public void r() {
    }

    @Override // androidx.media3.extractor.p
    public void h(androidx.media3.extractor.a0 a0Var) {
    }

    @Override // androidx.media3.extractor.ogg.g
    public void l(long j) {
    }
}
