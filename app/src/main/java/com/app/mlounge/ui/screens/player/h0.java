package com.app.mlounge.ui.screens.player;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements PointerInputEventHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kotlin.jvm.functions.l c;
    public final /* synthetic */ kotlin.jvm.functions.a d;

    public h0(long j, boolean z, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar) {
        this.a = j;
        this.b = z;
        this.c = lVar;
        this.d = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        Object objD = c3.d(yVar, new androidx.compose.foundation.text.contextmenu.c(this.a, this.b, this.c, yVar, this.d), dVar);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : kotlin.y.a;
    }
}
