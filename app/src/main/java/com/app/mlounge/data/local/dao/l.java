package com.app.mlounge.data.local.dao;

import android.content.Context;
import androidx.compose.ui.focus.c0;
import com.app.mlounge.data.remote.model.NtvChannel;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    public /* synthetic */ l(String str, int i) {
        this.e = i;
        this.y = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        boolean z = false;
        switch (this.e) {
            case 0:
                String str = this.y;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("DELETE FROM watchlist WHERE contentId = ?");
                try {
                    cVarU.s(1, str);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            case 1:
                String str2 = this.y;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT EXISTS(SELECT 1 FROM watchlist WHERE contentId = ?)");
                try {
                    cVarU2.s(1, str2);
                    if (cVarU2.Q() && ((int) cVarU2.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarU2.close();
                }
            case 2:
                String str3 = this.y;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM watchlist WHERE contentId = ? LIMIT 1");
                try {
                    cVarU3.s(1, str3);
                    int iU = _COROUTINE.b.u(cVarU3, "contentId");
                    int iU2 = _COROUTINE.b.u(cVarU3, "contentType");
                    int iU3 = _COROUTINE.b.u(cVarU3, "title");
                    int iU4 = _COROUTINE.b.u(cVarU3, "posterPath");
                    int iU5 = _COROUTINE.b.u(cVarU3, "backdropPath");
                    int iU6 = _COROUTINE.b.u(cVarU3, "rating");
                    int iU7 = _COROUTINE.b.u(cVarU3, "releaseDate");
                    int iU8 = _COROUTINE.b.u(cVarU3, "overview");
                    int iU9 = _COROUTINE.b.u(cVarU3, "addedAt");
                    int iU10 = _COROUTINE.b.u(cVarU3, "externalId");
                    int iU11 = _COROUTINE.b.u(cVarU3, "providerData");
                    Object fVar = null;
                    if (cVarU3.Q()) {
                        fVar = new com.app.mlounge.data.local.entity.f(cVarU3.F(iU), cVarU3.F(iU2), cVarU3.F(iU3), cVarU3.isNull(iU4) ? null : cVarU3.F(iU4), cVarU3.isNull(iU5) ? null : cVarU3.F(iU5), cVarU3.isNull(iU6) ? null : Double.valueOf(cVarU3.getDouble(iU6)), cVarU3.isNull(iU7) ? null : cVarU3.F(iU7), cVarU3.isNull(iU8) ? null : cVarU3.F(iU8), cVarU3.getLong(iU9), cVarU3.isNull(iU10) ? null : cVarU3.F(iU10), cVarU3.isNull(iU11) ? null : cVarU3.F(iU11));
                    }
                    return fVar;
                } finally {
                    cVarU3.close();
                }
            case 3:
                String str4 = this.y;
                int iIntValue = ((Integer) obj).intValue() * 8;
                String strSubstring = str4.substring(iIntValue, iIntValue + 8);
                kotlin.comparisons.a.c(16);
                long j = Long.parseLong(strSubstring, 16);
                kotlin.comparisons.a.c(36);
                String string = Long.toString(j, 36);
                string.getClass();
                return string;
            case 4:
                String str5 = this.y;
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", str5, "focus=" + c0Var.a());
                return y.a;
            case 5:
                String str6 = this.y;
                NtvChannel ntvChannel = (NtvChannel) obj;
                ntvChannel.getClass();
                String strD = ntvChannel.d();
                if (strD != null && kotlin.text.k.z(strD, str6, true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                String str7 = this.y;
                String str8 = (String) obj;
                str8.getClass();
                if (kotlin.text.k.J(str8)) {
                    return str8.length() < str7.length() ? str7 : str8;
                }
                return str7.concat(str8);
        }
    }
}
