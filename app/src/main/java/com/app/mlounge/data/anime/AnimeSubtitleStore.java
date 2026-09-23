package com.app.mlounge.data.anime;

import com.app.mlounge.data.remote.model.HiAnimeTrack;
import java.util.List;
import kotlin.collections.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AnimeSubtitleStore {
    public static final AnimeSubtitleStore INSTANCE = new AnimeSubtitleStore();
    private static volatile List<HiAnimeTrack> tracks = w.e;
    public static final int $stable = 8;

    private AnimeSubtitleStore() {
    }

    public final List<HiAnimeTrack> consume() {
        List<HiAnimeTrack> list = tracks;
        tracks = w.e;
        return list;
    }

    public final void set(List<HiAnimeTrack> list) {
        list.getClass();
        tracks = list;
    }
}
