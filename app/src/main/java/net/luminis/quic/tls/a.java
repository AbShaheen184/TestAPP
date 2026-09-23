package net.luminis.quic.tls;

import androidx.compose.ui.res.e;
import com.google.android.material.internal.k;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.h;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.luminis.quic.impl.m;
import net.luminis.quic.impl.n;
import net.luminis.tls.extension.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final n a;
    public final int b;
    public byte[] c;
    public final m d;

    public a(n nVar) {
        this.a = nVar;
        this.d = new m();
    }

    public static void c(int i, long j, ByteBuffer byteBuffer) {
        kotlin.coroutines.g.e(byteBuffer, androidx.constraintlayout.core.g.e(i));
        int iD = kotlin.coroutines.g.d(j, byteBuffer);
        kotlin.coroutines.g.e(byteBuffer, iD);
        kotlin.coroutines.g.d(j, byteBuffer);
    }

    public static void d(ByteBuffer byteBuffer, int i, byte[] bArr) {
        kotlin.coroutines.g.e(byteBuffer, i);
        kotlin.coroutines.g.e(byteBuffer, bArr.length);
        byteBuffer.put(bArr);
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        byte[] bArr;
        byte[] bArr2;
        if (this.c == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0 + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            n nVar = n.b;
            n nVar2 = this.a;
            byteBufferAllocate.putShort((short) ((nVar2.equals(nVar) || nVar2.b()) ? 57 : 65445));
            byteBufferAllocate.putShort((short) 0);
            int i = this.b;
            m mVar = this.d;
            if (i == 2) {
                d(byteBufferAllocate, 0, mVar.a);
            }
            c(2, mVar.b, byteBufferAllocate);
            if (i == 2 && (bArr2 = mVar.p) != null) {
                d(byteBufferAllocate, 2, bArr2);
            }
            c(4, mVar.o, byteBufferAllocate);
            c(5, mVar.c, byteBufferAllocate);
            c(6, mVar.d, byteBufferAllocate);
            c(7, mVar.e, byteBufferAllocate);
            c(8, mVar.f, byteBufferAllocate);
            c(9, mVar.g, byteBufferAllocate);
            c(10, mVar.h, byteBufferAllocate);
            c(11, mVar.i, byteBufferAllocate);
            c(12, mVar.k, byteBufferAllocate);
            if (mVar.j) {
                kotlin.coroutines.g.e(byteBufferAllocate, 12);
                kotlin.coroutines.g.e(byteBufferAllocate, 0);
            }
            c(15, mVar.l, byteBufferAllocate);
            d(byteBufferAllocate, 15, mVar.m);
            if (i == 2 && (bArr = mVar.n) != null) {
                d(byteBufferAllocate, 16, bArr);
            }
            k kVar = mVar.q;
            if (kVar != null) {
                ArrayList arrayList = (ArrayList) kVar.z;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((arrayList.size() * 4) + 4);
                byteBufferAllocate2.put(((n) kVar.y).a());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byteBufferAllocate2.put(((n) it.next()).a());
                }
                d(byteBufferAllocate, 17, byteBufferAllocate2.array());
            }
            int iPosition = byteBufferAllocate.position();
            byteBufferAllocate.putShort(2, (short) (iPosition - 4));
            this.c = new byte[iPosition];
            byteBufferAllocate.get(this.c);
        }
        return this.c;
    }

    public final void e(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) throws net.luminis.tls.alert.a {
        boolean z;
        long jN = kotlin.coroutines.g.n(byteBuffer);
        int iM = kotlin.coroutines.g.m(byteBuffer);
        if (byteBuffer.remaining() < iM) {
            kotlinx.coroutines.future.a.g("Invalid transport parameter extension");
            return;
        }
        int iPosition = byteBuffer.position();
        int iCharCount = 0;
        long j = 0;
        m mVar = this.d;
        if (jN == j) {
            byte[] bArr = new byte[iM];
            byteBuffer.get(bArr);
            aVar.getClass();
            mVar.a = bArr;
        } else if (jN == 1) {
            long jN2 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.b = jN2;
        } else if (jN == 2) {
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            "- stateless reset token: ".concat(h.c(bArr2));
            aVar.getClass();
            mVar.p = bArr2;
        } else if (jN == 3) {
            int iM2 = kotlin.coroutines.g.m(byteBuffer);
            aVar.getClass();
            mVar.o = iM2;
        } else if (jN == 4) {
            long jN3 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.c = jN3;
        } else if (jN == 5) {
            long jN4 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.d = jN4;
        } else if (jN == 6) {
            long jN5 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.e = jN5;
        } else if (jN == 7) {
            long jN6 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.f = jN6;
        } else if (jN == 8) {
            long jN7 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.g = jN7;
        } else if (jN == 9) {
            long jN8 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.h = jN8;
        } else if (jN == 10) {
            int iM3 = kotlin.coroutines.g.m(byteBuffer);
            aVar.getClass();
            mVar.i = iM3;
        } else if (jN == 11) {
            int iM4 = kotlin.coroutines.g.m(byteBuffer);
            aVar.getClass();
            mVar.k = iM4;
        } else if (jN == 12) {
            aVar.getClass();
            mVar.j = true;
        } else if (jN == 13) {
            try {
                byte[] bArr3 = new byte[4];
                byteBuffer.get(bArr3);
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else {
                        if (bArr3[i] != 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
                InetAddress byAddress = !z ? InetAddress.getByAddress(bArr3) : null;
                byteBuffer.get();
                byteBuffer.get();
                byte[] bArr4 = new byte[16];
                byteBuffer.get(bArr4);
                int i2 = 0;
                while (true) {
                    if (i2 >= 16) {
                        iCharCount = 1;
                        break;
                    } else if (bArr4[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                InetAddress byAddress2 = iCharCount == 0 ? InetAddress.getByAddress(bArr4) : null;
                byteBuffer.get();
                byteBuffer.get();
                if (byAddress == null && byAddress2 == null) {
                    throw new e("Preferred address: no valid IP address", 15);
                }
                byteBuffer.get(new byte[byteBuffer.get()]);
                byteBuffer.get(new byte[16]);
                mVar.getClass();
            } catch (UnknownHostException unused) {
                kotlinx.coroutines.future.a.a();
                return;
            }
        } else if (jN == 14) {
            long jN9 = kotlin.coroutines.g.n(byteBuffer);
            aVar.getClass();
            mVar.l = (int) jN9;
        } else if (jN == 15) {
            byte[] bArr5 = new byte[iM];
            byteBuffer.get(bArr5);
            "- initial source connection id: ".concat(h.c(bArr5));
            aVar.getClass();
            mVar.m = bArr5;
        } else if (jN == 16) {
            byte[] bArr6 = new byte[iM];
            byteBuffer.get(bArr6);
            "- retry source connection id: ".concat(h.c(bArr6));
            aVar.getClass();
            mVar.n = bArr6;
        } else if (jN != 17) {
            String str = jN == 32 ? "datagram" : "";
            if (jN == 64) {
                str = "multi-path";
            }
            if (jN == 4183) {
                str = "loss-bits";
            }
            if (jN == 5950) {
                str = "discard";
            }
            if (jN == 10930) {
                str = "grease-quic-bit";
            }
            if (jN == 29015) {
                str = "timestamp";
            }
            String str2 = jN != 29016 ? str : "timestamp";
            if (jN == 29659) {
                str2 = "version-negotiation";
            }
            if (jN == 56858) {
                str2 = "delayed-ack";
            }
            if (jN == 16741339) {
                str2 = "version-information-4-13";
            }
            String str3 = jN != 4278378010L ? str2 : "delayed-ack";
            int length = str3.length();
            while (true) {
                if (iCharCount >= length) {
                    String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(jN), Integer.valueOf(iM));
                    break;
                }
                int iCodePointAt = str3.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(jN), Integer.valueOf(iM), str3);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            aVar.getClass();
            byteBuffer.get(new byte[iM]);
        } else {
            if (iM % 4 != 0 || iM < 4) {
                kotlinx.coroutines.future.a.g("invalid parameters size");
                return;
            }
            int i3 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            while (iCharCount < (iM / 4) - 1) {
                arrayList.add(new n(byteBuffer.getInt()));
                iCharCount++;
            }
            mVar.q = new k(18, new n(i3), arrayList);
        }
        if (byteBuffer.position() - iPosition == iM) {
            return;
        }
        kotlinx.coroutines.future.a.g("inconsistent size in transport parameter");
    }

    public a(n nVar, m mVar) {
        this.a = nVar;
        this.d = mVar;
        this.b = 1;
    }
}
