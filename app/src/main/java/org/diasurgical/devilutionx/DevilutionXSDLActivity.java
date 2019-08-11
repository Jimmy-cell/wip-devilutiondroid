package org.diasurgical.devilutionx;

import org.libsdl.app.SDLActivity;

public class DevilutionXSDLActivity extends SDLActivity {
//    protected String getMainSharedObject() {
//        return getContext().getApplicationInfo().nativeLibraryDir + "/libdevilutionx.so";
//    }

    protected String[] getLibraries() {
        return new String[] {
            "SDL2",
            "SDL2_mixer",
            "SDL2_ttf",
            "devilutionx"
        };
    }
}
