package Geek.Demo
/**
 * 密闭类实现对皮肤颜色控制
 * */
sealed class PlayerViewType {
    object GREEN:PlayerViewType()
    object BLUE:PlayerViewType()
    class VIP(val title :String?=null,val message:String?=null):PlayerViewType()
}

fun getPlayerView(type: PlayerViewType)=when (type){
    PlayerViewType.GREEN->GreenPlayerView()//据不同类型显示不同样式
    PlayerViewType.BLUE->BluePlayerView()
    is PlayerViewType.VIP->VIPPlayer(type.title,type.message )
}
