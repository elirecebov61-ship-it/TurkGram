/*
 * This is the source code of TurkGram for Android.
 *
 * We do not and cannot prevent the use of our code,
 * but be respectful and credit the original author.
 *
 * Copyright @Radolyn, 2023
 */

package com.radolyn.turkgram.sync.models;

public interface SyncEvent {
    String type = "sync_unspecified";
    long userId = 0;
}
