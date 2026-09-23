package retrofit2.converter.gson;

import androidx.datastore.core.i1;
import com.google.gson.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.collections.o;
import kotlin.text.i;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.u;
import okio.f;
import retrofit2.m;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {
    public static final u z;
    public final e e;
    public final com.google.gson.m y;

    static {
        i iVar = u.e;
        z = o.s("application/json; charset=UTF-8");
    }

    public b(e eVar, com.google.gson.m mVar) {
        this.e = eVar;
        this.y = mVar;
    }

    @Override // retrofit2.m
    public final Object c(Object obj) throws IOException {
        f fVar = new f();
        com.google.gson.stream.b bVarF = this.e.f(new OutputStreamWriter(new i1(fVar), StandardCharsets.UTF_8));
        this.y.c(bVarF, obj);
        bVarF.close();
        okio.i iVarL = fVar.l(fVar.y);
        int i = e0.a;
        iVarL.getClass();
        return new c0(z, iVarL);
    }
}
