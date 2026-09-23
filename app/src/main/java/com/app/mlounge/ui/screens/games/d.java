package com.app.mlounge.ui.screens.games;

import androidx.lifecycle.m0;
import androidx.room.coroutines.c0;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.viewmodel.r;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p {
    public final /* synthetic */ r e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = rVar;
        this.y = str;
        this.z = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d(this.e, this.y, this.z, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        y yVar = y.a;
        dVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        kotlin.a.e(obj);
        GamePlatform.Companion.getClass();
        Iterator<E> it = GamePlatform.f().iterator();
        do {
            boolean zHasNext = it.hasNext();
            str = this.y;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (!l.a(((GamePlatform) next).a(), str));
        GamePlatform gamePlatform = (GamePlatform) next;
        if (gamePlatform == null) {
            gamePlatform = GamePlatform.SNES;
        }
        r rVar = this.e;
        rVar.g(gamePlatform);
        androidx.lifecycle.viewmodel.internal.a aVarG = m0.g(rVar);
        String str2 = this.z;
        BuildersKt__Builders_commonKt.launch$default(aVarG, null, null, new c0(rVar, str2, null, 20), 3, null);
        Job job = rVar.L;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        rVar.L = BuildersKt__Builders_commonKt.launch$default(m0.g(rVar), null, null, new c0(rVar, str2, str, (kotlin.coroutines.d) null, 22), 3, null);
        return y.a;
    }
}
