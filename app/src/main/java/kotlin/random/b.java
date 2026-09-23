package kotlin.random;

import androidx.compose.ui.platform.q0;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final q0 y = new q0(5);

    @Override // kotlin.random.a
    public final Random f() {
        Object obj = this.y.get();
        obj.getClass();
        return (Random) obj;
    }
}
