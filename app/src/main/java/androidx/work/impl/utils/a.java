package androidx.work.impl.utils;

import android.app.Application;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                y yVarE = y.e();
                String str = f.b;
                String str2 = f.b;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (yVarE.a <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = g.a[i2];
            if (!kotlin.collections.o.b(i3, iArr)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    y yVarE2 = y.e();
                    String str4 = f.b;
                    String str5 = f.b;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (yVarE2.a <= 5) {
                        Log.w(str5, str6, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new f(networkRequestBuild);
    }

    public static String b() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static boolean c(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean d(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }
}
