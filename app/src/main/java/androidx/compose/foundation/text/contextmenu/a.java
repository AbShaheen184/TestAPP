package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.data.g;
import androidx.compose.foundation.text.contextmenu.internal.n;
import androidx.compose.foundation.text.contextmenu.provider.e;
import androidx.compose.ui.text.l0;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.functions.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements s {
    public final /* synthetic */ int e;

    @Override // kotlin.jvm.functions.s
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                l0 l0Var = (l0) obj5;
                String string = ((CharSequence) obj4).subSequence(l0.f(l0Var.a), l0.e(l0Var.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj3;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? sVar.f(gVar) : sVar.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? sVar.f(eVar) : sVar.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
                }
                if (sVar.T(i & 1, (i & 1171) != 1170)) {
                    n.c(gVar, eVar, aVar, sVar, i & 1022);
                } else {
                    sVar.W();
                }
                break;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj3;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = ((iIntValue2 & 8) == 0 ? sVar2.f(gVar2) : sVar2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? sVar2.f(eVar2) : sVar2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= sVar2.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128;
                }
                if (sVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
                    n.c(gVar2, eVar2, aVar2, sVar2, i2 & 1022);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }
}
