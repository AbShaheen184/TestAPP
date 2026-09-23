package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.y4;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements w, com.google.android.gms.tasks.h, com.google.firebase.crashlytics.internal.settings.b, androidx.lifecycle.viewmodel.b {
    public static b0 T;
    public final /* synthetic */ int e;
    public static final /* synthetic */ b0 y = new b0(0);
    public static final /* synthetic */ b0 z = new b0(1);
    public static final /* synthetic */ b0 A = new b0(2);
    public static final /* synthetic */ b0 B = new b0(3);
    public static final /* synthetic */ b0 C = new b0(4);
    public static final /* synthetic */ b0 D = new b0(5);
    public static final /* synthetic */ b0 E = new b0(6);
    public static final /* synthetic */ b0 F = new b0(7);
    public static final /* synthetic */ b0 G = new b0(8);
    public static final /* synthetic */ b0 H = new b0(9);
    public static final /* synthetic */ b0 I = new b0(10);
    public static final /* synthetic */ b0 J = new b0(11);
    public static final /* synthetic */ b0 K = new b0(12);
    public static final /* synthetic */ b0 L = new b0(13);
    public static final /* synthetic */ b0 M = new b0(14);
    public static final /* synthetic */ b0 N = new b0(15);
    public static final /* synthetic */ b0 O = new b0(16);
    public static final /* synthetic */ b0 P = new b0(17);
    public static final /* synthetic */ b0 Q = new b0(18);
    public static final /* synthetic */ b0 R = new b0(19);
    public static final /* synthetic */ b0 S = new b0(20);

    public /* synthetic */ b0(int i) {
        this.e = i;
    }

    public static final String b(okio.i iVar, okio.i[] iVarArr, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        okio.i iVar2 = okhttp3.internal.publicsuffix.a.b;
        int iF = iVar.f();
        int i5 = 0;
        while (i5 < iF) {
            int i6 = (i5 + iF) / 2;
            while (i6 > -1 && iVar.k(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (iVar.k(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z2 = false;
                } else {
                    byte bK = iVarArr[i10].k(i11);
                    byte[] bArr = okhttp3.internal.e.a;
                    int i13 = bK & 255;
                    z2 = z3;
                    i3 = i13;
                }
                byte bK2 = iVar.k(i7 + i12);
                byte[] bArr2 = okhttp3.internal.e.a;
                i4 = i3 - (bK2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (iVarArr[i10].f() != i11) {
                    z3 = z2;
                } else {
                    if (i10 == iVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z3 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iF2 = iVarArr[i10].f() - i11;
                    int length = iVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iF2 += iVarArr[i15].f();
                    }
                    if (iF2 >= i14) {
                        if (iF2 <= i14) {
                            return iVar.q(i7, i9 + i7).p(kotlin.text.a.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iF = i6;
        }
        return null;
    }

    public static com.google.firebase.crashlytics.internal.settings.a c(y yVar) {
        return new com.google.firebase.crashlytics.internal.settings.a(System.currentTimeMillis() + ((long) 3600000), new androidx.compose.animation.core.t2(8), new androidx.media3.exoplayer.audio.g(true, false, false), 10.0d, 1.2d, 60);
    }

    public static okio.x d(String str) {
        str.getClass();
        okio.i iVar = okio.internal.c.a;
        okio.f fVar = new okio.f();
        fVar.u0(str);
        return okio.internal.c.d(fVar, false);
    }

    public static okio.x e(File file) {
        String str = okio.x.y;
        String string = file.toString();
        string.getClass();
        return d(string);
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 0:
                List list = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(63, 43200000L, "measurement.upload.backoff_period").get();
            case 1:
                List list2 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 2:
                List list3 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 3:
                List list4 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 4:
                List list5 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case 5:
                List list6 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (String) com.google.android.gms.internal.measurement.f4.a.i("measurement.test.string_flag", 5, "---").get();
            case 6:
                List list7 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f4.a.g(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 7:
                List list8 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 8:
                List list9 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 9:
                List list10 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_authority", 56, "google-analytics.com").get();
            case 10:
                List list11 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
            case 11:
                List list12 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 12:
                List list13 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 13:
                List list14 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(10, "measurement.config.default_flag_values", true).get();
            case 14:
                List list15 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.a.get();
            case 15:
                List list16 = f0.a;
                return (Boolean) y4.a.get();
            case 16:
                List list17 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.p4.a.get();
            case 17:
                List list18 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(1, "measurement.rb.attribution.client2", true).get();
            case 18:
                List list19 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.j4.a.get();
            case 19:
                List list20 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.d4.a.get()).booleanValue());
        }
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.s g(Object obj) {
        return org.jsoup.helper.n.o(Boolean.TRUE);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.b
    public com.google.firebase.crashlytics.internal.settings.a h(y yVar, JSONObject jSONObject) {
        return c(yVar);
    }
}
