package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ b1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(b1 b1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                t0 t0Var = new t0(this.z, dVar, 0);
                long j = ((androidx.compose.ui.geometry.b) obj).a;
                return t0Var;
            case 1:
                return new t0(this.z, dVar, 1);
            default:
                return new t0(this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                long j = ((androidx.compose.ui.geometry.b) obj).a;
                return new t0(this.z, (kotlin.coroutines.d) obj2, 0).invokeSuspend(kotlin.y.a);
            case 1:
                return ((t0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((t0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i;
        androidx.compose.ui.text.g gVarQ;
        androidx.compose.ui.platform.g1 g1Var;
        Object f1Var;
        Object gVar;
        CharSequence text;
        Annotation[] annotationArr;
        int i2;
        Parcel parcel;
        androidx.compose.ui.text.g gVar2;
        int i3 = this.e;
        androidx.compose.foundation.text.g0 g0Var = androidx.compose.foundation.text.g0.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        b1 b1Var = this.z;
        kotlin.y yVar = kotlin.y.a;
        switch (i3) {
            case 0:
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i4 != 2) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return yVar;
                }
                kotlin.a.e(obj);
                this.y = 1;
                if (b1Var.s(this) == aVar) {
                    return aVar;
                }
                kotlin.k kVarA = b1.a(b1Var);
                if (kVarA != null) {
                    String str = (String) kVarA.e;
                    long j = ((androidx.compose.ui.text.l0) kVarA.y).a;
                    n nVar = b1Var.j;
                    if (nVar != null) {
                        this.y = 2;
                        t tVar = (t) nVar;
                        Object objWithContext = (str.length() == 0 || androidx.compose.ui.text.l0.c(j)) ? yVar : BuildersKt.withContext(tVar.a, new r(tVar, new p(j, tVar, str, null), null), this);
                        if (objWithContext != aVar) {
                            objWithContext = yVar;
                        }
                        if (objWithContext == aVar) {
                            return aVar;
                        }
                    }
                }
                return yVar;
            case 1:
                int i5 = this.y;
                if (i5 == 0) {
                    kotlin.a.e(obj);
                    if (androidx.compose.ui.text.l0.c(b1Var.n().b) || !b1Var.j() || (b1Var.f instanceof androidx.compose.ui.text.input.r)) {
                        i = 1;
                        gVarQ = null;
                    } else {
                        gVarQ = com.imsdk.a.q(b1Var.n());
                        androidx.compose.ui.text.g gVarS = com.imsdk.a.s(b1Var.n(), b1Var.n().a.y.length());
                        androidx.compose.ui.text.g gVarR = com.imsdk.a.r(b1Var.n(), b1Var.n().a.y.length());
                        androidx.compose.ui.text.d dVar = new androidx.compose.ui.text.d(gVarS);
                        dVar.a(gVarR);
                        androidx.compose.ui.text.g gVarB = dVar.b();
                        int iF = androidx.compose.ui.text.l0.f(b1Var.n().b);
                        b1Var.c.invoke(b1.e(gVarB, androidx.compose.ui.text.d0.b(iF, iF)));
                        b1Var.q(g0Var);
                        i = 1;
                        b1Var.a.e = true;
                    }
                    if (gVarQ != null && (g1Var = b1Var.h) != null) {
                        androidx.compose.ui.platform.f1 f1VarA = androidx.compose.foundation.internal.d.a(gVarQ);
                        this.y = i;
                        ((androidx.compose.ui.platform.g) g1Var).a(f1VarA);
                        if (yVar == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar;
            default:
                int i6 = this.y;
                if (i6 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.ui.platform.g1 g1Var2 = b1Var.h;
                    if (g1Var2 != null) {
                        this.y = 1;
                        ClipData primaryClip = ((androidx.compose.ui.platform.g) g1Var2).a.a.getPrimaryClip();
                        f1Var = primaryClip != null ? new androidx.compose.ui.platform.f1(primaryClip) : null;
                        if (f1Var == aVar) {
                            return aVar;
                        }
                    }
                    return yVar;
                }
                if (i6 == 1) {
                    kotlin.a.e(obj);
                    f1Var = obj;
                } else {
                    if (i6 != 2) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    gVar = obj;
                }
                gVar2 = (androidx.compose.ui.text.g) gVar;
                if (gVar2 != null && b1Var.j()) {
                    androidx.compose.ui.text.d dVar2 = new androidx.compose.ui.text.d(com.imsdk.a.s(b1Var.n(), b1Var.n().a.y.length()));
                    dVar2.a(gVar2);
                    androidx.compose.ui.text.g gVarB2 = dVar2.b();
                    androidx.compose.ui.text.g gVarR2 = com.imsdk.a.r(b1Var.n(), b1Var.n().a.y.length());
                    androidx.compose.ui.text.d dVar3 = new androidx.compose.ui.text.d(gVarB2);
                    dVar3.a(gVarR2);
                    androidx.compose.ui.text.g gVarB3 = dVar3.b();
                    int length = gVar2.y.length() + androidx.compose.ui.text.l0.f(b1Var.n().b);
                    b1Var.c.invoke(b1.e(gVarB3, androidx.compose.ui.text.d0.b(length, length)));
                    b1Var.q(g0Var);
                    b1Var.a.e = true;
                }
                return yVar;
                androidx.compose.ui.platform.f1 f1Var2 = (androidx.compose.ui.platform.f1) f1Var;
                if (f1Var2 != null) {
                    this.y = 2;
                    ClipData clipData = f1Var2.a;
                    int i7 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        gVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr2 = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr2.getClass();
                        int length2 = annotationArr2.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr2[i8];
                                if (kotlin.jvm.internal.l.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    androidx.compose.foundation.internal.a aVar2 = new androidx.compose.foundation.internal.a();
                                    Parcel parcelObtain = Parcel.obtain();
                                    aVar2.a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    Parcel parcel2 = aVar2.a;
                                    long jA = androidx.compose.ui.graphics.t.i;
                                    long jA2 = jA;
                                    long jB = androidx.compose.ui.unit.o.c;
                                    long jB2 = jB;
                                    androidx.compose.ui.text.font.k kVar = null;
                                    androidx.compose.ui.text.font.i iVar = null;
                                    androidx.compose.ui.text.font.j jVar = null;
                                    String string = null;
                                    androidx.compose.ui.text.style.a aVar3 = null;
                                    androidx.compose.ui.text.style.p pVar = null;
                                    androidx.compose.ui.text.style.l lVar = null;
                                    androidx.compose.ui.graphics.m0 m0Var = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b = parcel2.readByte();
                                            i7 = i7;
                                            if (b == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jA = aVar2.a();
                                                }
                                            } else if (b == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jB = aVar2.b();
                                                }
                                            } else if (b == 3) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    kVar = new androidx.compose.ui.text.font.k(parcel2.readInt());
                                                }
                                            } else if (b == 4) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte b2 = parcel2.readByte();
                                                    iVar = new androidx.compose.ui.text.font.i((b2 != 0 && b2 == 1) ? 1 : i7);
                                                }
                                            } else if (b == 5) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte b3 = parcel2.readByte();
                                                    if (b3 == 0) {
                                                        i2 = i7;
                                                    } else if (b3 == 1) {
                                                        i2 = 65535;
                                                    } else if (b3 == 3) {
                                                        i2 = 2;
                                                    } else if (b3 == 2) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i7;
                                                    }
                                                    jVar = new androidx.compose.ui.text.font.j(i2);
                                                }
                                            } else if (b == 6) {
                                                string = parcel2.readString();
                                            } else if (b == 7) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jB2 = aVar2.b();
                                                }
                                            } else if (b == 8) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    aVar3 = new androidx.compose.ui.text.style.a(parcel2.readFloat());
                                                }
                                            } else if (b == 9) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    pVar = new androidx.compose.ui.text.style.p(parcel2.readFloat(), parcel2.readFloat());
                                                }
                                            } else if (b == 10) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jA2 = aVar2.a();
                                                }
                                            } else if (b != 11) {
                                                parcel = parcel2;
                                                if (b != 12) {
                                                    parcel2 = parcel;
                                                } else if (parcel.dataAvail() >= 20) {
                                                    annotationArr2 = annotationArr2;
                                                    parcel2 = parcel;
                                                    m0Var = new androidx.compose.ui.graphics.m0(aVar2.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                }
                                            } else if (parcel2.dataAvail() >= 4) {
                                                int i9 = parcel2.readInt();
                                                int i10 = (i9 & 2) != 0 ? 1 : i7;
                                                int i11 = (i9 & 1) != 0 ? 1 : i7;
                                                androidx.compose.ui.text.style.l lVar2 = androidx.compose.ui.text.style.l.d;
                                                parcel = parcel2;
                                                androidx.compose.ui.text.style.l lVar3 = androidx.compose.ui.text.style.l.c;
                                                if (i10 != 0 && i11 != 0) {
                                                    List listK = kotlin.collections.q.k(lVar2, lVar3);
                                                    Integer numValueOf = Integer.valueOf(i7);
                                                    int size = listK.size();
                                                    int i12 = i7;
                                                    while (i12 < size) {
                                                        numValueOf = Integer.valueOf(((androidx.compose.ui.text.style.l) listK.get(i12)).a | numValueOf.intValue());
                                                        i12++;
                                                        listK = listK;
                                                    }
                                                    lVar = new androidx.compose.ui.text.style.l(numValueOf.intValue());
                                                } else if (i10 != 0) {
                                                    lVar = lVar2;
                                                } else {
                                                    if (i11 == 0) {
                                                        lVar3 = androidx.compose.ui.text.style.l.b;
                                                    }
                                                    lVar = lVar3;
                                                }
                                                parcel2 = parcel;
                                            }
                                        } else {
                                            i7 = i7;
                                        }
                                    }
                                    annotationArr = annotationArr2;
                                    arrayList.add(new androidx.compose.ui.text.e(new androidx.compose.ui.text.e0(jA, jB, kVar, iVar, jVar, (androidx.compose.ui.text.font.r) null, string, jB2, aVar3, pVar, (androidx.compose.ui.text.intl.b) null, jA2, lVar, m0Var, 49152), spanStart, spanEnd));
                                } else {
                                    i7 = i7;
                                    annotationArr = annotationArr2;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    text = text;
                                    annotationArr2 = annotationArr;
                                    spanned = spanned;
                                    i7 = i7;
                                }
                            }
                        } else {
                            text = text;
                        }
                        String string2 = text.toString();
                        androidx.compose.ui.text.g gVar3 = androidx.compose.ui.text.h.a;
                        gVar = new androidx.compose.ui.text.g(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        gVar = new androidx.compose.ui.text.g(text.toString());
                    }
                    if (gVar == aVar) {
                        return aVar;
                    }
                    gVar2 = (androidx.compose.ui.text.g) gVar;
                    if (gVar2 != null) {
                        androidx.compose.ui.text.d dVar4 = new androidx.compose.ui.text.d(com.imsdk.a.s(b1Var.n(), b1Var.n().a.y.length()));
                        dVar4.a(gVar2);
                        androidx.compose.ui.text.g gVarB4 = dVar4.b();
                        androidx.compose.ui.text.g gVarR3 = com.imsdk.a.r(b1Var.n(), b1Var.n().a.y.length());
                        androidx.compose.ui.text.d dVar5 = new androidx.compose.ui.text.d(gVarB4);
                        dVar5.a(gVarR3);
                        androidx.compose.ui.text.g gVarB5 = dVar5.b();
                        int length3 = gVar2.y.length() + androidx.compose.ui.text.l0.f(b1Var.n().b);
                        b1Var.c.invoke(b1.e(gVarB5, androidx.compose.ui.text.d0.b(length3, length3)));
                        b1Var.q(g0Var);
                        b1Var.a.e = true;
                    }
                }
                return yVar;
        }
    }
}
