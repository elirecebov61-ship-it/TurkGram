package com.radolyn.ayugram.proprietary;

import com.radolyn.ayugram.database.entities.DeletedMessage;
import com.radolyn.ayugram.database.entities.EditedMessage;
import com.radolyn.ayugram.messages.AyuSavePreferences;

import org.telegram.tgnet.TLRPC;

public class AyuMessageUtils {

    public static void map(AyuSavePreferences prefs, EditedMessage revision) {
    }

    public static void mapMedia(AyuSavePreferences prefs, EditedMessage revision, boolean force) {
    }

    public static void map(AyuSavePreferences prefs, DeletedMessage deletedMessage) {
    }

    public static void mapMedia(AyuSavePreferences prefs, DeletedMessage deletedMessage, boolean force) {
    }

    public static void map(EditedMessage editedMessage, TLRPC.TL_message msg, int currentAccount) {
    }

    public static void mapMedia(EditedMessage editedMessage, TLRPC.TL_message msg) {
    }
}
