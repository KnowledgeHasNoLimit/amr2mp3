import it.sauronsoftware.jave.AudioUtils;

import java.io.File;

/**
 * @author : rain
 * @date : 2019-04-02 11:41
 */
public class amr2mp3 {
    public static void main(String[] args) {
        File source = new File("./src/main/resources/testAudio.amr");
        File target = new File("./src/main/resources/testAudio.mp3");

        AudioUtils.amrToMp3(source, target);
//        AudioUtils.amrToWav(source, target);
    }

}
