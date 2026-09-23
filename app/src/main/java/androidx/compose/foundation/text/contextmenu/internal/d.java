package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.a) {
            case 0:
                ((androidx.compose.foundation.text.contextmenu.data.d) this.b).d.invoke(((e) this.c).a);
                break;
            default:
                s.a((Context) this.b, (TextClassification) this.c);
                break;
        }
        return true;
    }
}
