package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.app.mlounge.R;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends androidx.activity.r {
    public kotlin.jvm.functions.a B;
    public i3 C;
    public long D;
    public final View E;
    public final q2 F;

    public u2(kotlin.jvm.functions.a aVar, i3 i3Var, long j, View view, androidx.compose.ui.unit.m mVar, androidx.compose.ui.unit.c cVar, UUID uuid, androidx.compose.animation.core.d dVar, CoroutineScope coroutineScope) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.B = aVar;
        this.C = i3Var;
        this.D = j;
        this.E = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            kotlinx.coroutines.future.a.u("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        kotlin.math.a.M(window, false);
        q2 q2Var = new q2(getContext());
        q2Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        q2Var.setClipChildren(false);
        q2Var.setElevation(cVar.W(f));
        q2Var.setOutlineProvider(new r2(0));
        this.F = q2Var;
        setContentView(q2Var);
        q2Var.setTag(R.id.view_tree_lifecycle_owner, androidx.lifecycle.m0.d(view));
        q2Var.setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.m0.e(view));
        q2Var.setTag(R.id.view_tree_saved_state_registry_owner, com.google.firebase.b.z(view));
        d(this.B, this.C, this.D, mVar);
        com.google.firebase.platforminfo.d dVar2 = new com.google.firebase.platforminfo.d(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        org.jsoup.helper.n d2Var = i >= 35 ? new androidx.core.view.d2(window, dVar2) : i >= 30 ? new androidx.core.view.c2(window, dVar2) : i >= 26 ? new androidx.core.view.b2(window, dVar2) : new androidx.core.view.a2(window, dVar2);
        this.C.getClass();
        d2Var.L(q.q(this.D));
        this.C.getClass();
        d2Var.K(q.q(this.D));
        getOnBackPressedDispatcher().a(new t2(this.C.b, coroutineScope, dVar, new androidx.activity.w(this, 18)), this);
    }

    public final void d(kotlin.jvm.functions.a aVar, i3 i3Var, long j, androidx.compose.ui.unit.m mVar) {
        this.B = aVar;
        this.C = i3Var;
        this.D = j;
        androidx.compose.ui.window.e0 e0Var = i3Var.a;
        ViewGroup.LayoutParams layoutParams = this.E.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = e0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    coil3.g.a();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            coil3.g.a();
            return;
        }
        this.F.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.B.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
