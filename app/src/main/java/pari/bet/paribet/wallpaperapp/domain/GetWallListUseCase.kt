package pari.bet.paribet.wallpaperapp.domain

import androidx.lifecycle.LiveData

class GetWallListUseCase(private val wallAppRepository:WallAppRepository) {
   fun getWallList(category:String):LiveData<List<WallItem>>{
       return wallAppRepository.getWallList(category)
    }
}