package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.collection.j0;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.text.contextmenu.data.d;
import androidx.compose.foundation.text.contextmenu.data.f;
import androidx.compose.ui.text.l0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final w1 a = new w1(18);
    public static final a b = new a(0);

    public static final void a(androidx.compose.foundation.text.contextmenu.builder.a aVar, Context context, boolean z, String str, long j) {
        if (l0.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context2 = context;
        List list = (List) a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        j0 j0Var = aVar.a;
        j0 j0Var2 = aVar.a;
        f fVar = f.b;
        j0Var.a(fVar);
        int size = list.size();
        int i = 0;
        while (i < size) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            j0Var2.a(new d(new androidx.compose.foundation.text.contextmenu.data.a(i), resolveInfo.loadLabel(packageManager).toString(), 0, new c(context2, resolveInfo, z, str, j)));
            i++;
            context2 = context;
        }
        j0Var2.a(fVar);
    }
}
