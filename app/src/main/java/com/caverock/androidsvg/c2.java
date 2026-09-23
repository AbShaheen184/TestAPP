package com.caverock.androidsvg;

import java.util.HashMap;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        androidx.compose.runtime.j.u(1, map, "bolder", -1, "lighter");
        androidx.compose.runtime.j.u(100, map, "100", Context.VERSION_ES6, "200");
        map.put("300", 300);
        map.put("400", 400);
        androidx.compose.runtime.j.u(500, map, "500", 600, "600");
        androidx.compose.runtime.j.z(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
