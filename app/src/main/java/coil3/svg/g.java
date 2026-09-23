package coil3.svg;

import android.graphics.Canvas;
import android.util.Log;
import androidx.appcompat.widget.c2;
import androidx.work.impl.k;
import coil3.j;
import com.caverock.androidsvg.c0;
import com.caverock.androidsvg.l;
import com.caverock.androidsvg.q;
import com.caverock.androidsvg.q0;
import com.caverock.androidsvg.r0;
import com.caverock.androidsvg.v1;
import com.caverock.androidsvg.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements j {
    public final c2 a;
    public final k b;
    public final int c;
    public final int d;

    public g(c2 c2Var, k kVar, int i, int i2) {
        this.a = c2Var;
        this.b = kVar;
        this.c = i;
        this.d = i2;
    }

    @Override // coil3.j
    public final int a() {
        return this.d;
    }

    @Override // coil3.j
    public final int b() {
        return this.c;
    }

    @Override // coil3.j
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    @Override // coil3.j
    public final void d(Canvas canvas) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        c2 c2Var = this.a;
        c2Var.getClass();
        androidx.compose.ui.graphics.vector.g gVar = (androidx.compose.ui.graphics.vector.g) c2Var.z;
        k kVar = this.b;
        if (kVar == null) {
            kVar = new k(15);
        }
        if (((androidx.compose.ui.geometry.a) kVar.z) == null) {
            kVar.z = new androidx.compose.ui.geometry.a(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        x1 x1Var = new x1();
        x1Var.a = canvas;
        x1Var.b = c2Var;
        r0 r0Var = (r0) c2Var.y;
        if (r0Var == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        androidx.compose.ui.geometry.a aVar = r0Var.o;
        q qVar = r0Var.n;
        androidx.compose.ui.graphics.vector.g gVar2 = (androidx.compose.ui.graphics.vector.g) kVar.y;
        if (gVar2 == null) {
            z = false;
        } else {
            ArrayList arrayList2 = gVar2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            gVar.h((androidx.compose.ui.graphics.vector.g) kVar.y);
        }
        x1Var.c = new v1();
        x1Var.d = new Stack();
        x1Var.t0((v1) x1Var.c, q0.a());
        v1 v1Var = (v1) x1Var.c;
        v1Var.f = null;
        v1Var.h = false;
        ((Stack) x1Var.d).push(new v1(v1Var));
        x1Var.f = new Stack();
        x1Var.e = new Stack();
        Boolean bool = r0Var.d;
        if (bool != null) {
            ((v1) x1Var.c).h = bool.booleanValue();
        }
        x1Var.o0();
        androidx.compose.ui.geometry.a aVar2 = new androidx.compose.ui.geometry.a((androidx.compose.ui.geometry.a) kVar.z);
        c0 c0Var = r0Var.r;
        if (c0Var != null) {
            aVar2.d = c0Var.b(x1Var, aVar2.d);
        }
        c0 c0Var2 = r0Var.s;
        if (c0Var2 != null) {
            aVar2.e = c0Var2.b(x1Var, aVar2.e);
        }
        x1Var.c0(r0Var, aVar2, aVar, qVar);
        x1Var.n0();
        androidx.compose.ui.graphics.vector.g gVar3 = (androidx.compose.ui.graphics.vector.g) kVar.y;
        if (gVar3 != null) {
            ArrayList arrayList3 = gVar3.b;
            z2 = (arrayList3 != null ? arrayList3.size() : 0) > 0;
        }
        if (!z2 || (arrayList = gVar.b) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((l) it.next()).c == 2) {
                it.remove();
            }
        }
    }

    @Override // coil3.j
    public final long e() {
        return 2048L;
    }
}
