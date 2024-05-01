package vivek;

public class GameLoop implements Runnable {
    private boolean running = false;
    private final double updateRate = 1.0/60.0; // 60 updates per second
    private final long updateInterval = (long)(updateRate * 1000); // in milliseconds

    public void start() {
        running = true;
        new Thread(this).start();
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        long lastUpdateTime = System.currentTimeMillis();

        while (running) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - lastUpdateTime;

            if (elapsedTime >= updateInterval) {
                update();
                lastUpdateTime = currentTime;
            }
        }
    }

    public void update() {
        // update game logic
    }

    public static void main(String[] args) {
        GameLoop game = new GameLoop();
        game.start();
    }
}
