package ru.vdv.dadapprovescontrolpanel.interfaces

/**
 * Универсальный интерфейс, на случай операивной замены библиотеки работающей с изображениями
 */

interface IImageLoader<T> {
    fun loadInfo(url: String, compiler: T)
    fun loadBg(url: String, container: T)
}