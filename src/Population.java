public class Population {
	public static void main(String[] args) throws InterruptedException {
		long alien = 2;
		double born;
		long gener = 1;
		long town = alien / 100;
		long city = alien / 10000;
		long megacity = alien / 10000000;
		String[] list = {"Mercury","Venus","Mars","Jupiter","Saturn","Uranus","Pluto","O Hai Mark","Chan"};
		int listlength = list.length;
		int rand = (int) (Math.random() * listlength);
		String Planet = list[rand];
		System.out.println("Now starting on planet " +Planet);
		while (alien > 1) {
			Thread.sleep(400);
			town = alien / 100;
			city = alien / 10000;
			megacity = alien / 10000000;
			double polfac = Math.random();
			if (megacity >= 10 && polfac < 0.2){
				System.out.println("Uh oh! Acid rain");
				alien = alien/100;
			}
			if (alien < 100){
			System.out.println("The population of the aliens in generation "
					+ gener + " is " + alien + ".");
			}
			else if (alien > 10000000){
				System.out.println("The population of the aliens in generation "
						+ gener + " is " + alien +" in " +megacity +" megacities.");
			}
			else if (alien > 10000){
				System.out.println("The population of the aliens in generation "
						+ gener + " is " + alien + " in " +city +" cities.");
			}
			else{
				System.out.println("The population of the aliens in generation "
						+ gener + " is " + alien + " in " +town +" towns.");
			}
			born = Math.random();
			if (born < 0.05) {
				alien = (long) (alien * 0.5);
			} else if (born < 0.7) {
				alien = (long) (alien * 1.5);
			} else {
				alien = (long) (alien * 1);
			}
			

		}
	System.out.println("There weren't enough aliens to reproduce");
	}
}