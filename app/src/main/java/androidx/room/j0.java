package androidx.room;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ i[] E;
    public final /* synthetic */ k0 F;
    public final /* synthetic */ a0 G;
    public i[] e;
    public k0 y;
    public a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i[] iVarArr, k0 k0Var, a0 a0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = iVarArr;
        this.F = k0Var;
        this.G = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new j0(this.E, this.F, this.G, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((androidx.room.coroutines.k) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.D
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.C
            int r3 = r10.B
            int r4 = r10.A
            androidx.room.a0 r5 = r10.z
            androidx.room.k0 r6 = r10.y
            androidx.room.i[] r7 = r10.e
            kotlin.a.e(r11)
            goto L57
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r11)
        L1f:
            r11 = 0
            return r11
        L21:
            kotlin.a.e(r11)
            androidx.room.i[] r11 = r10.E
            int r0 = r11.length
            r3 = 0
            androidx.room.k0 r4 = r10.F
            androidx.room.a0 r5 = r10.G
            r7 = r11
            r11 = r3
            r6 = r4
        L2f:
            if (r3 >= r0) goto L75
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L72
            kotlin.coroutines.intrinsics.a r9 = kotlin.coroutines.intrinsics.a.e
            if (r4 == r2) goto L5d
            if (r4 != r1) goto L59
            r10.e = r7
            r10.y = r6
            r10.z = r5
            r10.A = r8
            r10.B = r3
            r10.C = r0
            r10.D = r1
            java.lang.Object r11 = androidx.room.k0.d(r6, r5, r11, r10)
            if (r11 != r9) goto L56
            goto L71
        L56:
            r4 = r8
        L57:
            r11 = r4
            goto L73
        L59:
            coil3.g.a()
            goto L1f
        L5d:
            r10.e = r7
            r10.y = r6
            r10.z = r5
            r10.A = r8
            r10.B = r3
            r10.C = r0
            r10.D = r2
            java.lang.Object r11 = androidx.room.k0.c(r6, r5, r11, r10)
            if (r11 != r9) goto L56
        L71:
            return r9
        L72:
            r11 = r8
        L73:
            int r3 = r3 + r2
            goto L2f
        L75:
            kotlin.y r11 = kotlin.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
