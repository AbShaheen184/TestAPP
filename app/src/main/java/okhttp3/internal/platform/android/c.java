package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.c0;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = y.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(y.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(okhttp3.internal.http2.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(okhttp3.internal.concurrent.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = c0.o(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int iMin;
        String strE0 = (String) b.get(str);
        if (strE0 == null) {
            strE0 = kotlin.text.k.e0(23, str);
        }
        if (Log.isLoggable(strE0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iG = kotlin.text.k.G(str2, '\n', i2, 4);
                if (iG == -1) {
                    iG = length;
                }
                while (true) {
                    iMin = Math.min(iG, i2 + 4000);
                    Log.println(i, strE0, str2.substring(i2, iMin));
                    if (iMin >= iG) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.a);
        }
    }
}
