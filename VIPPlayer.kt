package Geek.Demo

import javax.swing.JOptionPane

/**
 * Author: Z.King.James
 * Declarations:
 * Created on: 2018/8/14:15:40
 * Mail:mrzhaoxiaolin@163.com
 */
class VIPPlayer(var title:String?,var message:String?):PlayerView{



    override fun showView() {
        JOptionPane.showConfirmDialog(
            null,
            message,
            title,
            JOptionPane.DEFAULT_OPTION
        );
    }


    override fun getPlayButton() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}