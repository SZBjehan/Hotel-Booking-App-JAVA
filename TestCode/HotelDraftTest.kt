package com.turquoise.hotelbookrecomendation.Activities

import com.google.common.truth.Truth
import org.junit.Test

class HotelDraftTest {

    @Test
    fun ClickDraft() {
        val result = HotelDraft.Drafts(
                draftCount = 1
        )
        Truth.assertThat(result).isTrue()
    }
    @Test
    fun NotClickDraft() {
        val result = HotelDraft.Drafts(
                draftCount = 0
        )
        Truth.assertThat(result).isFalse()
    }
}