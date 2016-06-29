import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List <Remote> remoteControls = new ArrayList<>();

        remoteControls.add(new Samsung(false, true));
        remoteControls.add(new Lg(false, false));
        remoteControls.add(new Bose (false, false));

        int i = 0;
        for (Remote remote : remoteControls) {
            remote.powerButtonPressed();
            System.out.println(remote.numberButtonPressed(i));
            i++;
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();

        }


    }


}
