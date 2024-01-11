package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf<Page>(
    Page("Page 1", "Page description", R.drawable.onboarding1),
    Page("Page 2", "Page description", R.drawable.onboarding2),
    Page("Page 3", "Page description", R.drawable.onboarding3),
)