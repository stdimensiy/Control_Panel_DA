package ru.vdv.dadapprovescontrolpanel.glide

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import ru.vdv.dadapprovescontrolpanel.R
import ru.vdv.dadapprovescontrolpanel.interfaces.IImageLoader

class GlideImageLoader: IImageLoader<ImageView> {
    override fun loadInfo(url: String, container: ImageView) {
        Glide.with(container.context)
            .load(url)
            .placeholder(R.drawable.user_plug)
            .error(R.drawable.error_sign)
            .transition(DrawableTransitionOptions.withCrossFade(1500))
            .circleCrop()
            .into(container)
    }
}