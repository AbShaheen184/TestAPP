package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.v;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements v {
    @Override // kotlin.jvm.functions.v
    public final Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, s sVar, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        d dVar = (d) obj2;
        q qVar = (q) obj3;
        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        o oVar = o.b;
        if (i2 == 0) {
            i = (sVar.f(oVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= sVar.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= sVar.g(zBooleanValue) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= sVar.f(dVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((iIntValue & 24576) == 0) {
            i |= sVar.h(qVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= sVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (sVar.T(i & 1, (599187 & i) != 599186)) {
            m.c(str, zBooleanValue, dVar, oVar, qVar, aVar, sVar, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            sVar.W();
        }
        return y.a;
    }
}
