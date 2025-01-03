package com.ninja.music.models

import com.ninja.innertube.models.YTItem
import com.ninja.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
