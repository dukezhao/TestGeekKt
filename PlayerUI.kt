package Geek.Demo
/*
* 通过伴生对象构建的单例类：
* 音乐播放器app ，every user can customized their own player ' skin
*/
class PlayerUI private constructor()
{

    companion object {
        fun get():PlayerUI{
            return Holder.instance
        }
    }
    private object Holder{
        val instance=PlayerUI();
    }

    fun showPlayer(user:User)//一个函数
    {
        MediaPlayerView(getPlayerView(user.playerType)).showView()//代理类MediaPlayerView对象，调用代理对象的showView方法
    }
}
