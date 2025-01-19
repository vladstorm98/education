package practice.exception_homework_2;

public class Runner {
    public static void main(String[] args) {
        Watch watch = new Watch(true);
        Watch watchBroken = new Watch(false);

        Worker worker1 = new Worker(watch);
        Worker worker2 = new Worker(watchBroken);

        Shop shop1 = new Shop(new Worker[]{worker1});
        Shop shop2 = new Shop(new Worker[]{worker2});

        Brand brand = new Brand(new Shop[]{shop1, shop2});

        for (Shop shop : brand.getShops()) {
            for (Worker worker : shop.getWorkers()) {
                try {
                    worker.getWatch().tick();
                } catch (WatchIsBrokenException e) {
                    System.out.println(e.getMessage());
                }
            }

        }


    }
}
