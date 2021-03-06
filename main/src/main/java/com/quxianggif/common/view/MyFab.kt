/*
 * Copyright (C) guolin, Suzhou Quxiang Inc. Open source codes for study only.
 * Do not use for commercial purpose.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.quxianggif.common.view

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * 自定义的Fab按钮，用于实现Fab偏移功能。
 * @author guolin
 * @since 2018/10/23
 */
class MyFab(context: Context, attrs: AttributeSet) : FloatingActionButton(context, attrs) {

    private var minOffset = 0

    fun setOffset(offset: Int) {
        if (offset.toFloat() != translationY) {
            val trans = Math.max(minOffset, offset)
            translationY = trans.toFloat()
        }
    }

    fun setMinOffset(minOffset: Int) {
        this.minOffset = minOffset
    }

}