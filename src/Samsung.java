/**
 * Created by erickivet on 6/29/16.
 */
public class Samsung extends Remote{

    public Samsung(boolean needsBatteries, boolean supportsUsb){
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void channelUp(){
        System.out.println("Channel Goes Up");
    }

    @Override
    public void channelDown(){
        System.out.println("Channel Goes Down");
    }

    @Override
    public void volumeUp(){
        System.out.println("Volume Goes Up");
    }

    @Override
    public void volumeDown(){
        System.out.println("Volume Goes Down");
    }


    public boolean isWaterProof(){
        return false;
    }


    public boolean isRechargeable(){
        return false;
    }


    public boolean Universal(){
        return true;

    }
}
