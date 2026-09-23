package androidx.appcompat.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements View.OnTouchListener {
    public final /* synthetic */ m1 e;

    public l1(m1 m1Var) {
        this.e = m1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m1 m1Var = this.e;
        i1 i1Var = m1Var.K;
        Handler handler = m1Var.O;
        z zVar = m1Var.S;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && zVar != null && zVar.isShowing() && x >= 0 && x < zVar.getWidth() && y >= 0 && y < zVar.getHeight()) {
            handler.postDelayed(i1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(i1Var);
        return false;
    }
}
