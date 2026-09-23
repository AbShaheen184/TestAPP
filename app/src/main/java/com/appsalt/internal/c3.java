package com.appsalt.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {
    public final androidx.media3.exoplayer.hls.c a;
    public final int b;
    public final p0 c;
    public final kotlin.coroutines.j d;
    public final ReceiveChannel e;
    public final Channel f;
    public final androidx.activity.compose.b g;
    public final Job h;
    public boolean i;
    public final int j;

    public c3(androidx.media3.exoplayer.hls.c cVar, int i, p0 p0Var, kotlin.coroutines.j jVar) {
        this.a = cVar;
        this.b = i;
        this.c = p0Var;
        this.d = jVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(jVar);
        kotlin.coroutines.d dVar = null;
        this.f = ChannelKt.Channel$default(4096, null, null, 6, null);
        this.g = new androidx.activity.compose.b(1);
        if (i != 1) {
            this.h = BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new androidx.compose.animation.core.z0(this, dVar, 10), 3, null);
        }
        this.e = i != 2 ? ProduceKt.produce$default(CoroutineScope, null, 4096, new t2(this, null), 1, null) : ChannelKt.Channel$default(0, null, null, 7, null);
        this.j = hashCode();
    }

    public static final ArrayList a(c3 c3Var, byte[] bArr) {
        c3Var.getClass();
        if (bArr.length < 4) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = i + 4;
            int i3 = ByteBuffer.wrap(kotlin.collections.o.k(bArr, i, i2)).order(ByteOrder.BIG_ENDIAN).getInt();
            i += i3 + 4;
            if (bArr.length < i) {
                break;
            }
            arrayList.add(kotlin.collections.o.k(bArr, i2, i3 + i2));
        } while (i + 4 < bArr.length);
        return arrayList;
    }

    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        SendChannel.DefaultImpls.close$default(this.f, null, 1, null);
        if (this.b != 2) {
            try {
                ((net.luminis.quic.stream.e) this.a.y).e.g();
            } catch (Throwable unused) {
            }
        }
        Job job = this.h;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        this.g.getClass();
    }
}
