package androidx.navigation.compose;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.StatFs;
import android.widget.Toast;
import com.app.mlounge.CinemaHQApp;
import com.google.android.gms.measurement.internal.b0;
import java.io.File;
import kotlin.collections.i0;
import kotlin.y;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ o(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int length;
        File file;
        int iG;
        int i = this.e;
        y yVar = y.a;
        Context context = this.y;
        switch (i) {
            case 0:
                return com.imsdk.a.h(context);
            case 1:
                int i2 = CinemaHQApp.D;
                okio.t tVar = okio.k.e;
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File file2 = new File("image_cache");
                String path = file2.getPath();
                path.getClass();
                char c = File.separatorChar;
                int iG2 = kotlin.text.k.G(path, c, 0, 4);
                if (iG2 == 0) {
                    if (path.length() <= 1 || path.charAt(1) != c || (iG = kotlin.text.k.G(path, c, 2, 4)) < 0) {
                        length = 1;
                    } else {
                        int iG3 = kotlin.text.k.G(path, c, iG + 1, 4);
                        length = iG3 >= 0 ? iG3 + 1 : path.length();
                    }
                } else if (iG2 <= 0 || path.charAt(iG2 - 1) != ':') {
                    length = (iG2 == -1 && kotlin.text.k.D(path, ':')) ? path.length() : 0;
                } else {
                    length = iG2 + 1;
                }
                if (!(length > 0)) {
                    String string = cacheDir.toString();
                    string.getClass();
                    if ((string.length() == 0) || kotlin.text.k.D(string, c)) {
                        file = new File(string + file2);
                    } else {
                        file = new File(string + c + file2);
                    }
                    file2 = file;
                }
                String str = x.y;
                x xVarE = b0.e(file2);
                long jE = 10485760;
                try {
                    File file3 = xVarE.toFile();
                    file3.mkdir();
                    StatFs statFs = new StatFs(file3.getAbsolutePath());
                    jE = i0.e((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new coil3.disk.g(jE, tVar, xVarE);
            case 2:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://appsalt.com/sdk/appsalt-sdk-privacy-policy/"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (Exception unused2) {
                    Toast.makeText(context, "No browser available", 0).show();
                }
                return yVar;
            case 3:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alldebrid.com/apikeys/")));
                return yVar;
            case 4:
                File fileK = com.google.firebase.b.k(context, "firebaseSessions/sessionConfigsDataStore.data");
                com.google.firebase.sessions.p.b(fileK);
                return fileK;
            default:
                File fileK2 = com.google.firebase.b.k(context, "firebaseSessions/sessionDataStore.data");
                com.google.firebase.sessions.p.b(fileK2);
                return fileK2;
        }
    }
}
