package coil3.map;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil3.l;
import coil3.request.n;
import coil3.v;
import java.io.File;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public final v a(Object obj, n nVar) {
        switch (this.a) {
            case 0:
                return l.i(((Uri) obj).toString());
            case 1:
                return l.a(((File) obj).getPath());
            case 2:
                return l.a(((x) obj).e.u());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = nVar.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return l.i("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return l.i((String) obj);
        }
    }
}
