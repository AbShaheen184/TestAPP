package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public j(Path path) {
        this.a = path;
    }

    public static void a(j jVar, j jVar2) {
        Path path = jVar.a;
        if (jVar2 instanceof j) {
            path.addPath(jVar2.a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
        } else {
            com.google.firebase.platforminfo.b.n("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(j jVar, androidx.compose.ui.geometry.d dVar) {
        if (jVar.b == null) {
            jVar.b = new RectF();
        }
        RectF rectF = jVar.b;
        rectF.getClass();
        float f = dVar.a;
        long j = dVar.h;
        long j2 = dVar.g;
        long j3 = dVar.f;
        long j4 = dVar.e;
        rectF.set(f, dVar.b, dVar.c, dVar.d);
        if (jVar.c == null) {
            jVar.c = new float[8];
        }
        float[] fArr = jVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = jVar.a;
        RectF rectF2 = jVar.b;
        rectF2.getClass();
        float[] fArr2 = jVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final androidx.compose.ui.geometry.c c() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new androidx.compose.ui.geometry.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(j jVar, j jVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(jVar instanceof j)) {
            com.google.firebase.platforminfo.b.n("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = jVar.a;
        if (jVar2 instanceof j) {
            return this.a.op(path, jVar2.a, op);
        }
        com.google.firebase.platforminfo.b.n("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void e() {
        this.a.reset();
    }
}
