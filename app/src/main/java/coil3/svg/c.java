package coil3.svg;

import android.util.Log;
import androidx.work.impl.k;
import com.caverock.androidsvg.h2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.internal.g {
    public static final c e = new c();

    public final k a(h hVar) {
        InputStream inputStreamV = hVar.V();
        h2 h2Var = new h2();
        h2Var.a = null;
        h2Var.b = null;
        h2Var.c = false;
        h2Var.e = false;
        h2Var.f = null;
        h2Var.g = null;
        h2Var.h = false;
        h2Var.i = null;
        if (!inputStreamV.markSupported()) {
            inputStreamV = new BufferedInputStream(inputStreamV);
        }
        try {
            inputStreamV.mark(3);
            int i = inputStreamV.read() + (inputStreamV.read() << 8);
            inputStreamV.reset();
            if (i == 35615) {
                inputStreamV = new BufferedInputStream(new GZIPInputStream(inputStreamV));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamV.mark(4096);
            h2Var.B(inputStreamV);
            return new k(h2Var.a);
        } finally {
            try {
                inputStreamV.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return new j(1, coil3.svg.internal.a.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
