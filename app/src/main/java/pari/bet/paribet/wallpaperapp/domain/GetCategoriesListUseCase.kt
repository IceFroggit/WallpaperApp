package pari.bet.paribet.wallpaperapp.domain

import androidx.lifecycle.LiveData

class GetCategoriesListUseCase(private val wallAppRepository: WallAppRepository) {
    //todo временно вместо категорий стринг
    fun getCategoriesList(): LiveData<List<String>> {
        return wallAppRepository.getCategoriesList()
    }
}