/**
 * Created by erickivet on 6/28/16.
 */
public abstract class Remote {
    protected boolean mNeedsBatteries;
    protected boolean msupportsUsb;

    public Remote (boolean needsBatteries, boolean supportsUsb){
        mNeedsBatteries = needsBatteries;
        msupportsUsb = supportsUsb;
    }

    public boolean getBatteryLow(){
        return mNeedsBatteries;
    }

    public void setBattery(boolean needsBatteries){
        mNeedsBatteries = needsBatteries;
    }

    public boolean getUsbSupport(){
        return msupportsUsb;
    }
    public void setUsbSupport(boolean supportsUsb){
        msupportsUsb = supportsUsb;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("The Power Button was Pressed");
    }

    public String numberButtonPressed(int channelNumber){
        return "Changing Channel to " + channelNumber;
    }








}
