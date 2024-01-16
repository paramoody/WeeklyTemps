
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;

	public class WeeklyTemps {
		public static void main(String[] args) {
			// create arraylists for days and temps
			ArrayList<Integer> temps = new ArrayList<>();
			String userDay = "";
			Scanner scanner = new Scanner(System.in);
			// add days and temps to arraylists
			final ArrayList<String> DAYS = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")); 

			temps.add(70);
			temps.add(65);
			temps.add(58);
			temps.add(64);
			temps.add(82);
			temps.add(77);
			temps.add(63);
			// print("enter a day")
			while (!userDay.equals("quit")) {

				System.out.print("Enter a day from Monday to Sunday, or enter week. Enter quit to exit. ");
				// userDay = scanner.userinput()
				userDay = scanner.nextLine();
				//scanner.close();
				// dayIndex = days.indexOf(userDay)

				int dayIndex = DAYS.indexOf(userDay);
				// print("the temp on " + userDay) " is " temps[dayIndex])

				if (userDay.equals("week")) {
					double totalTemp = 0;
					for (int i = 0; i < temps.size(); i++) {
						System.out.println(DAYS.get(i) + ": " + temps.get(i));
						totalTemp += temps.get(i);
					}
					System.out.println("Average temp for the week: " + (totalTemp / temps.size()));
				} else if (dayIndex != -1) {
					System.out.println("The temperture on " + userDay + " was " + temps.get(dayIndex) + " degrees");

				}else if(userDay.equals("quit")) {
					break;
				}else {
						System.out.println("not a valid input");
					}
				}
			scanner.close();
			System.out.println("goodbye");
			}
		}



