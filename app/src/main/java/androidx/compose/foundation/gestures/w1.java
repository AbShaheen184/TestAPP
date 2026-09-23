package androidx.compose.foundation.gestures;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.material3.h3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ w1(int i, androidx.compose.foundation.lazy.s sVar) {
        this.e = 4;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        String str;
        int i = this.e;
        int i2 = 0;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.ui.input.pointer.d0 d0Var = (androidx.compose.ui.input.pointer.d0) obj;
                if (d0Var != null && d0Var.a == 2) {
                    i2 = 1;
                }
                return Boolean.valueOf(i2 ^ 1);
            case 1:
                return ((androidx.compose.foundation.layout.v1) obj).c;
            case 2:
                ((Integer) obj).getClass();
                return null;
            case 3:
                List list = (List) obj;
                return new androidx.compose.foundation.lazy.y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 4:
                return yVar;
            case 5:
                List list2 = (List) obj;
                return new androidx.compose.foundation.lazy.grid.x(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 6:
                ((Integer) obj).getClass();
                androidx.compose.foundation.lazy.grid.n nVar = androidx.compose.foundation.lazy.grid.z.a;
                return kotlin.collections.w.e;
            case 7:
                ((Integer) obj).getClass();
                androidx.compose.foundation.lazy.grid.n nVar2 = androidx.compose.foundation.lazy.grid.z.a;
                return -1;
            case 8:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                ((androidx.compose.ui.semantics.a0) obj).b(androidx.compose.ui.semantics.w.e, yVar);
                return yVar;
            case 9:
                int i3 = androidx.compose.foundation.text.h.a;
                return yVar;
            case 10:
                return yVar;
            case 11:
                androidx.compose.foundation.text.selection.s0 s0Var = (androidx.compose.foundation.text.selection.s0) obj;
                String str2 = s0Var.g.y;
                long j = s0Var.f;
                int i4 = androidx.compose.ui.text.l0.c;
                int i5 = (int) (j & 4294967295L);
                if (i5 > 0) {
                    androidx.emoji2.text.j jVarP = androidx.compose.foundation.text.n0.p();
                    if (jVarP != null) {
                        int iB = jVarP.b(str2, i5 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i5 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str2, i5, -1);
                        }
                    } else if (i5 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str2, i5, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new androidx.compose.ui.text.input.e(((int) (s0Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 12:
                androidx.compose.foundation.text.selection.s0 s0Var2 = (androidx.compose.foundation.text.selection.s0) obj;
                String str3 = s0Var2.g.y;
                long j2 = s0Var2.f;
                int i6 = androidx.compose.ui.text.l0.c;
                int iL = androidx.compose.foundation.text.n0.l((int) (j2 & 4294967295L), str3);
                if (iL != -1) {
                    return new androidx.compose.ui.text.input.e(0, iL - ((int) (s0Var2.f & 4294967295L)));
                }
                return null;
            case 13:
                androidx.compose.foundation.text.selection.s0 s0Var3 = (androidx.compose.foundation.text.selection.s0) obj;
                Integer numE = s0Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = s0Var3.f;
                int i7 = androidx.compose.ui.text.l0.c;
                return new androidx.compose.ui.text.input.e(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 14:
                androidx.compose.foundation.text.selection.s0 s0Var4 = (androidx.compose.foundation.text.selection.s0) obj;
                Integer numD = s0Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = s0Var4.f;
                int i8 = androidx.compose.ui.text.l0.c;
                return new androidx.compose.ui.text.input.e(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 15:
                androidx.compose.foundation.text.selection.s0 s0Var5 = (androidx.compose.foundation.text.selection.s0) obj;
                Integer numC = s0Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = s0Var5.f;
                int i9 = androidx.compose.ui.text.l0.c;
                return new androidx.compose.ui.text.input.e(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 16:
                androidx.compose.foundation.text.selection.s0 s0Var6 = (androidx.compose.foundation.text.selection.s0) obj;
                Integer numB = s0Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = s0Var6.f;
                int i10 = androidx.compose.ui.text.l0.c;
                return new androidx.compose.ui.text.input.e(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 17:
                List list3 = (List) obj;
                Object obj2 = list3.get(1);
                obj2.getClass();
                o1 o1Var = ((Boolean) obj2).booleanValue() ? o1.e : o1.y;
                Object obj3 = list3.get(0);
                obj3.getClass();
                return new androidx.compose.foundation.text.i1(o1Var, ((Float) obj3).floatValue());
            case 18:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i2 < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i2++;
                }
                return arrayList;
            case 19:
                return yVar;
            case 20:
                return yVar;
            case 21:
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj;
                long j7 = bVar.a;
                return (9223372034707292159L & j7) != 9205357640488583168L ? new androidx.compose.animation.core.p(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L))) : androidx.compose.foundation.text.selection.m0.a;
            case 22:
                androidx.compose.animation.core.p pVar = (androidx.compose.animation.core.p) obj;
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(pVar.a)) << 32) | (((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L));
            case 23:
                androidx.compose.ui.node.k0 k0Var = (androidx.compose.ui.node.k0) obj;
                k0Var.c(androidx.compose.material3.q.b, (int) (k0Var.b().u() >> 32));
                k0Var.c(androidx.compose.material3.q.a, 0.0f);
                return yVar;
            case 24:
                androidx.compose.ui.semantics.y.d((androidx.compose.ui.semantics.a0) obj, 0);
                return yVar;
            case 25:
                androidx.compose.ui.semantics.y.d((androidx.compose.ui.semantics.a0) obj, 1);
                return yVar;
            case 26:
                float f = androidx.compose.material3.a2.a;
                return yVar;
            case 27:
                float f2 = h3.a;
                return Boolean.TRUE;
            case 28:
                androidx.compose.ui.semantics.y.g((androidx.compose.ui.semantics.a0) obj);
                return yVar;
            default:
                kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.y.a;
                ((androidx.compose.ui.semantics.a0) obj).b(androidx.compose.ui.semantics.w.x, yVar);
                return yVar;
        }
    }

    public /* synthetic */ w1(int i) {
        this.e = i;
    }
}
