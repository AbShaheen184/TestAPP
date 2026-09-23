package androidx.compose.material3;

import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s3 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.w2 y;

    public /* synthetic */ s3(androidx.compose.runtime.w2 w2Var, int i) {
        this.e = i;
        this.y = w2Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((androidx.compose.ui.graphics.k0) obj).c(((Number) this.y.getValue()).floatValue());
                return kotlin.y.a;
            case 1:
                ((androidx.compose.ui.graphics.k0) obj).c(((Number) this.y.getValue()).floatValue());
                return kotlin.y.a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                return "game_" + ((Game) ((List) this.y.getValue()).get(iIntValue)).c() + "_" + iIntValue;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                return androidx.compose.runtime.j.g("movie_", ((TmdbMovie) ((List) this.y.getValue()).get(iIntValue2)).a(), "_", iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                Object obj2 = ((List) this.y.getValue()).get(iIntValue3);
                if (obj2 instanceof MusicAlbum) {
                    return "album_" + ((MusicAlbum) obj2).d() + "_" + iIntValue3;
                }
                if (!(obj2 instanceof MusicArtist)) {
                    return String.valueOf(iIntValue3);
                }
                return "artist_" + ((MusicArtist) obj2).c() + "_" + iIntValue3;
            default:
                int iIntValue4 = ((Integer) obj).intValue();
                return androidx.compose.runtime.j.g("tv_", ((TmdbTvShow) ((List) this.y.getValue()).get(iIntValue4)).b(), "_", iIntValue4);
        }
    }
}
