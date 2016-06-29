/**
 * Created by erickivet on 6/29/16.
 */
public class Lg extends Remote {
    public Lg (boolean needsBatteries, boolean supportsUsb){
        super(needsBatteries, supportsUsb);
    }
    @Override
    public void channelUp(){
        System.out.println("Channel Up");
    }

    @Override
    public void channelDown(){
        System.out.println("Channel Down");
    }

    @Override
    public void volumeUp(){
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown(){
        System.out.println("Volume Down");
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

