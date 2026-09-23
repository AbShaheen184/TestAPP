package org.schabi.newpipe.extractor.services.media_ccc.extractors;

import androidx.appcompat.widget.x;
import androidx.compose.runtime.j;
import com.app.mlounge.data.music.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.jsoup.internal.g;
import org.schabi.newpipe.extractor.exceptions.d;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public com.grack.nanojson.c f;
    public com.grack.nanojson.c g;

    @Override // org.schabi.newpipe.extractor.f
    public final long A() {
        return this.f.c("length", 0);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final int I() {
        return 2;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List O() {
        return org.schabi.newpipe.extractor.utils.b.g(this.f.a("tags"));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String P() {
        return this.f.f("release_date", null);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Q() {
        return b.b(this.f, "thumb_url", "poster_url");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void T() throws org.schabi.newpipe.extractor.exceptions.f {
        org.schabi.newpipe.extractor.localization.b.b(P());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List U() {
        return b.a(this.g.f("logo_url", null));
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String V() {
        return this.f.f("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", "");
    }

    @Override // org.schabi.newpipe.extractor.f
    public final String X() {
        return j.i("https://media.ccc.de/c/", V());
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List Y() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[SYNTHETIC] */
    @Override // org.schabi.newpipe.extractor.f
    public final List Z() {
        i iVar;
        i iVar2;
        String strF;
        String strF2;
        String strD;
        com.grack.nanojson.b bVarA = this.f.a("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVarA.size(); i++) {
            com.grack.nanojson.c cVarB = bVarA.b(i);
            String strF3 = cVarB.f("mime_type", null);
            if (strF3.startsWith("video")) {
                if (strF3.endsWith("webm")) {
                    iVar2 = i.WEBM;
                } else {
                    if (strF3.endsWith("mp4")) {
                        iVar2 = i.MPEG_4;
                    } else {
                        iVar = null;
                    }
                    strF = cVarB.f("filename", " ");
                    strF2 = cVarB.f("recording_url", null);
                    strD = j.d(cVarB.c("height", 0), "p");
                    if (strF != null) {
                        kotlinx.coroutines.future.a.u("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
                        return null;
                    }
                    if (strF2 != null) {
                        kotlinx.coroutines.future.a.u("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                        return null;
                    }
                    arrayList.add(new org.schabi.newpipe.extractor.stream.j(strF2, true, iVar, 1, strD, false, null));
                }
                iVar = iVar2;
                strF = cVarB.f("filename", " ");
                strF2 = cVarB.f("recording_url", null);
                strD = j.d(cVarB.c("height", 0), "p");
                if (strF != null) {
                    kotlinx.coroutines.future.a.u("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
                    return null;
                }
                if (strF2 != null) {
                    kotlinx.coroutines.future.a.u("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
                    return null;
                }
                arrayList.add(new org.schabi.newpipe.extractor.stream.j(strF2, true, iVar, 1, strD, false, null));
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void a0() {
        this.f.c("view_count", 0);
    }

    @Override // androidx.work.j0
    public final String h() {
        return this.f.f("title", null);
    }

    @Override // androidx.work.j0
    public final String i() {
        return this.f.f("frontend_link", null);
    }

    @Override // androidx.work.j0
    public final void m(e eVar) throws d {
        String strI = j.i("https://api.media.ccc.de/public/events/", ((org.schabi.newpipe.extractor.linkhandler.a) this.d).z);
        try {
            this.f = (com.grack.nanojson.c) x.p().m((String) eVar.r(strI).B);
            this.g = (com.grack.nanojson.c) x.p().m((String) eVar.r(this.f.f("conference_url", null)).B);
        } catch (com.grack.nanojson.d e) {
            throw new d("Could not parse json returned by URL: ".concat(strI), e);
        }
    }

    @Override // org.schabi.newpipe.extractor.f
    public final List p() {
        i iVar;
        com.grack.nanojson.b bVarA = this.f.a("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVarA.size(); i++) {
            com.grack.nanojson.c cVarB = bVarA.b(i);
            String strF = cVarB.f("mime_type", null);
            if (strF.startsWith("audio")) {
                if (strF.endsWith("opus")) {
                    iVar = i.OPUS;
                } else if (strF.endsWith("mpeg")) {
                    iVar = i.MP3;
                } else {
                    iVar = strF.endsWith("ogg") ? i.OGG : null;
                }
                org.schabi.newpipe.extractor.stream.a aVar = new org.schabi.newpipe.extractor.stream.a();
                aVar.a = cVarB.f("filename", " ");
                aVar.b = cVarB.f("recording_url", null);
                aVar.c = true;
                aVar.e = iVar;
                aVar.f = -1;
                String strF2 = cVarB.f("language", null);
                if (strF2 != null && !strF2.contains("-")) {
                    aVar.h = (Locale) org.schabi.newpipe.extractor.utils.b.c(strF2).orElseThrow(new g(strF2, 3));
                }
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }

    @Override // org.schabi.newpipe.extractor.f
    public final org.schabi.newpipe.extractor.stream.c s() {
        return new org.schabi.newpipe.extractor.stream.c(this.f.f("description", null), 3);
    }

    @Override // org.schabi.newpipe.extractor.f
    public final void z() throws org.schabi.newpipe.extractor.exceptions.f {
        String strF = this.f.f("original_language", null);
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length);
        for (String str : iSOLanguages) {
            Locale locale = new Locale(str);
            map.put(locale.getISO3Language(), locale);
        }
        if (!map.containsKey(strF)) {
            throw new org.schabi.newpipe.extractor.exceptions.f(j.i("Could not get Locale from this three letter language code", strF));
        }
    }
}
