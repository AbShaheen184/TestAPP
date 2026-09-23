package androidx.media3.extractor.flv;

import androidx.compose.animation.core.j2;
import androidx.media3.common.util.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j2 {
    public long[] A;
    public long y;
    public long[] z;

    public static Serializable w(int i, v vVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(vVar.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(vVar.z() == 1);
        }
        if (i == 2) {
            return y(vVar);
        }
        if (i != 3) {
            if (i == 8) {
                return x(vVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(vVar.t()));
                vVar.N(2);
                return date;
            }
            int iD = vVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableW = w(vVar.z(), vVar);
                if (serializableW != null) {
                    arrayList.add(serializableW);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strY = y(vVar);
            int iZ = vVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableW2 = w(iZ, vVar);
            if (serializableW2 != null) {
                map.put(strY, serializableW2);
            }
        }
    }

    public static HashMap x(v vVar) {
        int iD = vVar.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strY = y(vVar);
            Serializable serializableW = w(vVar.z(), vVar);
            if (serializableW != null) {
                map.put(strY, serializableW);
            }
        }
        return map;
    }

    public static String y(v vVar) {
        int iG = vVar.G();
        int i = vVar.b;
        vVar.N(iG);
        return new String(vVar.a, i, iG);
    }
}
