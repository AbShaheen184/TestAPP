package com.app.mlounge.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.gestures.h2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final Flow A;
    public final Flow B;
    public final Flow C;
    public final Flow D;
    public final Flow E;
    public final Flow F;
    public final Flow G;
    public final Flow H;
    public final Flow I;
    public final Flow J;
    public final Flow K;
    public final Flow L;
    public final Flow M;
    public final Flow N;
    public final Flow O;
    public final Flow P;
    public final Flow Q;
    public final Flow R;
    public final Flow S;
    public final Flow T;
    public final Flow U;
    public final kotlin.o V;
    public final Flow W;
    public final Flow X;
    public final Flow Y;
    public final Flow Z;
    public final Context a;
    public final Flow a0;
    public final Flow b;
    public final Flow b0;
    public final Flow c;
    public final Flow c0;
    public final Flow d;
    public final Flow d0;
    public final Flow e;
    public final Flow e0;
    public final Flow f;
    public final Flow f0;
    public final Flow g;
    public final Flow g0;
    public final Flow h;
    public final Flow h0;
    public final Flow i;
    public final Flow i0;
    public final Flow j;
    public final Flow j0;
    public final Flow k;
    public final Flow l;
    public final Flow m;
    public final Flow n;
    public final Flow o;
    public final Flow p;
    public final Flow q;
    public final Flow r;
    public final Flow s;
    public final Flow t;
    public final Flow u;
    public final Flow v;
    public final Flow w;
    public final Flow x;
    public final Flow y;
    public final Flow z;
    public static final androidx.datastore.preferences.core.d k0 = new androidx.datastore.preferences.core.d("adult_enabled");
    public static final androidx.datastore.preferences.core.d l0 = new androidx.datastore.preferences.core.d("adult_pin");
    public static final androidx.datastore.preferences.core.d m0 = new androidx.datastore.preferences.core.d("include_adult_content");
    public static final androidx.datastore.preferences.core.d n0 = new androidx.datastore.preferences.core.d("include_adult_in_watchlist");
    public static final androidx.datastore.preferences.core.d o0 = new androidx.datastore.preferences.core.d("include_adult_in_history");
    public static final androidx.datastore.preferences.core.d p0 = new androidx.datastore.preferences.core.d("premiumize_token");
    public static final androidx.datastore.preferences.core.d q0 = new androidx.datastore.preferences.core.d("torbox_token");
    public static final androidx.datastore.preferences.core.d r0 = new androidx.datastore.preferences.core.d("alldebrid_token");
    public static final androidx.datastore.preferences.core.d s0 = new androidx.datastore.preferences.core.d("real_debrid_token");
    public static final androidx.datastore.preferences.core.d t0 = new androidx.datastore.preferences.core.d("real_debrid_token_expiry");
    public static final androidx.datastore.preferences.core.d u0 = new androidx.datastore.preferences.core.d("real_debrid_refresh_token");
    public static final androidx.datastore.preferences.core.d v0 = new androidx.datastore.preferences.core.d("real_debrid_client_id");
    public static final androidx.datastore.preferences.core.d w0 = new androidx.datastore.preferences.core.d("real_debrid_client_secret");
    public static final androidx.datastore.preferences.core.d x0 = new androidx.datastore.preferences.core.d("easynews_username");
    public static final androidx.datastore.preferences.core.d y0 = new androidx.datastore.preferences.core.d("easynews_password");
    public static final androidx.datastore.preferences.core.d z0 = new androidx.datastore.preferences.core.d("trakt_token");
    public static final androidx.datastore.preferences.core.d A0 = new androidx.datastore.preferences.core.d("trakt_refresh_token");
    public static final androidx.datastore.preferences.core.d B0 = new androidx.datastore.preferences.core.d("trakt_token_expiry");
    public static final androidx.datastore.preferences.core.d C0 = new androidx.datastore.preferences.core.d("hidden_menus");
    public static final androidx.datastore.preferences.core.d D0 = new androidx.datastore.preferences.core.d("player_quality");
    public static final androidx.datastore.preferences.core.d E0 = new androidx.datastore.preferences.core.d("player_auto_play_next");
    public static final androidx.datastore.preferences.core.d F0 = new androidx.datastore.preferences.core.d("player_one_click_play");
    public static final androidx.datastore.preferences.core.d G0 = new androidx.datastore.preferences.core.d("player_next_episode_lead_ms");
    public static final androidx.datastore.preferences.core.d H0 = new androidx.datastore.preferences.core.d("player_seek_increment_ms");
    public static final androidx.datastore.preferences.core.d I0 = new androidx.datastore.preferences.core.d("player_subtitle_enabled");
    public static final androidx.datastore.preferences.core.d J0 = new androidx.datastore.preferences.core.d("subtitle_size_sp");
    public static final androidx.datastore.preferences.core.d K0 = new androidx.datastore.preferences.core.d("subtitle_text_color");
    public static final androidx.datastore.preferences.core.d L0 = new androidx.datastore.preferences.core.d("subtitle_bg_color");
    public static final androidx.datastore.preferences.core.d M0 = new androidx.datastore.preferences.core.d("external_player_package");
    public static final androidx.datastore.preferences.core.d N0 = new androidx.datastore.preferences.core.d("external_player_name");
    public static final androidx.datastore.preferences.core.d O0 = new androidx.datastore.preferences.core.d("emu_aspect_ratio");
    public static final androidx.datastore.preferences.core.d P0 = new androidx.datastore.preferences.core.d("emu_show_touch_controls");
    public static final androidx.datastore.preferences.core.d Q0 = new androidx.datastore.preferences.core.d("emu_controls_opacity");
    public static final androidx.datastore.preferences.core.d R0 = new androidx.datastore.preferences.core.d("emu_auto_save");
    public static final androidx.datastore.preferences.core.d S0 = new androidx.datastore.preferences.core.d("emu_vibration");
    public static final androidx.datastore.preferences.core.d T0 = new androidx.datastore.preferences.core.d("emu_auto_load_save");
    public static final androidx.datastore.preferences.core.d U0 = new androidx.datastore.preferences.core.d("emu_key_mapping");
    public static final androidx.datastore.preferences.core.d V0 = new androidx.datastore.preferences.core.d("download_location");
    public static final androidx.datastore.preferences.core.d W0 = new androidx.datastore.preferences.core.d("simultaneous_downloads");
    public static final androidx.datastore.preferences.core.d X0 = new androidx.datastore.preferences.core.d("external_downloader_package");
    public static final androidx.datastore.preferences.core.d Y0 = new androidx.datastore.preferences.core.d("external_downloader_name");
    public static final androidx.datastore.preferences.core.d Z0 = new androidx.datastore.preferences.core.d("resource_sharing");
    public static final androidx.datastore.preferences.core.d a1 = new androidx.datastore.preferences.core.d("disabled_providers");
    public static final androidx.datastore.preferences.core.d b1 = new androidx.datastore.preferences.core.d("nav_order");
    public static final androidx.datastore.preferences.core.d c1 = new androidx.datastore.preferences.core.d("allow_portrait");
    public static final androidx.datastore.preferences.core.d d1 = new androidx.datastore.preferences.core.d("card_scale");
    public static final androidx.datastore.preferences.core.d e1 = new androidx.datastore.preferences.core.d("text_scale");
    public static final androidx.datastore.preferences.core.d f1 = new androidx.datastore.preferences.core.d("custom_iptv_type");
    public static final androidx.datastore.preferences.core.d g1 = new androidx.datastore.preferences.core.d("custom_iptv_m3u_url");
    public static final androidx.datastore.preferences.core.d h1 = new androidx.datastore.preferences.core.d("custom_iptv_epg_url");
    public static final androidx.datastore.preferences.core.d i1 = new androidx.datastore.preferences.core.d("custom_iptv_xtream_host");
    public static final androidx.datastore.preferences.core.d j1 = new androidx.datastore.preferences.core.d("custom_iptv_xtream_port");
    public static final androidx.datastore.preferences.core.d k1 = new androidx.datastore.preferences.core.d("custom_iptv_xtream_username");
    public static final androidx.datastore.preferences.core.d l1 = new androidx.datastore.preferences.core.d("custom_iptv_xtream_password");
    public static final androidx.datastore.preferences.core.d m1 = new androidx.datastore.preferences.core.d("custom_iptv_channel_count");
    public static final androidx.datastore.preferences.core.d n1 = new androidx.datastore.preferences.core.d("custom_iptv_last_sync");
    public static final androidx.datastore.preferences.core.d o1 = new androidx.datastore.preferences.core.d("custom_iptv_has_epg");
    public static final androidx.datastore.preferences.core.d p1 = new androidx.datastore.preferences.core.d("custom_iptv_xtream_use_builtin_epg");
    public static final androidx.datastore.preferences.core.d q1 = new androidx.datastore.preferences.core.d("custom_iptv_local_m3u_path");
    public static final androidx.datastore.preferences.core.d r1 = new androidx.datastore.preferences.core.d("custom_iptv_local_epg_path");
    public static final androidx.datastore.preferences.core.d s1 = new androidx.datastore.preferences.core.d("live_tv_selected_provider");

    public y1(Context context) {
        this.a = context;
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.m60catch(((androidx.datastore.preferences.core.c) z1.a(context)).a.b(), new androidx.compose.material3.internal.n(3, 2, (kotlin.coroutines.d) null)));
        this.b = flowDistinctUntilChanged;
        this.c = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 14));
        this.d = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 25));
        this.e = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 6));
        this.f = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 17));
        this.g = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 28));
        this.h = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 29));
        this.i = FlowKt.distinctUntilChanged(new v1(flowDistinctUntilChanged, 0));
        this.j = FlowKt.distinctUntilChanged(new v1(flowDistinctUntilChanged, 1));
        this.k = FlowKt.distinctUntilChanged(new v1(flowDistinctUntilChanged, 2));
        this.l = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 4));
        this.m = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 5));
        this.n = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 6));
        this.o = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 7));
        this.p = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 8));
        this.q = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 9));
        this.r = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 10));
        this.s = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 11));
        this.t = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 12));
        this.u = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 13));
        this.v = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 15));
        this.w = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 16));
        this.x = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 17));
        this.y = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 18));
        this.z = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 19));
        this.A = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 20));
        this.B = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 21));
        this.C = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 22));
        this.D = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 23));
        this.E = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 24));
        this.F = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 26));
        this.G = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 27));
        this.H = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 28));
        this.I = FlowKt.distinctUntilChanged(new androidx.datastore.core.o(flowDistinctUntilChanged, 29));
        this.J = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 0));
        this.K = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 1));
        this.L = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 2));
        this.M = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 3));
        this.N = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 4));
        this.O = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 5));
        this.P = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 7));
        this.Q = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 8));
        this.R = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 9));
        this.S = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 10));
        this.T = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 11));
        this.U = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 12));
        this.V = new kotlin.o(new androidx.navigation.internal.h(this, 18));
        this.W = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 13));
        this.X = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 14));
        this.Y = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 15));
        this.Z = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 16));
        this.a0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 18));
        this.b0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 19));
        this.c0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 20));
        this.d0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 21));
        this.e0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 22));
        this.f0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 23));
        this.g0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 24));
        this.h0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 25));
        this.i0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 26));
        this.j0 = FlowKt.distinctUntilChanged(new q0(flowDistinctUntilChanged, 27));
    }

    public final Flow a() {
        return this.Y;
    }

    public final Flow b() {
        return this.h0;
    }

    public final Flow c() {
        return this.g0;
    }

    public final Flow d() {
        return this.X;
    }

    public final Flow e() {
        return this.W;
    }

    public final Flow f() {
        return this.i0;
    }

    public final SharedPreferences g() {
        return (SharedPreferences) this.V.getValue();
    }

    public final Flow h() {
        return this.L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.A = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.y;
        int i2 = fVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            c cVar2 = new c(13, str, null);
            fVar.e = str;
            fVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, cVar2, fVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = fVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putString("emu_aspect_ratio", str);
        editorEdit.apply();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.A = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.y;
        int i2 = gVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            b bVar = new b(z, null, 5);
            gVar.e = z;
            gVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, bVar, gVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = gVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putBoolean("emu_auto_load_save", z);
        editorEdit.apply();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.A = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.y;
        int i2 = hVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            b bVar = new b(z, null, 6);
            hVar.e = z;
            hVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, bVar, hVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = hVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putBoolean("emu_auto_save", z);
        editorEdit.apply();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(float f, kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.A = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.y;
        int i2 = iVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            j jVar = new j(f, null);
            iVar.e = f;
            iVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, jVar, iVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = iVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putFloat("emu_controls_opacity", f);
        editorEdit.apply();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.A = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.y;
        int i2 = kVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            c cVar2 = new c(14, str, null);
            kVar.e = str;
            kVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, cVar2, kVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = kVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putString("emu_key_mapping", str);
        editorEdit.apply();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.A = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.y;
        int i2 = lVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.datastore.core.e eVarA = z1.a(this.a);
            b bVar = new b(z, null, 7);
            lVar.e = z;
            lVar.A = 1;
            Object objH = _COROUTINE.a.H(eVarA, bVar, lVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = lVar.e;
            kotlin.a.e(obj);
        }
        SharedPreferences sharedPreferencesG = g();
        sharedPreferencesG.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferencesG.edit();
        editorEdit.putBoolean("emu_show_touch_controls", z);
        editorEdit.apply();
        return kotlin.y.a;
    }

    public final Object o(String str, long j, kotlin.coroutines.jvm.internal.c cVar) {
        Object objH = _COROUTINE.a.H(z1.a(this.a), new m(str, j, null), cVar);
        return objH == kotlin.coroutines.intrinsics.a.e ? objH : kotlin.y.a;
    }

    public final Object p(String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objH = _COROUTINE.a.H(z1.a(this.a), new c(20, str, null), cVar);
        return objH == kotlin.coroutines.intrinsics.a.e ? objH : kotlin.y.a;
    }

    public final Object q(String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objH = _COROUTINE.a.H(z1.a(this.a), new c(21, str, null), cVar);
        return objH == kotlin.coroutines.intrinsics.a.e ? objH : kotlin.y.a;
    }

    public final Object r(long j, kotlin.coroutines.jvm.internal.c cVar) {
        Object objH = _COROUTINE.a.H(z1.a(this.a), new h2(j, null, 4), cVar);
        return objH == kotlin.coroutines.intrinsics.a.e ? objH : kotlin.y.a;
    }
}
