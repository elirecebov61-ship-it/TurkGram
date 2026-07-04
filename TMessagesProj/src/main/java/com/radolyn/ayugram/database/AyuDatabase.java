/*
 * This is the source code of TurkGram for Android.
 *
 * We do not and cannot prevent the use of our code,
 * but be respectful and credit the original author.
 *
 * Copyright @Radolyn, 2023
 */

package com.radolyn.turkgram.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.radolyn.turkgram.database.dao.DeletedMessageDao;
import com.radolyn.turkgram.database.dao.EditedMessageDao;
import com.radolyn.turkgram.database.entities.DeletedMessage;
import com.radolyn.turkgram.database.entities.DeletedMessageReaction;
import com.radolyn.turkgram.database.entities.EditedMessage;

@Database(entities = {
        EditedMessage.class,
        DeletedMessage.class,
        DeletedMessageReaction.class
}, version = 21)
public abstract class AyuDatabase extends RoomDatabase {
    public abstract EditedMessageDao editedMessageDao();

    public abstract DeletedMessageDao deletedMessageDao();
}