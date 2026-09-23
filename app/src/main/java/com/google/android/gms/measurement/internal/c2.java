package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final c2 c = new c2(100);
    public final EnumMap a;
    public final int b;

    public c2(int i) {
        EnumMap enumMap = new EnumMap(b2.class);
        this.a = enumMap;
        b2 b2Var = b2.AD_STORAGE;
        z1 z1Var = z1.UNINITIALIZED;
        enumMap.put(b2Var, z1Var);
        enumMap.put(b2.ANALYTICS_STORAGE, z1Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static c2 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new c2(i);
        }
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.e) {
            enumMap.put(b2Var, d(bundle.getString(b2Var.e)));
        }
        return new c2(enumMap, i);
    }

    public static c2 c(int i, String str) {
        EnumMap enumMap = new EnumMap(b2.class);
        b2[] b2VarArr = a2.STORAGE.e;
        for (int i2 = 0; i2 < b2VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            b2 b2Var = b2VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(b2Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(b2Var, z1.UNINITIALIZED);
            }
        }
        return new c2(enumMap, i);
    }

    public static z1 d(String str) {
        z1 z1Var = z1.UNINITIALIZED;
        if (str == null) {
            return z1Var;
        }
        if (str.equals("granted")) {
            return z1.GRANTED;
        }
        return str.equals("denied") ? z1.DENIED : z1Var;
    }

    public static z1 e(char c2) {
        if (c2 == '+') {
            return z1.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? z1.UNINITIALIZED : z1.GRANTED;
        }
        return z1.DENIED;
    }

    public static char h(z1 z1Var) {
        if (z1Var == null) {
            return '-';
        }
        int iOrdinal = z1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            for (b2 b2Var : a2.STORAGE.e) {
                if (this.a.get(b2Var) == c2Var.a.get(b2Var)) {
                }
            }
            if (this.b == c2Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (b2 b2Var : a2.STORAGE.e) {
            z1 z1Var = (z1) this.a.get(b2Var);
            char c2 = '-';
            if (z1Var != null && (iOrdinal = z1Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (b2 b2Var : a2.STORAGE.e) {
            sb.append(h((z1) this.a.get(b2Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((z1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(b2 b2Var) {
        return ((z1) this.a.get(b2Var)) != z1.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final c2 j(c2 c2Var) {
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.e) {
            z1 z1Var = (z1) this.a.get(b2Var);
            z1 z1Var2 = (z1) c2Var.a.get(b2Var);
            if (z1Var == null) {
                z1Var = z1Var2;
            } else if (z1Var2 != null) {
                z1 z1Var3 = z1.UNINITIALIZED;
                if (z1Var == z1Var3) {
                    z1Var = z1Var2;
                } else if (z1Var2 != z1Var3) {
                    z1 z1Var4 = z1.POLICY;
                    if (z1Var == z1Var4) {
                        z1Var = z1Var2;
                    } else if (z1Var2 != z1Var4) {
                        z1 z1Var5 = z1.DENIED;
                        z1Var = (z1Var == z1Var5 || z1Var2 == z1Var5) ? z1Var5 : z1.GRANTED;
                    }
                }
            }
            if (z1Var != null) {
                enumMap.put(b2Var, z1Var);
            }
        }
        return new c2(enumMap, 100);
    }

    public final c2 k(c2 c2Var) {
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.STORAGE.e) {
            z1 z1Var = (z1) this.a.get(b2Var);
            if (z1Var == z1.UNINITIALIZED) {
                z1Var = (z1) c2Var.a.get(b2Var);
            }
            if (z1Var != null) {
                enumMap.put(b2Var, z1Var);
            }
        }
        return new c2(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (b2 b2Var : a2.STORAGE.e) {
            sb.append(",");
            sb.append(b2Var.e);
            sb.append("=");
            z1 z1Var = (z1) this.a.get(b2Var);
            if (z1Var == null) {
                z1Var = z1.UNINITIALIZED;
            }
            sb.append(z1Var);
        }
        return sb.toString();
    }

    public c2(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(b2.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
