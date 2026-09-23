package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, int i) {
        super(0);
        this.y = i;
        this.z = uVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.window.layout.util.g gVar;
        int actionMasked;
        int i = this.y;
        u uVar = this.z;
        switch (i) {
            case 0:
                Context context = uVar.getContext();
                Context baseContext = context;
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
                            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                            if (contextWrapper.getBaseContext() != null) {
                                baseContext = contextWrapper.getBaseContext();
                            }
                        }
                    }
                    baseContext = null;
                }
                if (baseContext == null) {
                    Configuration configuration = context.getResources().getConfiguration();
                    androidx.compose.ui.unit.e eVarA = org.jsoup.helper.n.a(context);
                    long jB = android.support.v4.media.session.b.b(configuration.screenWidthDp, configuration.screenHeightDp);
                    long jM0 = eVarA.m0(jB);
                    return new n1((((long) ((int) Float.intBitsToFloat((int) (jM0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jM0 >> 32)))) << 32), jB);
                }
                androidx.window.layout.c.a.getClass();
                androidx.window.layout.b bVar = androidx.window.layout.b.a;
                androidx.window.layout.d dVar = androidx.window.layout.b.b;
                dVar.getClass();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    gVar = androidx.window.layout.util.f.c;
                } else {
                    gVar = i2 >= 30 ? androidx.window.layout.util.d.c : androidx.window.layout.util.c.g;
                }
                androidx.window.core.a aVar = gVar.a((ContextWrapper) baseContext, dVar.b).a;
                aVar.getClass();
                int iWidth = new Rect(aVar.a, aVar.b, aVar.c, aVar.d).width();
                aVar.getClass();
                long jHeight = (4294967295L & ((long) new Rect(aVar.a, aVar.b, aVar.c, aVar.d).height())) | (((long) iWidth) << 32);
                return new n1(jHeight, org.jsoup.helper.n.a(baseContext).o(coil3.network.g.F(jHeight)));
            case 1:
                MotionEvent motionEvent = uVar.R0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    uVar.S0 = SystemClock.uptimeMillis();
                    uVar.post(uVar.X0);
                }
                return kotlin.y.a;
            default:
                return uVar.get_viewTreeOwners();
        }
    }
}
