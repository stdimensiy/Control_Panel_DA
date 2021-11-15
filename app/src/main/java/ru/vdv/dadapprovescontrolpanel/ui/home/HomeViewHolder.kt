package ru.vdv.dadapprovescontrolpanel.ui.home

import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import app.futured.donut.DonutSection
import ru.vdv.dadapprovescontrolpanel.databinding.HomeListItemBinding
import ru.vdv.dadapprovescontrolpanel.interfaces.BaseUserItemView
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class HomeViewHolder(
    private val vb: HomeListItemBinding,
    private val imageLoader: IImageLoader<ImageView>
) : RecyclerView.ViewHolder(vb.root),
    BaseUserItemView {
    override fun setName(name: String): Unit = with(vb) {
        tvName.text = name
        Log.d("Моя проверка", "HomeViewHolder  / сработал setName")
    }

    override fun setImageAvatar(url: String): Unit =
        with(vb) {
            imageLoader.loadInfo(url, ivUserAvatar)
            Log.d("Моя проверка", "HomeViewHolder  / сработал setImageAvatar")
        }

    override fun setCustomBackgroundImage(url: String): Unit =
        with(vb) {
            imageLoader.loadBg(url, ivUserCustomBgImage)
            Log.d("Моя проверка", "HomeViewHolder  / сработал setImageAvatar")
        }

    fun setDonatChartData(section1: DonutSection, section2: DonutSection): Unit =
        with(vb) {
            donutView.cap = 5f
            donutView.gapAngleDegrees =-45f
            donutView.gapWidthDegrees = 60f
            donutView.submitData(listOf(section1, section2))
    }

    fun setDonatChartData2(section1: DonutSection, section2: DonutSection): Unit =
        with(vb) {
            donutView2.cap = 5f
            donutView2.gapAngleDegrees =-45f
            donutView2.gapWidthDegrees = 60f
            donutView2.submitData(listOf(section1, section2))
        }
}