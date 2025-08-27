public class TelevisionViewer {

    static class Television {
        private int channel = 1;
        private boolean isOn = false;

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public int getChannel() {
            return channel;
        }

        public void pressOnOff() {
            isOn = !isOn;
        }

        public boolean isOn() {
            return isOn;
        }

        public void nextChannel() {
            channel++;
            if (channel > 10) {
                channel = 1;
            }
        }
    }

    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            if (!myTV.isOn()) {
                myTV.pressOnOff();
            }

            int channelsToWatch = (day == 1) ? 3 : 4;
            for (int i = 0; i < channelsToWatch; i++) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.nextChannel();
            }

            myTV.pressOnOff();
            System.out.println("Falling asleep");
        }
    }
}
