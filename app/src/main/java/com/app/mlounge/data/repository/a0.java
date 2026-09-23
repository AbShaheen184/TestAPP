package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.model.MusicGenre;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final List e;
    public final x a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public final List d;

    static {
        kotlin.collections.w wVar = kotlin.collections.w.e;
        e = kotlin.collections.q.k(new MusicGenre("all", "All Genres", wVar), new MusicGenre("0", "World", kotlin.collections.q.k(new MusicGenre("3", "Celtic", wVar), new MusicGenre("14", "Jewish", wVar), new MusicGenre("79", "Arabic", wVar), new MusicGenre("169", "Chinese", wVar), new MusicGenre("179", "Japanese", wVar), new MusicGenre("194", "Korean", wVar))), new MusicGenre("313", "Classical", wVar), new MusicGenre("355", "Metal", wVar), new MusicGenre("408", "Alternative", wVar), new MusicGenre("473", "Rock", wVar), new MusicGenre("517", "R&B", wVar), new MusicGenre("539", "Dance", wVar), new MusicGenre("558", "Pop", wVar), new MusicGenre("596", "Jazz", wVar), new MusicGenre("623", "Hip Hop", wVar), new MusicGenre("654", "Electronic", wVar), new MusicGenre("750", "Country", wVar), new MusicGenre("774", "Blues", wVar), new MusicGenre("0", "Soundtracks", kotlin.collections.q.k(new MusicGenre("789", "Movie Soundtracks", wVar), new MusicGenre("792", "TV Soundtracks", wVar), new MusicGenre("794", "Game Soundtracks", wVar))));
    }

    public a0(com.app.mlounge.data.music.c cVar, com.app.mlounge.data.music.h hVar, x xVar) {
        cVar.getClass();
        hVar.getClass();
        xVar.getClass();
        this.a = xVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(cVar);
        this.b = MutableStateFlow;
        this.c = MutableStateFlow;
        this.d = kotlin.collections.q.k(cVar, hVar);
    }

    public final Object a(String str, String str2, Object obj, kotlin.coroutines.jvm.internal.c cVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new z(this, str, str2, obj, null, 3), cVar);
    }

    public final void b(String str) {
        Object next;
        str.getClass();
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.app.mlounge.data.music.d) next).getName().equals(str));
        com.app.mlounge.data.music.d dVar = (com.app.mlounge.data.music.d) next;
        if (dVar != null) {
            this.b.setValue(dVar);
        }
    }
}
