/**
 * Created by erickivet on 6/29/16.
 */
public class Bose extends Remote {
    public Bose (boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }
        @Override
        public void channelUp () {
            System.out.println("Audio System Only");
        }

        @Override
        public void channelDown () {
            System.out.println("Audio System Only");
        }

        @Override
        public void volumeUp () {
            System.out.println("Volume Increased");
        }

        @Override
        public void volumeDown () {
            System.out.println("Volume Decreased");
        }


        public boolean isWaterProof () {
            return false;
        }


        public boolean isRechargeable () {
            return false;
        }


        public boolean Universal () {
            return false;

        }
    }
