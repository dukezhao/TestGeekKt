package Geek.Demo

/**
 * 蓝色播放器
 * */
import javax.swing.JOptionPane

class BluePlayerView : PlayerView {
    override fun showView() {

        JOptionPane.showConfirmDialog(
            null,
            "show blue player",
            " Blue player",
            JOptionPane.DEFAULT_OPTION
        );
    }

    override fun getPlayButton() {
        println("show blue button")
    }

}
