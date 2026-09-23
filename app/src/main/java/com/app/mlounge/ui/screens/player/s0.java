package com.app.mlounge.ui.screens.player;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(String str, int i, a1 a1Var, int i2, int i3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = str;
        this.z = i;
        this.A = a1Var;
        this.B = i2;
        this.C = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new s0(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        String str;
        Object value2;
        String str2;
        Integer numW;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = this.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                String str3 = this.y;
                Pattern patternCompile = Pattern.compile("\\s+S\\d+E\\d+.*", 66);
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(str3).replaceAll("");
                strReplaceAll.getClass();
                Pattern patternCompile2 = Pattern.compile("\\s+-\\s+Episode\\s+\\d+.*", 66);
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
                strReplaceAll2.getClass();
                String string = kotlin.text.k.g0(strReplaceAll2).toString();
                if (this.z > 1 || !kotlin.text.k.z(this.y, "Episode", true)) {
                    i = this.z;
                } else {
                    Pattern patternCompile3 = Pattern.compile("Episode\\s+(\\d+)", 66);
                    patternCompile3.getClass();
                    String str4 = this.y;
                    Matcher matcher = patternCompile3.matcher(str4);
                    matcher.getClass();
                    int iIntValue = 0;
                    kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str4);
                    if (gVarA != null && (str2 = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) != null && (numW = kotlin.text.r.w(str2)) != null) {
                        iIntValue = numW.intValue();
                    }
                    i = iIntValue + 1;
                }
                int i3 = i;
                if (kotlin.jvm.internal.l.a(this.A.p, "anime")) {
                    str = string + " - Episode " + i3;
                } else {
                    str = string + " S" + this.B + "E" + i3;
                }
                String str5 = str;
                MutableStateFlow mutableStateFlow = this.A.g;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, true, "Finding sources...", str5, false, false, false, 0, 0L, -939524097, 7)));
                this.A.g();
                androidx.media3.exoplayer.c0 c0Var = this.A.i;
                String strD0 = null;
                if (c0Var != null) {
                    c0Var.V();
                    c0Var.Q(null);
                    com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
                    long j = c0Var.n0.s;
                    c0Var.d0 = new androidx.media3.common.text.c(a1Var);
                }
                if (kotlin.jvm.internal.l.a(this.A.p, "anime")) {
                    String str6 = this.A.o;
                    strD0 = kotlin.text.k.d0(kotlin.text.k.W(str6, "anime:", str6), "-ep-");
                }
                a1 a1Var2 = this.A;
                com.app.mlounge.data.repository.r rVar = a1Var2.c;
                String str7 = a1Var2.p;
                String strValueOf = String.valueOf(this.C);
                int i4 = this.B;
                rVar.getClass();
                str7.getClass();
                strValueOf.getClass();
                string.getClass();
                Flow flowChannelFlow = FlowKt.channelFlow(new com.app.mlounge.data.repository.o(rVar, str7, strValueOf, i4, i3, strD0, string, null));
                r0 r0Var = new r0(this.A, 0);
                this.e = 1;
                if (flowChannelFlow.collect(r0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow2 = this.A.g;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, androidx.compose.runtime.j.i("Failed to load next episode: ", e.getMessage()), null, false, false, null, null, false, false, false, 0, 0L, -142606337, 7)));
        }
        return kotlin.y.a;
    }
}
