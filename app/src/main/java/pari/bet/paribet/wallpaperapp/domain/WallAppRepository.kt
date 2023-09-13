package pari.bet.paribet.wallpaperapp.domain

import androidx.lifecycle.LiveData

interface WallAppRepository {
    fun setWallpaper(WallItem: WallItem)//Установить обои

    fun getWallList(category:String): LiveData<List<WallItem>>//получить список обоев

    fun getWallItem(id:Int): WallItem//Получить одну картинку обоев

    fun deleteWallItem(WallItem: WallItem)//удалить список обоев из избранных
    //todo временно вместо категорий стринг
    fun getCategoriesList():LiveData<List<String>>//Получить список всех категорий
}