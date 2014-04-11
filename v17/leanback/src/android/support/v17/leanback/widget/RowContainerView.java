/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package android.support.v17.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * RowContainerView wraps header and user defined row view
 */
final class RowContainerView extends LinearLayout {

    public RowContainerView(Context context) {
        this(context, null, 0);
    }

    public RowContainerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RowContainerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOrientation(VERTICAL);
        setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    }

    public void addHeaderView(View headerView) {
        if (indexOfChild(headerView) < 0) {
            addView(headerView, 0);
        }
    }

    public void removeHeaderView(View headerView) {
        if (indexOfChild(headerView) >= 0) {
            removeView(headerView);
        }
    }

    public void addRowView(View view) {
        addView(view);
    }

}
