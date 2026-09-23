package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ((androidx.navigationevent.m) this.b).a();
                break;
        }
    }
}
