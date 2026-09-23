package com.app.mlounge.data.iptv;

import android.content.Context;
import com.app.mlounge.data.providers.h1;
import com.app.mlounge.data.providers.i1;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new a0(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x002b, B:28:0x008f, B:30:0x0095, B:31:0x00ae, B:33:0x00b4, B:34:0x00c2, B:38:0x00de, B:15:0x003c, B:27:0x007f, B:16:0x0040, B:22:0x0063, B:24:0x006c, B:19:0x0047), top: B:42:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[Catch: Exception -> 0x002f, LOOP:1: B:31:0x00ae->B:33:0x00b4, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:8:0x002b, B:28:0x008f, B:30:0x0095, B:31:0x00ae, B:33:0x00b4, B:34:0x00c2, B:38:0x00de, B:15:0x003c, B:27:0x007f, B:16:0x0040, B:22:0x0063, B:24:0x006c, B:19:0x0047), top: B:42:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x008f->B:47:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        c0 c0Var;
        int i;
        Iterator it;
        com.app.mlounge.data.local.dao.i iVar;
        ArrayList arrayList;
        Iterator it2;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                i1 i1VarH = this.this$0.h();
                this.label = 1;
                i1VarH.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new h1(i1VarH, null), this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                kotlin.a.e(obj);
            } else if (i2 == 2) {
                list = (List) this.L$0;
                kotlin.a.e(obj);
                ArrayList arrayListW = kotlin.collections.p.w(1000, list);
                list2 = list;
                c0Var = this.this$0;
                i = 0;
                it = arrayListW.iterator();
            } else {
                if (i2 != 3) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$3;
                c0Var = (c0) this.L$2;
                list2 = (List) this.L$0;
                kotlin.a.e(obj);
            }
            while (it.hasNext()) {
                List list3 = (List) it.next();
                iVar = c0Var.channelDao;
                arrayList = new ArrayList(kotlin.collections.r.p(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(c0.f(c0Var, (IptvChannel) it2.next()));
                }
                this.L$0 = list2;
                this.L$1 = null;
                this.L$2 = c0Var;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 3;
                if (((com.app.mlounge.data.local.dao.j) iVar).b(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            list = list2;
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "PlaylistManager", "plutotv: " + list.size() + " channels");
            return new kotlin.k("plutotv", new Integer(list.size()));
            list = (List) obj;
            if (!list.isEmpty()) {
                com.app.mlounge.data.local.dao.i iVar2 = this.this$0.channelDao;
                this.L$0 = list;
                this.label = 2;
                if (((com.app.mlounge.data.local.dao.j) iVar2).a("plutotv", this) != aVar) {
                    ArrayList arrayListW2 = kotlin.collections.p.w(1000, list);
                    list2 = list;
                    c0Var = this.this$0;
                    i = 0;
                    it = arrayListW2.iterator();
                    while (it.hasNext()) {
                        List list4 = (List) it.next();
                        iVar = c0Var.channelDao;
                        arrayList = new ArrayList(kotlin.collections.r.p(list4, 10));
                        it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(c0.f(c0Var, (IptvChannel) it2.next()));
                        }
                        this.L$0 = list2;
                        this.L$1 = null;
                        this.L$2 = c0Var;
                        this.L$3 = it;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = i;
                        this.I$1 = 0;
                        this.label = 3;
                        if (((com.app.mlounge.data.local.dao.j) iVar).b(arrayList, this) == aVar) {
                        }
                    }
                    list = list2;
                }
                return aVar;
            }
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "PlaylistManager", "plutotv: " + list.size() + " channels");
            return new kotlin.k("plutotv", new Integer(list.size()));
        } catch (Exception e) {
            Context context3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", "PlaylistManager", "Failed to regenerate plutotv: " + e.getMessage());
            return new kotlin.k("plutotv", new Integer(0));
        }
    }
}
