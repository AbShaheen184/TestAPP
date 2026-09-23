package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import androidx.core.view.x;
import androidx.emoji2.text.z;
import androidx.lifecycle.j;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.media3.common.p;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.w;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i, x, androidx.lifecycle.viewmodel.b, androidx.media3.extractor.g, com.google.android.gms.dynamite.d, w {
    public final /* synthetic */ int e;
    public static final /* synthetic */ e y = new e(22);
    public static final /* synthetic */ e z = new e(23);
    public static final /* synthetic */ e A = new e(24);
    public static final /* synthetic */ e B = new e(25);
    public static final /* synthetic */ e C = new e(26);
    public static final /* synthetic */ e D = new e(27);
    public static final /* synthetic */ e E = new e(28);
    public static final /* synthetic */ e F = new e(29);

    public e(Context context) {
        this.e = 9;
    }

    public static w0 b(y0 y0Var, u0 u0Var, int i) {
        if ((i & 2) != 0) {
            u0Var = y0Var instanceof j ? ((j) y0Var).getDefaultViewModelProviderFactory() : androidx.lifecycle.viewmodel.internal.b.a;
        }
        androidx.lifecycle.viewmodel.c defaultViewModelCreationExtras = y0Var instanceof j ? ((j) y0Var).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b;
        u0Var.getClass();
        defaultViewModelCreationExtras.getClass();
        return new w0(y0Var.getViewModelStore(), u0Var, defaultViewModelCreationExtras);
    }

    public static byte[] c(h0 h0Var, long j) {
        p pVar = new p(13);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(h0Var.size());
        Iterator<E> it = h0Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) pVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static Path e(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static boolean f(androidx.emoji2.viewsintegration.b bVar, Editable editable, int i, int i2, boolean z2) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z3) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z3) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z3 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z4) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z4) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z4 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                z[] zVarArr = (z[]) editable.getSpans(selectionStart, iMin, z.class);
                if (zVarArr != null && zVarArr.length > 0) {
                    for (z zVar : zVarArr) {
                        int spanStart = editable.getSpanStart(zVar);
                        int spanEnd = editable.getSpanEnd(zVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 22:
                return new Boolean(((Boolean) k3.b.get()).booleanValue());
            case 23:
                List list = f0.a;
                e3.y.get();
                return (Long) f3.a.g(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 24:
                List list2 = f0.a;
                return (String) o3.b.get();
            case 25:
                List list3 = f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
            case 26:
                List list4 = f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
            case 27:
                List list5 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 28:
                List list6 = f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            default:
                List list7 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
        }
    }

    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j g(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        int iC;
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        int iD = cVar.d(context, str);
        jVar.a = iD;
        int i = 1;
        int i2 = 0;
        if (iD != 0) {
            iC = cVar.c(context, str, false);
            jVar.b = iC;
        } else {
            iC = cVar.c(context, str, true);
            jVar.b = iC;
        }
        int i3 = jVar.a;
        if (i3 == 0) {
            if (iC == 0) {
                i = 0;
            }
            jVar.c = i;
            return jVar;
        }
        i2 = i3;
        if (i2 >= iC) {
            i = -1;
        }
        jVar.c = i;
        return jVar;
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i) {
        this.e = i;
    }

    @Override // androidx.media3.extractor.g
    public long d(long j) {
        return j;
    }

    @Override // androidx.core.view.x
    public void onScrollLimit(int i, int i2, int i3, boolean z2) {
    }

    @Override // androidx.core.view.x
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
