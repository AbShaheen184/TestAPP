package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.layout.i1;
import androidx.compose.runtime.s1;
import androidx.compose.ui.platform.m0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v a = new v();

    public static String a(TextClassification textClassification, androidx.compose.runtime.s sVar) {
        sVar.b0(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        sVar.p(false);
        return strValueOf;
    }

    public static void b(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            r.a(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static String c(RemoteAction remoteAction, androidx.compose.runtime.s sVar) {
        sVar.b0(-1376593684);
        String string = remoteAction.getTitle().toString();
        sVar.p(false);
        return string;
    }

    public static void f(androidx.compose.foundation.contextmenu.g gVar, Context context, androidx.compose.foundation.text.contextmenu.data.h hVar) {
        if (context == null) {
            return;
        }
        int i = hVar.c;
        TextClassification textClassification = hVar.b;
        if (i < 0) {
            g0 g0Var = new g0(textClassification, 7);
            Drawable icon = textClassification.getIcon();
            androidx.compose.foundation.contextmenu.g.b(gVar, g0Var, icon != null ? new androidx.compose.runtime.internal.f(true, -1123224187, new m(icon, 1)) : null, new androidx.activity.compose.f(11, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            androidx.compose.foundation.contextmenu.g.b(gVar, new g0(remoteAction, 8), ((i == 0) || remoteAction.shouldShowIcon()) ? new androidx.compose.runtime.internal.f(true, -1261173016, new u(remoteAction)) : null, new androidx.activity.w(remoteAction, 12), 6);
        }
    }

    public final void d(Drawable drawable, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(257732500);
        int i2 = (sVar.h(drawable) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.r rVarM = i1.m(androidx.compose.ui.o.b, androidx.compose.foundation.contextmenu.h.j);
            boolean zH = sVar.h(drawable);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.activity.compose.g(drawable, 17);
                sVar.l0(objQ);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.c(rVarM, (kotlin.jvm.functions.l) objQ), sVar, 0);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(this, drawable, i, 7);
        }
    }

    public final void e(final Icon icon, androidx.compose.runtime.s sVar, final int i) {
        s1 s1VarT;
        kotlin.jvm.functions.p pVar;
        sVar.c0(2116504409);
        int i2 = (sVar.h(icon) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) sVar.j(m0.b);
            boolean zF = sVar.f(icon) | sVar.f(context);
            Object objQ = sVar.Q();
            if (zF || objQ == androidx.compose.runtime.n.a) {
                objQ = icon.loadDrawable(context);
                sVar.l0(objQ);
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                s1VarT = sVar.t();
                if (s1VarT == null) {
                    return;
                }
                final int i3 = 0;
                pVar = new kotlin.jvm.functions.p(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.t
                    public final /* synthetic */ int e;
                    public final /* synthetic */ v y;
                    public final /* synthetic */ Icon z;

                    {
                        this.e = i3;
                        this.y = this;
                    }

                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.e;
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                this.y.e(this.z, sVar2, androidx.compose.runtime.t.A(49));
                                break;
                            default:
                                this.y.e(this.z, sVar2, androidx.compose.runtime.t.A(49));
                                break;
                        }
                        return y.a;
                    }
                };
            } else {
                d(drawable, sVar, 48);
            }
            s1VarT.d = pVar;
        }
        sVar.W();
        s1VarT = sVar.t();
        if (s1VarT != null) {
            final int i4 = 1;
            pVar = new kotlin.jvm.functions.p(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.t
                public final /* synthetic */ int e;
                public final /* synthetic */ v y;
                public final /* synthetic */ Icon z;

                {
                    this.e = i4;
                    this.y = this;
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.e;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.y.e(this.z, sVar2, androidx.compose.runtime.t.A(49));
                            break;
                        default:
                            this.y.e(this.z, sVar2, androidx.compose.runtime.t.A(49));
                            break;
                    }
                    return y.a;
                }
            };
            s1VarT.d = pVar;
        }
    }
}
