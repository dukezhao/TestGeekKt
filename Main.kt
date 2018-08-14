package Geek.Demo

/**
 * Author: Z.King.James
 * Declarations:
 * Created on: 2018/8/14:14:40
 * Mail:mrzhaoxiaolin@163.com
 */

fun main(args: Array<String>) {
    // val user=User(1,"jack");//若需要改默认播放器为绿色， 则增加一个参数PlayerviewType.BLUE

    // val user=User(1,"jack",PlayerViewType.GREEN);
    //播放器换肤 ,
    val user = User(1, "jack", PlayerViewType.VIP("duke Vip", "duke's customized player"));//默认vip为准
    PlayerUI.get().showPlayer(user);

    //test 解构
    val user2 = User(11, "lisi")
    val (age: Int, name: String) = user2
    println(age)
    println(name)

    //解构 用于拆解map
    val map= mapOf<String ,String>("key" to "key","value" to "value")
    for ((k,v) in map)
    {
        println("$k---$v")
    }

}

