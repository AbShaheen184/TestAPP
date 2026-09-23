package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.appcompat.widget.x;
import androidx.emoji2.text.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.g0;
import org.jsoup.parser.e0;
import org.schabi.newpipe.extractor.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public com.grack.nanojson.c j;

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final long A() {
        return this.j.d("audio_duration", 0L);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final /* bridge */ /* synthetic */ g G() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void H() {
        com.grack.nanojson.b<com.grack.nanojson.c> bVarA = this.j.a("tracks");
        ArrayList arrayList = new ArrayList(bVarA.size());
        for (com.grack.nanojson.c cVar : bVarA) {
            cVar.f("title", null);
            cVar.c("timecode", 0);
            org.schabi.newpipe.extractor.stream.d dVar = new org.schabi.newpipe.extractor.stream.d();
            cVar.d("track_art_id", 0L);
            List list = b.a;
            cVar.f("artist", null);
            arrayList.add(dVar);
        }
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List O() {
        return Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String P() {
        return this.j.f("published_date", null);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List Q() {
        return b.b(this.j.d("show_image_id", 0L), false);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List U() {
        return Collections.singletonList(new org.schabi.newpipe.extractor.a(512, "https://bandcamp.com/img/buttons/bandcamp-button-circle-whitecolor-512.png", 512, 2));
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String V() {
        return (String) e0.a(this.j.f("image_caption", null), "").W("a").stream().map(new androidx.media3.exoplayer.audio.f(9)).findFirst().orElseThrow(new org.jsoup.internal.c(9));
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final String X() throws org.schabi.newpipe.extractor.exceptions.c {
        throw new org.schabi.newpipe.extractor.exceptions.c("Fan pages are not supported");
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f
    public final org.schabi.newpipe.extractor.channel.d f0() {
        return null;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, androidx.work.j0
    public final String h() {
        return this.j.f("subtitle", null);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, androidx.work.j0
    public final String l() {
        return ((org.schabi.newpipe.extractor.linkhandler.a) this.d).y;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, androidx.work.j0
    public final void m(com.app.mlounge.data.music.e eVar) throws org.schabi.newpipe.extractor.exceptions.f {
        int i = Integer.parseInt(((org.schabi.newpipe.extractor.linkhandler.a) this.d).z);
        try {
            this.j = (com.grack.nanojson.c) x.p().m((String) g0.a.r("https://bandcamp.com/api/bcweekly/1/get?id=" + i).B);
        } catch (com.grack.nanojson.d | IOException e) {
            org.mozilla.javascript.typedarrays.c.d("could not get show data", e);
        }
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final List p() {
        ArrayList arrayList = new ArrayList();
        com.grack.nanojson.c cVarE = this.j.e("audio_stream");
        if (cVarE.containsKey("mp3-128")) {
            org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
            aVar.a = "mp3-128";
            aVar.b = cVarE.f("mp3-128", null);
            aVar.c = true;
            aVar.e = i.MP3;
            aVar.f = 128;
            arrayList.add(aVar.a());
        }
        if (cVarE.containsKey("opus-lo")) {
            org.schabi.newpipe.extractor.stream.a aVar2 = new org.schabi.newpipe.extractor.stream.a();
            aVar2.a = "opus-lo";
            aVar2.b = cVarE.f("opus-lo", null);
            aVar2.c = true;
            aVar2.e = i.OPUS;
            aVar2.f = 100;
            arrayList.add(aVar2.a());
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        return new org.schabi.newpipe.extractor.stream.c(this.j.f("desc", null), 3);
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final void B() {
    }

    @Override // org.schabi.newpipe.extractor.services.bandcamp.extractors.f, org.schabi.newpipe.extractor.f
    public final void q() {
    }
}
