package org.msgpack.core;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Charset a = Charset.forName("UTF-8");
    public static final f b = new f();
    public static final g c;

    static {
        g gVar = new g();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        gVar.e = codingErrorAction;
        gVar.y = codingErrorAction;
        gVar.z = Integer.MAX_VALUE;
        gVar.A = 8192;
        gVar.B = 8192;
        c = gVar;
    }

    public static i a(byte[] bArr) {
        g gVar = c;
        gVar.getClass();
        MessageBuffer messageBufferWrap = MessageBuffer.wrap(bArr, 0, bArr.length);
        org.msgpack.core.buffer.a aVar = new org.msgpack.core.buffer.a();
        aVar.e = messageBufferWrap;
        if (messageBufferWrap == null) {
            aVar.y = true;
        } else {
            aVar.y = false;
        }
        return new i(aVar, gVar);
    }
}
