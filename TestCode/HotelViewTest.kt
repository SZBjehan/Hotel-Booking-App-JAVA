package com.turquoise.hotelbookrecomendation.Activities

import com.google.common.truth.Truth
import org.junit.Test


class HotelViewTest  {

    @Test
    fun ClickView() {
        val result = HotelView.Views(
                viewCount = 1
        )
        Truth.assertThat(result).isTrue()
    }
    @Test
    fun NotClickView() {
        val result = HotelView.Views(
                viewCount = 0
        )
        Truth.assertThat(result).isFalse()
    }

}