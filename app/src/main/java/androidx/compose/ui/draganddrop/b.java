package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.y1;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnDragListener, d {
    public final g a;
    public final androidx.collection.h b;
    public final a c;

    public b() {
        g gVar = new g();
        gVar.N = 0L;
        this.a = gVar;
        this.b = new androidx.collection.h(0);
        this.c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(dragEvent, 14);
        int action = dragEvent.getAction();
        y1 y1Var = y1.e;
        androidx.collection.h hVar = this.b;
        g gVar = this.a;
        switch (action) {
            case 1:
                v vVar = new v();
                f fVar = new f(eVar, gVar, vVar);
                if (fVar.invoke(gVar) == y1Var) {
                    l.B(gVar, fVar);
                }
                boolean z = vVar.e;
                hVar.getClass();
                androidx.collection.b bVar = new androidx.collection.b(hVar);
                while (bVar.hasNext()) {
                    ((g) bVar.next()).Q0();
                }
                return z;
            case 2:
                gVar.P0(eVar);
                return false;
            case 3:
                return gVar.M0();
            case 4:
                androidx.compose.animation.e eVar2 = new androidx.compose.animation.e(eVar, 2);
                if (eVar2.invoke(gVar) == y1Var) {
                    l.B(gVar, eVar2);
                }
                hVar.clear();
                return false;
            case 5:
                gVar.N0();
                return false;
            case 6:
                gVar.O0();
                return false;
            default:
                return false;
        }
    }
}
