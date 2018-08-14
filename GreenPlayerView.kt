package Geek.Demo

/**
 * 绿色播放器
 * */

import javax.swing.JOptionPane

class GreenPlayerView : PlayerView {
    override fun showView() {

        JOptionPane.showConfirmDialog(
    null,
    "show green player",
    "Green player",
    JOptionPane.DEFAULT_OPTION
    );
}

    override fun getPlayButton() {
        println("show green button")
    }

}
