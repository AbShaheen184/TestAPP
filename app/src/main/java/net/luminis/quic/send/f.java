package net.luminis.quic.send;

import java.util.ArrayList;
import java.util.function.Consumer;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ f(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                net.luminis.quic.packet.g gVar = (net.luminis.quic.packet.g) obj;
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i < arrayList.size()) {
                        if (arrayList.get(i) != g.h) {
                            ((Consumer) arrayList.get(i)).accept((n) gVar.c.get(i));
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                org.schabi.newpipe.extractor.stream.e eVar = (org.schabi.newpipe.extractor.stream.e) obj;
                ArrayList arrayList2 = this.b;
                if (!org.schabi.newpipe.extractor.stream.e.a(eVar, arrayList2)) {
                    arrayList2.add(eVar);
                }
                break;
        }
    }
}
