package androidx.compose.ui.platform;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.app.mlounge.data.music.e {
    public final /* synthetic */ androidx.core.view.b A;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(androidx.core.view.b bVar, int i) {
        super(22);
        this.z = i;
        this.A = bVar;
    }

    @Override // com.app.mlounge.data.music.e
    public void g(int i, androidx.core.view.accessibility.d dVar, String str, Bundle bundle) {
        switch (this.z) {
            case 0:
                ((a0) this.A).j(i, dVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0223  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:125:0x0272  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:146:0x030b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0311  */
    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0327  */
    /* JADX WARN: Code duplicated, block: B:156:0x0338  */
    /* JADX WARN: Code duplicated, block: B:159:0x036d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0378  */
    /* JADX WARN: Code duplicated, block: B:164:0x0388  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c0 A[LOOP:3: B:172:0x03ac->B:175:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:180:0x03df  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0415  */
    /* JADX WARN: Code duplicated, block: B:193:0x042d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0447  */
    /* JADX WARN: Code duplicated, block: B:199:0x0457  */
    /* JADX WARN: Code duplicated, block: B:207:0x047c  */
    /* JADX WARN: Code duplicated, block: B:209:0x048a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0491  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04df  */
    /* JADX WARN: Code duplicated, block: B:225:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:227:0x050b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0515  */
    /* JADX WARN: Code duplicated, block: B:233:0x0522  */
    /* JADX WARN: Code duplicated, block: B:234:0x0526  */
    /* JADX WARN: Code duplicated, block: B:237:0x053e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0544  */
    /* JADX WARN: Code duplicated, block: B:242:0x0548  */
    /* JADX WARN: Code duplicated, block: B:243:0x054d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0551  */
    /* JADX WARN: Code duplicated, block: B:248:0x055d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0563  */
    /* JADX WARN: Code duplicated, block: B:253:0x0569  */
    /* JADX WARN: Code duplicated, block: B:254:0x056d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0574  */
    /* JADX WARN: Code duplicated, block: B:259:0x057e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0590  */
    /* JADX WARN: Code duplicated, block: B:266:0x0598  */
    /* JADX WARN: Code duplicated, block: B:269:0x059e  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:277:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:279:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:282:0x05d2 A[LOOP:8: B:278:0x05b9->B:282:0x05d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x05da  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:291:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:294:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:296:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:297:0x0602  */
    /* JADX WARN: Code duplicated, block: B:300:0x0623  */
    /* JADX WARN: Code duplicated, block: B:303:0x0629  */
    /* JADX WARN: Code duplicated, block: B:304:0x062e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0648  */
    /* JADX WARN: Code duplicated, block: B:309:0x065b  */
    /* JADX WARN: Code duplicated, block: B:311:0x0665  */
    /* JADX WARN: Code duplicated, block: B:312:0x066c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0681  */
    /* JADX WARN: Code duplicated, block: B:318:0x0694  */
    /* JADX WARN: Code duplicated, block: B:320:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:325:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:326:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:327:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:332:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:333:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:335:0x06bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:339:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:342:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:347:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:349:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:352:0x070e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0720  */
    /* JADX WARN: Code duplicated, block: B:357:0x072a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:360:0x0740  */
    /* JADX WARN: Code duplicated, block: B:363:0x0757  */
    /* JADX WARN: Code duplicated, block: B:366:0x076d  */
    /* JADX WARN: Code duplicated, block: B:370:0x077f  */
    /* JADX WARN: Code duplicated, block: B:371:0x0786  */
    /* JADX WARN: Code duplicated, block: B:373:0x0789  */
    /* JADX WARN: Code duplicated, block: B:376:0x079c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:380:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:382:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:384:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:385:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:388:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:392:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:394:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:398:0x0801  */
    /* JADX WARN: Code duplicated, block: B:401:0x080e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0814  */
    /* JADX WARN: Code duplicated, block: B:405:0x081a  */
    /* JADX WARN: Code duplicated, block: B:410:0x082b  */
    /* JADX WARN: Code duplicated, block: B:413:0x082f A[LOOP:9: B:402:0x0812->B:413:0x082f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:416:0x0838  */
    /* JADX WARN: Code duplicated, block: B:418:0x083e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:420:0x0846  */
    /* JADX WARN: Code duplicated, block: B:422:0x084f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0852  */
    /* JADX WARN: Code duplicated, block: B:427:0x0857  */
    /* JADX WARN: Code duplicated, block: B:430:0x0866  */
    /* JADX WARN: Code duplicated, block: B:432:0x0876  */
    /* JADX WARN: Code duplicated, block: B:436:0x087f  */
    /* JADX WARN: Code duplicated, block: B:438:0x0882  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:443:0x0897  */
    /* JADX WARN: Code duplicated, block: B:446:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:450:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:452:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:453:0x08da  */
    /* JADX WARN: Code duplicated, block: B:456:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:459:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:463:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:464:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:467:0x0902  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:471:0x090c  */
    /* JADX WARN: Code duplicated, block: B:474:0x0911  */
    /* JADX WARN: Code duplicated, block: B:477:0x091c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0942  */
    /* JADX WARN: Code duplicated, block: B:485:0x094a  */
    /* JADX WARN: Code duplicated, block: B:486:0x095b  */
    /* JADX WARN: Code duplicated, block: B:489:0x096f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:491:0x0972  */
    /* JADX WARN: Code duplicated, block: B:493:0x097e  */
    /* JADX WARN: Code duplicated, block: B:495:0x0998  */
    /* JADX WARN: Code duplicated, block: B:499:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:501:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:502:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:504:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:508:0x09dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:511:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:513:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:515:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:546:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a71 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:561:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:575:0x0add  */
    /* JADX WARN: Code duplicated, block: B:578:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:581:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:583:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:589:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b42  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b70  */
    /* JADX WARN: Code duplicated, block: B:602:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:604:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:606:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:607:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:611:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:616:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:617:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:624:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:626:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:631:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:634:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:637:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:642:0x0c64  */
    /* JADX WARN: Code duplicated, block: B:653:0x0c7a  */
    /* JADX WARN: Code duplicated, block: B:655:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:674:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:692:0x099b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01af  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:499:0x09ad, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:653:0x0c7a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.w] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v148, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r6v153 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [androidx.compose.ui.platform.a0] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.platform.a0] */
    /* JADX WARN: Type inference failed for: r8v112, types: [androidx.compose.ui.node.f0] */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v114, types: [androidx.compose.ui.node.f0] */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.accessibility.AccessibilityNodeInfo] */
    @Override // com.app.mlounge.data.music.e
    public final androidx.core.view.accessibility.d i(int i) throws Throwable {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        androidx.core.view.accessibility.d dVar;
        int i2;
        Throwable th;
        androidx.compose.ui.semantics.s sVarL;
        Integer numValueOf;
        int iIntValue;
        androidx.collection.x xVar;
        androidx.collection.z0 z0Var;
        Resources resources;
        androidx.compose.ui.semantics.n nVar;
        androidx.collection.o0 o0Var;
        Object objG;
        androidx.compose.ui.semantics.j jVar;
        AccessibilityManager accessibilityManager;
        androidx.collection.z0 z0Var2;
        boolean zK;
        List listJ;
        int size;
        boolean z;
        int i3;
        int i4;
        ?? r9;
        androidx.compose.ui.text.g gVarI;
        androidx.collection.x xVar2;
        androidx.compose.ui.semantics.s sVar;
        androidx.collection.o0 o0Var2;
        androidx.compose.ui.semantics.j jVar2;
        androidx.compose.ui.semantics.n nVar2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ?? r1;
        ?? r0;
        androidx.compose.ui.semantics.z zVar;
        androidx.collection.o0 o0Var3;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        androidx.compose.ui.semantics.s sVar2;
        String strH;
        Object objG2;
        androidx.compose.ui.state.a aVar;
        Object objG3;
        Boolean bool;
        androidx.compose.ui.semantics.j jVar3;
        int i5;
        androidx.compose.ui.semantics.n nVar3;
        Object objG4;
        List list;
        ?? r4;
        Object objG5;
        String str;
        Object objG6;
        int i6;
        Object objG7;
        Integer num;
        int iIntValue2;
        androidx.compose.ui.semantics.z zVar2;
        a0 a0Var;
        boolean z2;
        ?? r7;
        androidx.compose.ui.semantics.a aVar2;
        char c;
        androidx.compose.ui.semantics.a aVar3;
        androidx.compose.ui.semantics.a aVar4;
        String strT;
        boolean z3;
        androidx.compose.ui.semantics.i iVar;
        float f;
        Object objG8;
        androidx.compose.ui.semantics.d dVar2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        ArrayList arrayList;
        Object objG9;
        float f2;
        boolean zG;
        int size2;
        List listJ2;
        int size3;
        int i7;
        androidx.compose.ui.semantics.s sVar3;
        androidx.compose.ui.semantics.k kVar;
        androidx.compose.ui.semantics.k kVar2;
        boolean z4;
        int iD;
        ?? r5;
        u uVar;
        int iD2;
        String str2;
        ?? r6;
        androidx.compose.ui.viewinterop.h hVarP;
        androidx.compose.ui.viewinterop.h hVarP2;
        androidx.compose.ui.semantics.a aVar5;
        androidx.compose.ui.semantics.a aVar6;
        androidx.compose.ui.semantics.a aVar7;
        androidx.compose.ui.semantics.z zVar3;
        List list2;
        int size4;
        androidx.collection.y yVar;
        androidx.collection.z0 z0Var3;
        androidx.collection.f0 f0Var;
        int[] iArr;
        int i8;
        int[] iArrCopyOf;
        int i9;
        int i10;
        ArrayList arrayList2;
        int i11;
        boolean z5;
        Object objG10;
        boolean z6;
        boolean z7;
        androidx.compose.ui.unit.m mVar;
        androidx.compose.ui.node.f0 f0Var2;
        boolean z8;
        androidx.core.view.accessibility.b bVar;
        boolean z9;
        androidx.core.view.accessibility.b bVar2;
        Object objG11;
        androidx.compose.ui.semantics.a aVar8;
        float f3;
        float f4;
        androidx.compose.ui.semantics.z zVar4;
        float f5;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        boolean z10;
        androidx.compose.ui.semantics.a aVar9;
        ?? r8;
        List list3;
        boolean z11;
        ?? V;
        androidx.compose.ui.semantics.n nVarX;
        boolean zA;
        Object objG12;
        androidx.compose.ui.semantics.n nVarX2;
        boolean z12;
        boolean z13;
        androidx.compose.ui.semantics.a aVar10;
        androidx.compose.ui.semantics.a aVar11;
        androidx.compose.ui.semantics.a aVar12;
        androidx.compose.ui.semantics.a aVar13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int iD3;
        androidx.compose.ui.semantics.s sVarL2;
        boolean zBooleanValue;
        androidx.compose.ui.semantics.n nVar4;
        androidx.compose.ui.semantics.z zVar5;
        boolean zBooleanValue2;
        Object objG13;
        androidx.compose.ui.unit.c density;
        androidx.appcompat.widget.c2 c2Var;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString2;
        ?? arrayList5;
        ?? arrayList6;
        int size5;
        int i12;
        ?? arrayList7;
        int size6;
        int i13;
        int size7;
        int i14;
        androidx.compose.ui.text.e eVar;
        int i15;
        Object obj;
        int i16;
        androidx.compose.ui.text.m mVar2;
        WeakHashMap weakHashMap;
        Object gVar;
        androidx.compose.ui.text.e eVar2;
        androidx.compose.ui.text.l lVar;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size8;
        int i17;
        androidx.compose.ui.text.e eVar3;
        androidx.compose.ui.text.n0 n0Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size9;
        int i18;
        androidx.compose.ui.text.e eVar4;
        androidx.compose.ui.text.o0 o0Var4;
        int i19;
        int i20;
        int size10;
        int i21;
        androidx.compose.ui.text.e eVar5;
        int size11;
        int i22;
        int i23;
        int i24;
        long jB;
        androidx.compose.ui.text.font.k kVar3;
        androidx.compose.ui.text.font.i iVar2;
        androidx.compose.ui.text.style.p pVar;
        long j;
        androidx.compose.ui.text.style.l lVar2;
        androidx.compose.ui.text.style.o oVar;
        androidx.compose.ui.text.style.o cVar;
        androidx.compose.ui.text.style.o oVar2;
        SpannableString spannableString3;
        androidx.compose.ui.text.font.k kVar4;
        int i25;
        int i26;
        int i27;
        androidx.compose.ui.semantics.s sVar4;
        androidx.collection.n nVarS;
        int i28;
        androidx.compose.ui.viewinterop.h hVar;
        androidx.compose.ui.semantics.t tVar;
        boolean zA2;
        androidx.compose.ui.semantics.s sVar5;
        int i29;
        int i30;
        String strR;
        Object parentForAccessibility;
        View view;
        ?? r10;
        androidx.core.view.accessibility.d dVar3;
        androidx.lifecycle.p lifecycle;
        switch (this.z) {
            case 0:
                a0 a0Var2 = (a0) this.A;
                AccessibilityManager accessibilityManager2 = a0Var2.D;
                u uVar2 = a0Var2.A;
                l viewTreeOwners = uVar2.getViewTreeOwners();
                if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : ((androidx.lifecycle.x) lifecycle).d) == androidx.lifecycle.o.e) {
                    if (accessibilityManager2.isEnabled()) {
                        dVar3 = null;
                    } else {
                        dVar3 = new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain());
                    }
                    i6 = i;
                    r10 = a0Var2;
                    r6 = dVar3;
                } else {
                    androidx.compose.ui.semantics.t tVar2 = (androidx.compose.ui.semantics.t) a0Var2.s().b(i);
                    if (tVar2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            dVar3 = null;
                        } else {
                            dVar3 = new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain());
                        }
                        i6 = i;
                        r10 = a0Var2;
                        r6 = dVar3;
                    } else {
                        androidx.compose.ui.semantics.s sVar6 = tVar2.a;
                        androidx.compose.ui.semantics.n nVarK = sVar6.k();
                        androidx.compose.ui.node.f0 f0Var3 = sVar6.c;
                        Object objG14 = nVarK.e.g(androidx.compose.ui.semantics.w.n);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        boolean zA3 = kotlin.jvm.internal.l.a(objG14, Boolean.TRUE);
                        if (!zA3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                androidx.compose.ui.text.android.b.m(accessibilityNodeInfoObtain, zA3);
                            } else {
                                dVar.j(64, zA3);
                            }
                            if (i == -1) {
                                th = null;
                                sVarL = sVar6.l();
                                if (sVarL != null) {
                                    numValueOf = Integer.valueOf(sVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    if (iIntValue == uVar2.getSemanticsOwner().a().g) {
                                        iIntValue = -1;
                                    }
                                    dVar.b = iIntValue;
                                    accessibilityNodeInfoObtain.setParent(uVar2, iIntValue);
                                } else {
                                    androidx.compose.ui.internal.a.c("semanticsNode " + i + " has null parent");
                                    com.google.firebase.platforminfo.b.b();
                                }
                                return null;
                            }
                            parentForAccessibility = uVar2.getParentForAccessibility();
                            th = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            dVar.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                            dVar.c = i;
                            accessibilityNodeInfoObtain.setSource(uVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(a0Var2.k(tVar2));
                            xVar = a0Var2.h0;
                            z0Var = a0Var2.Q;
                            resources = uVar2.getContext().getResources();
                            dVar.k("android.view.View");
                            nVar = sVar6.d;
                            o0Var = nVar.e;
                            if (o0Var.c(androidx.compose.ui.semantics.w.F)) {
                                dVar.k("android.widget.EditText");
                            }
                            if (o0Var.c(androidx.compose.ui.semantics.w.B)) {
                                dVar.k("android.widget.TextView");
                            }
                            objG = o0Var.g(androidx.compose.ui.semantics.w.y);
                            if (objG == null) {
                                objG = th;
                            }
                            jVar = (androidx.compose.ui.semantics.j) objG;
                            if (jVar != null) {
                                i29 = jVar.a;
                                accessibilityManager = accessibilityManager2;
                                if (sVar6.e) {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                    if (androidx.compose.ui.semantics.s.j(4, sVar6).isEmpty()) {
                                    }
                                } else {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                }
                                if (i29 == i30) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i29 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = i0.r(i29);
                                    if (i29 == 5 || sVar6.n() || nVar.z) {
                                        dVar.k(strR);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                z0Var2 = z0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(uVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(androidx.compose.ui.semantics.v.f(sVar6));
                            if (i2 >= 34) {
                                zK = androidx.compose.ui.text.android.b.k(accessibilityManager);
                            } else {
                                zK = true;
                            }
                            listJ = androidx.compose.ui.semantics.s.j(4, sVar6);
                            size = listJ.size();
                            z = zK;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                r9 = dVar.a;
                                if (i4 < size) {
                                    int i31 = size;
                                    sVar4 = (androidx.compose.ui.semantics.s) listJ.get(i4);
                                    List list5 = listJ;
                                    nVarS = a0Var2.s();
                                    int i32 = i4;
                                    i28 = sVar4.g;
                                    if (nVarS.a(i28)) {
                                        hVar = uVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar4.c);
                                        if (i28 != -1) {
                                            if (hVar != null) {
                                                accessibilityNodeInfoObtain.addChild(hVar);
                                            } else {
                                                tVar = (androidx.compose.ui.semantics.t) a0Var2.s().b(i28);
                                                if (tVar != null || (sVar5 = tVar.a) == null) {
                                                    zA2 = false;
                                                } else {
                                                    Object objG15 = sVar5.k().e.g(androidx.compose.ui.semantics.w.n);
                                                    if (objG15 == null) {
                                                        objG15 = th;
                                                    }
                                                    zA2 = kotlin.jvm.internal.l.a(objG15, Boolean.TRUE);
                                                }
                                                if (z || !zA2) {
                                                    r9.addChild(uVar2, i28);
                                                }
                                            }
                                            xVar.f(i28, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i32 + 1;
                                    listJ = list5;
                                    size = i31;
                                } else {
                                    if (i == a0Var2.I) {
                                        r9.setAccessibilityFocused(true);
                                        dVar.b(androidx.core.view.accessibility.b.g);
                                    } else {
                                        r9.setAccessibilityFocused(false);
                                        dVar.b(androidx.core.view.accessibility.b.f);
                                    }
                                    gVarI = i0.i(sVar6);
                                    if (gVarI != null) {
                                        uVar2.getFontFamilyResolver();
                                        density = uVar2.getDensity();
                                        c2Var = a0Var2.d0;
                                        String str3 = gVarI.y;
                                        list4 = gVarI.e;
                                        spannableString = new SpannableString(str3);
                                        arrayList4 = gVarI.z;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i22 = 0;
                                            while (i22 < size11) {
                                                ArrayList arrayList8 = arrayList4;
                                                androidx.compose.ui.text.e eVar6 = (androidx.compose.ui.text.e) arrayList4.get(i22);
                                                int i33 = i22;
                                                androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) eVar6.a;
                                                int i34 = size11;
                                                i23 = eVar6.b;
                                                i24 = eVar6.c;
                                                androidx.collection.x xVar3 = xVar;
                                                androidx.compose.ui.semantics.j jVar4 = jVar;
                                                androidx.compose.ui.semantics.n nVar5 = nVar;
                                                jB = e0Var.a.b();
                                                androidx.compose.ui.semantics.s sVar7 = sVar6;
                                                androidx.collection.o0 o0Var5 = o0Var;
                                                long j2 = e0Var.b;
                                                kVar3 = e0Var.c;
                                                iVar2 = e0Var.d;
                                                pVar = e0Var.j;
                                                androidx.compose.ui.text.intl.b bVar3 = e0Var.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                                androidx.core.view.accessibility.d dVar4 = dVar;
                                                j = e0Var.l;
                                                lVar2 = e0Var.m;
                                                oVar = e0Var.a;
                                                if (androidx.compose.ui.graphics.t.c(jB, oVar.b())) {
                                                    oVar2 = oVar;
                                                } else {
                                                    if (jB != 16) {
                                                        cVar = new androidx.compose.ui.text.style.c(jB);
                                                    } else {
                                                        cVar = androidx.compose.ui.text.style.n.a;
                                                    }
                                                    oVar2 = cVar;
                                                }
                                                kotlin.math.a.L(spannableString, oVar2.b(), i23, i24);
                                                spannableString3 = spannableString;
                                                kotlin.math.a.O(spannableString3, j2, density, i23, i24);
                                                if (kVar3 == null || iVar2 != null) {
                                                    if (kVar3 == null) {
                                                        kVar4 = androidx.compose.ui.text.font.k.z;
                                                    } else {
                                                        kVar4 = kVar3;
                                                    }
                                                    if (iVar2 != null) {
                                                        i25 = iVar2.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(androidx.work.impl.v.q(kVar4, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan, i23, i24, 33);
                                                } else {
                                                    i26 = 33;
                                                }
                                                if (lVar2 != null) {
                                                    i27 = lVar2.a;
                                                    if ((i27 | 1) == i27) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i23, i24, i26);
                                                    }
                                                    if ((i27 | 2) == i27) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i26);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar.a), i23, i24, i26);
                                                }
                                                kotlin.math.a.P(spannableString3, bVar3, i23, i24);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a0.y(j)), i23, i24, i26);
                                                }
                                                i22 = i33 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList8;
                                                size11 = i34;
                                                xVar = xVar3;
                                                nVar = nVar5;
                                                jVar = jVar4;
                                                o0Var = o0Var5;
                                                sVar6 = sVar7;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                                dVar = dVar4;
                                            }
                                        }
                                        xVar2 = xVar;
                                        spannableString2 = spannableString;
                                        sVar = sVar6;
                                        o0Var2 = o0Var;
                                        jVar2 = jVar;
                                        nVar2 = nVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        androidx.core.view.accessibility.d dVar5 = dVar;
                                        int length = str3.length();
                                        arrayList5 = kotlin.collections.w.e;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            while (i21 < size10) {
                                                Object obj2 = list4.get(i21);
                                                eVar5 = (androidx.compose.ui.text.e) obj2;
                                                if (!(eVar5.a instanceof androidx.compose.ui.text.o0) && androidx.compose.ui.text.h.b(0, length, eVar5.b, eVar5.c)) {
                                                    arrayList6.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size5 = arrayList6.size();
                                        while (i12 < size5) {
                                            androidx.compose.ui.text.e eVar7 = (androidx.compose.ui.text.e) arrayList6.get(i12);
                                            o0Var4 = (androidx.compose.ui.text.o0) eVar7.a;
                                            i19 = eVar7.b;
                                            i20 = eVar7.c;
                                            if (o0Var4 instanceof androidx.compose.ui.text.o0) {
                                                coil3.g.a();
                                                return null;
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(o0Var4.a).build(), i19, i20, 33);
                                        }
                                        int length2 = str3.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            while (i18 < size9) {
                                                Object obj3 = list4.get(i18);
                                                eVar4 = (androidx.compose.ui.text.e) obj3;
                                                if (!(eVar4.a instanceof androidx.compose.ui.text.n0) && androidx.compose.ui.text.h.b(0, length2, eVar4.b, eVar4.c)) {
                                                    arrayList7.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size6 = arrayList7.size();
                                        while (i13 < size6) {
                                            androidx.compose.ui.text.e eVar8 = (androidx.compose.ui.text.e) arrayList7.get(i13);
                                            n0Var = (androidx.compose.ui.text.n0) eVar8.a;
                                            int i35 = eVar8.b;
                                            int i36 = eVar8.c;
                                            weakHashMap3 = (WeakHashMap) c2Var.y;
                                            uRLSpan2 = weakHashMap3.get(n0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(n0Var.a);
                                                weakHashMap3.put(n0Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i35, i36, 33);
                                        }
                                        int length3 = str3.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i17 < size8) {
                                                Object obj4 = list4.get(i17);
                                                eVar3 = (androidx.compose.ui.text.e) obj4;
                                                if (!(eVar3.a instanceof androidx.compose.ui.text.m) && androidx.compose.ui.text.h.b(0, length3, eVar3.b, eVar3.c)) {
                                                    arrayList5.add(obj4);
                                                }
                                            }
                                        }
                                        size7 = arrayList5.size();
                                        while (i14 < size7) {
                                            eVar = (androidx.compose.ui.text.e) arrayList5.get(i14);
                                            i15 = eVar.b;
                                            obj = eVar.a;
                                            i16 = eVar.c;
                                            if (i15 != i16) {
                                                mVar2 = (androidx.compose.ui.text.m) obj;
                                                if (mVar2 instanceof androidx.compose.ui.text.l) {
                                                    obj.getClass();
                                                    lVar = (androidx.compose.ui.text.l) obj;
                                                    eVar2 = new androidx.compose.ui.text.e(lVar, i15, i16);
                                                    weakHashMap2 = (WeakHashMap) c2Var.z;
                                                    uRLSpan = weakHashMap2.get(eVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(lVar.a);
                                                        weakHashMap2.put(eVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) c2Var.A;
                                                    gVar = weakHashMap.get(eVar);
                                                    if (gVar == null) {
                                                        gVar = new androidx.compose.ui.text.platform.g(mVar2);
                                                        weakHashMap.put(eVar, gVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) gVar, i15, i16, 33);
                                                }
                                            }
                                        }
                                        r1 = dVar5;
                                        r0 = (SpannableString) a0.P(spannableString2);
                                    } else {
                                        a0Var2 = a0Var2;
                                        xVar2 = xVar;
                                        sVar = sVar6;
                                        o0Var2 = o0Var;
                                        jVar2 = jVar;
                                        nVar2 = nVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        r1 = dVar;
                                        r0 = th;
                                    }
                                    r1.r(r0);
                                    zVar = androidx.compose.ui.semantics.w.L;
                                    o0Var3 = o0Var2;
                                    if (o0Var3.c(zVar)) {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        accessibilityNodeInfo2.setContentInvalid(true);
                                        objG13 = o0Var3.g(zVar);
                                        if (objG13 == null) {
                                            objG13 = th;
                                        }
                                        r9.setError((CharSequence) objG13);
                                    } else {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    }
                                    sVar2 = sVar;
                                    strH = i0.h(sVar2, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        androidx.compose.ui.graphics.layer.i.l(r9, strH);
                                    } else {
                                        r9.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    r9.setCheckable(i0.g(sVar2));
                                    objG2 = o0Var3.g(androidx.compose.ui.semantics.w.J);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    aVar = (androidx.compose.ui.state.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == androidx.compose.ui.state.a.e) {
                                            r9.setChecked(true);
                                        } else if (aVar == androidx.compose.ui.state.a.y) {
                                            r9.setChecked(false);
                                        }
                                    }
                                    objG3 = o0Var3.g(androidx.compose.ui.semantics.w.I);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (jVar2 == null) {
                                            jVar3 = jVar2;
                                            i5 = 4;
                                        } else {
                                            jVar3 = jVar2;
                                            i5 = 4;
                                            if (jVar3.a == 4) {
                                                accessibilityNodeInfo2.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r9.setChecked(zBooleanValue2);
                                    } else {
                                        jVar3 = jVar2;
                                        i5 = 4;
                                    }
                                    nVar3 = nVar2;
                                    if (nVar3.z || androidx.compose.ui.semantics.s.j(i5, sVar2).isEmpty()) {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.w.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.p.D(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    }
                                    objG5 = o0Var3.g(androidx.compose.ui.semantics.w.z);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        sVarL2 = sVar2;
                                        while (true) {
                                            if (sVarL2 != null) {
                                                nVar4 = sVarL2.d;
                                                zVar5 = androidx.compose.ui.semantics.x.a;
                                                if (nVar4.e.c(zVar5)) {
                                                    zBooleanValue = ((Boolean) nVar4.d(zVar5)).booleanValue();
                                                } else {
                                                    sVarL2 = sVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo2.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = o0Var3.g(androidx.compose.ui.semantics.w.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((kotlin.y) objG6) != null) {
                                        r1.l(true);
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = xVar2.d(sVar2.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo2.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo2.setPassword(o0Var3.c(androidx.compose.ui.semantics.w.K));
                                    accessibilityNodeInfo2.setEditable(o0Var3.c(androidx.compose.ui.semantics.w.N));
                                    objG7 = o0Var3.g(androidx.compose.ui.semantics.w.O);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r9.setMaxTextLength(iIntValue2);
                                    r9.setEnabled(i0.b(sVar2));
                                    zVar2 = androidx.compose.ui.semantics.w.k;
                                    r9.setFocusable(o0Var3.c(zVar2));
                                    if (accessibilityNodeInfo2.isFocusable()) {
                                        r9.setFocused(((Boolean) nVar3.d(zVar2)).booleanValue());
                                        if (accessibilityNodeInfo2.isFocused()) {
                                            r1.a(2);
                                            a0 a0Var3 = a0Var2;
                                            a0Var3.J = i6;
                                            a0Var = a0Var3;
                                        } else {
                                            r7 = a0Var2;
                                            z2 = true;
                                            r1.a(1);
                                        }
                                        r9.setVisibleToUser(androidx.compose.ui.semantics.v.e(sVar2) ^ z2);
                                        if (((androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.j)) != null) {
                                            accessibilityNodeInfo2.setLiveRegion(2);
                                        }
                                        r9.setClickable(false);
                                        aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.b);
                                        c = 3;
                                        if (aVar2 != null) {
                                            boolean zA4 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.I), Boolean.TRUE);
                                            if (jVar3 == null && jVar3.a == 4) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                z15 = true;
                                            } else {
                                                if (jVar3 == null && jVar3.a == 3) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                            if (z15 || (z15 && !zA4)) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            r9.setClickable(z16);
                                            if (i0.b(sVar2) && accessibilityNodeInfo2.isClickable()) {
                                                r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                            }
                                        }
                                        r9.setLongClickable(false);
                                        aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.c);
                                        if (aVar3 != null) {
                                            r9.setLongClickable(true);
                                            if (i0.b(sVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                            }
                                        }
                                        aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.q);
                                        if (aVar4 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                        }
                                        if (i0.b(sVar2)) {
                                            aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.k);
                                            if (aVar10 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                            }
                                            aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.p);
                                            if (aVar11 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            }
                                            aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.r);
                                            if (aVar12 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                            }
                                            aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.s);
                                            if (aVar13 != null && accessibilityNodeInfo2.isFocused()) {
                                                primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                }
                                            }
                                        }
                                        strT = a0.t(sVar2);
                                        if (strT != null || strT.length() == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo2.setTextSelection(r7.r(sVar2), r7.q(sVar2));
                                            aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.j);
                                            if (aVar9 != null) {
                                                r8 = aVar9.a;
                                            } else {
                                                r8 = th;
                                            }
                                            r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                            r1.a(LibretroCore.SCREEN_WIDTH);
                                            r1.a(512);
                                            r9.setMovementGranularities(11);
                                            list3 = (List) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.a);
                                            if (list3 != null || list3.isEmpty()) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11 && o0Var3.c(androidx.compose.ui.semantics.m.a)) {
                                                if (o0Var3.c(androidx.compose.ui.semantics.w.F) || kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.v.d(nVar3, zVar2), Boolean.TRUE)) {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            nVarX2 = V.x();
                                                            if (nVarX2 != null || !nVarX2.z) {
                                                                z12 = false;
                                                            } else if (nVarX2.e.c(androidx.compose.ui.semantics.w.F)) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        nVarX = V.x();
                                                        if (nVarX != null) {
                                                            objG12 = nVarX.e.g(zVar2);
                                                            if (objG12 == null) {
                                                                objG12 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        z13 = zA ? false : true;
                                                    }
                                                }
                                                if (!z13) {
                                                    r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = r1.g();
                                            if (charSequenceG != null || charSequenceG.length() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (!z10 && o0Var3.c(androidx.compose.ui.semantics.m.a)) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.z)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.P)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r1.i(arrayList3);
                                        }
                                        iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.c);
                                        f = 0.0f;
                                        if (iVar != null) {
                                            f3 = iVar.a;
                                            f4 = iVar.b.a;
                                            zVar4 = androidx.compose.ui.semantics.m.i;
                                            if (o0Var3.c(zVar4)) {
                                                r1.k("android.widget.SeekBar");
                                            } else {
                                                r1.k("android.widget.ProgressBar");
                                            }
                                            if (iVar != androidx.compose.ui.semantics.i.c) {
                                                accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                            }
                                            if (o0Var3.c(zVar4) && i0.b(sVar2)) {
                                                if (f4 < 0.0f) {
                                                    f5 = 0.0f;
                                                } else {
                                                    f5 = f4;
                                                }
                                                if (f3 < f5) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                }
                                                if (0.0f <= f4) {
                                                    f4 = 0.0f;
                                                }
                                                if (f3 > f4) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                }
                                            }
                                        }
                                        if (i0.b(sVar2) && (aVar8 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.i)) != null) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                        objG8 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        dVar2 = (androidx.compose.ui.semantics.d) objG8;
                                        accessibilityNodeInfo3 = r1.a;
                                        if (dVar2 != null) {
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar2.a, dVar2.b, false, 0));
                                            f2 = 0.0f;
                                        } else {
                                            arrayList = new ArrayList();
                                            objG9 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                            if ((objG9 != null ? objG9 : null) != null) {
                                                listJ2 = androidx.compose.ui.semantics.s.j(4, sVar2);
                                                size3 = listJ2.size();
                                                i7 = 0;
                                                while (i7 < size3) {
                                                    float f6 = f;
                                                    sVar3 = (androidx.compose.ui.semantics.s) listJ2.get(i7);
                                                    char c2 = c;
                                                    if (sVar3.k().e.c(androidx.compose.ui.semantics.w.I)) {
                                                        arrayList.add(sVar3);
                                                    }
                                                    i7++;
                                                    c = c2;
                                                    f = f6;
                                                }
                                            }
                                            f2 = f;
                                            if (!arrayList.isEmpty()) {
                                                zG = coil3.network.g.g(arrayList);
                                                if (zG) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zG ? arrayList.size() : 1, false, 0));
                                            }
                                        }
                                        coil3.network.g.C(sVar2, r1);
                                        kVar = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.u);
                                        androidx.compose.ui.semantics.a aVar14 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.d);
                                        if (kVar != null && aVar14 != null) {
                                            objG10 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                            if (objG10 == null) {
                                                objG10 = th;
                                            }
                                            if (objG10 == null) {
                                                objG11 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                r1.k("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) kVar.b.invoke()).floatValue() > f2) {
                                                r1.p(true);
                                            }
                                            if (i0.b(sVar2)) {
                                                z7 = a0.z(kVar);
                                                mVar = androidx.compose.ui.unit.m.y;
                                                if (z7) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                    f0Var2 = f0Var3;
                                                    if (f0Var2.X == mVar) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        bVar2 = androidx.core.view.accessibility.b.p;
                                                    } else {
                                                        bVar2 = androidx.core.view.accessibility.b.n;
                                                    }
                                                    r1.b(bVar2);
                                                } else {
                                                    f0Var2 = f0Var3;
                                                }
                                                if (a0.y(kVar)) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                    if (f0Var2.X == mVar) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        bVar = androidx.core.view.accessibility.b.n;
                                                    } else {
                                                        bVar = androidx.core.view.accessibility.b.p;
                                                    }
                                                    r1.b(bVar);
                                                }
                                            }
                                        }
                                        kVar2 = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.v);
                                        if (kVar2 != null || aVar14 == null) {
                                            z4 = true;
                                        } else {
                                            Object objG16 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                            if (objG16 == null) {
                                                objG16 = th;
                                            }
                                            if (objG16 == null) {
                                                Object objG17 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                                if (objG17 == null) {
                                                    objG17 = th;
                                                }
                                                if (objG17 != null) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                            } else {
                                                z5 = true;
                                            }
                                            if (!z5) {
                                                r1.k("android.widget.ScrollView");
                                            }
                                            z4 = true;
                                            if (((Number) kVar2.b.invoke()).floatValue() > f2) {
                                                r1.p(true);
                                            }
                                            if (i0.b(sVar2)) {
                                                if (a0.z(kVar2)) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                    r1.b(androidx.core.view.accessibility.b.o);
                                                }
                                                if (a0.y(kVar2)) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                    r1.b(androidx.core.view.accessibility.b.m);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i0.d(sVar2, r1);
                                        }
                                        r1.n((CharSequence) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.d));
                                        if (i0.b(sVar2)) {
                                            aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.t);
                                            if (aVar5 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                            }
                                            aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.u);
                                            if (aVar6 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                            }
                                            aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.v);
                                            if (aVar7 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                            }
                                            zVar3 = androidx.compose.ui.semantics.m.x;
                                            if (o0Var3.c(zVar3)) {
                                                list2 = (List) nVar3.d(zVar3);
                                                size4 = list2.size();
                                                yVar = a0.l0;
                                                if (size4 < yVar.b) {
                                                    androidx.collection.z0 z0Var4 = new androidx.collection.z0(0);
                                                    androidx.collection.f0 f0VarA = androidx.collection.t0.a();
                                                    z0Var3 = z0Var2;
                                                    if (z0Var3.e) {
                                                        androidx.collection.t.a(z0Var3);
                                                    }
                                                    if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                        iArr = yVar.a;
                                                        i8 = yVar.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i37 = iArr[i9];
                                                            int i38 = i8;
                                                            i11 = i10 + 1;
                                                            int i39 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i37;
                                                            i9 = i39 + 1;
                                                            i10 = i11;
                                                            i8 = i38;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                            f0Var.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.D(arrayList2.get(0));
                                                            if (i10 <= 0) {
                                                                int i40 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            com.google.firebase.platforminfo.b.l("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                        yVar.c(0);
                                                        throw th;
                                                    }
                                                    r7.P.e(i6, z0Var4);
                                                    z0Var3.e(i6, f0VarA);
                                                } else {
                                                    kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.o(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                return null;
                                            }
                                        }
                                        r1.o(i0.c(sVar2, resources));
                                        iD = r7.Z.d(i6);
                                        if (iD != -1) {
                                            hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                            if (hVarP2 != null) {
                                                r9.setTraversalBefore(hVarP2);
                                                uVar = uVar2;
                                            } else {
                                                uVar = uVar2;
                                                r9.setTraversalBefore(uVar, iD);
                                            }
                                            ?? r11 = th;
                                            r7.j(i6, r1, r7.b0, r11);
                                            r5 = r11;
                                        } else {
                                            r5 = th;
                                            uVar = uVar2;
                                        }
                                        iD2 = r7.a0.d(i6);
                                        if (iD2 != -1 && (hVarP = i0.p(uVar.getAndroidViewsHandler$ui(), iD2)) != null) {
                                            r9.setTraversalAfter(hVarP);
                                            r7.j(i6, r1, r7.c0, r5);
                                        }
                                        str2 = (String) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.x.b);
                                        if (str2 != null) {
                                            r1.k(str2);
                                        }
                                        r6 = r1;
                                        r10 = r7;
                                    } else {
                                        a0Var = a0Var2;
                                    }
                                    z2 = true;
                                    r7 = a0Var;
                                    r9.setVisibleToUser(androidx.compose.ui.semantics.v.e(sVar2) ^ z2);
                                    if (((androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.j)) != null) {
                                        accessibilityNodeInfo2.setLiveRegion(2);
                                    }
                                    r9.setClickable(false);
                                    aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.b);
                                    c = 3;
                                    if (aVar2 != null) {
                                        boolean zA5 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.I), Boolean.TRUE);
                                        if (jVar3 == null) {
                                            z14 = false;
                                        } else {
                                            z14 = true;
                                        }
                                        if (z14) {
                                            z15 = true;
                                        } else {
                                            if (jVar3 == null) {
                                                z17 = false;
                                            } else {
                                                z17 = true;
                                            }
                                            if (z17) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        }
                                        if (z15) {
                                            z16 = true;
                                        } else {
                                            z16 = true;
                                        }
                                        r9.setClickable(z16);
                                        if (i0.b(sVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                        }
                                    }
                                    r9.setLongClickable(false);
                                    aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.c);
                                    if (aVar3 != null) {
                                        r9.setLongClickable(true);
                                        if (i0.b(sVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                        }
                                    }
                                    aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.q);
                                    if (aVar4 != null) {
                                        r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                    }
                                    if (i0.b(sVar2)) {
                                        aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.k);
                                        if (aVar10 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                        }
                                        aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.p);
                                        if (aVar11 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                        }
                                        aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.r);
                                        if (aVar12 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                        }
                                        aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.s);
                                        if (aVar13 != null) {
                                            primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                            }
                                        }
                                    }
                                    strT = a0.t(sVar2);
                                    if (strT != null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        accessibilityNodeInfo2.setTextSelection(r7.r(sVar2), r7.q(sVar2));
                                        aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.j);
                                        if (aVar9 != null) {
                                            r8 = aVar9.a;
                                        } else {
                                            r8 = th;
                                        }
                                        r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                        r1.a(LibretroCore.SCREEN_WIDTH);
                                        r1.a(512);
                                        r9.setMovementGranularities(11);
                                        list3 = (List) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.a);
                                        if (list3 != null) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.F)) {
                                                V = f0Var3.v();
                                                while (true) {
                                                    if (V == 0) {
                                                        V = th;
                                                    } else {
                                                        nVarX2 = V.x();
                                                        if (nVarX2 != null) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            V = V.v();
                                                        }
                                                    }
                                                }
                                                if (V != 0) {
                                                    nVarX = V.x();
                                                    if (nVarX != null) {
                                                        objG12 = nVarX.e.g(zVar2);
                                                        if (objG12 == null) {
                                                            objG12 = th;
                                                        }
                                                        zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            } else {
                                                V = f0Var3.v();
                                                while (true) {
                                                    if (V == 0) {
                                                        V = th;
                                                    } else {
                                                        nVarX2 = V.x();
                                                        if (nVarX2 != null) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            V = V.v();
                                                        }
                                                    }
                                                }
                                                if (V != 0) {
                                                    nVarX = V.x();
                                                    if (nVarX != null) {
                                                        objG12 = nVarX.e.g(zVar2);
                                                        if (objG12 == null) {
                                                            objG12 = th;
                                                        }
                                                        zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z13) {
                                                r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = r1.g();
                                        if (charSequenceG != null) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (!z10) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (o0Var3.c(androidx.compose.ui.semantics.w.z)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (o0Var3.c(androidx.compose.ui.semantics.w.P)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r1.i(arrayList3);
                                    }
                                    iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.c);
                                    f = 0.0f;
                                    if (iVar != null) {
                                        f3 = iVar.a;
                                        f4 = iVar.b.a;
                                        zVar4 = androidx.compose.ui.semantics.m.i;
                                        if (o0Var3.c(zVar4)) {
                                            r1.k("android.widget.SeekBar");
                                        } else {
                                            r1.k("android.widget.ProgressBar");
                                        }
                                        if (iVar != androidx.compose.ui.semantics.i.c) {
                                            accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                        }
                                        if (o0Var3.c(zVar4)) {
                                            if (f4 < 0.0f) {
                                                f5 = 0.0f;
                                            } else {
                                                f5 = f4;
                                            }
                                            if (f3 < f5) {
                                                r1.b(androidx.core.view.accessibility.b.h);
                                            }
                                            if (0.0f <= f4) {
                                                f4 = 0.0f;
                                            }
                                            if (f3 > f4) {
                                                r1.b(androidx.core.view.accessibility.b.i);
                                            }
                                        }
                                    }
                                    if (i0.b(sVar2)) {
                                        r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                    }
                                    objG8 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    dVar2 = (androidx.compose.ui.semantics.d) objG8;
                                    accessibilityNodeInfo3 = r1.a;
                                    if (dVar2 != null) {
                                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar2.a, dVar2.b, false, 0));
                                        f2 = 0.0f;
                                    } else {
                                        arrayList = new ArrayList();
                                        objG9 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                        if ((objG9 != null ? objG9 : null) != null) {
                                            listJ2 = androidx.compose.ui.semantics.s.j(4, sVar2);
                                            size3 = listJ2.size();
                                            i7 = 0;
                                            while (i7 < size3) {
                                                float f7 = f;
                                                sVar3 = (androidx.compose.ui.semantics.s) listJ2.get(i7);
                                                char c3 = c;
                                                if (sVar3.k().e.c(androidx.compose.ui.semantics.w.I)) {
                                                    arrayList.add(sVar3);
                                                }
                                                i7++;
                                                c = c3;
                                                f = f7;
                                            }
                                        }
                                        f2 = f;
                                        if (!arrayList.isEmpty()) {
                                            zG = coil3.network.g.g(arrayList);
                                            if (zG) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zG ? arrayList.size() : 1, false, 0));
                                        }
                                    }
                                    coil3.network.g.C(sVar2, r1);
                                    kVar = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.u);
                                    androidx.compose.ui.semantics.a aVar15 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.d);
                                    if (kVar != null) {
                                        objG10 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                        if (objG10 == null) {
                                            objG10 = th;
                                        }
                                        if (objG10 == null) {
                                            objG11 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                        } else {
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            r1.k("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) kVar.b.invoke()).floatValue() > f2) {
                                            r1.p(true);
                                        }
                                        if (i0.b(sVar2)) {
                                            z7 = a0.z(kVar);
                                            mVar = androidx.compose.ui.unit.m.y;
                                            if (z7) {
                                                r1.b(androidx.core.view.accessibility.b.h);
                                                f0Var2 = f0Var3;
                                                if (f0Var2.X == mVar) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    bVar2 = androidx.core.view.accessibility.b.p;
                                                } else {
                                                    bVar2 = androidx.core.view.accessibility.b.n;
                                                }
                                                r1.b(bVar2);
                                            } else {
                                                f0Var2 = f0Var3;
                                            }
                                            if (a0.y(kVar)) {
                                                r1.b(androidx.core.view.accessibility.b.i);
                                                if (f0Var2.X == mVar) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    bVar = androidx.core.view.accessibility.b.n;
                                                } else {
                                                    bVar = androidx.core.view.accessibility.b.p;
                                                }
                                                r1.b(bVar);
                                            }
                                        }
                                    }
                                    kVar2 = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.v);
                                    if (kVar2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i0.d(sVar2, r1);
                                    }
                                    r1.n((CharSequence) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.d));
                                    if (i0.b(sVar2)) {
                                        aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.t);
                                        if (aVar5 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                        }
                                        aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.u);
                                        if (aVar6 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                        }
                                        aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.v);
                                        if (aVar7 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                        }
                                        zVar3 = androidx.compose.ui.semantics.m.x;
                                        if (o0Var3.c(zVar3)) {
                                            list2 = (List) nVar3.d(zVar3);
                                            size4 = list2.size();
                                            yVar = a0.l0;
                                            if (size4 < yVar.b) {
                                                androidx.collection.z0 z0Var5 = new androidx.collection.z0(0);
                                                androidx.collection.f0 f0VarA2 = androidx.collection.t0.a();
                                                z0Var3 = z0Var2;
                                                if (z0Var3.e) {
                                                    androidx.collection.t.a(z0Var3);
                                                }
                                                if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                    iArr = yVar.a;
                                                    i8 = yVar.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i310 = iArr[i9];
                                                        int i311 = i8;
                                                        i11 = i10 + 1;
                                                        int i312 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i310;
                                                        i9 = i312 + 1;
                                                        i10 = i11;
                                                        i8 = i311;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                        f0Var.getClass();
                                                        throw th;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(arrayList2.get(0));
                                                        if (i10 <= 0) {
                                                            int i41 = iArrCopyOf[0];
                                                            throw th;
                                                        }
                                                        com.google.firebase.platforminfo.b.l("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                    yVar.c(0);
                                                    throw th;
                                                }
                                                r7.P.e(i6, z0Var5);
                                                z0Var3.e(i6, f0VarA2);
                                            } else {
                                                kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.o(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            return null;
                                        }
                                    }
                                    r1.o(i0.c(sVar2, resources));
                                    iD = r7.Z.d(i6);
                                    if (iD != -1) {
                                        hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                        if (hVarP2 != null) {
                                            r9.setTraversalBefore(hVarP2);
                                            uVar = uVar2;
                                        } else {
                                            uVar = uVar2;
                                            r9.setTraversalBefore(uVar, iD);
                                        }
                                        ?? r12 = th;
                                        r7.j(i6, r1, r7.b0, r12);
                                        r5 = r12;
                                    } else {
                                        r5 = th;
                                        uVar = uVar2;
                                    }
                                    iD2 = r7.a0.d(i6);
                                    if (iD2 != -1) {
                                        r9.setTraversalAfter(hVarP);
                                        r7.j(i6, r1, r7.c0, r5);
                                    }
                                    str2 = (String) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.x.b);
                                    if (str2 != null) {
                                        r1.k(str2);
                                    }
                                    r6 = r1;
                                    r10 = r7;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.text.android.b.k(accessibilityManager2) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                androidx.compose.ui.text.android.b.m(accessibilityNodeInfoObtain, zA3);
                            } else {
                                dVar.j(64, zA3);
                            }
                            if (i == -1) {
                                th = null;
                                sVarL = sVar6.l();
                                if (sVarL != null) {
                                    numValueOf = Integer.valueOf(sVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    if (iIntValue == uVar2.getSemanticsOwner().a().g) {
                                        iIntValue = -1;
                                    }
                                    dVar.b = iIntValue;
                                    accessibilityNodeInfoObtain.setParent(uVar2, iIntValue);
                                } else {
                                    androidx.compose.ui.internal.a.c("semanticsNode " + i + " has null parent");
                                    com.google.firebase.platforminfo.b.b();
                                }
                                return null;
                            }
                            parentForAccessibility = uVar2.getParentForAccessibility();
                            th = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            dVar.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                            dVar.c = i;
                            accessibilityNodeInfoObtain.setSource(uVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(a0Var2.k(tVar2));
                            xVar = a0Var2.h0;
                            z0Var = a0Var2.Q;
                            resources = uVar2.getContext().getResources();
                            dVar.k("android.view.View");
                            nVar = sVar6.d;
                            o0Var = nVar.e;
                            if (o0Var.c(androidx.compose.ui.semantics.w.F)) {
                                dVar.k("android.widget.EditText");
                            }
                            if (o0Var.c(androidx.compose.ui.semantics.w.B)) {
                                dVar.k("android.widget.TextView");
                            }
                            objG = o0Var.g(androidx.compose.ui.semantics.w.y);
                            if (objG == null) {
                                objG = th;
                            }
                            jVar = (androidx.compose.ui.semantics.j) objG;
                            if (jVar != null) {
                                i29 = jVar.a;
                                accessibilityManager = accessibilityManager2;
                                if (sVar6.e) {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                } else {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                    if (androidx.compose.ui.semantics.s.j(4, sVar6).isEmpty()) {
                                    }
                                }
                                if (i29 == i30) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i29 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = i0.r(i29);
                                    if (i29 == 5) {
                                        dVar.k(strR);
                                    } else {
                                        dVar.k(strR);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                z0Var2 = z0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(uVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(androidx.compose.ui.semantics.v.f(sVar6));
                            if (i2 >= 34) {
                                zK = androidx.compose.ui.text.android.b.k(accessibilityManager);
                            } else {
                                zK = true;
                            }
                            listJ = androidx.compose.ui.semantics.s.j(4, sVar6);
                            size = listJ.size();
                            z = zK;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                r9 = dVar.a;
                                if (i4 < size) {
                                    int i313 = size;
                                    sVar4 = (androidx.compose.ui.semantics.s) listJ.get(i4);
                                    List list6 = listJ;
                                    nVarS = a0Var2.s();
                                    int i314 = i4;
                                    i28 = sVar4.g;
                                    if (nVarS.a(i28)) {
                                        hVar = uVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar4.c);
                                        if (i28 != -1) {
                                            if (hVar != null) {
                                                accessibilityNodeInfoObtain.addChild(hVar);
                                            } else {
                                                tVar = (androidx.compose.ui.semantics.t) a0Var2.s().b(i28);
                                                if (tVar != null) {
                                                    zA2 = false;
                                                } else {
                                                    zA2 = false;
                                                }
                                                if (z) {
                                                    r9.addChild(uVar2, i28);
                                                } else {
                                                    r9.addChild(uVar2, i28);
                                                }
                                            }
                                            xVar.f(i28, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i314 + 1;
                                    listJ = list6;
                                    size = i313;
                                } else {
                                    if (i == a0Var2.I) {
                                        r9.setAccessibilityFocused(true);
                                        dVar.b(androidx.core.view.accessibility.b.g);
                                    } else {
                                        r9.setAccessibilityFocused(false);
                                        dVar.b(androidx.core.view.accessibility.b.f);
                                    }
                                    gVarI = i0.i(sVar6);
                                    if (gVarI != null) {
                                        uVar2.getFontFamilyResolver();
                                        density = uVar2.getDensity();
                                        c2Var = a0Var2.d0;
                                        String str4 = gVarI.y;
                                        list4 = gVarI.e;
                                        spannableString = new SpannableString(str4);
                                        arrayList4 = gVarI.z;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i22 = 0;
                                            while (i22 < size11) {
                                                ArrayList arrayList9 = arrayList4;
                                                androidx.compose.ui.text.e eVar9 = (androidx.compose.ui.text.e) arrayList4.get(i22);
                                                int i315 = i22;
                                                androidx.compose.ui.text.e0 e0Var2 = (androidx.compose.ui.text.e0) eVar9.a;
                                                int i316 = size11;
                                                i23 = eVar9.b;
                                                i24 = eVar9.c;
                                                androidx.collection.x xVar4 = xVar;
                                                androidx.compose.ui.semantics.j jVar5 = jVar;
                                                androidx.compose.ui.semantics.n nVar6 = nVar;
                                                jB = e0Var2.a.b();
                                                androidx.compose.ui.semantics.s sVar8 = sVar6;
                                                androidx.collection.o0 o0Var6 = o0Var;
                                                long j3 = e0Var2.b;
                                                kVar3 = e0Var2.c;
                                                iVar2 = e0Var2.d;
                                                pVar = e0Var2.j;
                                                androidx.compose.ui.text.intl.b bVar4 = e0Var2.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                                androidx.core.view.accessibility.d dVar6 = dVar;
                                                j = e0Var2.l;
                                                lVar2 = e0Var2.m;
                                                oVar = e0Var2.a;
                                                if (androidx.compose.ui.graphics.t.c(jB, oVar.b())) {
                                                    oVar2 = oVar;
                                                } else {
                                                    if (jB != 16) {
                                                        cVar = new androidx.compose.ui.text.style.c(jB);
                                                    } else {
                                                        cVar = androidx.compose.ui.text.style.n.a;
                                                    }
                                                    oVar2 = cVar;
                                                }
                                                kotlin.math.a.L(spannableString, oVar2.b(), i23, i24);
                                                spannableString3 = spannableString;
                                                kotlin.math.a.O(spannableString3, j3, density, i23, i24);
                                                if (kVar3 == null) {
                                                    if (kVar3 == null) {
                                                        kVar4 = androidx.compose.ui.text.font.k.z;
                                                    } else {
                                                        kVar4 = kVar3;
                                                    }
                                                    if (iVar2 != null) {
                                                        i25 = iVar2.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(androidx.work.impl.v.q(kVar4, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan2, i23, i24, 33);
                                                } else {
                                                    if (kVar3 == null) {
                                                        kVar4 = androidx.compose.ui.text.font.k.z;
                                                    } else {
                                                        kVar4 = kVar3;
                                                    }
                                                    if (iVar2 != null) {
                                                        i25 = iVar2.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(androidx.work.impl.v.q(kVar4, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan3, i23, i24, 33);
                                                }
                                                if (lVar2 != null) {
                                                    i27 = lVar2.a;
                                                    if ((i27 | 1) == i27) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i23, i24, i26);
                                                    }
                                                    if ((i27 | 2) == i27) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i26);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar.a), i23, i24, i26);
                                                }
                                                kotlin.math.a.P(spannableString3, bVar4, i23, i24);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a0.y(j)), i23, i24, i26);
                                                }
                                                i22 = i315 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList9;
                                                size11 = i316;
                                                xVar = xVar4;
                                                nVar = nVar6;
                                                jVar = jVar5;
                                                o0Var = o0Var6;
                                                sVar6 = sVar8;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                                dVar = dVar6;
                                            }
                                        }
                                        xVar2 = xVar;
                                        spannableString2 = spannableString;
                                        sVar = sVar6;
                                        o0Var2 = o0Var;
                                        jVar2 = jVar;
                                        nVar2 = nVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        androidx.core.view.accessibility.d dVar7 = dVar;
                                        int length4 = str4.length();
                                        arrayList5 = kotlin.collections.w.e;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            for (i21 = 0; i21 < size10; i21++) {
                                                Object obj5 = list4.get(i21);
                                                eVar5 = (androidx.compose.ui.text.e) obj5;
                                                if (!(eVar5.a instanceof androidx.compose.ui.text.o0)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size5 = arrayList6.size();
                                        for (i12 = 0; i12 < size5; i12++) {
                                            androidx.compose.ui.text.e eVar10 = (androidx.compose.ui.text.e) arrayList6.get(i12);
                                            o0Var4 = (androidx.compose.ui.text.o0) eVar10.a;
                                            i19 = eVar10.b;
                                            i20 = eVar10.c;
                                            if (o0Var4 instanceof androidx.compose.ui.text.o0) {
                                                coil3.g.a();
                                                return null;
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(o0Var4.a).build(), i19, i20, 33);
                                        }
                                        int length5 = str4.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            for (i18 = 0; i18 < size9; i18++) {
                                                Object obj6 = list4.get(i18);
                                                eVar4 = (androidx.compose.ui.text.e) obj6;
                                                if (!(eVar4.a instanceof androidx.compose.ui.text.n0)) {
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size6 = arrayList7.size();
                                        for (i13 = 0; i13 < size6; i13++) {
                                            androidx.compose.ui.text.e eVar11 = (androidx.compose.ui.text.e) arrayList7.get(i13);
                                            n0Var = (androidx.compose.ui.text.n0) eVar11.a;
                                            int i317 = eVar11.b;
                                            int i318 = eVar11.c;
                                            weakHashMap3 = (WeakHashMap) c2Var.y;
                                            uRLSpan2 = weakHashMap3.get(n0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(n0Var.a);
                                                weakHashMap3.put(n0Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i317, i318, 33);
                                        }
                                        int length6 = str4.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i17 = 0; i17 < size8; i17++) {
                                                Object obj7 = list4.get(i17);
                                                eVar3 = (androidx.compose.ui.text.e) obj7;
                                                if (!(eVar3.a instanceof androidx.compose.ui.text.m)) {
                                                }
                                            }
                                        }
                                        size7 = arrayList5.size();
                                        for (i14 = 0; i14 < size7; i14++) {
                                            eVar = (androidx.compose.ui.text.e) arrayList5.get(i14);
                                            i15 = eVar.b;
                                            obj = eVar.a;
                                            i16 = eVar.c;
                                            if (i15 != i16) {
                                                mVar2 = (androidx.compose.ui.text.m) obj;
                                                if (mVar2 instanceof androidx.compose.ui.text.l) {
                                                    obj.getClass();
                                                    lVar = (androidx.compose.ui.text.l) obj;
                                                    eVar2 = new androidx.compose.ui.text.e(lVar, i15, i16);
                                                    weakHashMap2 = (WeakHashMap) c2Var.z;
                                                    uRLSpan = weakHashMap2.get(eVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(lVar.a);
                                                        weakHashMap2.put(eVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) c2Var.A;
                                                    gVar = weakHashMap.get(eVar);
                                                    if (gVar == null) {
                                                        gVar = new androidx.compose.ui.text.platform.g(mVar2);
                                                        weakHashMap.put(eVar, gVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) gVar, i15, i16, 33);
                                                }
                                            }
                                        }
                                        r1 = dVar7;
                                        r0 = (SpannableString) a0.P(spannableString2);
                                    } else {
                                        a0Var2 = a0Var2;
                                        xVar2 = xVar;
                                        sVar = sVar6;
                                        o0Var2 = o0Var;
                                        jVar2 = jVar;
                                        nVar2 = nVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        r1 = dVar;
                                        r0 = th;
                                    }
                                    r1.r(r0);
                                    zVar = androidx.compose.ui.semantics.w.L;
                                    o0Var3 = o0Var2;
                                    if (o0Var3.c(zVar)) {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        accessibilityNodeInfo2.setContentInvalid(true);
                                        objG13 = o0Var3.g(zVar);
                                        if (objG13 == null) {
                                            objG13 = th;
                                        }
                                        r9.setError((CharSequence) objG13);
                                    } else {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    }
                                    sVar2 = sVar;
                                    strH = i0.h(sVar2, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        androidx.compose.ui.graphics.layer.i.l(r9, strH);
                                    } else {
                                        r9.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    r9.setCheckable(i0.g(sVar2));
                                    objG2 = o0Var3.g(androidx.compose.ui.semantics.w.J);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    aVar = (androidx.compose.ui.state.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == androidx.compose.ui.state.a.e) {
                                            r9.setChecked(true);
                                        } else if (aVar == androidx.compose.ui.state.a.y) {
                                            r9.setChecked(false);
                                        }
                                    }
                                    objG3 = o0Var3.g(androidx.compose.ui.semantics.w.I);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (jVar2 == null) {
                                            jVar3 = jVar2;
                                            i5 = 4;
                                        } else {
                                            jVar3 = jVar2;
                                            i5 = 4;
                                            if (jVar3.a == 4) {
                                                accessibilityNodeInfo2.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r9.setChecked(zBooleanValue2);
                                    } else {
                                        jVar3 = jVar2;
                                        i5 = 4;
                                    }
                                    nVar3 = nVar2;
                                    if (nVar3.z) {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.w.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.p.D(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    } else {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.w.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.p.D(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    }
                                    objG5 = o0Var3.g(androidx.compose.ui.semantics.w.z);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        sVarL2 = sVar2;
                                        while (true) {
                                            if (sVarL2 != null) {
                                                nVar4 = sVarL2.d;
                                                zVar5 = androidx.compose.ui.semantics.x.a;
                                                if (nVar4.e.c(zVar5)) {
                                                    zBooleanValue = ((Boolean) nVar4.d(zVar5)).booleanValue();
                                                } else {
                                                    sVarL2 = sVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo2.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = o0Var3.g(androidx.compose.ui.semantics.w.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((kotlin.y) objG6) != null) {
                                        r1.l(true);
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = xVar2.d(sVar2.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo2.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo2.setPassword(o0Var3.c(androidx.compose.ui.semantics.w.K));
                                    accessibilityNodeInfo2.setEditable(o0Var3.c(androidx.compose.ui.semantics.w.N));
                                    objG7 = o0Var3.g(androidx.compose.ui.semantics.w.O);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r9.setMaxTextLength(iIntValue2);
                                    r9.setEnabled(i0.b(sVar2));
                                    zVar2 = androidx.compose.ui.semantics.w.k;
                                    r9.setFocusable(o0Var3.c(zVar2));
                                    if (accessibilityNodeInfo2.isFocusable()) {
                                        r9.setFocused(((Boolean) nVar3.d(zVar2)).booleanValue());
                                        if (accessibilityNodeInfo2.isFocused()) {
                                            r1.a(2);
                                            a0 a0Var4 = a0Var2;
                                            a0Var4.J = i6;
                                            a0Var = a0Var4;
                                        } else {
                                            r7 = a0Var2;
                                            z2 = true;
                                            r1.a(1);
                                        }
                                        r9.setVisibleToUser(androidx.compose.ui.semantics.v.e(sVar2) ^ z2);
                                        if (((androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.j)) != null) {
                                            accessibilityNodeInfo2.setLiveRegion(2);
                                        }
                                        r9.setClickable(false);
                                        aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.b);
                                        c = 3;
                                        if (aVar2 != null) {
                                            boolean zA6 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.I), Boolean.TRUE);
                                            if (jVar3 == null) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (z14) {
                                                z15 = true;
                                            } else {
                                                if (jVar3 == null) {
                                                    z17 = false;
                                                } else {
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                            if (z15) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            r9.setClickable(z16);
                                            if (i0.b(sVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                            }
                                        }
                                        r9.setLongClickable(false);
                                        aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.c);
                                        if (aVar3 != null) {
                                            r9.setLongClickable(true);
                                            if (i0.b(sVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                            }
                                        }
                                        aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.q);
                                        if (aVar4 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                        }
                                        if (i0.b(sVar2)) {
                                            aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.k);
                                            if (aVar10 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                            }
                                            aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.p);
                                            if (aVar11 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            }
                                            aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.r);
                                            if (aVar12 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                            }
                                            aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.s);
                                            if (aVar13 != null) {
                                                primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                }
                                            }
                                        }
                                        strT = a0.t(sVar2);
                                        if (strT != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo2.setTextSelection(r7.r(sVar2), r7.q(sVar2));
                                            aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.j);
                                            if (aVar9 != null) {
                                                r8 = aVar9.a;
                                            } else {
                                                r8 = th;
                                            }
                                            r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                            r1.a(LibretroCore.SCREEN_WIDTH);
                                            r1.a(512);
                                            r9.setMovementGranularities(11);
                                            list3 = (List) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.a);
                                            if (list3 != null) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            if (z11) {
                                                if (o0Var3.c(androidx.compose.ui.semantics.w.F)) {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            nVarX2 = V.x();
                                                            if (nVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        nVarX = V.x();
                                                        if (nVarX != null) {
                                                            objG12 = nVarX.e.g(zVar2);
                                                            if (objG12 == null) {
                                                                objG12 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                } else {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            nVarX2 = V.x();
                                                            if (nVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        nVarX = V.x();
                                                        if (nVarX != null) {
                                                            objG12 = nVarX.e.g(zVar2);
                                                            if (objG12 == null) {
                                                                objG12 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z13) {
                                                    r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = r1.g();
                                            if (charSequenceG != null) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.z)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.P)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r1.i(arrayList3);
                                        }
                                        iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.c);
                                        f = 0.0f;
                                        if (iVar != null) {
                                            f3 = iVar.a;
                                            f4 = iVar.b.a;
                                            zVar4 = androidx.compose.ui.semantics.m.i;
                                            if (o0Var3.c(zVar4)) {
                                                r1.k("android.widget.SeekBar");
                                            } else {
                                                r1.k("android.widget.ProgressBar");
                                            }
                                            if (iVar != androidx.compose.ui.semantics.i.c) {
                                                accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                            }
                                            if (o0Var3.c(zVar4)) {
                                                if (f4 < 0.0f) {
                                                    f5 = 0.0f;
                                                } else {
                                                    f5 = f4;
                                                }
                                                if (f3 < f5) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                }
                                                if (0.0f <= f4) {
                                                    f4 = 0.0f;
                                                }
                                                if (f3 > f4) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                }
                                            }
                                        }
                                        if (i0.b(sVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                        objG8 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        dVar2 = (androidx.compose.ui.semantics.d) objG8;
                                        accessibilityNodeInfo3 = r1.a;
                                        if (dVar2 != null) {
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar2.a, dVar2.b, false, 0));
                                            f2 = 0.0f;
                                        } else {
                                            arrayList = new ArrayList();
                                            objG9 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                            if ((objG9 != null ? objG9 : null) != null) {
                                                listJ2 = androidx.compose.ui.semantics.s.j(4, sVar2);
                                                size3 = listJ2.size();
                                                i7 = 0;
                                                while (i7 < size3) {
                                                    float f8 = f;
                                                    sVar3 = (androidx.compose.ui.semantics.s) listJ2.get(i7);
                                                    char c4 = c;
                                                    if (sVar3.k().e.c(androidx.compose.ui.semantics.w.I)) {
                                                        arrayList.add(sVar3);
                                                    }
                                                    i7++;
                                                    c = c4;
                                                    f = f8;
                                                }
                                            }
                                            f2 = f;
                                            if (!arrayList.isEmpty()) {
                                                zG = coil3.network.g.g(arrayList);
                                                if (zG) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zG ? arrayList.size() : 1, false, 0));
                                            }
                                        }
                                        coil3.network.g.C(sVar2, r1);
                                        kVar = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.u);
                                        androidx.compose.ui.semantics.a aVar16 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.d);
                                        if (kVar != null) {
                                            objG10 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                            if (objG10 == null) {
                                                objG10 = th;
                                            }
                                            if (objG10 == null) {
                                                objG11 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                r1.k("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) kVar.b.invoke()).floatValue() > f2) {
                                                r1.p(true);
                                            }
                                            if (i0.b(sVar2)) {
                                                z7 = a0.z(kVar);
                                                mVar = androidx.compose.ui.unit.m.y;
                                                if (z7) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                    f0Var2 = f0Var3;
                                                    if (f0Var2.X == mVar) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        bVar2 = androidx.core.view.accessibility.b.n;
                                                    } else {
                                                        bVar2 = androidx.core.view.accessibility.b.p;
                                                    }
                                                    r1.b(bVar2);
                                                } else {
                                                    f0Var2 = f0Var3;
                                                }
                                                if (a0.y(kVar)) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                    if (f0Var2.X == mVar) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        bVar = androidx.core.view.accessibility.b.p;
                                                    } else {
                                                        bVar = androidx.core.view.accessibility.b.n;
                                                    }
                                                    r1.b(bVar);
                                                }
                                            }
                                        }
                                        kVar2 = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.v);
                                        if (kVar2 != null) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i0.d(sVar2, r1);
                                        }
                                        r1.n((CharSequence) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.d));
                                        if (i0.b(sVar2)) {
                                            aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.t);
                                            if (aVar5 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                            }
                                            aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.u);
                                            if (aVar6 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                            }
                                            aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.v);
                                            if (aVar7 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                            }
                                            zVar3 = androidx.compose.ui.semantics.m.x;
                                            if (o0Var3.c(zVar3)) {
                                                list2 = (List) nVar3.d(zVar3);
                                                size4 = list2.size();
                                                yVar = a0.l0;
                                                if (size4 < yVar.b) {
                                                    androidx.collection.z0 z0Var6 = new androidx.collection.z0(0);
                                                    androidx.collection.f0 f0VarA3 = androidx.collection.t0.a();
                                                    z0Var3 = z0Var2;
                                                    if (z0Var3.e) {
                                                        androidx.collection.t.a(z0Var3);
                                                    }
                                                    if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                        iArr = yVar.a;
                                                        i8 = yVar.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i319 = iArr[i9];
                                                            int i3110 = i8;
                                                            i11 = i10 + 1;
                                                            int i3111 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i319;
                                                            i9 = i3111 + 1;
                                                            i10 = i11;
                                                            i8 = i3110;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                            f0Var.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.D(arrayList2.get(0));
                                                            if (i10 <= 0) {
                                                                int i42 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            com.google.firebase.platforminfo.b.l("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                        yVar.c(0);
                                                        throw th;
                                                    }
                                                    r7.P.e(i6, z0Var6);
                                                    z0Var3.e(i6, f0VarA3);
                                                } else {
                                                    kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.o(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                return null;
                                            }
                                        }
                                        r1.o(i0.c(sVar2, resources));
                                        iD = r7.Z.d(i6);
                                        if (iD != -1) {
                                            hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                            if (hVarP2 != null) {
                                                r9.setTraversalBefore(hVarP2);
                                                uVar = uVar2;
                                            } else {
                                                uVar = uVar2;
                                                r9.setTraversalBefore(uVar, iD);
                                            }
                                            ?? r13 = th;
                                            r7.j(i6, r1, r7.b0, r13);
                                            r5 = r13;
                                        } else {
                                            r5 = th;
                                            uVar = uVar2;
                                        }
                                        iD2 = r7.a0.d(i6);
                                        if (iD2 != -1) {
                                            r9.setTraversalAfter(hVarP);
                                            r7.j(i6, r1, r7.c0, r5);
                                        }
                                        str2 = (String) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.x.b);
                                        if (str2 != null) {
                                            r1.k(str2);
                                        }
                                        r6 = r1;
                                        r10 = r7;
                                    } else {
                                        a0Var = a0Var2;
                                    }
                                    z2 = true;
                                    r7 = a0Var;
                                    r9.setVisibleToUser(androidx.compose.ui.semantics.v.e(sVar2) ^ z2);
                                    if (((androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.j)) != null) {
                                        accessibilityNodeInfo2.setLiveRegion(2);
                                    }
                                    r9.setClickable(false);
                                    aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.b);
                                    c = 3;
                                    if (aVar2 != null) {
                                        boolean zA7 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.I), Boolean.TRUE);
                                        if (jVar3 == null) {
                                            z14 = false;
                                        } else {
                                            z14 = true;
                                        }
                                        if (z14) {
                                            z15 = true;
                                        } else {
                                            if (jVar3 == null) {
                                                z17 = false;
                                            } else {
                                                z17 = true;
                                            }
                                            if (z17) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        }
                                        if (z15) {
                                            z16 = true;
                                        } else {
                                            z16 = true;
                                        }
                                        r9.setClickable(z16);
                                        if (i0.b(sVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                        }
                                    }
                                    r9.setLongClickable(false);
                                    aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.c);
                                    if (aVar3 != null) {
                                        r9.setLongClickable(true);
                                        if (i0.b(sVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                        }
                                    }
                                    aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.q);
                                    if (aVar4 != null) {
                                        r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                    }
                                    if (i0.b(sVar2)) {
                                        aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.k);
                                        if (aVar10 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                        }
                                        aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.p);
                                        if (aVar11 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                        }
                                        aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.r);
                                        if (aVar12 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                        }
                                        aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.s);
                                        if (aVar13 != null) {
                                            primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                            }
                                        }
                                    }
                                    strT = a0.t(sVar2);
                                    if (strT != null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        accessibilityNodeInfo2.setTextSelection(r7.r(sVar2), r7.q(sVar2));
                                        aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.j);
                                        if (aVar9 != null) {
                                            r8 = aVar9.a;
                                        } else {
                                            r8 = th;
                                        }
                                        r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                        r1.a(LibretroCore.SCREEN_WIDTH);
                                        r1.a(512);
                                        r9.setMovementGranularities(11);
                                        list3 = (List) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.a);
                                        if (list3 != null) {
                                            z11 = true;
                                        } else {
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (o0Var3.c(androidx.compose.ui.semantics.w.F)) {
                                                V = f0Var3.v();
                                                while (true) {
                                                    if (V == 0) {
                                                        V = th;
                                                    } else {
                                                        nVarX2 = V.x();
                                                        if (nVarX2 != null) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            V = V.v();
                                                        }
                                                    }
                                                }
                                                if (V != 0) {
                                                    nVarX = V.x();
                                                    if (nVarX != null) {
                                                        objG12 = nVarX.e.g(zVar2);
                                                        if (objG12 == null) {
                                                            objG12 = th;
                                                        }
                                                        zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            } else {
                                                V = f0Var3.v();
                                                while (true) {
                                                    if (V == 0) {
                                                        V = th;
                                                    } else {
                                                        nVarX2 = V.x();
                                                        if (nVarX2 != null) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            V = V.v();
                                                        }
                                                    }
                                                }
                                                if (V != 0) {
                                                    nVarX = V.x();
                                                    if (nVarX != null) {
                                                        objG12 = nVarX.e.g(zVar2);
                                                        if (objG12 == null) {
                                                            objG12 = th;
                                                        }
                                                        zA = kotlin.jvm.internal.l.a(objG12, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z13) {
                                                r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayList3 = new ArrayList();
                                        arrayList3.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = r1.g();
                                        if (charSequenceG != null) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        if (!z10) {
                                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (o0Var3.c(androidx.compose.ui.semantics.w.z)) {
                                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (o0Var3.c(androidx.compose.ui.semantics.w.P)) {
                                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r1.i(arrayList3);
                                    }
                                    iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.c);
                                    f = 0.0f;
                                    if (iVar != null) {
                                        f3 = iVar.a;
                                        f4 = iVar.b.a;
                                        zVar4 = androidx.compose.ui.semantics.m.i;
                                        if (o0Var3.c(zVar4)) {
                                            r1.k("android.widget.SeekBar");
                                        } else {
                                            r1.k("android.widget.ProgressBar");
                                        }
                                        if (iVar != androidx.compose.ui.semantics.i.c) {
                                            accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                        }
                                        if (o0Var3.c(zVar4)) {
                                            if (f4 < 0.0f) {
                                                f5 = 0.0f;
                                            } else {
                                                f5 = f4;
                                            }
                                            if (f3 < f5) {
                                                r1.b(androidx.core.view.accessibility.b.h);
                                            }
                                            if (0.0f <= f4) {
                                                f4 = 0.0f;
                                            }
                                            if (f3 > f4) {
                                                r1.b(androidx.core.view.accessibility.b.i);
                                            }
                                        }
                                    }
                                    if (i0.b(sVar2)) {
                                        r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                    }
                                    objG8 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    dVar2 = (androidx.compose.ui.semantics.d) objG8;
                                    accessibilityNodeInfo3 = r1.a;
                                    if (dVar2 != null) {
                                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar2.a, dVar2.b, false, 0));
                                        f2 = 0.0f;
                                    } else {
                                        arrayList = new ArrayList();
                                        objG9 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                        if ((objG9 != null ? objG9 : null) != null) {
                                            listJ2 = androidx.compose.ui.semantics.s.j(4, sVar2);
                                            size3 = listJ2.size();
                                            i7 = 0;
                                            while (i7 < size3) {
                                                float f9 = f;
                                                sVar3 = (androidx.compose.ui.semantics.s) listJ2.get(i7);
                                                char c5 = c;
                                                if (sVar3.k().e.c(androidx.compose.ui.semantics.w.I)) {
                                                    arrayList.add(sVar3);
                                                }
                                                i7++;
                                                c = c5;
                                                f = f9;
                                            }
                                        }
                                        f2 = f;
                                        if (!arrayList.isEmpty()) {
                                            zG = coil3.network.g.g(arrayList);
                                            if (zG) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zG ? arrayList.size() : 1, false, 0));
                                        }
                                    }
                                    coil3.network.g.C(sVar2, r1);
                                    kVar = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.u);
                                    androidx.compose.ui.semantics.a aVar17 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.d);
                                    if (kVar != null) {
                                        objG10 = sVar2.k().e.g(androidx.compose.ui.semantics.w.f);
                                        if (objG10 == null) {
                                            objG10 = th;
                                        }
                                        if (objG10 == null) {
                                            objG11 = sVar2.k().e.g(androidx.compose.ui.semantics.w.e);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                        } else {
                                            z6 = true;
                                        }
                                        if (!z6) {
                                            r1.k("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) kVar.b.invoke()).floatValue() > f2) {
                                            r1.p(true);
                                        }
                                        if (i0.b(sVar2)) {
                                            z7 = a0.z(kVar);
                                            mVar = androidx.compose.ui.unit.m.y;
                                            if (z7) {
                                                r1.b(androidx.core.view.accessibility.b.h);
                                                f0Var2 = f0Var3;
                                                if (f0Var2.X == mVar) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    bVar2 = androidx.core.view.accessibility.b.p;
                                                } else {
                                                    bVar2 = androidx.core.view.accessibility.b.n;
                                                }
                                                r1.b(bVar2);
                                            } else {
                                                f0Var2 = f0Var3;
                                            }
                                            if (a0.y(kVar)) {
                                                r1.b(androidx.core.view.accessibility.b.i);
                                                if (f0Var2.X == mVar) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    bVar = androidx.core.view.accessibility.b.n;
                                                } else {
                                                    bVar = androidx.core.view.accessibility.b.p;
                                                }
                                                r1.b(bVar);
                                            }
                                        }
                                    }
                                    kVar2 = (androidx.compose.ui.semantics.k) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.v);
                                    if (kVar2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i0.d(sVar2, r1);
                                    }
                                    r1.n((CharSequence) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.w.d));
                                    if (i0.b(sVar2)) {
                                        aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.t);
                                        if (aVar5 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                        }
                                        aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.u);
                                        if (aVar6 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                        }
                                        aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.m.v);
                                        if (aVar7 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                        }
                                        zVar3 = androidx.compose.ui.semantics.m.x;
                                        if (o0Var3.c(zVar3)) {
                                            list2 = (List) nVar3.d(zVar3);
                                            size4 = list2.size();
                                            yVar = a0.l0;
                                            if (size4 < yVar.b) {
                                                androidx.collection.z0 z0Var7 = new androidx.collection.z0(0);
                                                androidx.collection.f0 f0VarA4 = androidx.collection.t0.a();
                                                z0Var3 = z0Var2;
                                                if (z0Var3.e) {
                                                    androidx.collection.t.a(z0Var3);
                                                }
                                                if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                    iArr = yVar.a;
                                                    i8 = yVar.b;
                                                    iArrCopyOf = new int[16];
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < i8) {
                                                        int i3112 = iArr[i9];
                                                        int i3113 = i8;
                                                        i11 = i10 + 1;
                                                        int i3114 = i9;
                                                        if (iArrCopyOf.length < i11) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i10] = i3112;
                                                        i9 = i3114 + 1;
                                                        i10 = i11;
                                                        i8 = i3113;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                        f0Var.getClass();
                                                        throw th;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.D(arrayList2.get(0));
                                                        if (i10 <= 0) {
                                                            int i43 = iArrCopyOf[0];
                                                            throw th;
                                                        }
                                                        com.google.firebase.platforminfo.b.l("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    androidx.privacysandbox.ads.adservices.java.internal.a.D(list2.get(0));
                                                    yVar.c(0);
                                                    throw th;
                                                }
                                                r7.P.e(i6, z0Var7);
                                                z0Var3.e(i6, f0VarA4);
                                            } else {
                                                kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.o(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            return null;
                                        }
                                    }
                                    r1.o(i0.c(sVar2, resources));
                                    iD = r7.Z.d(i6);
                                    if (iD != -1) {
                                        hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                        if (hVarP2 != null) {
                                            r9.setTraversalBefore(hVarP2);
                                            uVar = uVar2;
                                        } else {
                                            uVar = uVar2;
                                            r9.setTraversalBefore(uVar, iD);
                                        }
                                        ?? r14 = th;
                                        r7.j(i6, r1, r7.b0, r14);
                                        r5 = r14;
                                    } else {
                                        r5 = th;
                                        uVar = uVar2;
                                    }
                                    iD2 = r7.a0.d(i6);
                                    if (iD2 != -1) {
                                        r9.setTraversalAfter(hVarP);
                                        r7.j(i6, r1, r7.c0, r5);
                                    }
                                    str2 = (String) androidx.compose.ui.semantics.v.d(nVar3, androidx.compose.ui.semantics.x.b);
                                    if (str2 != null) {
                                        r1.k(str2);
                                    }
                                    r6 = r1;
                                    r10 = r7;
                                }
                            }
                        } else {
                            i6 = i;
                            r10 = a0Var2;
                            r6 = 0;
                        }
                    }
                }
                if (r10.M) {
                    if (i6 == r10.I) {
                        r10.K = r6;
                    }
                    if (i6 == r10.J) {
                        r10.L = r6;
                    }
                }
                return r6;
            default:
                return new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain(((androidx.customview.widget.a) this.A).n(i).a));
        }
    }

    @Override // com.app.mlounge.data.music.e
    public final androidx.core.view.accessibility.d q(int i) {
        switch (this.z) {
            case 0:
                a0 a0Var = (a0) this.A;
                if (i == 1) {
                    int i2 = a0Var.J;
                    if (i2 != Integer.MIN_VALUE) {
                        return i(i2);
                    }
                } else {
                    if (i == 2) {
                        return i(a0Var.I);
                    }
                    kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Unknown focus type: "));
                }
                return null;
            default:
                androidx.customview.widget.a aVar = (androidx.customview.widget.a) this.A;
                int i3 = i == 2 ? aVar.H : aVar.I;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return i(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:181:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:277:0x044e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0452  */
    /* JADX WARN: Code duplicated, block: B:280:0x0454  */
    /* JADX WARN: Code duplicated, block: B:283:0x0459  */
    /* JADX WARN: Code duplicated, block: B:284:0x045b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0461  */
    /* JADX WARN: Code duplicated, block: B:288:0x0463  */
    /* JADX WARN: Code duplicated, block: B:291:0x0469  */
    /* JADX WARN: Code duplicated, block: B:292:0x046b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0471  */
    /* JADX WARN: Code duplicated, block: B:296:0x0473  */
    /* JADX WARN: Code duplicated, block: B:299:0x0479  */
    /* JADX WARN: Code duplicated, block: B:300:0x047b  */
    /* JADX WARN: Code duplicated, block: B:307:0x0487  */
    /* JADX WARN: Code duplicated, block: B:314:0x0493  */
    /* JADX WARN: Code duplicated, block: B:317:0x0498  */
    /* JADX WARN: Code duplicated, block: B:319:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:325:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:327:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:330:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:333:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:336:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:339:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:340:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:342:0x0501  */
    /* JADX WARN: Code duplicated, block: B:345:0x0506  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:353:0x0529  */
    /* JADX WARN: Code duplicated, block: B:357:0x0530  */
    /* JADX WARN: Code duplicated, block: B:359:0x053a  */
    /* JADX WARN: Code duplicated, block: B:362:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:403:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:406:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:409:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:411:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:412:0x05de  */
    /* JADX WARN: Code duplicated, block: B:414:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:415:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:418:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:420:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:426:0x0619  */
    /* JADX WARN: Code duplicated, block: B:428:0x061d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0625  */
    /* JADX WARN: Code duplicated, block: B:431:0x0627  */
    /* JADX WARN: Code duplicated, block: B:433:0x062b  */
    /* JADX WARN: Code duplicated, block: B:435:0x0631  */
    /* JADX WARN: Code duplicated, block: B:436:0x0633  */
    /* JADX WARN: Code duplicated, block: B:439:0x0638  */
    /* JADX WARN: Code duplicated, block: B:502:0x072b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:503:0x072d  */
    /* JADX WARN: Code duplicated, block: B:505:0x073b  */
    /* JADX WARN: Code duplicated, block: B:506:0x073d  */
    /* JADX WARN: Code duplicated, block: B:509:0x0742  */
    /* JADX WARN: Code duplicated, block: B:510:0x0744  */
    /* JADX WARN: Code duplicated, block: B:516:0x0759  */
    /* JADX WARN: Code duplicated, block: B:521:0x0767  */
    /* JADX WARN: Code duplicated, block: B:534:0x077f  */
    /* JADX WARN: Code duplicated, block: B:539:0x0796  */
    /* JADX WARN: Code duplicated, block: B:546:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:548:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:551:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:553:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:565:0x0830  */
    /* JADX WARN: Code duplicated, block: B:567:0x0837 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:568:0x0839  */
    /* JADX WARN: Code duplicated, block: B:569:0x083b  */
    /* JADX WARN: Code duplicated, block: B:572:0x0842  */
    /* JADX WARN: Code duplicated, block: B:573:0x0847  */
    /* JADX WARN: Code duplicated, block: B:576:0x084f  */
    /* JADX WARN: Code duplicated, block: B:578:0x0859  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:590:0x087f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:591:0x0881  */
    /* JADX WARN: Code duplicated, block: B:592:0x0884  */
    /* JADX WARN: Code duplicated, block: B:595:0x0889  */
    /* JADX WARN: Code duplicated, block: B:596:0x088c  */
    /* JADX WARN: Code duplicated, block: B:599:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:602:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:604:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:605:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:610:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:613:0x08da  */
    /* JADX WARN: Code duplicated, block: B:615:0x08de  */
    /* JADX WARN: Code duplicated, block: B:616:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:618:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:620:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:621:0x08ef  */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0370, code lost:
    
        if (((java.lang.Boolean) r1.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r16))).booleanValue() == true) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x023d, code lost:
    
        r2 = null;
     */
    @Override // com.app.mlounge.data.music.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(int r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v.v(int, int, android.os.Bundle):boolean");
    }
}
