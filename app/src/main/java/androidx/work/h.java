package androidx.work;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final LinkedHashMap a;

    public h(coil3.network.o oVar) {
        Map map = oVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kotlin.collections.p.c0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public void a(HashMap map) {
        Object[] objArr;
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(value.getClass());
                if (!eVarA.equals(kotlin.jvm.internal.a0.a(Boolean.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Byte.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Integer.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Long.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Float.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Double.TYPE)) && !eVarA.equals(kotlin.jvm.internal.a0.a(String.class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Boolean[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Byte[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Integer[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Long[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Float[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(Double[].class)) && !eVarA.equals(kotlin.jvm.internal.a0.a(String[].class))) {
                    int i = 0;
                    if (eVarA.equals(kotlin.jvm.internal.a0.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = j.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (eVarA.equals(kotlin.jvm.internal.a0.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = j.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (eVarA.equals(kotlin.jvm.internal.a0.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = j.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (eVarA.equals(kotlin.jvm.internal.a0.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = j.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (eVarA.equals(kotlin.jvm.internal.a0.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = j.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!eVarA.equals(kotlin.jvm.internal.a0.a(double[].class))) {
                            org.mozilla.javascript.typedarrays.c.c("Key ", str, " has invalid type ", eVarA);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = j.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public androidx.work.impl.j b(androidx.work.impl.model.j jVar) {
        jVar.getClass();
        return (androidx.work.impl.j) this.a.remove(jVar);
    }

    public List c(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (kotlin.jvm.internal.l.a(((androidx.work.impl.model.j) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((androidx.work.impl.model.j) it.next());
        }
        return kotlin.collections.p.b0(linkedHashMap.values());
    }

    public void d(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, kotlin.collections.q.l(str));
    }

    public androidx.work.impl.j e(androidx.work.impl.model.j jVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object jVar2 = linkedHashMap.get(jVar);
        if (jVar2 == null) {
            jVar2 = new androidx.work.impl.j(jVar);
            linkedHashMap.put(jVar, jVar2);
        }
        return (androidx.work.impl.j) jVar2;
    }

    public h(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
