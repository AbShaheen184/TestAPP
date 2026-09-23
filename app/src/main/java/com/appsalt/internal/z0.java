package com.appsalt.internal;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final net.luminis.quic.impl.i a;
    public final kotlin.coroutines.j b;
    public final Channel c;
    public final Channel d;

    public z0(net.luminis.quic.impl.i iVar, kotlin.coroutines.j jVar) {
        this.a = iVar;
        this.b = jVar;
        Channel channelChannel$default = ChannelKt.Channel$default(-2, null, null, 6, null);
        this.c = channelChannel$default;
        this.d = channelChannel$default;
        iVar.W.h = new y0(this, 0);
    }
}
