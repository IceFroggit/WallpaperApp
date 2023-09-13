package pari.bet.paribet.wallpaperapp.domain

class DeleteWallItemUseCase(private val wallAppRepository:WallAppRepository){
    fun deleteWallItem(wallItem: WallItem){
        wallAppRepository.deleteWallItem(wallItem)
    }
}
