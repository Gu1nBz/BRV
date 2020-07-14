/*
 * Copyright (C) 2018, Umbrella CompanyLimited All rights reserved.
 * Project：BRV
 * Author：drake
 * Date：7/15/20 3:20 AM
 */

package com.drake.brv.animation

import android.animation.ObjectAnimator
import android.view.View


class SlideBottomItemAnimation : ItemAnimation {

    override fun onItemEnterAnimation(view: View) {
        ObjectAnimator.ofFloat(view, "translationY", view.measuredHeight.toFloat(), 0F)
                .setDuration(300)
                .start()
    }
}
