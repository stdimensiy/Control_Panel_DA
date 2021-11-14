package ru.vdv.dadapprovescontrolpanel.interfaces

import android.widget.ImageView

interface BaseUserItemView {
    /**
     * Метод устанавливает значение текстового поля name
     * твечающего за отображение имени пользователя
     * @param name  - передаваемая для отображения строка
     */
    fun setName(name: String)

    /**
     * Метод устанавливает картинку аватара пользователя
     * @param url  - адрес (URL) нахождения файла изображения (аватара пользователя)
     */
    fun setImageAvatar(url: String)

    /**
     * Метод устанавливает кастомную картинку фона карточки пользователя
     * @param url  - адрес (URL) нахождения файла изображения (фоно пользователя)
     */
    fun setCustomBackgroundImage(url: String)
}