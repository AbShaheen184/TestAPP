package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        androidx.compose.runtime.j.u(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.compose.runtime.j.z(map, "aqua", -16711681, -8388652, "aquamarine");
        androidx.compose.runtime.j.u(-983041, map, "azure", -657956, "beige");
        androidx.compose.runtime.j.u(-6972, map, "bisque", -16777216, "black");
        androidx.compose.runtime.j.u(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.compose.runtime.j.u(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.compose.runtime.j.u(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.compose.runtime.j.u(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.compose.runtime.j.u(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.compose.runtime.j.u(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.compose.runtime.j.z(map, "cyan", -16711681, -16777077, "darkblue");
        androidx.compose.runtime.j.u(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.compose.runtime.j.z(map, "darkgray", -5658199, -16751616, "darkgreen");
        androidx.compose.runtime.j.z(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.compose.runtime.j.u(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.compose.runtime.j.u(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.compose.runtime.j.u(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.compose.runtime.j.u(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.compose.runtime.j.z(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.compose.runtime.j.u(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.compose.runtime.j.z(map, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.compose.runtime.j.u(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.compose.runtime.j.z(map, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.compose.runtime.j.u(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.compose.runtime.j.u(-16744448, map, "green", -5374161, "greenyellow");
        androidx.compose.runtime.j.z(map, "grey", -8355712, -983056, "honeydew");
        androidx.compose.runtime.j.u(-38476, map, "hotpink", -3318692, "indianred");
        androidx.compose.runtime.j.u(-11861886, map, "indigo", -16, "ivory");
        androidx.compose.runtime.j.u(-989556, map, "khaki", -1644806, "lavender");
        androidx.compose.runtime.j.u(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.compose.runtime.j.u(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.compose.runtime.j.u(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.compose.runtime.j.u(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.compose.runtime.j.u(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.compose.runtime.j.z(map, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.compose.runtime.j.u(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.compose.runtime.j.u(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.compose.runtime.j.u(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.compose.runtime.j.u(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.compose.runtime.j.u(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.compose.runtime.j.u(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.compose.runtime.j.u(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.compose.runtime.j.u(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.compose.runtime.j.u(-8531, map, "navajowhite", -16777088, "navy");
        androidx.compose.runtime.j.u(-133658, map, "oldlace", -8355840, "olive");
        androidx.compose.runtime.j.u(-9728477, map, "olivedrab", -23296, "orange");
        androidx.compose.runtime.j.u(-47872, map, "orangered", -2461482, "orchid");
        androidx.compose.runtime.j.u(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.compose.runtime.j.u(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.compose.runtime.j.u(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.compose.runtime.j.u(-3308225, map, "peru", -16181, "pink");
        androidx.compose.runtime.j.u(-2252579, map, "plum", -5185306, "powderblue");
        androidx.compose.runtime.j.u(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.compose.runtime.j.u(-65536, map, "red", -4419697, "rosybrown");
        androidx.compose.runtime.j.u(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.compose.runtime.j.u(-360334, map, "salmon", -744352, "sandybrown");
        androidx.compose.runtime.j.u(-13726889, map, "seagreen", -2578, "seashell");
        androidx.compose.runtime.j.u(-6270419, map, "sienna", -4144960, "silver");
        androidx.compose.runtime.j.u(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.compose.runtime.j.z(map, "snow", -1286, -16711809, "springgreen");
        androidx.compose.runtime.j.u(-12156236, map, "steelblue", -2968436, "tan");
        androidx.compose.runtime.j.u(-16744320, map, "teal", -2572328, "thistle");
        androidx.compose.runtime.j.u(-40121, map, "tomato", 0, "transparent");
        androidx.compose.runtime.j.u(-12525360, map, "turquoise", -1146130, "violet");
        androidx.compose.runtime.j.u(-663885, map, "wheat", -1, "white");
        androidx.compose.runtime.j.u(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        _COROUTINE.a.o(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            kotlinx.coroutines.future.a.r();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(com.imsdk.a.B(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        kotlinx.coroutines.future.a.r();
        return 0;
    }
}
