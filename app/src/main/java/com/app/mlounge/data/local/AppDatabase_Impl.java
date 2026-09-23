package com.app.mlounge.data.local;

import androidx.emoji2.text.g;
import androidx.work.impl.s;
import com.app.mlounge.data.local.dao.f;
import com.app.mlounge.data.local.dao.h;
import com.app.mlounge.data.local.dao.i;
import com.app.mlounge.data.local.dao.j;
import com.app.mlounge.data.local.dao.k;
import com.app.mlounge.data.local.dao.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final /* synthetic */ int v = 0;
    public final o p;
    public final o q;
    public final o r;
    public final o s;
    public final o t;
    public final o u;

    public AppDatabase_Impl() {
        final int i = 0;
        this.p = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i2 = i;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i2) {
                    case 0:
                        int i3 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i4 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i5 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i6 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i7 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i8 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.q = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i3 = i2;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i3) {
                    case 0:
                        int i4 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i5 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i6 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i7 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i8 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i9 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.r = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i4 = i3;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i4) {
                    case 0:
                        int i5 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i6 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i7 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i8 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i9 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i10 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.s = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i5 = i4;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i5) {
                    case 0:
                        int i6 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i7 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i8 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i9 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i10 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i11 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.t = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i6 = i5;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i6) {
                    case 0:
                        int i7 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i8 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i9 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i10 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i11 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
        final int i6 = 5;
        this.u = new o(new kotlin.jvm.functions.a(this) { // from class: com.app.mlounge.data.local.d
            public final /* synthetic */ AppDatabase_Impl y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                int i7 = i6;
                AppDatabase_Impl appDatabase_Impl = this.y;
                switch (i7) {
                    case 0:
                        int i8 = AppDatabase_Impl.v;
                        return new m(appDatabase_Impl);
                    case 1:
                        int i9 = AppDatabase_Impl.v;
                        return new h(appDatabase_Impl);
                    case 2:
                        int i10 = AppDatabase_Impl.v;
                        return new com.app.mlounge.data.local.dao.d(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.v;
                        return new f(appDatabase_Impl);
                    case 4:
                        int i12 = AppDatabase_Impl.v;
                        return new k(appDatabase_Impl);
                    default:
                        int i13 = AppDatabase_Impl.v;
                        return new j(appDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.r
    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.r
    public final androidx.room.f d() {
        return new androidx.room.f(this, new LinkedHashMap(), new LinkedHashMap(), "watchlist", "history", "downloads", "favourite_games", "watch_progress", "iptv_channels");
    }

    @Override // androidx.room.r
    public final g e() {
        return new s(this);
    }

    @Override // androidx.room.r
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.r
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVarA = a0.a(m.class);
        w wVar = w.e;
        linkedHashMap.put(eVarA, wVar);
        linkedHashMap.put(a0.a(h.class), wVar);
        linkedHashMap.put(a0.a(com.app.mlounge.data.local.dao.d.class), wVar);
        linkedHashMap.put(a0.a(f.class), wVar);
        linkedHashMap.put(a0.a(k.class), wVar);
        linkedHashMap.put(a0.a(i.class), wVar);
        return linkedHashMap;
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final com.app.mlounge.data.local.dao.d r() {
        return (com.app.mlounge.data.local.dao.d) this.r.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final f s() {
        return (f) this.s.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final h t() {
        return (h) this.q.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final i u() {
        return (i) this.u.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final k v() {
        return (k) this.t.getValue();
    }

    @Override // com.app.mlounge.data.local.AppDatabase
    public final m w() {
        return (m) this.p.getValue();
    }
}
