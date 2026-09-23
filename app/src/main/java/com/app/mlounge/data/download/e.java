package com.app.mlounge.data.download;

import com.app.mlounge.data.repository.r;
import com.google.android.material.internal.k;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ int e = 2;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, String str, int i, String str2, String str3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = rVar;
        this.B = str;
        this.z = i;
        this.C = str2;
        this.D = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e((h) this.C, dVar);
            case 1:
                return new e((r) this.A, (String) this.B, this.z, (String) this.C, (String) this.D, dVar);
            default:
                com.i4studio.subslib.model.b bVar = (com.i4studio.subslib.model.b) this.C;
                return new e(this.z, (k) this.D, bVar, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f7 A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:50:0x0189, B:95:0x0293, B:97:0x0297, B:99:0x029e, B:101:0x02ad, B:103:0x02b5, B:105:0x02c3, B:106:0x02e0, B:109:0x02e6, B:111:0x02f9, B:113:0x02ff, B:115:0x0305, B:117:0x030b, B:119:0x030e, B:121:0x0316, B:123:0x0320, B:110:0x02ec, B:56:0x01a9, B:70:0x01f1, B:72:0x01f7, B:74:0x0203, B:82:0x0224, B:80:0x0219, B:92:0x0279, B:57:0x01ae, B:63:0x01c7, B:64:0x01d2, B:66:0x01d8, B:68:0x01e2, B:69:0x01e6, B:60:0x01b7), top: B:131:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0203 A[Catch: Exception -> 0x0191, TRY_LEAVE, TryCatch #1 {Exception -> 0x0191, blocks: (B:50:0x0189, B:95:0x0293, B:97:0x0297, B:99:0x029e, B:101:0x02ad, B:103:0x02b5, B:105:0x02c3, B:106:0x02e0, B:109:0x02e6, B:111:0x02f9, B:113:0x02ff, B:115:0x0305, B:117:0x030b, B:119:0x030e, B:121:0x0316, B:123:0x0320, B:110:0x02ec, B:56:0x01a9, B:70:0x01f1, B:72:0x01f7, B:74:0x0203, B:82:0x0224, B:80:0x0219, B:92:0x0279, B:57:0x01ae, B:63:0x01c7, B:64:0x01d2, B:66:0x01d8, B:68:0x01e2, B:69:0x01e6, B:60:0x01b7), top: B:131:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x0217  */
    /* JADX WARN: Code duplicated, block: B:80:0x0219 A[Catch: Exception -> 0x0191, TRY_ENTER, TryCatch #1 {Exception -> 0x0191, blocks: (B:50:0x0189, B:95:0x0293, B:97:0x0297, B:99:0x029e, B:101:0x02ad, B:103:0x02b5, B:105:0x02c3, B:106:0x02e0, B:109:0x02e6, B:111:0x02f9, B:113:0x02ff, B:115:0x0305, B:117:0x030b, B:119:0x030e, B:121:0x0316, B:123:0x0320, B:110:0x02ec, B:56:0x01a9, B:70:0x01f1, B:72:0x01f7, B:74:0x0203, B:82:0x0224, B:80:0x0219, B:92:0x0279, B:57:0x01ae, B:63:0x01c7, B:64:0x01d2, B:66:0x01d8, B:68:0x01e2, B:69:0x01e6, B:60:0x01b7), top: B:131:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0224 A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:50:0x0189, B:95:0x0293, B:97:0x0297, B:99:0x029e, B:101:0x02ad, B:103:0x02b5, B:105:0x02c3, B:106:0x02e0, B:109:0x02e6, B:111:0x02f9, B:113:0x02ff, B:115:0x0305, B:117:0x030b, B:119:0x030e, B:121:0x0316, B:123:0x0320, B:110:0x02ec, B:56:0x01a9, B:70:0x01f1, B:72:0x01f7, B:74:0x0203, B:82:0x0224, B:80:0x0219, B:92:0x0279, B:57:0x01ae, B:63:0x01c7, B:64:0x01d2, B:66:0x01d8, B:68:0x01e2, B:69:0x01e6, B:60:0x01b7), top: B:131:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0260  */
    /* JADX WARN: Code duplicated, block: B:85:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0264  */
    /* JADX WARN: Code duplicated, block: B:88:0x0265  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x0279 A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:50:0x0189, B:95:0x0293, B:97:0x0297, B:99:0x029e, B:101:0x02ad, B:103:0x02b5, B:105:0x02c3, B:106:0x02e0, B:109:0x02e6, B:111:0x02f9, B:113:0x02ff, B:115:0x0305, B:117:0x030b, B:119:0x030e, B:121:0x0316, B:123:0x0320, B:110:0x02ec, B:56:0x01a9, B:70:0x01f1, B:72:0x01f7, B:74:0x0203, B:82:0x0224, B:80:0x0219, B:92:0x0279, B:57:0x01ae, B:63:0x01c7, B:64:0x01d2, B:66:0x01d8, B:68:0x01e2, B:69:0x01e6, B:60:0x01b7), top: B:131:0x017b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0265 -> B:89:0x026a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.download.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, k kVar, com.i4studio.subslib.model.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = bVar;
        this.D = kVar;
        this.z = i;
    }
}
