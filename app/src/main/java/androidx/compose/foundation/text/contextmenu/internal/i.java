package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.j1;
import androidx.compose.foundation.m1;
import androidx.compose.foundation.o1;
import kotlin.y;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.compose.foundation.text.contextmenu.provider.f {
    public final View a;
    public final kotlin.jvm.functions.l b;
    public final kotlin.jvm.functions.a c;
    public final o1 d = new o1();
    public final androidx.compose.runtime.snapshots.t e = new androidx.compose.runtime.snapshots.t(new a(this, 0));
    public final a f = new a(this, 1);
    public final a g = new a(this, 2);
    public ActionMode h;
    public g i;
    public Runnable j;

    public i(View view, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar) {
        this.a = view;
        this.b = lVar;
        this.c = aVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.f
    public final Object a(androidx.compose.foundation.text.contextmenu.provider.e eVar, kotlin.coroutines.jvm.internal.i iVar) {
        h hVar = new h(this, eVar, null, 0);
        o1 o1Var = this.d;
        o1Var.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new m1(j1.e, o1Var, hVar, null), iVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }
}
