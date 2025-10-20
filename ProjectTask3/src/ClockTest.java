public class ClockTest {
}
public class ClockTest {

    public static void main(String[] args) {

        Clock clock1 = Clock.getInstance();
        clock1.setTime(10);
        clock1.showTime();  // Expect 10

        Clock clock2 = Clock.getInstance();
        clock2.showTime();  // Also 10 (same object)

        clock2.advanceTime(5);

        System.out.println("\nAfter advancing time by 5:");
        clock1.showTime();
        clock2.showTime();

        System.out.println("\nAre clock1 and clock2 the same object? " + (clock1 == clock2));
    }
}
