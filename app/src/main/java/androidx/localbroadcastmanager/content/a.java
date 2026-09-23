package androidx.localbroadcastmanager.content;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.room.t;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        t[] tVarArr;
        androidx.media3.exoplayer.mediacodec.c cVar;
        ArrayDeque arrayDeque;
        switch (this.a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                c cVar2 = (c) this.b;
                do {
                    synchronized (cVar2.a) {
                        try {
                            size = cVar2.c.size();
                            if (size <= 0) {
                                return;
                            }
                            tVarArr = new t[size];
                            cVar2.c.toArray(tVarArr);
                            cVar2.c.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                t tVar = tVarArr[0];
                throw null;
            default:
                d dVar = (d) this.b;
                int i = message.what;
                androidx.media3.exoplayer.mediacodec.c cVar3 = null;
                if (i != 1) {
                    if (i == 2) {
                        cVar = (androidx.media3.exoplayer.mediacodec.c) message.obj;
                        int i2 = cVar.a;
                        MediaCodec.CryptoInfo cryptoInfo = cVar.c;
                        long j = cVar.d;
                        int i3 = cVar.e;
                        try {
                            if (Build.VERSION.SDK_INT < 31) {
                                synchronized (d.E) {
                                    dVar.e.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                                }
                            } else {
                                dVar.e.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                            break;
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = dVar.A;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i == 3) {
                        dVar.B.c();
                    } else if (i != 4) {
                        AtomicReference atomicReference2 = dVar.A;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            dVar.e.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = dVar.A;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (cVar3 != null) {
                        arrayDeque = d.D;
                        synchronized (arrayDeque) {
                            arrayDeque.add(cVar3);
                            break;
                        }
                        return;
                    }
                    return;
                }
                cVar = (androidx.media3.exoplayer.mediacodec.c) message.obj;
                try {
                    dVar.e.queueInputBuffer(cVar.a, 0, cVar.b, cVar.d, cVar.e);
                    break;
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference4 = dVar.A;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
                cVar3 = cVar;
                if (cVar3 != null) {
                    arrayDeque = d.D;
                    synchronized (arrayDeque) {
                        arrayDeque.add(cVar3);
                        return;
                    }
                }
                return;
        }
    }
}
