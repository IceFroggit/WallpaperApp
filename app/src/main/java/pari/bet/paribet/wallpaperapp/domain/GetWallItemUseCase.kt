package pari.bet.paribet.wallpaperapp.domain

class GetWallItemUseCase(private val wallAppRepository:WallAppRepository) {
    fun getWallItem(id:Int):WallItem{
        return wallAppRepository.getWallItem(id)
    }
}