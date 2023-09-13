package pari.bet.paribet.wallpaperapp.domain

class SetWallItemUseCase(private val wallAppRepository:WallAppRepository) {
    fun setWallpaper(wallItem: WallItem){
        wallAppRepository.setWallpaper(wallItem)
    }
}