import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import vehicles.Vehicle;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Vehicle> vehicles = new LinkedBlockingDeque<>();
		BlockingQueue<Boolean> isDone = new LinkedBlockingDeque<>();

		Thread producerThread = new Thread(() -> {
			final long NANOSEC_PER_SEC = 1000l*1000*1000;
			long startTime = System.nanoTime();
			while ((System.nanoTime()-startTime)< 60*NANOSEC_PER_SEC){
				try {
					Vehicle v = VehicleGenerator.randVehicle();
					vehicles.put(v);
					//System.out.println("Produced " + v.toString());
					//Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//the producer is done
			try {
				isDone.put(true);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumerThread = new Thread(() -> {
			while (true) {
				try {
					Vehicle v = vehicles.poll(1000, TimeUnit.MILLISECONDS);
					if(v != null) {
						System.out.println("Consume " + v);
					}
					//if vehicles is empty and the producer is done
					else if(!isDone.isEmpty()){
						break;
					}
					//Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});


		producerThread.start();
		consumerThread.start();
	}
}
