package com.app.mlounge.ui.screens.downloads;

import android.net.Uri;
import androidx.compose.runtime.a1;
import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.screens.player.c1;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.o1;
import com.app.mlounge.ui.viewmodel.r1;
import com.app.mlounge.ui.viewmodel.u;
import com.app.mlounge.ui.viewmodel.w1;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.s;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.internal.http2.p;
import okhttp3.internal.http2.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final Object y;
    public final /* synthetic */ Object z;

    public e(p pVar, t tVar) {
        this.e = 9;
        this.z = pVar;
        this.y = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v10, types: [okhttp3.internal.http2.p] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws Throwable {
        okhttp3.internal.http2.b bVar;
        int i = this.e;
        int i2 = 1;
        ?? r4 = 0;
        r4 = 0;
        y yVar = y.a;
        Object obj = this.y;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                com.app.mlounge.data.local.entity.a aVar = (com.app.mlounge.data.local.entity.a) obj;
                String string = aVar.n;
                if (string != null) {
                    s sVar = (s) obj2;
                    if (!r.u(string, "content://", false)) {
                        string = Uri.fromFile(new File(string)).toString();
                        string.getClass();
                    }
                    sVar.d(string, aVar.d, Integer.valueOf(aVar.r), Integer.valueOf(aVar.s), Integer.valueOf(aVar.t));
                }
                return yVar;
            case 1:
                a0 a0Var = (a0) obj;
                BuildersKt__Builders_commonKt.launch$default(m0.g(a0Var), null, null, new u(a0Var, (IptvChannel) obj2, r4, i2), 3, null);
                return yVar;
            case 2:
                ((l) obj).invoke((com.app.mlounge.ui.screens.player.a) obj2);
                return yVar;
            case 3:
                ((l) obj).invoke((c1) obj2);
                return yVar;
            case 4:
                IptvChannel iptvChannel = (IptvChannel) obj2;
                ((q) obj).invoke(iptvChannel.f(), iptvChannel.c(), iptvChannel.d());
                return yVar;
            case 5:
                ((l) obj).invoke(((MusicArtist) obj2).c());
                return yVar;
            case 6:
                String strA = ((MusicTrack) obj).a();
                if (strA != null && !k.J(strA)) {
                    ((l) obj2).invoke(strA);
                }
                return yVar;
            case 7:
                File file = (File) obj;
                if (file.canRead()) {
                    List list = e0.a;
                    ((a1) obj2).setValue(file);
                }
                return yVar;
            case 8:
                w1 w1Var = (w1) obj;
                ChqStream chqStream = (ChqStream) obj2;
                chqStream.getClass();
                if (kotlin.jvm.internal.l.a(chqStream.n(), Boolean.TRUE) || kotlin.jvm.internal.l.a(chqStream.k(), "torrent") || r.u(chqStream.m(), "magnet:", false) || chqStream.f() != null) {
                    BuildersKt__Builders_commonKt.launch$default(m0.g(w1Var), null, null, new r1(w1Var, chqStream, r4, 2), 3, null);
                } else if (kotlin.jvm.internal.l.a(w1Var.x, "download")) {
                    BuildersKt__Builders_commonKt.launch$default(m0.g(w1Var), null, null, new o1(w1Var, chqStream.m(), chqStream, (kotlin.coroutines.d) null), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(m0.g(w1Var), null, null, new r1(w1Var, chqStream, r4, i2), 3, null);
                }
                return yVar;
            default:
                ?? r7 = (p) obj2;
                t tVar = (t) obj;
                okhttp3.internal.http2.b bVar2 = okhttp3.internal.http2.b.INTERNAL_ERROR;
                try {
                    if (!tVar.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (tVar.a(false, this)) {
                    }
                    bVar = okhttp3.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            r7.a(bVar, okhttp3.internal.http2.b.CANCEL, null);
                        } catch (Throwable th) {
                            th = th;
                            r7.a(bVar, bVar2, r4);
                            okhttp3.internal.e.b(tVar);
                            throw th;
                        }
                    } catch (IOException e) {
                        r4 = e;
                        okhttp3.internal.http2.b bVar3 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                        r7.a(bVar3, bVar3, r4);
                    }
                    okhttp3.internal.e.b(tVar);
                    return yVar;
                } catch (IOException e2) {
                    r4 = e2;
                    bVar = bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    r7.a(bVar, bVar2, r4);
                    okhttp3.internal.e.b(tVar);
                    throw th;
                }
                break;
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
