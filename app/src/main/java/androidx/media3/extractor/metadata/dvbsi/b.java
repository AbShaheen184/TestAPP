package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.h0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends _COROUTINE.a {
    public final /* synthetic */ int m;

    public static androidx.media3.extractor.metadata.emsg.a d0(v vVar) {
        String strU = vVar.u();
        strU.getClass();
        String strU2 = vVar.u();
        strU2.getClass();
        return new androidx.media3.extractor.metadata.emsg.a(strU, strU2, vVar.t(), vVar.t(), Arrays.copyOfRange(vVar.a, vVar.b, vVar.c));
    }

    @Override // _COROUTINE.a
    public final h0 F(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        switch (this.m) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                u uVar = new u(byteBuffer.array(), byteBuffer.limit());
                int i = 12;
                uVar.o(12);
                int iD = (uVar.d() + uVar.g(12)) - 4;
                uVar.o(44);
                uVar.p(uVar.g(12));
                uVar.o(16);
                ArrayList arrayList = new ArrayList();
                while (uVar.d() < iD) {
                    uVar.o(48);
                    int iG = uVar.g(8);
                    uVar.o(4);
                    int iD2 = uVar.d() + uVar.g(i);
                    String str = null;
                    String str2 = null;
                    while (uVar.d() < iD2) {
                        int iG2 = uVar.g(8);
                        int iG3 = uVar.g(8);
                        int iD3 = uVar.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = uVar.g(16);
                            uVar.o(8);
                            if (iG4 == 3) {
                                while (uVar.d() < iD3) {
                                    int iG5 = uVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    uVar.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = uVar.g(8);
                                    for (int i2 = 0; i2 < iG6; i2++) {
                                        uVar.p(uVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            uVar.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        uVar.m(iD3 * 8);
                    }
                    uVar.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(iG, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new h0(arrayList);
            default:
                return new h0(d0(new v(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
