package com.app.mlounge.data.local.dao;

import java.util.ArrayList;
import kotlin.y;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ e(String str, String str2, int i) {
        this.e = i;
        this.y = str;
        this.z = str2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.e) {
            case 0:
                String str = this.y;
                String str2 = this.z;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("DELETE FROM favourite_games WHERE slug = ? AND platform = ?");
                try {
                    cVarU.s(1, str);
                    cVarU.s(2, str2);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            case 1:
                String str3 = this.y;
                String str4 = this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT EXISTS(SELECT 1 FROM favourite_games WHERE slug = ? AND platform = ?)");
                try {
                    cVarU2.s(1, str3);
                    cVarU2.s(2, str4);
                    boolean z = false;
                    if (cVarU2.Q()) {
                        z = ((int) cVarU2.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarU2.close();
                }
            case 2:
                String str5 = this.y;
                String str6 = this.z;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM iptv_channels WHERE provider = ? AND name LIKE '%' || ? || '%' LIMIT ?");
                try {
                    cVarU3.s(1, str5);
                    cVarU3.s(2, str6);
                    cVarU3.f(3, Context.VERSION_ES6);
                    int iU = _COROUTINE.b.u(cVarU3, "id");
                    int iU2 = _COROUTINE.b.u(cVarU3, "name");
                    int iU3 = _COROUTINE.b.u(cVarU3, "url");
                    int iU4 = _COROUTINE.b.u(cVarU3, "logo");
                    int iU5 = _COROUTINE.b.u(cVarU3, "groupName");
                    int iU6 = _COROUTINE.b.u(cVarU3, "provider");
                    int iU7 = _COROUTINE.b.u(cVarU3, "tvgId");
                    ArrayList arrayList = new ArrayList();
                    while (cVarU3.Q()) {
                        arrayList.add(new com.app.mlounge.data.local.entity.d(cVarU3.getLong(iU), cVarU3.F(iU2), cVarU3.F(iU3), cVarU3.isNull(iU4) ? null : cVarU3.F(iU4), cVarU3.isNull(iU5) ? null : cVarU3.F(iU5), cVarU3.F(iU6), cVarU3.isNull(iU7) ? null : cVarU3.F(iU7)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU3.close();
                }
            default:
                String str7 = this.y;
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM iptv_channels WHERE provider = ? AND (? IS NULL OR groupName = ?) ORDER BY name ASC");
                try {
                    cVarU4.s(1, str7);
                    String str8 = this.z;
                    if (str8 == null) {
                        cVarU4.j(2);
                    } else {
                        cVarU4.s(2, str8);
                    }
                    if (str8 == null) {
                        cVarU4.j(3);
                    } else {
                        cVarU4.s(3, str8);
                    }
                    int iU8 = _COROUTINE.b.u(cVarU4, "id");
                    int iU9 = _COROUTINE.b.u(cVarU4, "name");
                    int iU10 = _COROUTINE.b.u(cVarU4, "url");
                    int iU11 = _COROUTINE.b.u(cVarU4, "logo");
                    int iU12 = _COROUTINE.b.u(cVarU4, "groupName");
                    int iU13 = _COROUTINE.b.u(cVarU4, "provider");
                    int iU14 = _COROUTINE.b.u(cVarU4, "tvgId");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU4.Q()) {
                        arrayList2.add(new com.app.mlounge.data.local.entity.d(cVarU4.getLong(iU8), cVarU4.F(iU9), cVarU4.F(iU10), cVarU4.isNull(iU11) ? null : cVarU4.F(iU11), cVarU4.isNull(iU12) ? null : cVarU4.F(iU12), cVarU4.F(iU13), cVarU4.isNull(iU14) ? null : cVarU4.F(iU14)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU4.close();
                }
        }
    }
}
